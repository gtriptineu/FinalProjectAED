/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;


import javax.swing.JOptionPane;



import SMTPEmail.Email;
import com.mysql.jdbc.Connection;
import java.sql.Statement;
import SQLConnection.DBConnection;
import static constants.EmailConnection.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;

import com.mysql.jdbc.Connection;
import static constants.DBConnection.*;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import model.Patient.Patient;
import model.Patient.PatientDAOImp;
/**
 *
 * @author rodri
 */
public class SignupPanel extends javax.swing.JPanel {
    JSplitPane splitPane;

    /**
     * Creates new form SignupPanel
     */
    public SignupPanel(JSplitPane splitPane) {
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

        jPasswordField1 = new javax.swing.JPasswordField();
        nameTxtField = new javax.swing.JTextField();
        emailTxtField = new javax.swing.JTextField();
        nameLbl = new javax.swing.JLabel();
        emailLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        signupBtn = new javax.swing.JButton();
        contactTextField = new javax.swing.JTextField();
        contactTextField1 = new javax.swing.JTextField();
        contactLbl = new javax.swing.JLabel();
        addressLbl = new javax.swing.JLabel();
        addressTxtField = new javax.swing.JTextField();
        passwordLbl = new javax.swing.JLabel();
        passwordTxtField = new javax.swing.JPasswordField();
        loginTitle = new javax.swing.JLabel();
        userNameLbl = new javax.swing.JLabel();
        contactLbl1 = new javax.swing.JLabel();
        ageTxtField = new javax.swing.JTextField();
        userEmailLbl = new javax.swing.JLabel();
        userContactLbl = new javax.swing.JLabel();
        ageLbl = new javax.swing.JLabel();
        passLbl = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setBackground(new java.awt.Color(160, 213, 229));

        nameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtFieldActionPerformed(evt);
            }
        });
        nameTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameTxtFieldKeyReleased(evt);
            }
        });

        emailTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTxtFieldActionPerformed(evt);
            }
        });
        emailTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailTxtFieldKeyReleased(evt);
            }
        });

        nameLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nameLbl.setText("Name:");

        emailLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        emailLbl.setText("Email:");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/add-user (1).png"))); // NOI18N

        signupBtn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        signupBtn.setText("SIGN-UP");
        signupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupBtnActionPerformed(evt);
            }
        });

        contactTextField.setForeground(new java.awt.Color(204, 204, 204));
        contactTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupBtnActionPerformed(evt);
            }
        });

        contactTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactTextFieldActionPerformed(evt);
            }
        });
        contactTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                contactTextFieldKeyReleased(evt);
            }
        });

        contactLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        contactLbl.setText("Contact:");

        addressLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addressLbl.setText("Address:");

        addressTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTxtFieldActionPerformed(evt);
            }
        });

        passwordLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passwordLbl.setText("Password:");

        passwordTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordTxtFieldKeyReleased(evt);
            }
        });

        loginTitle.setFont(new java.awt.Font("PT Sans", 1, 24)); // NOI18N
        loginTitle.setText("REGISTER");

        userNameLbl.setForeground(new java.awt.Color(255, 0, 0));

        contactLbl1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        contactLbl1.setText("Age:");

        ageTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTxtFieldActionPerformed(evt);
            }
        });
        ageTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ageTxtFieldKeyReleased(evt);
            }
        });

        userEmailLbl.setForeground(new java.awt.Color(255, 0, 0));

        userContactLbl.setForeground(new java.awt.Color(255, 0, 0));

        ageLbl.setForeground(new java.awt.Color(255, 0, 0));

        passLbl.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(270, 270, 270))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(loginTitle)
                        .addGap(242, 242, 242))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(emailLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                            .addGap(45, 45, 45)
                            .addComponent(emailTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(addressLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                        .addComponent(passwordLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                                    .addGap(45, 45, 45))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(contactLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(contactTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(addressTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                    .addComponent(passwordTxtField))
                                .addComponent(ageTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(contactLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(userNameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(userEmailLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(userContactLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ageLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                    .addComponent(passLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(signupBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 269, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(userNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nameLbl))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailLbl)
                            .addComponent(emailTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userEmailLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(contactLbl1)
                            .addComponent(ageTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(ageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(contactTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(contactLbl))
                    .addComponent(userContactLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressLbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(passwordTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(passwordLbl)))
                .addGap(67, 67, 67)
                .addComponent(signupBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtFieldActionPerformed
        // TODO add your handling code here:

        nameTxtField.setText("Enter UserName");
    }//GEN-LAST:event_nameTxtFieldActionPerformed

    private void emailTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTxtFieldActionPerformed
        // TODO add your handling code here:
        emailTxtField.setText("Enter Password");
    }//GEN-LAST:event_emailTxtFieldActionPerformed

    private void contactTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactTextFieldActionPerformed

    private void addressTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTxtFieldActionPerformed

    private void signupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupBtnActionPerformed
        // TODO add your handling code here:
        String name = nameTxtField.getText();
        String email = emailTxtField.getText();
        String contact = contactTextField.getText();
        String address = addressTxtField.getText();
        String age = ageTxtField.getText();
        //i have done this
        String password = String.valueOf(passwordTxtField.getPassword());
        
        if (name.isEmpty() || email.isEmpty() ||
                contact.isEmpty() || address.isEmpty() ||
                password.isEmpty()){
            JOptionPane.showMessageDialog(null,"Please Enter all fields");
        }
        else {
            
        //Generating Random 6 digit number as activation code
        Random rnd = new Random();
        int activationCode = rnd.nextInt(999999);
        String body = ACTIVATION_BODY + Integer.toString(activationCode);
        System.out.print("activationCode:"+ activationCode +"-------"+ body);
        
        Patient p = new Patient();
        p.setEmail(email);
        p.setName(name);
        p.setContactNo(contact);
        p.setAddress(address);
        p.setAge(Integer.parseInt(age));
        p.setPassword(password);
        PatientDAOImp pDao = new PatientDAOImp();
        boolean present = pDao.checkPatientAlreadyPresent(email);

            
            if(present){
                JOptionPane.showMessageDialog(this, "This email Id already exists.\nPlease try loging in or with a different email id.");
            } else {

                //Need todo validation 6digit integer
                String userCode;
                userCode= JOptionPane.showInputDialog("Enter activation code");

                if (userCode.isBlank()) {

                    JOptionPane.showMessageDialog(null, "Please enter activation code");
                }
                else {
                    System.out.println("in if of add");
                    Email.sendEmail(email, ACTIVATION_SUBJECTLINE, body );
                    pDao.add(p);
                    JOptionPane.showMessageDialog(this, "You have successfully signed up!");
                    LoginPanel goToLogin=new LoginPanel(splitPane,null,null);
                    splitPane.setBottomComponent(goToLogin);
                }

            }
            
        }
        
        nameTxtField.setText("");
        emailTxtField.setText("");
        contactTextField.setText("");
        addressTxtField.setText("");
        passwordTxtField.setText("");
        ageTxtField.setText("");
    }//GEN-LAST:event_signupBtnActionPerformed

    //validation
    private void nameTxtFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTxtFieldKeyReleased
        // TODO add your handling code here:
        String namePattern="^[a-zA-Z]{0,30}$";
        Pattern pat=Pattern.compile(namePattern);
        Matcher match=pat.matcher(nameTxtField.getText());
        if (!match.matches()) {
            userNameLbl.setText("Naming is incorrect");
        }
        else {
            
            userNameLbl.setText(null);
        }
    }//GEN-LAST:event_nameTxtFieldKeyReleased

    private void ageTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTxtFieldActionPerformed

    private void emailTxtFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailTxtFieldKeyReleased
        // TODO add your handling code here:
        
          String namePattern="^[a-zA-Z]{3,30}[@][a-zA-Z]{0,9}[.][a-zA-Z]{0,3}$";
        Pattern pat=Pattern.compile(namePattern);
        Matcher match=pat.matcher(emailTxtField.getText());
        if (!match.matches()) {
             userEmailLbl.setText("emailId is incorrect");
        }
        else {
             userEmailLbl.setText(null);
        }
    }//GEN-LAST:event_emailTxtFieldKeyReleased

    private void ageTxtFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageTxtFieldKeyReleased
        // TODO add your handling code here:
        String namePattern="^[0-9]{1,2}$";
        Pattern pat=Pattern.compile(namePattern);
        Matcher match=pat.matcher(ageTxtField.getText());
        if (!match.matches()) {
             ageLbl.setText("Age is incorrect!!Age should be int");
        }
        else {
             ageLbl.setText(null);
        }
    }//GEN-LAST:event_ageTxtFieldKeyReleased

    private void contactTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactTextFieldKeyReleased
        // TODO add your handling code here:
        String namePattern="^[0-9]{9,9}$";
        Pattern pat=Pattern.compile(namePattern);
        Matcher match=pat.matcher(contactTextField.getText());
        if (!match.matches()) {
             userContactLbl.setText("Mobile number is incorrect");
        }
        else {
             userContactLbl.setText(null);
        }
  
    }//GEN-LAST:event_contactTextFieldKeyReleased

    private void passwordTxtFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordTxtFieldKeyReleased
        // TODO add your handling code here:
        
        String namePattern="^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$";
        Pattern pat=Pattern.compile(namePattern);
        Matcher match=pat.matcher(passwordTxtField.getText());
        if (!match.matches()) {
             passLbl.setText("Invalid password!one uppercase,lowercase,special char and integer needed");
        }
        else {
             passLbl.setText(null);
        }
    }//GEN-LAST:event_passwordTxtFieldKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLbl;
    private javax.swing.JTextField addressTxtField;
    private javax.swing.JLabel ageLbl;
    private javax.swing.JTextField ageTxtField;
    private javax.swing.JLabel contactLbl;
    private javax.swing.JLabel contactLbl1;
    private javax.swing.JTextField contactTextField;
    private javax.swing.JTextField contactTextField1;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JTextField emailTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel loginTitle;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JLabel passLbl;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JPasswordField passwordTxtField;
    private javax.swing.JButton signupBtn;
    private javax.swing.JLabel userContactLbl;
    private javax.swing.JLabel userEmailLbl;
    private javax.swing.JLabel userNameLbl;
    // End of variables declaration//GEN-END:variables
}
