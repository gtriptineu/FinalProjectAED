/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import model.admin.AdminDAOImp;
import model.admin.AdminLogin;

/**
 *
 * @author rodri
 */
public class LoginNgoPanel extends javax.swing.JPanel {
JSplitPane splitPane;
    /**
     * Creates new form LoginNgoPanel
     */
    public LoginNgoPanel(JSplitPane splitPane) {
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

        loginBtn = new javax.swing.JButton();
        loginLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        userNameLbl = new javax.swing.JLabel();
        userNameTxtField = new javax.swing.JTextField();
        passwordLbl = new javax.swing.JLabel();
        passwordTxtField = new javax.swing.JPasswordField();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(160, 213, 229));

        loginBtn.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        loginBtn.setText("LOGIN");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        loginLbl.setFont(new java.awt.Font("PT Sans", 1, 18)); // NOI18N
        loginLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginLbl.setText("NGO ADMIN ");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/user.png"))); // NOI18N

        userNameLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        userNameLbl.setText("UserName:");

        userNameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTxtFieldActionPerformed(evt);
            }
        });

        passwordLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passwordLbl.setText("Password:");

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
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(323, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(userNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(userNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(passwordLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(passwordTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(287, 287, 287))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addGap(30, 30, 30)
                        .addComponent(loginBtn)
                        .addGap(345, 345, 345))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginLbl)
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameLbl)
                    .addComponent(userNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLbl)
                    .addComponent(passwordTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginBtn)
                    .addComponent(backBtn))
                .addContainerGap(146, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
        String username = userNameTxtField.getText();
        String password = String.valueOf(passwordTxtField.getPassword());
        
        if (username.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(null,"Please Enter all fields");
        } else  {
           boolean loginSuccess = false;
        AdminLogin admin = new AdminLogin();
        admin.setUsername(username);
        admin.setPassword(password);
        admin.setAdminType("ngo");
        AdminDAOImp adminDao = new AdminDAOImp();
        loginSuccess = adminDao.loginAdmin(admin);

        if(loginSuccess){
              NgoAdminPanel ngoPanel=new NgoAdminPanel(splitPane);
             splitPane.setBottomComponent(ngoPanel);
        } else {
            JOptionPane.showMessageDialog(this, "Login Failed.");
            userNameTxtField.setText("");
            passwordTxtField.setText("");
        }  
        }
       
    }//GEN-LAST:event_loginBtnActionPerformed

    private void userNameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTxtFieldActionPerformed
        // TODO add your handling code here:
        userNameTxtField.setText("Enter UserName");
    }//GEN-LAST:event_userNameTxtFieldActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        AllAdmins goToAdmins = new AllAdmins(splitPane);
        splitPane.setBottomComponent(goToAdmins);
        // TODO add your handling code here:
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel loginLbl;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JPasswordField passwordTxtField;
    private javax.swing.JLabel userNameLbl;
    private javax.swing.JTextField userNameTxtField;
    // End of variables declaration//GEN-END:variables
}
