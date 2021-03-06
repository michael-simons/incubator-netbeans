/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/*
 * ExtensionResourcesPanel.java
 *
 */

package org.netbeans.modules.javawebstart.ui.customizer;

import org.netbeans.modules.javawebstart.ui.customizer.JWSProjectProperties.PropertiesTableModel;

/**
 *
 * @author Milan Kubec
 */
public class ExtensionResourcesPanel extends javax.swing.JPanel {

    private PropertiesTableModel model;
    
    /** Creates new form ExtensionResourcesPanel */
    public ExtensionResourcesPanel(PropertiesTableModel mdl) {
        this.model = mdl;
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        extResourcesTable = new javax.swing.JTable();
        addButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        extResourcesLabel = new javax.swing.JLabel();

        extResourcesTable.setModel(model);
        jScrollPane1.setViewportView(extResourcesTable);
        extResourcesTable.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(ExtensionResourcesPanel.class, "ExtensionResourcesPanel.extResourcesTable.AccessibleContext.accessibleDescription")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(addButton, org.openide.util.NbBundle.getMessage(ExtensionResourcesPanel.class, "ExtensionResourcesPanel.addButton.text")); // NOI18N
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(removeButton, org.openide.util.NbBundle.getMessage(ExtensionResourcesPanel.class, "ExtensionResourcesPanel.removeButton.text")); // NOI18N
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        extResourcesLabel.setLabelFor(extResourcesTable);
        org.openide.awt.Mnemonics.setLocalizedText(extResourcesLabel, org.openide.util.NbBundle.getMessage(ExtensionResourcesPanel.class, "ExtensionResourcesPanel.extResourcesLabel.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(extResourcesLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addButton)
                    .addComponent(removeButton))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addButton, removeButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(extResourcesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
                .addContainerGap())
        );

        addButton.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(ExtensionResourcesPanel.class, "ExtensionResourcesPanel.addButton.AccessibleContext.accessibleDescription")); // NOI18N
        removeButton.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(ExtensionResourcesPanel.class, "ExtensionResourcesPanel.removeButton.AccessibleContext.accessibleDescription")); // NOI18N
        extResourcesLabel.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(ExtensionResourcesPanel.class, "ExtensionResourcesPanel.extResourcesLabel.AccessibleContext.accessibleDescription")); // NOI18N

        getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(ExtensionResourcesPanel.class, "ExtensionResourcesPanel.AccessibleContext.accessibleName")); // NOI18N
        getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(ExtensionResourcesPanel.class, "ExtensionResourcesPanel.AccessibleContext.accessibleDescription")); // NOI18N
    }// </editor-fold>//GEN-END:initComponents

private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
    model.addRow();
    model.fireTableDataChanged();
}//GEN-LAST:event_addButtonActionPerformed

private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
    int selIndex = extResourcesTable.getSelectedRow();
    if (selIndex != -1) {
        model.removeRow(selIndex);
        model.fireTableDataChanged();
    }
}//GEN-LAST:event_removeButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel extResourcesLabel;
    private javax.swing.JTable extResourcesTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removeButton;
    // End of variables declaration//GEN-END:variables

}
