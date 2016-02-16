/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.kinitrojavatech.geco.gui;

import es.kinitrojavatech.geco.xml.Category;
import es.kinitrojavatech.geco.xml.Site;

/**
 *
 * @author quique
 */
public class JPanelCategory extends javax.swing.JPanel {

	private static final long serialVersionUID = 1L;

	private final Category category;

	/**
	 * Creates new form JPanelSites
	 */
	public JPanelCategory(final Category category) {
		initComponents();
		this.category = category;
		addEmptySite(category);
		for (final Site site : category.getSite()) {
			addSite(category, site);
		}
	}

	public Category getCategory() {
		return category;
	}

	public final void addSite(final Category category, final Site site) {
		final JPanelSite panelPassword = new JPanelSite(this, category, site);
		jTabbedPane1.add(panelPassword.getSiteName(), panelPassword);
		jTabbedPane1.setSelectedIndex(jTabbedPane1.getTabCount() - 1);
	}

	private void addEmptySite(final Category category) {
		final JPanelSite panelPassword = new JPanelSite(this, category, new Site());
		jTabbedPane1.add("Nuevo Site", panelPassword);
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
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jTabbedPane1 = new javax.swing.JTabbedPane();

		setBorder(javax.swing.BorderFactory.createEtchedBorder());

		jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
		add(jTabbedPane1);
	}// </editor-fold>//GEN-END:initComponents

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JTabbedPane jTabbedPane1;
	// End of variables declaration//GEN-END:variables

}
