/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.kinitrojavatech.geco.data;

import es.kinitrojavatech.geco.xml.Geco;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author quique
 */
public class DataFile {

    File file;
    Geco xml;
    boolean modified;

    public DataFile(File file) {
        this.file = file;
    }
    
    public void setModified(boolean modified) {
        this.modified = modified;        
    }
    
    public boolean isModified() {
        return modified;
    }

    public void save() {
        try {
            JAXBContext context = JAXBContext.newInstance("es.kinitrojavatech.geco.xml");
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(xml, file);
        } catch (JAXBException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo abrir el fichero", ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(DataFile.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
        }
    }

    public boolean open() {
        try {
            JAXBContext context = JAXBContext.newInstance("es.kinitrojavatech.geco.xml");
            Unmarshaller unmarshaller = context.createUnmarshaller();
            xml = (Geco) unmarshaller.unmarshal(file);
        } catch (JAXBException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo abrir el fichero", ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(DataFile.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
            return false;
        }
        return true;
    }
    
    public Geco getData() {
        return xml;
    }
}
