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
public class AddInventoryMedicine extends javax.swing.JPanel {

    JSplitPane jSplitPane;
    public AddInventoryMedicine(JSplitPane jSplitPane) {
        initComponents();
        this.jSplitPane = jSplitPane;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeLbl = new javax.swing.JLabel();
        adminLbl = new javax.swing.JLabel();
        medicineTitle = new javax.swing.JLabel();
        medicineIDLbl = new javax.swing.JLabel();
        medicineIDTxtField = new javax.swing.JTextField();
        medicineNameLbl = new javax.swing.JLabel();
        medicineNameTxtField = new javax.swing.JTextField();
        qtyLbl = new javax.swing.JLabel();
        qtyTxtField = new javax.swing.JTextField();
        dosageLbl = new javax.swing.JLabel();
        dosageTxtField = new javax.swing.JTextField();
        commLbl = new javax.swing.JLabel();
        commTxtField = new javax.swing.JTextField();
        storeIDLbl = new javax.swing.JLabel();
        storeIDTxtField = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(160, 213, 229));

        welcomeLbl.setFont(new java.awt.Font("PT Sans", 1, 17)); // NOI18N
        welcomeLbl.setText("Welcome,");

        adminLbl.setFont(new java.awt.Font("PT Sans", 1, 17)); // NOI18N
        adminLbl.setText("<Name>");

        medicineTitle.setFont(new java.awt.Font("PT Sans", 1, 24)); // NOI18N
        medicineTitle.setText("ADD MEDICINES");

        medicineIDLbl.setFont(new java.awt.Font("PT Sans", 1, 15)); // NOI18N
        medicineIDLbl.setText("Medicine ID");

        medicineIDTxtField.setFont(new java.awt.Font("PT Sans", 1, 15)); // NOI18N
        medicineIDTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicineIDTxtFieldActionPerformed(evt);
            }
        });

        medicineNameLbl.setFont(new java.awt.Font("PT Sans", 1, 15)); // NOI18N
        medicineNameLbl.setText("Medicine Name");

        medicineNameTxtField.setFont(new java.awt.Font("PT Sans", 1, 15)); // NOI18N
        medicineNameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicineNameTxtFieldActionPerformed(evt);
            }
        });

        qtyLbl.setFont(new java.awt.Font("PT Sans", 1, 15)); // NOI18N
        qtyLbl.setText("Quantity");

        qtyTxtField.setFont(new java.awt.Font("PT Sans", 1, 15)); // NOI18N
        qtyTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyTxtFieldActionPerformed(evt);
            }
        });

        dosageLbl.setFont(new java.awt.Font("PT Sans", 1, 15)); // NOI18N
        dosageLbl.setText("Dosage");

        dosageTxtField.setFont(new java.awt.Font("PT Sans", 1, 15)); // NOI18N
        dosageTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosageTxtFieldActionPerformed(evt);
            }
        });

        commLbl.setFont(new java.awt.Font("PT Sans", 1, 15)); // NOI18N
        commLbl.setText("Community");

        commTxtField.setFont(new java.awt.Font("PT Sans", 1, 15)); // NOI18N
        commTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commTxtFieldActionPerformed(evt);
            }
        });

        storeIDLbl.setFont(new java.awt.Font("PT Sans", 1, 15)); // NOI18N
        storeIDLbl.setText("Store ID");

        storeIDTxtField.setFont(new java.awt.Font("PT Sans", 1, 15)); // NOI18N
        storeIDTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storeIDTxtFieldActionPerformed(evt);
            }
        });

        addBtn.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        addBtn.setText("ADD");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(welcomeLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adminLbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(commLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(commTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dosageLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dosageTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(qtyLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(qtyTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(medicineIDLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(medicineIDTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(medicineNameLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(medicineNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(storeIDLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(storeIDTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(addBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addComponent(medicineTitle)))
                .addContainerGap(337, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(medicineTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(welcomeLbl)
                    .addComponent(adminLbl))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(medicineIDLbl)
                    .addComponent(medicineIDTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(medicineNameLbl)
                    .addComponent(medicineNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qtyLbl)
                    .addComponent(qtyTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dosageLbl)
                    .addComponent(dosageTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(commLbl)
                    .addComponent(commTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(storeIDLbl)
                    .addComponent(storeIDTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void medicineIDTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicineIDTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicineIDTxtFieldActionPerformed

    private void medicineNameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicineNameTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicineNameTxtFieldActionPerformed

    private void qtyTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtyTxtFieldActionPerformed

    private void dosageTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosageTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dosageTxtFieldActionPerformed

    private void commTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_commTxtFieldActionPerformed

    private void storeIDTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeIDTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_storeIDTxtFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel adminLbl;
    private javax.swing.JLabel commLbl;
    private javax.swing.JTextField commTxtField;
    private javax.swing.JLabel dosageLbl;
    private javax.swing.JTextField dosageTxtField;
    private javax.swing.JLabel medicineIDLbl;
    private javax.swing.JTextField medicineIDTxtField;
    private javax.swing.JLabel medicineNameLbl;
    private javax.swing.JTextField medicineNameTxtField;
    private javax.swing.JLabel medicineTitle;
    private javax.swing.JLabel qtyLbl;
    private javax.swing.JTextField qtyTxtField;
    private javax.swing.JLabel storeIDLbl;
    private javax.swing.JTextField storeIDTxtField;
    private javax.swing.JLabel welcomeLbl;
    // End of variables declaration//GEN-END:variables
}