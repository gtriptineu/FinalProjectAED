/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;
import model.ngo.Ngo;
import model.ngo.NgoDAOImp;
import model.ngo.NgoDirectory;

/**
 *
 * @author rodri
 */
public class FindNgoPanel extends javax.swing.JPanel {

  JSplitPane splitPane;
   NgoDirectory allNgo;
    /**
     * Creates new form FindNgoPanel
     */
    public FindNgoPanel(JSplitPane splitPane) {
        allNgo = new NgoDirectory();
        this.splitPane = splitPane;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        loginTitle = new javax.swing.JLabel();
        cityLbl = new javax.swing.JLabel();
        commDropDown = new javax.swing.JComboBox<>();
        commLbl = new javax.swing.JLabel();
        cityTxtField = new javax.swing.JTextField();
        findBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ngoTbl = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(160, 213, 229));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/find.png"))); // NOI18N

        loginTitle.setFont(new java.awt.Font("PT Sans", 1, 24)); // NOI18N
        loginTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginTitle.setText("FIND NGO");

        cityLbl.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        cityLbl.setText("City:");

        commDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Select Community","Brighton", "Brookline", "Allston", "Chestnut Hill","Huntington Avenue"}));
        commDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commDropDownActionPerformed(evt);
            }
        });

        commLbl.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        commLbl.setText("Community:");

        findBtn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        findBtn.setText("FIND");
        findBtn.setMaximumSize(new java.awt.Dimension(74, 26));
        findBtn.setMinimumSize(new java.awt.Dimension(74, 26));
        findBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findBtnActionPerformed(evt);
            }
        });

        ngoTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NgoName", "Functionality", "Community", "City"
            }
        ));
        jScrollPane2.setViewportView(ngoTbl);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("NGO Details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(loginTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(commLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addComponent(cityLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cityTxtField)
                            .addComponent(commDropDown, 0, 142, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(364, 364, 364)
                .addComponent(findBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(400, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(commDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(commLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(findBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void commDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commDropDownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_commDropDownActionPerformed

    private void findBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findBtnActionPerformed
        // TODO add your handling code here:
        allNgo = new NgoDirectory();
        String communityText = commDropDown.getSelectedItem().toString();
        String cityName = cityTxtField.getText();
        
          if (communityText.isEmpty() || cityName.isEmpty()){
            JOptionPane.showMessageDialog(null,"Please Enter all fields");
        }
        else {
        NgoDAOImp ngoDao = new NgoDAOImp();
        NgoDirectory ngoDir = new NgoDirectory();
        ngoDir = ngoDao.getByCommunityCity(communityText, cityName);
        
        
        if(ngoDir.getSize()>0){
           System.out.println("All store id--");
           for(Ngo i : ngoDir.getNgoDirectory()){
               addRows(splitPane,i.getName(),i.getFunctionality(),i.getCommunity(),i.getCity());
            }
            
        } else {
            JOptionPane.showMessageDialog(this, "Ngo not found.\nTry for a different community and city.");
            cityTxtField.setText("");
            commDropDown.setSelectedItem(0);
            
        }
              
              
          }
          
        
    }//GEN-LAST:event_findBtnActionPerformed


     public void addRows(JSplitPane splitPane, String ngoName,String ngofunc, String comm, String city){
        DefaultTableModel model = (DefaultTableModel) ngoTbl.getModel();
        model.setDataVector(new Object[][] { {ngoName,ngofunc, comm, city }}, new Object[] {"NgoName","Functionality", "Community", "City" });
        
        System.out.println("Added Rows to table");
        setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cityLbl;
    private javax.swing.JTextField cityTxtField;
    private javax.swing.JComboBox<String> commDropDown;
    private javax.swing.JLabel commLbl;
    private javax.swing.JButton findBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel loginTitle;
    private javax.swing.JTable ngoTbl;
    // End of variables declaration//GEN-END:variables
}


