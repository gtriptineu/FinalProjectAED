/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.doctor;

import SQLConnection.DBConnection;
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author nikethanann
 */
public class DoctorDAOImpl implements DoctorDAO{

    @Override
    public void add(Doctor doc) {
        try{
            Connection connection= DBConnection.dbconnector();
            Statement stm = connection.createStatement();
            String insertDoctorDetails = "insert into doctordetails(name,email,license,contact,address,password) values('"+doc.getDocName()+"','"+doc.getDocEmail()+"','"+doc.getDocLicense()+"','"+doc.getDocContact()+"','"+doc.getDocAddress()+"','"+doc.getDocPassword()+"')";
            System.out.println("insert Doctor--"+ insertDoctorDetails);
            stm.executeUpdate(insertDoctorDetails);
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public boolean checkDoctorAlreadyPresent(String email) {
        boolean present = false;
        try{
            Connection connection= DBConnection.dbconnector();
            Statement stm = connection.createStatement();
            String checkDoctor = "select email from doctordetails where email='"+email+"';";
            ResultSet rst= stm.executeQuery(checkDoctor);
            if(rst.next()){
                present = true;
            } else{
                present = false;
            }
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
        return present;
    }

    @Override
    public Doctor getDoctor(String emailId, String password) {
        Doctor loggedInDoctor = new Doctor();
        try
        {
            Connection connection= DBConnection.dbconnector();
            Statement stm = connection.createStatement();
            String loginPatient = "select email,password,name from doctordetails where email='"+emailId+"'and password='"+password+"';";
            ResultSet rst= stm.executeQuery(loginPatient);
            
            if(rst.next()){
                loggedInDoctor.setDocEmail(rst.getString("email"));
                loggedInDoctor.setDocPassword(rst.getString("password"));
                loggedInDoctor.setDocName(rst.getString("name"));
                loggedInDoctor.setDocContact(rst.getString("contact"));
                loggedInDoctor.setDocLicense(Integer.valueOf(rst.getString("license")));
                loggedInDoctor.setDocAddress(rst.getString("address"));
            }
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return loggedInDoctor;
    }
    
}
