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
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.store.Store;

/**
 *
 * @author nikethanann
 */
public class VendorProfile extends javax.swing.JPanel {


    public VendorProfile(JSplitPane jSplitPane1) {
        initComponents();
        this.jSplitPane1 = jSplitPane1;
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String UpdateTime = dtf.format(now);
        
        DefaultTableModel model = (DefaultTableModel) ordersTable.getModel();
        model.setRowCount(0);

            Object[] row = new Object[5];
            row[0]= "Advil";
            row[1]= 12345;
            row[2]=3;
            row[3]="Order Received";
            row[4]=UpdateTime;
            model.addRow(row);
            
            TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(ordersTable.getModel());
            ordersTable.setRowSorter(sorter);

            List<RowSorter.SortKey> sortKeys = new ArrayList<>(25);
            sortKeys.add(new RowSorter.SortKey(4, SortOrder.ASCENDING));
            sorter.setSortKeys(sortKeys);
            
            timer.start();
            timer.setRepeats(false);
//            timer.setDelay(500);
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
        ordersBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ordersTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(160, 213, 229));

        jSplitPane1.setBackground(new java.awt.Color(160, 213, 229));
        jSplitPane1.setDividerLocation(175);

        jPanel1.setBackground(new java.awt.Color(160, 213, 229));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ordersBtn.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        ordersBtn.setText("ORDERS");
        ordersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordersBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(ordersBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(ordersBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(339, Short.MAX_VALUE))
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
                "Medicine ID", "Store ID", "Quantity purchased", "Delivery Status", "Timestamp"
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(227, Short.MAX_VALUE))
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

    private void ordersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordersBtnActionPerformed
        
        // TODO add your handling code here:
    }//GEN-LAST:event_ordersBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton ordersBtn;
    private javax.swing.JTable ordersTable;
    // End of variables declaration//GEN-END:variables
}
