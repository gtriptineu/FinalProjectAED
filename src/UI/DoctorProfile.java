/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;
import model.Patient.Patient;
import model.doctor.Doctor;
import model.inventory.Inventory;
import model.inventory.InventoryDAOImp;
import model.inventory.InventoryDirectory;
import model.store.StoreDAOImp;

/**
 *
 * @author nikethanann
 */
public class DoctorProfile extends javax.swing.JPanel {
    
    JSplitPane splitPane;
    String storeName;
    String comm;
    String medicineSearched;
    Doctor doc;
    String storeIdPurchased;
    
    public DoctorProfile(JSplitPane jSplitPane, String storeName, String comm, Doctor doc, String medicineSearched) {
        initComponents();
        this.splitPane = jSplitPane;
        this.storeName = storeName;
        this.comm = comm;
        this.doc = doc;
        this.medicineSearched = medicineSearched;
        
        licenseDisplay.setText(String.valueOf(this.doc.getDocLicense()));
        commDisplay.setText(comm);
        storeDisplay.setText(storeName);
        populateTable(medicineSearched, this.storeName, this.comm);
    }
    
    public void populateTable(String medicineName, String storeName, String community){
        DefaultTableModel model = (DefaultTableModel) medicinesTable.getModel();
        model.setRowCount(0);
        StoreDAOImp sDao = new StoreDAOImp();
        String storeId = sDao.getStoreId(storeName, community);
        this.storeIdPurchased = storeId;
        InventoryDirectory invDir = new InventoryDirectory();
        InventoryDAOImp invDao = new InventoryDAOImp();
        invDir = invDao.getByMedicineStoreId(medicineName, storeId);
        int count=1;
        for(Inventory inv: invDir.getInventoryDirectory()){
            Object[] row = new Object[4];
             row[0]=count;
             row[1]=inv;
             row[2]=inv.getDosage();
             row[3]=inv.getPrice();
             
             model.addRow(row);
            count++;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        patientIDLbl = new javax.swing.JLabel();
        licenseDisplay = new javax.swing.JLabel();
        commDisplay = new javax.swing.JLabel();
        commLbl = new javax.swing.JLabel();
        loginTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        medicinesTable = new javax.swing.JTable();
        checkoutBtn = new javax.swing.JButton();
        qtyLbl = new javax.swing.JLabel();
        qtySpinner = new javax.swing.JSpinner();
        medicineSearch = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        storeNameLbl = new javax.swing.JLabel();
        storeDisplay = new javax.swing.JLabel();

        setBackground(new java.awt.Color(160, 213, 229));

        patientIDLbl.setFont(new java.awt.Font("PT Sans", 1, 18)); // NOI18N
        patientIDLbl.setText("Doctor License No.");

        licenseDisplay.setFont(new java.awt.Font("PT Sans", 1, 18)); // NOI18N
        licenseDisplay.setText("jLabel2");

        commDisplay.setFont(new java.awt.Font("PT Sans", 0, 18)); // NOI18N
        commDisplay.setText("jLabel2");

        commLbl.setFont(new java.awt.Font("PT Sans", 0, 18)); // NOI18N
        commLbl.setText("Community:");

        loginTitle.setFont(new java.awt.Font("PT Sans", 1, 24)); // NOI18N
        loginTitle.setText("STORE DETAILS");

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
        checkoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutBtnActionPerformed(evt);
            }
        });

        qtyLbl.setFont(new java.awt.Font("PT Sans", 1, 15)); // NOI18N
        qtyLbl.setText("Quantity:");

        searchBtn.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        searchBtn.setText("SEARCH");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        storeNameLbl.setFont(new java.awt.Font("PT Sans", 0, 18)); // NOI18N
        storeNameLbl.setText("Store Name:");

        storeDisplay.setFont(new java.awt.Font("PT Sans", 0, 18)); // NOI18N
        storeDisplay.setText("jLabel2");

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
                                .addComponent(medicineSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchBtn)
                                .addGap(98, 433, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(patientIDLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(licenseDisplay))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(commLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(commDisplay)
                                        .addGap(53, 53, 53)
                                        .addComponent(storeNameLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(storeDisplay)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientIDLbl)
                    .addComponent(licenseDisplay))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(commLbl)
                    .addComponent(commDisplay)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(storeNameLbl)
                        .addComponent(storeDisplay)))
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
                .addContainerGap(84, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        if(medicineSearch.getText().equals("") || isItInteger(medicineSearch.getText())) {
            JOptionPane.showMessageDialog(this, "Medicine Name Field is empty / invalid!");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBtnActionPerformed

    private void checkoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutBtnActionPerformed
        int selectedRowIndex = medicinesTable.getSelectedRow();
        System.out.print("search---"+ selectedRowIndex);
        int quantity = (Integer) qtySpinner.getValue();
        System.out.println("Quantity selected--"+ quantity);
        if(selectedRowIndex < 0){
             JOptionPane.showMessageDialog(this, "Please select a row to proceed.");
        } else if (quantity <=0){
            JOptionPane.showMessageDialog(this, "Please select the quantity to be purchased.");
            
        } else {
            DefaultTableModel table = (DefaultTableModel) medicinesTable.getModel();
            Inventory inv = (Inventory)table.getValueAt(selectedRowIndex, 1);
            System.out.println("inventory Details"+ inv.getMedicineID()+ inv.getMedicineName());
            DoctorPurchaseScreen doctor = new DoctorPurchaseScreen(splitPane, doc, inv,quantity, storeIdPurchased);
            splitPane.setBottomComponent(doctor);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_checkoutBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkoutBtn;
    private javax.swing.JLabel commDisplay;
    private javax.swing.JLabel commLbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel licenseDisplay;
    private javax.swing.JLabel loginTitle;
    private javax.swing.JTextField medicineSearch;
    private javax.swing.JTable medicinesTable;
    private javax.swing.JLabel patientIDLbl;
    private javax.swing.JLabel qtyLbl;
    private javax.swing.JSpinner qtySpinner;
    private javax.swing.JButton searchBtn;
    private javax.swing.JLabel storeDisplay;
    private javax.swing.JLabel storeNameLbl;
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
