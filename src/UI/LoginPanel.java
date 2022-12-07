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
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;

/**
 *
 * @author rodri
 */
public class LoginPanel extends javax.swing.JPanel {

    JSplitPane jSplitPane;
    String storeName;
    String comm;
    public LoginPanel(JSplitPane jSplitPane, String storeName, String comm) {
        initComponents();
        this.jSplitPane = jSplitPane;
        this.storeName = storeName;
        this.comm = comm;       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        loginLbl = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        userNameTxtField = new javax.swing.JTextField();
        passwordTxtField = new javax.swing.JTextField();
        userNameLbl = new javax.swing.JLabel();
        passwordLbl = new javax.swing.JLabel();
        signUpBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(160, 213, 229));
        setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/user.png"))); // NOI18N

        loginLbl.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        loginLbl.setText("Welcome, User!!");

        loginBtn.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        loginBtn.setText("LOGIN");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        userNameTxtField.setForeground(new java.awt.Color(204, 204, 204));
        userNameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTxtFieldActionPerformed(evt);
            }
        });

        passwordTxtField.setForeground(new java.awt.Color(204, 204, 204));
        passwordTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTxtFieldActionPerformed(evt);
            }
        });

        userNameLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        userNameLbl.setText("UserName:");

        passwordLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passwordLbl.setText("Password:");

        signUpBtn.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        signUpBtn.setText("SIGNUP");
        signUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpBtnActionPerformed(evt);
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
                .addGap(0, 151, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(userNameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(passwordLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(435, 435, 435))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(274, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(280, 280, 280))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(userNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(230, 230, 230))))
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(backBtn)
                .addGap(35, 35, 35)
                .addComponent(signUpBtn)
                .addGap(26, 26, 26)
                .addComponent(loginBtn)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginLbl)
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameLbl)
                    .addComponent(userNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLbl))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginBtn)
                    .addComponent(signUpBtn)
                    .addComponent(backBtn))
                .addContainerGap(104, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void userNameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTxtFieldActionPerformed
        // TODO add your handling code here:
        userNameTxtField.setText("Enter UserName");
    }//GEN-LAST:event_userNameTxtFieldActionPerformed

    private void passwordTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTxtFieldActionPerformed
        // TODO add your handling code here:
        passwordTxtField.setText("Enter Password");
    }//GEN-LAST:event_passwordTxtFieldActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
        
        String email = userNameTxtField.getText();
        String password = passwordTxtField.getText();
        
        try
        {
            System.out.println("In try");
            Connection connection= DBConnection.dbconnector();
            Statement stm = connection.createStatement();
            String loginPatient = "select email,password,name from patientdetails where email='"+email+"'and password='"+password+"';";
            
            ResultSet rst= stm.executeQuery(loginPatient);
            if (rst.next()){
                String patientName = rst.getString("Name");
                JOptionPane.showMessageDialog(this, "Login Sucess. Welcome "+ patientName+ ".");
                PatientProfile goToPatient = new PatientProfile(jSplitPane, storeName, comm, patientName);
                jSplitPane.setBottomComponent(goToPatient);
                System.out.println("Going to patient profile");
            } else {
                JOptionPane.showMessageDialog(this, "Login Failed");
                userNameTxtField.setText("");
                passwordTxtField.setText("");
            }
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
       //PharmacistPanel pharma=new PharmacistPanel();
        //pharma.setVisible(true);
    }//GEN-LAST:event_loginBtnActionPerformed

    private void signUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpBtnActionPerformed
        SignupPanel goToSignUp = new SignupPanel(jSplitPane);
        jSplitPane.setBottomComponent(goToSignUp);
        // TODO add your handling code here:
    }//GEN-LAST:event_signUpBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        PublicScreens goToPublic = new PublicScreens(jSplitPane);
        jSplitPane.setBottomComponent(goToPublic);
// TODO add your handling code here:
    }//GEN-LAST:event_backBtnActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel loginLbl;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JTextField passwordTxtField;
    private javax.swing.JButton signUpBtn;
    private javax.swing.JLabel userNameLbl;
    private javax.swing.JTextField userNameTxtField;
    // End of variables declaration//GEN-END:variables
}
