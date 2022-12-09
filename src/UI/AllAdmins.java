/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import javax.swing.JSplitPane;

/**
 *
 * @author nikethanann
 */
public class AllAdmins extends javax.swing.JPanel {

    JSplitPane jSplitPane1;
    public AllAdmins(JSplitPane jSplitPane1) {
        initComponents();
        this.jSplitPane1 = jSplitPane1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pharmacyBtn = new javax.swing.JButton();
        ngoAdmin = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        inventoryBtn = new javax.swing.JButton();
        vendorBtn1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(160, 213, 229));

        pharmacyBtn.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        pharmacyBtn.setText("PHARMACY ADMIN");
        pharmacyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pharmacyBtnActionPerformed(evt);
            }
        });

        ngoAdmin.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        ngoAdmin.setText("NGO ADMIN");
        ngoAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ngoAdminActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        inventoryBtn.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        inventoryBtn.setText("INVENTORY ADMIN");
        inventoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventoryBtnActionPerformed(evt);
            }
        });

        vendorBtn1.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        vendorBtn1.setText("VENDOR ADMIN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(352, 352, 352)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pharmacyBtn)
                            .addComponent(inventoryBtn)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(371, 371, 371)
                        .addComponent(ngoAdmin)))
                .addContainerGap(467, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(362, 362, 362)
                        .addComponent(vendorBtn1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(387, 387, 387)
                        .addComponent(backBtn)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(vendorBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pharmacyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(inventoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ngoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(214, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        PrimaryJFrame homePage = new PrimaryJFrame(jSplitPane1);
        jSplitPane1.setBottomComponent(homePage);
        // TODO add your handling code here:
    }//GEN-LAST:event_backBtnActionPerformed


    private void pharmacyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pharmacyBtnActionPerformed
        // TODO add your handling code here:
        PharmacyAdminPanel pharmacyAdminPnl = new PharmacyAdminPanel(jSplitPane1);
        jSplitPane1.setBottomComponent(pharmacyAdminPnl);
    }//GEN-LAST:event_pharmacyBtnActionPerformed

    private void inventoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventoryBtnActionPerformed
        LoginInventory goToInventory = new LoginInventory(jSplitPane1);
        jSplitPane1.setBottomComponent(goToInventory);
        // TODO add your handling code here:
    }//GEN-LAST:event_inventoryBtnActionPerformed

    private void ngoAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ngoAdminActionPerformed
        // TODO add your handling code here:
        NgoAdminPanel ngoAdmin = new NgoAdminPanel(jSplitPane1);
        jSplitPane1.setBottomComponent(ngoAdmin);
    }//GEN-LAST:event_ngoAdminActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton inventoryBtn;
    private javax.swing.JButton ngoAdmin;
    private javax.swing.JButton pharmacyBtn;
    private javax.swing.JButton vendorBtn1;
    // End of variables declaration//GEN-END:variables
}
