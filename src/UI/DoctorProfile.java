/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import javax.swing.JOptionPane;
import javax.swing.JSplitPane;

/**
 *
 * @author nikethanann
 */
public class DoctorProfile extends javax.swing.JPanel {
    
    JSplitPane splitPane;
    public DoctorProfile(JSplitPane splitPane) {
        initComponents();
        this.splitPane = splitPane;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        patientIDLbl = new javax.swing.JLabel();
        patientIDDisplay = new javax.swing.JLabel();
        commDisplay = new javax.swing.JLabel();
        commLbl = new javax.swing.JLabel();
        loginTitle = new javax.swing.JLabel();
        ordersBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        medicinesTable = new javax.swing.JTable();
        checkoutBtn = new javax.swing.JButton();
        qtyLbl = new javax.swing.JLabel();
        qtySpinner = new javax.swing.JSpinner();
        medicineSearch = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(160, 213, 229));

        patientIDLbl.setFont(new java.awt.Font("PT Sans", 1, 18)); // NOI18N
        patientIDLbl.setText("Doctor License No.");

        patientIDDisplay.setFont(new java.awt.Font("PT Sans", 1, 18)); // NOI18N
        patientIDDisplay.setText("jLabel2");

        commDisplay.setFont(new java.awt.Font("PT Sans", 0, 18)); // NOI18N
        commDisplay.setText("jLabel2");

        commLbl.setFont(new java.awt.Font("PT Sans", 0, 18)); // NOI18N
        commLbl.setText("Community:");

        loginTitle.setFont(new java.awt.Font("PT Sans", 1, 24)); // NOI18N
        loginTitle.setText("STORE DETAILS");

        ordersBtn.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        ordersBtn.setText("PAST ORDERS");
        ordersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordersBtnActionPerformed(evt);
            }
        });

        medicinesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "S.no", "Medicine Name", "Dosage", "Price / qty"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(medicinesTable);

        checkoutBtn.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        checkoutBtn.setText("CHECKOUT");

        qtyLbl.setFont(new java.awt.Font("PT Sans", 1, 15)); // NOI18N
        qtyLbl.setText("Quantity:");

        searchBtn.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        searchBtn.setText("SEARCH");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(loginTitle))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(commLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(commDisplay)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(medicineSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchBtn)
                                .addGap(98, 433, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(patientIDLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(patientIDDisplay)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ordersBtn)))))
                .addGap(145, 145, 145))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(549, 549, 549)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(checkoutBtn)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(qtyLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(qtySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(loginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientIDLbl)
                    .addComponent(patientIDDisplay)
                    .addComponent(ordersBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(commLbl)
                    .addComponent(commDisplay))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(medicineSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qtyLbl)
                    .addComponent(qtySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(checkoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        if(medicineSearch.getText().equals("") || isItInteger(medicineSearch.getText())) {
            JOptionPane.showMessageDialog(this, "Medicine Name Field is empty / invalid!");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBtnActionPerformed

    private void ordersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordersBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ordersBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkoutBtn;
    private javax.swing.JLabel commDisplay;
    private javax.swing.JLabel commLbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel loginTitle;
    private javax.swing.JTextField medicineSearch;
    private javax.swing.JTable medicinesTable;
    private javax.swing.JButton ordersBtn;
    private javax.swing.JLabel patientIDDisplay;
    private javax.swing.JLabel patientIDLbl;
    private javax.swing.JLabel qtyLbl;
    private javax.swing.JSpinner qtySpinner;
    private javax.swing.JButton searchBtn;
    // End of variables declaration//GEN-END:variables
        private static boolean isItInteger(String s) {
    try { 
        Integer.parseInt(s); 
    } catch(NumberFormatException e) { 
        return false; 
    } catch(NullPointerException e) {
        return false;
        }
    return true;
    }
}
