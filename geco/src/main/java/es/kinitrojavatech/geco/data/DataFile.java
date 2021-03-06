/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.kinitrojavatech.geco.data;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import es.kinitrojavatech.geco.xml.Geco;
import es.kinitrojavatech.geco.xml.Passwords;

/**
 *
 * @author quique
 */
public class DataFile {

	private static final String CHARSET = "ISO-8859-15";
	private static final int PASSWORD_LENGTH = 16;
	File openfile;
	boolean modified;
	String password;
	Geco xml;

	/** build a new datafile with empty data */
	public DataFile() {
		xml = new Geco();
		xml.setPasswords(new Passwords());
	}

	private String checkMinLength(final String passwd, final int length) throws DataFileException {
		if (passwd.isEmpty()) {
			throw new DataFileException("El password no puede estar vacio", null);
		}
		if (passwd.length() < length) {
			return checkMinLength(passwd + passwd, length);
		} else {
			return passwd;
		}
	}

	public byte[] crypt(final byte[] fileContent, final String passwd, final int mode) throws DataFileException {
		// Generamos una clave de 128 bits adecuada para AES
		KeyGenerator keyGenerator;
		try {
			keyGenerator = KeyGenerator.getInstance("AES");
			keyGenerator.init(128);
			final Key key = new SecretKeySpec(passwd.getBytes(CHARSET), 0, PASSWORD_LENGTH, "AES");

			// Se obtiene un cifrador AES
			final Cipher aes = Cipher.getInstance("AES/ECB/PKCS5Padding");
			// Se inicializa para encriptacion y se encripta el texto,
			// que debemos pasar como bytes.
			aes.init(mode, key);
			return aes.doFinal(fileContent);
		} catch (final NoSuchAlgorithmException | IllegalBlockSizeException | InvalidKeyException
				| UnsupportedEncodingException | NoSuchPaddingException e) {
			throw new DataFileException(e.getMessage(), e);
		} catch (final BadPaddingException e) {
			throw new DataFileException("Password incorrecto", e);
		}
	}

	public Geco getData() {
		return xml;
	}

	public boolean isModified() {
		return modified;
	}

	public boolean isOpen() {
		return (openfile != null) && (password != null);
	}

	public boolean open(final File file, final String passwd) {

		try (FileInputStream fileInput = new FileInputStream(file);
				BufferedInputStream bufferedInput = new BufferedInputStream(fileInput);) {
			final String tempPassword = checkMinLength(passwd, PASSWORD_LENGTH);

			final byte[] array = new byte[1024];
			int read = bufferedInput.read(array);
			final ByteArrayOutputStream byteArray = new ByteArrayOutputStream();
			while (read > 0) {
				byteArray.write(array, 0, read);
				read = bufferedInput.read(array);
			}

			final byte[] decryptedText = crypt(byteArray.toByteArray(), tempPassword, Cipher.DECRYPT_MODE);

			final String result = new String(decryptedText, CHARSET);

			final StringReader stringReader = new StringReader(result);

			final JAXBContext context = JAXBContext.newInstance("es.kinitrojavatech.geco.xml");
			final Unmarshaller unmarshaller = context.createUnmarshaller();
			xml = (Geco) unmarshaller.unmarshal(stringReader);
			setPassword(tempPassword);
			openfile = file;
		} catch (final JAXBException | IOException | DataFileException ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage(), "No se pudo abrir el fichero",
					JOptionPane.ERROR_MESSAGE);
			Logger.getLogger(DataFile.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
			return false;
		}

		return true;
	}

	public void save() {
		try {
			final JAXBContext context = JAXBContext.newInstance("es.kinitrojavatech.geco.xml");
			final Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			final StringWriter stringWriter = new StringWriter();
			marshaller.marshal(xml, stringWriter);
			final byte[] cryptedText = crypt(stringWriter.toString().getBytes(CHARSET), password, Cipher.ENCRYPT_MODE);
			final FileOutputStream output = new FileOutputStream(openfile);
			output.write(cryptedText);
			output.close();
			modified = false;
		} catch (final JAXBException | DataFileException | IOException ex) {
			JOptionPane.showMessageDialog(null, "No se pudo guardar el fichero", ex.getMessage(),
					JOptionPane.ERROR_MESSAGE);
			Logger.getLogger(DataFile.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
		}
	}

	public void setFile(final File selectedFile) {
		openfile = selectedFile;
	}

	public void setModified(final boolean modified) {
		this.modified = modified;
	}

	public void setPassword(final String pwd) throws DataFileException {
		password = checkMinLength(pwd, PASSWORD_LENGTH);
	}
}
