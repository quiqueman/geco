/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.kinitrojavatech.geco;

import java.awt.Toolkit;
import java.io.File;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.filechooser.FileNameExtensionFilter;

import es.kinitrojavatech.geco.calc.PasswdCalcDlg;
import es.kinitrojavatech.geco.data.DataFile;
import es.kinitrojavatech.geco.data.DataFileException;
import es.kinitrojavatech.geco.gui.JPanelCategory;
import es.kinitrojavatech.geco.xml.Category;
import es.kinitrojavatech.geco.xml.EncryptedVolumes;

/**
 *
 * @author quique
 */
public class GecoApp extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;

	private String password;

	/**
	 * Creates new form GecoApp
	 */
	public GecoApp() {
		dataFile = new DataFile();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jToolBar1 = new javax.swing.JToolBar();
		jButtonOpen = new javax.swing.JButton();
		jButtonSave = new javax.swing.JButton();
		jButtonNewPasswdCategory = new javax.swing.JButton();
		jButtonRenamePasswdCategory = new javax.swing.JButton();
		jButtonPasswdCalc = new javax.swing.JButton();
		jTabbedPane1 = new javax.swing.JTabbedPane();
		jPanelCategory = new javax.swing.JPanel();
		jTabbedPanePasswdCategories = new javax.swing.JTabbedPane();
		jPanelAccounts = new javax.swing.JPanel();
		jPanelEncFsCollection = new es.kinitrojavatech.geco.gui.JPanelEncFsCollection();
		jPanelAbout = new es.kinitrojavatech.geco.gui.JPanelAbout();
		jPanel1 = new javax.swing.JPanel();
		jLabelFilename = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
		final java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("es/kinitrojavatech/geco/Bundle"); // NOI18N
		setTitle(bundle.getString("GecoApp.title")); // NOI18N
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(getClass().getResource("/es/kinitrojavatech/geco/gui/icons/logo.png")));
		setName("Form"); // NOI18N
		addWindowListener(new java.awt.event.WindowAdapter() {
			@Override
			public void windowClosing(final java.awt.event.WindowEvent evt) {
				formWindowClosing(evt);
			}
		});

		jToolBar1.setFloatable(false);
		jToolBar1.setRollover(true);
		jToolBar1.setName("jToolBar1"); // NOI18N

		jButtonOpen.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/es/kinitrojavatech/geco/gui/icons/document-open.png"))); // NOI18N
		jButtonOpen.setText(bundle.getString("GecoApp.jButtonOpen.text")); // NOI18N
		jButtonOpen.setFocusable(false);
		jButtonOpen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		jButtonOpen.setName("jButtonOpen"); // NOI18N
		jButtonOpen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		jButtonOpen.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(final java.awt.event.ActionEvent evt) {
				jButtonOpenActionPerformed(evt);
			}
		});
		jToolBar1.add(jButtonOpen);

		jButtonSave.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/es/kinitrojavatech/geco/gui/icons/document-save.png"))); // NOI18N
		jButtonSave.setText(bundle.getString("GecoApp.jButtonSave.text")); // NOI18N
		jButtonSave.setFocusable(false);
		jButtonSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		jButtonSave.setName("jButtonSave"); // NOI18N
		jButtonSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		jButtonSave.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(final java.awt.event.ActionEvent evt) {
				jButtonSaveActionPerformed(evt);
			}
		});
		jToolBar1.add(jButtonSave);

		jButtonNewPasswdCategory.setIcon(
				new javax.swing.ImageIcon(getClass().getResource("/es/kinitrojavatech/geco/gui/icons/folder-new.png"))); // NOI18N
		jButtonNewPasswdCategory.setText(bundle.getString("GecoApp.jButtonNewPasswdCategory.text")); // NOI18N
		jButtonNewPasswdCategory.setFocusable(false);
		jButtonNewPasswdCategory.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		jButtonNewPasswdCategory.setName("jButtonNewPasswdCategory"); // NOI18N
		jButtonNewPasswdCategory.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		jButtonNewPasswdCategory.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(final java.awt.event.ActionEvent evt) {
				jButtonNewPasswdCategoryActionPerformed(evt);
			}
		});
		jToolBar1.add(jButtonNewPasswdCategory);

		jButtonRenamePasswdCategory.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/es/kinitrojavatech/geco/gui/icons/folder-move.png"))); // NOI18N
		jButtonRenamePasswdCategory.setText(bundle.getString("GecoApp.jButtonRenamePasswdCategory.text")); // NOI18N
		jButtonRenamePasswdCategory.setFocusable(false);
		jButtonRenamePasswdCategory.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		jButtonRenamePasswdCategory.setName("jButtonRenamePasswdCategory"); // NOI18N
		jButtonRenamePasswdCategory.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		jButtonRenamePasswdCategory.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(final java.awt.event.ActionEvent evt) {
				jButtonRenamePasswdCategoryActionPerformed(evt);
			}
		});
		jToolBar1.add(jButtonRenamePasswdCategory);

		jButtonPasswdCalc.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/es/kinitrojavatech/geco/gui/icons/accessories-calculator.png"))); // NOI18N
		jButtonPasswdCalc.setText(bundle.getString("GecoApp.jButtonPasswdCalc.text")); // NOI18N
		jButtonPasswdCalc.setFocusable(false);
		jButtonPasswdCalc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		jButtonPasswdCalc.setName("jButtonPasswdCalc"); // NOI18N
		jButtonPasswdCalc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		jButtonPasswdCalc.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(final java.awt.event.ActionEvent evt) {
				jButtonPasswdCalcActionPerformed(evt);
			}
		});
		jToolBar1.add(jButtonPasswdCalc);

		getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_START);

		jTabbedPane1.setName("jTabbedPane1"); // NOI18N
		jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
			@Override
			public void stateChanged(final javax.swing.event.ChangeEvent evt) {
				jTabbedPane1StateChanged(evt);
			}
		});

		jPanelCategory.setName("jPanelCategory"); // NOI18N

		jTabbedPanePasswdCategories.setMaximumSize(null);
		jTabbedPanePasswdCategories.setMinimumSize(null);
		jTabbedPanePasswdCategories.setName("jTabbedPanePasswdCategories"); // NOI18N
		jTabbedPanePasswdCategories.setPreferredSize(null);

		final javax.swing.GroupLayout jPanelCategoryLayout = new javax.swing.GroupLayout(jPanelCategory);
		jPanelCategory.setLayout(jPanelCategoryLayout);
		jPanelCategoryLayout.setHorizontalGroup(jPanelCategoryLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 795, Short.MAX_VALUE)
				.addGroup(jPanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanelCategoryLayout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
								.addComponent(jTabbedPanePasswdCategories, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(0, 0, Short.MAX_VALUE))));
		jPanelCategoryLayout.setVerticalGroup(jPanelCategoryLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 404, Short.MAX_VALUE)
				.addGroup(jPanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanelCategoryLayout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
								.addComponent(jTabbedPanePasswdCategories, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(0, 0, Short.MAX_VALUE))));

		jTabbedPane1.addTab(bundle.getString("GecoApp.jPanelCategory.TabConstraints.tabTitle"),
				new javax.swing.ImageIcon(
						getClass().getResource("/es/kinitrojavatech/geco/gui/icons/stock_keyring.png")),
				jPanelCategory); // NOI18N

		jPanelAccounts.setName("jPanelAccounts"); // NOI18N

		final javax.swing.GroupLayout jPanelAccountsLayout = new javax.swing.GroupLayout(jPanelAccounts);
		jPanelAccounts.setLayout(jPanelAccountsLayout);
		jPanelAccountsLayout.setHorizontalGroup(jPanelAccountsLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 795, Short.MAX_VALUE));
		jPanelAccountsLayout.setVerticalGroup(jPanelAccountsLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 404, Short.MAX_VALUE));

		jTabbedPane1
				.addTab(bundle.getString("GecoApp.jPanelAccounts.TabConstraints.tabTitle"),
						new javax.swing.ImageIcon(
								getClass().getResource("/es/kinitrojavatech/geco/gui/icons/gnucash-icon.png")),
				jPanelAccounts); // NOI18N

		jPanelEncFsCollection.setName("jPanelEncFsCollection"); // NOI18N
		jTabbedPane1.addTab(bundle.getString("GecoApp.jPanelEncFsCollection.TabConstraints.tabTitle"),
				new javax.swing.ImageIcon(getClass().getResource("/es/kinitrojavatech/geco/gui/icons/encrypted.png")),
				jPanelEncFsCollection); // NOI18N

		jPanelAbout.setName("jPanelAbout"); // NOI18N
		jTabbedPane1.addTab(bundle.getString("GecoApp.jPanelAbout.TabConstraints.tabTitle"),
				new javax.swing.ImageIcon(
						getClass().getResource("/es/kinitrojavatech/geco/gui/icons/gnome-about-logo.png")),
				jPanelAbout); // NOI18N

		getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

		jPanel1.setName("jPanel1"); // NOI18N

		jLabelFilename.setText(bundle.getString("GecoApp.jLabelFilename.text")); // NOI18N
		jLabelFilename.setName("jLabelFilename"); // NOI18N
		jPanel1.add(jLabelFilename);

		getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents

	private void jButtonPasswdCalcActionPerformed(final java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonPasswdCalcActionPerformed
		final PasswdCalcDlg dlg = new PasswdCalcDlg(this, true, "");
		dlg.setVisible(true);
	}// GEN-LAST:event_jButtonPasswdCalcActionPerformed

	private void jButtonRenamePasswdCategoryActionPerformed(final java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonRenamePasswdCategoryActionPerformed
		final JPanelCategory panel = (JPanelCategory) jTabbedPanePasswdCategories.getSelectedComponent();
		if (panel != null) {
			final String oldName = panel.getCategory().getTitle();
			final String newName = JOptionPane.showInputDialog(this,
					"¿Qué nombre quieres para la categoría '" + oldName + "'", "Renombrar categoría",
					JOptionPane.QUESTION_MESSAGE);
			if (newName != null) {
				panel.getCategory().setTitle(newName);
			}
			jTabbedPanePasswdCategories.setTitleAt(jTabbedPanePasswdCategories.getSelectedIndex(), newName);
		}
	}// GEN-LAST:event_jButtonRenamePasswdCategoryActionPerformed

	private void jTabbedPane1StateChanged(final javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_jTabbedPane1StateChanged
		switch (jTabbedPane1.getSelectedIndex()) {
		case 0:
			jButtonNewPasswdCategory.setVisible(true);
			jButtonRenamePasswdCategory.setVisible(true);
			jButtonPasswdCalc.setVisible(true);
			break;
		default:
			jButtonNewPasswdCategory.setVisible(false);
			jButtonRenamePasswdCategory.setVisible(false);
			jButtonPasswdCalc.setVisible(false);
			break;
		}
	}// GEN-LAST:event_jTabbedPane1StateChanged

	private void jButtonOpenActionPerformed(final java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonOpenActionPerformed
		final File file = openDatafile();
		if (file != null) {
			jLabelFilename.setText(file.getAbsolutePath());
			reset();
			initPanelPasswords();
			initPanelEncFs();
			pack();
		}
	}// GEN-LAST:event_jButtonOpenActionPerformed

	private void reset() {
		jTabbedPanePasswdCategories.removeAll();
	}

	private void formWindowClosing(final java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowClosing
		switch (JOptionPane.showConfirmDialog(this, "Guardar los cambios antes de salir")) {
		case JOptionPane.YES_OPTION:
			save();
			System.exit(0);
		case JOptionPane.NO_OPTION:
			System.exit(0);
		}
	}// GEN-LAST:event_formWindowClosing

	private void jButtonNewPasswdCategoryActionPerformed(final java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonNewPasswdCategoryActionPerformed
		final String name = JOptionPane.showInputDialog(this, "Nombre de la nueva categoría", "Nueva Categoría",
				JOptionPane.QUESTION_MESSAGE);
		if (name != null) {
			final Category category = new Category();
			category.setTitle(name);
			dataFile.getData().getPasswords().getCategory().add(category);
			final JPanelCategory newPanel = new JPanelCategory(category);
			jTabbedPanePasswdCategories.add(category.getTitle(), newPanel);
			jTabbedPanePasswdCategories.setSelectedComponent(newPanel);
			pack();
		}
	}// GEN-LAST:event_jButtonNewPasswdCategoryActionPerformed

	private void jButtonSaveActionPerformed(final java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonSaveActionPerformed
		save();
	}// GEN-LAST:event_jButtonSaveActionPerformed

	private void save() {
		if (dataFile.isOpen()) {
			dataFile.save();
			JOptionPane.showMessageDialog(this, "Los cambios han sido guardados", "Datos guardados",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			final JFileChooser chooser = new JFileChooser();
			final FileNameExtensionFilter filter = new FileNameExtensionFilter("Ficheros de datos de geco", "geco");
			chooser.setFileFilter(filter);
			final int returnVal = chooser.showOpenDialog(this);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				password = JOptionPane.showInputDialog(this, "Introduce el password", "Password",
						JOptionPane.QUESTION_MESSAGE);
				if (password != null) {
					try {
						dataFile.setPassword(password);
						dataFile.setFile(chooser.getSelectedFile());
						dataFile.save();
						JOptionPane.showMessageDialog(this, "Los cambios han sido guardados", "Datos guardados",
								JOptionPane.INFORMATION_MESSAGE);
					} catch (final DataFileException e) {
						JOptionPane.showMessageDialog(this, "El password no puede estar vacío", "Password incorrecto",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		}
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(final String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting
		// code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.
		 * html
		 */
		try {
			for (final javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (final ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(GecoApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (final InstantiationException ex) {
			java.util.logging.Logger.getLogger(GecoApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (final IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(GecoApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (final javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(GecoApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				final GecoApp app = new GecoApp();
				app.initComponents();
				app.initPanelEncFs();
				app.pack();
				app.setVisible(true);
			}
		});
	}

	private DataFile dataFile;

	// Variables declaration - do not modify//GEN-BEGIN:variables
	javax.swing.JButton jButtonNewPasswdCategory;
	javax.swing.JButton jButtonOpen;
	javax.swing.JButton jButtonPasswdCalc;
	javax.swing.JButton jButtonRenamePasswdCategory;
	javax.swing.JButton jButtonSave;
	javax.swing.JLabel jLabelFilename;
	javax.swing.JPanel jPanel1;
	es.kinitrojavatech.geco.gui.JPanelAbout jPanelAbout;
	javax.swing.JPanel jPanelAccounts;
	javax.swing.JPanel jPanelCategory;
	es.kinitrojavatech.geco.gui.JPanelEncFsCollection jPanelEncFsCollection;
	javax.swing.JTabbedPane jTabbedPane1;
	javax.swing.JTabbedPane jTabbedPanePasswdCategories;
	javax.swing.JToolBar jToolBar1;
	// End of variables declaration//GEN-END:variables

	private File openDatafile() {
		final JFileChooser chooser = new JFileChooser();
		final FileNameExtensionFilter filter = new FileNameExtensionFilter("Ficheros de datos de geco", "geco");
		chooser.setFileFilter(filter);
		final int returnVal = chooser.showOpenDialog(this);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			dataFile = new DataFile();
			final JPasswordField jPasswdField = new JPasswordField(10);
			final int result = JOptionPane.showConfirmDialog(this, jPasswdField, "Introduce el password",
					JOptionPane.OK_CANCEL_OPTION);
			if (result == JOptionPane.OK_OPTION) {
				password = String.valueOf(jPasswdField.getPassword());
				final File file = chooser.getSelectedFile();
				if (dataFile.open(file, password)) {
					return file;
				}
			}
		}
		return null;
	}

	private void initPanelPasswords() {
		final List<Category> categories = dataFile.getData().getPasswords().getCategory();

		for (final Category category : categories) {
			final JPanelCategory panel = new JPanelCategory(category);
			jTabbedPanePasswdCategories.add(category.getTitle(), panel);
		}
	}

	private void initPanelEncFs() {
		EncryptedVolumes encVolumes = dataFile.getData().getEncryptedVolumes();
		if (encVolumes == null) {
			encVolumes = new EncryptedVolumes();
			dataFile.getData().setEncryptedVolumes(encVolumes);
		}
		jPanelEncFsCollection.init(encVolumes);
	}
}
