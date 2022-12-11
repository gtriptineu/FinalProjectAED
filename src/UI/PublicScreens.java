/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import SQLConnection.DBConnection;
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import model.inventory.Inventory;
import model.inventory.InventoryDAOImp;
import model.inventory.InventoryDirectory;
import model.store.Store;
import model.store.StoreDAOImp;
import model.store.StoreDirectory;

/**
 *
 * @author nikethanann
 */
public class PublicScreens extends javax.swing.JPanel {

    JSplitPane splitPane;
    StoreDirectory allStores;
    String medicineNameSearched;
    
    public PublicScreens(JSplitPane splitPane) {
        this.splitPane = splitPane;
        allStores = new StoreDirectory();
        initComponents();
        DefaultTableModel model = (DefaultTableModel) medicinesTable.getModel();
        System.out.println("In public screen constructor");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        searchTitle = new javax.swing.JLabel();
        commSearchLbl = new javax.swing.JLabel();
        commDropDown = new javax.swing.JComboBox<>();
        medicineLbl = new javax.swing.JLabel();
        medicineTxtField = new javax.swing.JTextField();
        commSearchLbl1 = new javax.swing.JLabel();
        dosageDropDown = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        medicinesTable = new javax.swing.JTable();
        searchBtn = new javax.swing.JButton();
        viewBtn = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(160, 213, 229));

        searchTitle.setFont(new java.awt.Font("PT Sans", 1, 24)); // NOI18N
        searchTitle.setText("SEARCH FOR MEDICINES");

        commSearchLbl.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        commSearchLbl.setText("Search By Community:");

        commDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Select Community","Brighton", "Brookline", "Allston", "Chestnut Hill"}));
        commDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commDropDownActionPerformed(evt);
            }
        });

        medicineLbl.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        medicineLbl.setText("Medicine Name:");

        commSearchLbl1.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        commSearchLbl1.setText("Dosage:");

        dosageDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Select Dosage","250 mg", "500 mg", "600 mg", "650 mg"}));
        dosageDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosageDropDownActionPerformed(evt);
            }
        });

        medicinesTable.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        medicinesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Store Name", "Community"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        medicinesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                medicinesTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(medicinesTable);

        searchBtn.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        searchBtn.setText("SEARCH");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        viewBtn.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        viewBtn.setText("VIEW");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(viewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(medicineLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(commSearchLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(commSearchLbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(86, 86, 86)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(searchTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(medicineTxtField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(commDropDown, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dosageDropDown, 0, 162, Short.MAX_VALUE))
                                .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(searchTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(commSearchLbl)
                    .addComponent(commDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(medicineLbl)
                    .addComponent(medicineTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(commSearchLbl1)
                    .addComponent(dosageDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void commDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commDropDownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_commDropDownActionPerformed

    private void dosageDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosageDropDownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dosageDropDownActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        if(medicineTxtField.getText().equals("")|| isItInteger(medicineTxtField.getText()))
        {
            JOptionPane.showMessageDialog(this, "Enter a medicine name!");
            return;
        }
        else 
        {
            allStores = new StoreDirectory();
            String communityText = commDropDown.getSelectedItem().toString();
            String dosageText = dosageDropDown.getSelectedItem().toString();
            String medicineName = medicineTxtField.getText();

            InventoryDAOImp invDao = new InventoryDAOImp();
            InventoryDirectory invDir = new InventoryDirectory();

            if(!communityText.equals("Select Community") && !dosageText.equals("Select Dosage") && !medicineName.isEmpty() ){
                invDir = invDao.getByMedicineCommunityDosage(medicineName, communityText, dosageText);
            } else if(!dosageText.equals("Select Dosage") && !medicineName.isEmpty()){
                invDir = invDao.getByMedicineDosage(medicineName, dosageText);
            } else if (!communityText.equals("Select Community") && !medicineName.isEmpty()){
                invDir = invDao.getByMedicineCommunity(medicineName, communityText);
            } else{
                invDir = invDao.getByMedicine(medicineName);
            }

            this.medicineNameSearched = medicineName;
            ArrayList<String> allStoreId = new ArrayList<>();
            StoreDAOImp sDao = new StoreDAOImp();
            if(invDir.getSize()>0){
                for(Inventory i : invDir.getInventoryDirectory()){
                    allStoreId.add(i.getStoreID());
                }
                System.out.println("All store id--"+ allStoreId);
                allStores = sDao.getMultipleStore(allStoreId);
                DefaultTableModel model = (DefaultTableModel) medicinesTable.getModel();
                model.setRowCount(0);
                for(Store s: allStores.getStoreDictionary()){
                    System.out.println("--Store--"+ s.getStoreId()+"--"+s.getStoreName()+"--"+s.getCommunity());
                    String storeName = s.getStoreName();
                    String comm = s.getCommunity();

                    Object[] row = new Object[2];
                    row[0]= storeName;
                    row[1]= comm;
                    model.addRow(row);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Medicine not found.\nTry for a different medicine name.");
                medicineTxtField.setText("");
                commDropDown.setSelectedItem(0);
                dosageDropDown.setSelectedItem(0);
            }
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void medicinesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medicinesTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_medicinesTableMouseClicked

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        
        int selectedRowIndex = medicinesTable.getSelectedRow();
        if(selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this, "Please select a row to view.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) medicinesTable.getModel();
        String storeName = medicinesTable.getModel().getValueAt(selectedRowIndex, 0).toString();
        String comm = medicinesTable.getModel().getValueAt(selectedRowIndex, 1).toString();
        String[] buttons = { "Login", "Sign Up"};
        int result =0;
        result = JOptionPane.showOptionDialog(null, "Oops! Login / Sign up, please", "Login / Sign Up",
JOptionPane.INFORMATION_MESSAGE, 0, null, buttons, buttons[1]);
        
        if(result == 0) //Login
        {
            LoginPanel goToLogin=new LoginPanel(splitPane, storeName, comm, medicineNameSearched);
            splitPane.setBottomComponent(goToLogin);
        }
        else // Sign up
        {
            SignupPanel goToSignup=new SignupPanel(splitPane, storeName, comm,medicineNameSearched);
            splitPane.setBottomComponent(goToSignup);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_viewBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> commDropDown;
    private javax.swing.JLabel commSearchLbl;
    private javax.swing.JLabel commSearchLbl1;
    private javax.swing.JComboBox<String> dosageDropDown;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel medicineLbl;
    private javax.swing.JTextField medicineTxtField;
    private javax.swing.JTable medicinesTable;
    private javax.swing.JButton searchBtn;
    private javax.swing.JLabel searchTitle;
    private javax.swing.JButton viewBtn;
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
