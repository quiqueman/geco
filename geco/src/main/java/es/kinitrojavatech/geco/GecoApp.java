/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.kinitrojavatech.geco;

import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import es.kinitrojavatech.geco.data.DataFile;
import es.kinitrojavatech.geco.gui.JPanelPassword;
import es.kinitrojavatech.geco.gui.JPanelPasswords;
import es.kinitrojavatech.geco.xml.Category;
import es.kinitrojavatech.geco.xml.Site;

/**
 *
 * @author quique
 */
public class GecoApp extends javax.swing.JFrame {

	/**
	 * Creates new form GecoApp
	 */
	public GecoApp() {
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jTabbedPane1 = new javax.swing.JTabbedPane();
		jPanelPasswd = new javax.swing.JPanel();
		jTabbedPanePasswdCategories = new javax.swing.JTabbedPane();
		jPanelAccounts = new javax.swing.JPanel();
		jPanelEncFs = new javax.swing.JPanel();
		jPanelAbout = new javax.swing.JPanel();
		menuBar = new javax.swing.JMenuBar();
		fileMenu = new javax.swing.JMenu();
		openMenuItem = new javax.swing.JMenuItem();
		saveMenuItem = new javax.swing.JMenuItem();
		saveAsMenuItem = new javax.swing.JMenuItem();
		exitMenuItem = new javax.swing.JMenuItem();
		editMenu = new javax.swing.JMenu();
		cutMenuItem = new javax.swing.JMenuItem();
		copyMenuItem = new javax.swing.JMenuItem();
		pasteMenuItem = new javax.swing.JMenuItem();
		deleteMenuItem = new javax.swing.JMenuItem();
		helpMenu = new javax.swing.JMenu();
		contentsMenuItem = new javax.swing.JMenuItem();
		aboutMenuItem = new javax.swing.JMenuItem();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		final java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("es/kinitrojavatech/geco/Bundle"); // NOI18N
		setTitle(bundle.getString("GecoApp.title")); // NOI18N
		setName("Form"); // NOI18N

		jTabbedPane1.setName("jTabbedPane1"); // NOI18N

		jPanelPasswd.setName("jPanelPasswd"); // NOI18N

		jTabbedPanePasswdCategories.setMaximumSize(null);
		jTabbedPanePasswdCategories.setMinimumSize(null);
		jTabbedPanePasswdCategories.setName("jTabbedPanePasswdCategories"); // NOI18N
		jTabbedPanePasswdCategories.setPreferredSize(null);

		final javax.swing.GroupLayout jPanelPasswdLayout = new javax.swing.GroupLayout(jPanelPasswd);
		jPanelPasswd.setLayout(jPanelPasswdLayout);
		jPanelPasswdLayout.setHorizontalGroup(jPanelPasswdLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 795, Short.MAX_VALUE)
				.addGroup(jPanelPasswdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanelPasswdLayout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
								.addComponent(jTabbedPanePasswdCategories, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(0, 0, Short.MAX_VALUE))));
		jPanelPasswdLayout.setVerticalGroup(jPanelPasswdLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 452, Short.MAX_VALUE)
				.addGroup(jPanelPasswdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanelPasswdLayout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
								.addComponent(jTabbedPanePasswdCategories, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(0, 0, Short.MAX_VALUE))));

		jTabbedPane1.addTab(bundle.getString("GecoApp.jPanelPasswd.TabConstraints.tabTitle"), jPanelPasswd); // NOI18N

		jPanelAccounts.setName("jPanelAccounts"); // NOI18N

		final javax.swing.GroupLayout jPanelAccountsLayout = new javax.swing.GroupLayout(jPanelAccounts);
		jPanelAccounts.setLayout(jPanelAccountsLayout);
		jPanelAccountsLayout.setHorizontalGroup(jPanelAccountsLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 795, Short.MAX_VALUE));
		jPanelAccountsLayout.setVerticalGroup(jPanelAccountsLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 452, Short.MAX_VALUE));

		jTabbedPane1.addTab(bundle.getString("GecoApp.jPanelAccounts.TabConstraints.tabTitle"), jPanelAccounts); // NOI18N

		jPanelEncFs.setName("jPanelEncFs"); // NOI18N

		final javax.swing.GroupLayout jPanelEncFsLayout = new javax.swing.GroupLayout(jPanelEncFs);
		jPanelEncFs.setLayout(jPanelEncFsLayout);
		jPanelEncFsLayout.setHorizontalGroup(jPanelEncFsLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 795, Short.MAX_VALUE));
		jPanelEncFsLayout.setVerticalGroup(jPanelEncFsLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 452, Short.MAX_VALUE));

		jTabbedPane1.addTab(bundle.getString("GecoApp.jPanelEncFs.TabConstraints.tabTitle"), jPanelEncFs); // NOI18N

		jPanelAbout.setName("jPanelAbout"); // NOI18N

		final javax.swing.GroupLayout jPanelAboutLayout = new javax.swing.GroupLayout(jPanelAbout);
		jPanelAbout.setLayout(jPanelAboutLayout);
		jPanelAboutLayout.setHorizontalGroup(jPanelAboutLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 795, Short.MAX_VALUE));
		jPanelAboutLayout.setVerticalGroup(jPanelAboutLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 452, Short.MAX_VALUE));

		jTabbedPane1.addTab(bundle.getString("GecoApp.jPanelAbout.TabConstraints.tabTitle"), jPanelAbout); // NOI18N

		getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

		menuBar.setName("menuBar"); // NOI18N

		fileMenu.setMnemonic('f');
		fileMenu.setText(bundle.getString("GecoApp.fileMenu.text")); // NOI18N
		fileMenu.setName("fileMenu"); // NOI18N

		openMenuItem.setMnemonic('o');
		openMenuItem.setText(bundle.getString("GecoApp.openMenuItem.text")); // NOI18N
		openMenuItem.setName("openMenuItem"); // NOI18N
		fileMenu.add(openMenuItem);

		saveMenuItem.setMnemonic('s');
		saveMenuItem.setText(bundle.getString("GecoApp.saveMenuItem.text")); // NOI18N
		saveMenuItem.setName("saveMenuItem"); // NOI18N
		fileMenu.add(saveMenuItem);

		saveAsMenuItem.setMnemonic('a');
		saveAsMenuItem.setText(bundle.getString("GecoApp.saveAsMenuItem.text")); // NOI18N
		saveAsMenuItem.setName("saveAsMenuItem"); // NOI18N
		fileMenu.add(saveAsMenuItem);

		exitMenuItem.setMnemonic('x');
		exitMenuItem.setText(bundle.getString("GecoApp.exitMenuItem.text")); // NOI18N
		exitMenuItem.setName("exitMenuItem"); // NOI18N
		exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(final java.awt.event.ActionEvent evt) {
				exitMenuItemActionPerformed(evt);
			}
		});
		fileMenu.add(exitMenuItem);

		menuBar.add(fileMenu);

		editMenu.setMnemonic('e');
		editMenu.setText(bundle.getString("GecoApp.editMenu.text")); // NOI18N
		editMenu.setName("editMenu"); // NOI18N

		cutMenuItem.setMnemonic('t');
		cutMenuItem.setText(bundle.getString("GecoApp.cutMenuItem.text")); // NOI18N
		cutMenuItem.setName("cutMenuItem"); // NOI18N
		editMenu.add(cutMenuItem);

		copyMenuItem.setMnemonic('y');
		copyMenuItem.setText(bundle.getString("GecoApp.copyMenuItem.text")); // NOI18N
		copyMenuItem.setName("copyMenuItem"); // NOI18N
		editMenu.add(copyMenuItem);

		pasteMenuItem.setMnemonic('p');
		pasteMenuItem.setText(bundle.getString("GecoApp.pasteMenuItem.text")); // NOI18N
		pasteMenuItem.setName("pasteMenuItem"); // NOI18N
		editMenu.add(pasteMenuItem);

		deleteMenuItem.setMnemonic('d');
		deleteMenuItem.setText(bundle.getString("GecoApp.deleteMenuItem.text")); // NOI18N
		deleteMenuItem.setName("deleteMenuItem"); // NOI18N
		editMenu.add(deleteMenuItem);

		menuBar.add(editMenu);

		helpMenu.setMnemonic('h');
		helpMenu.setText(bundle.getString("GecoApp.helpMenu.text")); // NOI18N
		helpMenu.setName("helpMenu"); // NOI18N

		contentsMenuItem.setMnemonic('c');
		contentsMenuItem.setText(bundle.getString("GecoApp.contentsMenuItem.text")); // NOI18N
		contentsMenuItem.setName("contentsMenuItem"); // NOI18N
		helpMenu.add(contentsMenuItem);

		aboutMenuItem.setMnemonic('a');
		aboutMenuItem.setText(bundle.getString("GecoApp.aboutMenuItem.text")); // NOI18N
		aboutMenuItem.setName("aboutMenuItem"); // NOI18N
		helpMenu.add(aboutMenuItem);

		menuBar.add(helpMenu);

		setJMenuBar(menuBar);

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents

	private void exitMenuItemActionPerformed(final java.awt.event.ActionEvent evt) {// GEN-FIRST:event_exitMenuItemActionPerformed
		System.exit(0);
	}// GEN-LAST:event_exitMenuItemActionPerformed

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
			public void run() {
				final GecoApp app = new GecoApp();
				if (app.openDatafile()) {
					app.initComponents();
					app.initPanelPasswords();
					app.pack();
					app.setVisible(true);
				}
			}
		});
	}

	private DataFile dataFile;

	// Variables declaration - do not modify//GEN-BEGIN:variables
	javax.swing.JMenuItem aboutMenuItem;
	javax.swing.JMenuItem contentsMenuItem;
	javax.swing.JMenuItem copyMenuItem;
	javax.swing.JMenuItem cutMenuItem;
	javax.swing.JMenuItem deleteMenuItem;
	javax.swing.JMenu editMenu;
	javax.swing.JMenuItem exitMenuItem;
	javax.swing.JMenu fileMenu;
	javax.swing.JMenu helpMenu;
	javax.swing.JPanel jPanelAbout;
	javax.swing.JPanel jPanelAccounts;
	javax.swing.JPanel jPanelEncFs;
	javax.swing.JPanel jPanelPasswd;
	javax.swing.JTabbedPane jTabbedPane1;
	javax.swing.JTabbedPane jTabbedPanePasswdCategories;
	javax.swing.JMenuBar menuBar;
	javax.swing.JMenuItem openMenuItem;
	javax.swing.JMenuItem pasteMenuItem;
	javax.swing.JMenuItem saveAsMenuItem;
	javax.swing.JMenuItem saveMenuItem;
	// End of variables declaration//GEN-END:variables

	private boolean openDatafile() {
		final JFileChooser chooser = new JFileChooser();
		final FileNameExtensionFilter filter = new FileNameExtensionFilter("Ficheros de datos de geco", "geco");
		chooser.setFileFilter(filter);
		final int returnVal = chooser.showOpenDialog(this);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			dataFile = new DataFile(chooser.getSelectedFile());
			return dataFile.open();
		}
		return false;
	}

	private void initPanelPasswords() {
		final List<Category> categories = dataFile.getData().getPasswords().getCategory();

		for (final Category category : categories) {
			final JPanelPasswords panel = new JPanelPasswords();
			jTabbedPanePasswdCategories.add(category.getTitle(), panel);
			for (final Site site : category.getSite()) {
				final JPanelPassword panelPassword = new JPanelPassword(site);
				panel.add(panelPassword);
			}
			// add an empty site
			final JPanelPassword panelPassword = new JPanelPassword(new Site());
			panel.add(panelPassword);
		}
	}
}
