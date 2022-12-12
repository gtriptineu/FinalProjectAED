/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JSplitPane;
import model.vendor.Vendor;

import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.inventory.Inventory;
import model.inventory.InventoryDAOImp;
import model.puchase.Purchase;
import model.puchase.PurchaseDAOImp;
import model.puchase.PurchaseDirectory;
import model.store.StoreDAOImp;


/**
 *
 * @author nikethanann
 */
public class VendorProfile extends javax.swing.JPanel {

Vendor ven;
    /**
     * Creates new form VendorProfile
     */
    public VendorProfile(JSplitPane jSplitPane1,Vendor ven) {
        initComponents();
        this.jSplitPane1 = jSplitPane1;
        this.ven=ven;

        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String UpdateTime = dtf.format(now);
        System.out.println("in constructor");
        populateTable();
        
//        DefaultTableModel model = (DefaultTableModel) ordersTable.getModel();
//        model.setRowCount(0);
//
//
//            Object[] row = new Object[5];
//            row[0]= "Advil";
//            row[1]= 12345;
//            row[2]=3;
//            row[3]="Order Received";
//            row[4]=UpdateTime;
//            model.addRow(row);
            
            TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(ordersTable.getModel());
            ordersTable.setRowSorter(sorter);

            List<RowSorter.SortKey> sortKeys = new ArrayList<>(25);
            sortKeys.add(new RowSorter.SortKey(4, SortOrder.ASCENDING));
            sorter.setSortKeys(sortKeys);
            
            timer.start();
            timer.setRepeats(false);
    }
    boolean a = true;
    Timer timer = new Timer(10000,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae){
            
            DefaultTableModel model = (DefaultTableModel) ordersTable.getModel();

            String actualOrderRecd = "Order Received";
            String orderRecd = ordersTable.getModel().getValueAt(0, 3).toString();
            System.out.println(ordersTable.getModel().getValueAt(0, 3).toString() + " Value ------  "+ orderRecd.equals(actualOrderRecd));
            if(orderRecd.equals(actualOrderRecd))
            {
                System.out.println("Printing it as order shipped");
                ordersTable.getModel().setValueAt("Order Shipped",0, 3);
            }
            timer1.start();
            timer1.setRepeats(false);
            System.out.println("Exec second timer");
        }
    });
        Timer timer1 = new Timer(10500,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae){
        DefaultTableModel model = (DefaultTableModel) ordersTable.getModel();
        System.out.println(ordersTable.getModel().getValueAt(0, 3).toString() + " Value");

        ordersTable.getModel().setValueAt("Delivery successful",0, 3);
        System.out.println(ordersTable.getModel().getValueAt(0, 3).toString() + " Value");
        }
    });
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ordersTable = new javax.swing.JTable();
        refreshBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(160, 213, 229));

        jSplitPane1.setBackground(new java.awt.Color(160, 213, 229));
        jSplitPane1.setDividerLocation(175);

        jPanel1.setBackground(new java.awt.Color(160, 213, 229));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 171, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 536, Short.MAX_VALUE)
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(160, 213, 229));

        ordersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Medicine Name", "Store ID", "Quantity purchased", "Delivery Status", "Timestamp"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ordersTable);

        refreshBtn.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        refreshBtn.setText("REFRESH");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(179, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        // TODO add your handling code here:
        populateTable();

    }//GEN-LAST:event_refreshBtnActionPerformed

    public void populateTable(){
        System.out.println("in populate Table");
         DefaultTableModel model = (DefaultTableModel) ordersTable.getModel();
         model.setRowCount(0);
         System.out.println("after table def");
         PurchaseDAOImp pdao = new PurchaseDAOImp();
         PurchaseDirectory pDir = new PurchaseDirectory();
         pDir = pdao.getAll();
         System.out.println("after pDir");

         for(Purchase p: pDir.getPurchaseDir()){
             System.out.println("in for");
             InventoryDAOImp iDao = new InventoryDAOImp();
             Inventory i = iDao.getByMedicineID(p.getMedicinId());
             System.out.println("after Inventory"+p.getStoreId());
//             StoreDAOImp sDao = new StoreDAOImp();
//             String storeName = sDao.getStoreName(p.getStoreId());
//             System.out.println("after store");
             
             Object[] row = new Object[5];
              row[0]=i.getMedicineName();
              row[1] = p.getStoreId();
//              row[2] = storeName;
              row[2]=p.getQuantity();
              row[3]=p.getStatus();
              row[4] = p.getUpdateTime();
             
              model.addRow(row);
         }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable ordersTable;
    private javax.swing.JButton refreshBtn;
    // End of variables declaration//GEN-END:variables
}
