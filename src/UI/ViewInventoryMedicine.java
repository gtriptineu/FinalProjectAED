/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;
import model.inventory.Inventory;
import model.inventory.InventoryDAOImp;
import model.inventory.InventoryDirectory;

/**
 *
 * @author nikethanann
 */
public class ViewInventoryMedicine extends javax.swing.JPanel {

    JSplitPane jSplitPane;
    public ViewInventoryMedicine(JSplitPane jSplitPane) {
        initComponents();
        this.jSplitPane = jSplitPane;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        medicineTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inventoryTable = new javax.swing.JTable();
        deleteBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        searchTxtField = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(160, 213, 229));

        medicineTitle.setFont(new java.awt.Font("PT Sans", 1, 24)); // NOI18N
        medicineTitle.setText("VIEW MEDICINES");

        inventoryTable.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        inventoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Medicine ID", "Medicine Name", "Quantity", "Dosage", "Community", "Store ID", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(inventoryTable);

        deleteBtn.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        deleteBtn.setText("DELETE");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        refreshBtn.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        refreshBtn.setText("REFRESH");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        updateBtn.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        updateBtn.setText("UPDATE");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        searchBtn.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        searchBtn.setText("SEARCH BY MEDICINE");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(366, 366, 366)
                        .addComponent(medicineTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(updateBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(searchTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(34, 34, 34)
                                    .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(286, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(medicineTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(131, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        String medicineName = searchTxtField.getText();
        
        InventoryDirectory invDir = new InventoryDirectory();
        InventoryDAOImp ngoDao = new InventoryDAOImp();
        invDir = ngoDao.getByMedicine(medicineName);
        populateTableById(invDir);
        
    }//GEN-LAST:event_searchBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        InventoryProfile goToProfile = new InventoryProfile(jSplitPane);
        jSplitPane.setRightComponent(goToProfile);
    }//GEN-LAST:event_backBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = inventoryTable.getSelectedRow();
        System.out.print("search---"+ selectedRowIndex);
        if(selectedRowIndex < 0){
             JOptionPane.showMessageDialog(this, "Please select a row to be deleted.");
        } else {
            DefaultTableModel table = (DefaultTableModel) inventoryTable.getModel();
            Inventory inv = (Inventory)table.getValueAt(selectedRowIndex, 1);
            InventoryDAOImp invDao = new InventoryDAOImp();
            invDao.delete(inv);
            JOptionPane.showMessageDialog(this, "Medicine Id: "+ inv.getMedicineID()+ " is deleted.");
            populateTable();
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = inventoryTable.getSelectedRow();
        System.out.print("search---"+ selectedRowIndex);
        if(selectedRowIndex < 0){
             JOptionPane.showMessageDialog(this, "Please select a row to be updated.");
        } else {
           DefaultTableModel table = (DefaultTableModel) inventoryTable.getModel();
           Inventory inv = (Inventory)table.getValueAt(selectedRowIndex, 1);
           InventoryDAOImp invDao = new InventoryDAOImp();
           invDao.delete(inv);
           AddInventoryMedicine goToAddInventory = new AddInventoryMedicine(jSplitPane, inv, true);
           jSplitPane.setRightComponent(goToAddInventory);
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void populateTable() {
        InventoryDirectory invDir = new InventoryDirectory();
        InventoryDAOImp ngoDao = new InventoryDAOImp();
        invDir = ngoDao.getAll();
        
        DefaultTableModel model = (DefaultTableModel) inventoryTable.getModel();
        model.setRowCount(0);
         
         for(Inventory p: invDir.getInventoryDirectory())
         {
             Object[] row = new Object[7];
             row[0]=p.getMedicineID();
             row[1]=p;
             row[2]=p.getQuantity();
             row[3]=p.getDosage();
             row[4]=p.getComm();
             row[5] = p.getStoreID();
             row[6] = p.getPrice();
             
             model.addRow(row);
         }
    }
    
    private void populateTableById (InventoryDirectory invDir){
        
        DefaultTableModel model = (DefaultTableModel) inventoryTable.getModel();
        model.setRowCount(0);
         
         for(Inventory p: invDir.getInventoryDirectory())
         {
             Object[] row = new Object[7];
             row[0]=p.getMedicineID();
             row[1]=p;
             row[2]=p.getQuantity();
             row[3]=p.getDosage();
             row[4]=p.getComm();
             row[5] = p.getStoreID();
             row[6] = p.getPrice();
             
             model.addRow(row);
         }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTable inventoryTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel medicineTitle;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchTxtField;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
