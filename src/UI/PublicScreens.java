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
    
    public PublicScreens(JSplitPane splitPane) {
        this.splitPane = splitPane;
        allStores = new StoreDirectory();
        initComponents();
        jPanel1 = new JPanel();
        DefaultTableModel model = (DefaultTableModel) medicinesTable.getModel();
       
        System.out.println("In public screen constructor");
        System.out.println("Getting store dictionary"+ allStores.getStoreDictionary());
        for(Store store: allStores.getStoreDictionary())
        {
        System.out.println("Details"+ store.getStoreName() + store.getCommunity());
        String storeName = store.getStoreName();
        String comm = store.getCommunity();
        String viewStore = "View Store";
        addRows(splitPane,storeName,comm,viewStore);
        setVisible(true);
        }
    }
    public void addRows(JSplitPane splitPane, String storeName, String comm, String viewStore){
        DefaultTableModel model = (DefaultTableModel) medicinesTable.getModel();
        model.setDataVector(new Object[][] { {storeName, comm, viewStore }}, new Object[] {"Store Name", "Community", "View Store" });
        medicinesTable.getColumn("View Store").setCellRenderer(new ButtonRenderer());
        medicinesTable.getColumn("View Store").setCellEditor(new ButtonEditor(new JCheckBox()));
        System.out.println("Added Rows to table");
        setVisible(true);
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
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Store Name", "Community", "View Store"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                            .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(253, 253, 253))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(searchTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
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
                .addContainerGap(205, Short.MAX_VALUE))
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
            
        ArrayList<String> allStoreId = new ArrayList<>();
        StoreDAOImp sDao = new StoreDAOImp();
        if(invDir.getSize()>0){
            for(Inventory i : invDir.getInventoryDirectory()){
                allStoreId.add(i.getStoreID());
            }
            System.out.println("All store id--"+ allStoreId);
            allStores = sDao.getMultipleStore(allStoreId);
        } else {
            JOptionPane.showMessageDialog(this, "Medicine not found.\nTry for a different medicine name.");
            medicineTxtField.setText("");
            commDropDown.setSelectedItem(0);
            dosageDropDown.setSelectedItem(0);
            
            for(Store s: allStores.getStoreDictionary()){
                System.out.println("--Store--"+ s.getStoreId()+"--"+s.getStoreName()+"--"+s.getCommunity());
                String storeName = s.getStoreName();
                String comm = s.getCommunity();
                String viewStore = "View Store";
                addRows(splitPane,storeName,comm,viewStore);
            }
            
        }
        
        for(Store s: allStores.getStoreDictionary()){
            System.out.println("--Store--"+ s.getStoreId()+"--"+s.getStoreName()+"--"+s.getCommunity());
        }
    }//GEN-LAST:event_searchBtnActionPerformed


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
    // End of variables declaration//GEN-END:variables

    class ButtonRenderer extends JButton implements TableCellRenderer {

      public ButtonRenderer() {
        setOpaque(true);
      }

      public Component getTableCellRendererComponent(JTable medicinesTable, Object value,
          boolean isSelected, boolean hasFocus, int row, int column) {
        if (isSelected) {
          setForeground(medicinesTable.getSelectionForeground());
          setBackground(medicinesTable.getSelectionBackground());
        } else {
          setForeground(medicinesTable.getForeground());
          setBackground(UIManager.getColor("Button.background"));
        }
        setText((value == null) ? "" : value.toString());
        return this;
      }
    }
    
        class ButtonEditor extends DefaultCellEditor {
      protected JButton button;

      private String label;

      private boolean isPushed;

      public ButtonEditor(JCheckBox checkBox) {
        super(checkBox);
        button = new JButton();
        button.setOpaque(true);
        button.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            fireEditingStopped();
          }
        });
      }

      public Component getTableCellEditorComponent(JTable table, Object value,
          boolean isSelected, int row, int column) {
        if (isSelected) {
          button.setForeground(table.getSelectionForeground());
          button.setBackground(table.getSelectionBackground());
        } else {
          button.setForeground(table.getForeground());
          button.setBackground(table.getBackground());
        }
        label = (value == null) ? "" : value.toString();
        button.setText(label);
        isPushed = true;
        return button;
      }

      public Object getCellEditorValue() {
          int result = 0 ;
        if (isPushed) {
        String[] buttons = { "Login", "Sign Up"};
//        JOptionPane.showMessageDialog(button, buttons);
        result = JOptionPane.showOptionDialog(null, "Oops! Login / Sign up, please", "Login / Sign Up",
JOptionPane.INFORMATION_MESSAGE, 0, null, buttons, buttons[1]);
        System.out.println(result);
        }
        if(result == 0) //Login
        {
            int selectedRowIndex = medicinesTable.getSelectedRow();
            String storeName = medicinesTable.getModel().getValueAt(selectedRowIndex, 1).toString();
            String comm = medicinesTable.getModel().getValueAt(selectedRowIndex, 2).toString();
            LoginPanel goToLogin=new LoginPanel(splitPane, storeName, comm);
            splitPane.setBottomComponent(goToLogin);
        }
        else // Sign up
        {
            SignupPanel goToSignup=new SignupPanel(splitPane);
            splitPane.setBottomComponent(goToSignup);
            
        }
        isPushed = false;
        return new String(label);
      }

      public boolean stopCellEditing() {
        isPushed = false;
        return super.stopCellEditing();
      }

      protected void fireEditingStopped() {
        super.fireEditingStopped();
      }
    }
}
