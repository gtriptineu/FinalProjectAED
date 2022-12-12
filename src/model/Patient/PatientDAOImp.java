/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Patient;

import SQLConnection.DBConnection;
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class PatientDAOImp implements PatientDao{

    @Override
    public void add(Patient p) {
        try{
            Connection connection= DBConnection.dbconnector();
            Statement stm = connection.createStatement();
            String insertPatientDetails = "insert into patientdetails(email,name,contact,address,password,age) values('"+p.getEmail()+"','"+p.getName()+"','"+p.getContactNo()+"','"+p.getAddress()+"','"+p.getPassword()+"')";
            stm.executeUpdate(insertPatientDetails);
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
    }

    @Override
    public boolean checkPatientAlreadyPresent(String id) {
        System.out.println("in check patient");
        boolean present = false;
        try{
            Connection connection= DBConnection.dbconnector();
            Statement stm = connection.createStatement();
            String checkPatient = "select email from patientdetails where email='"+id+"';";
            ResultSet rst= stm.executeQuery(checkPatient);
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
    public Patient getPatient(String emailId, String password) {
        System.out.println("in get patient");
        Patient loggedInPatient = new Patient();
        try
        {
            Connection connection= DBConnection.dbconnector();
            Statement stm = connection.createStatement();
            String loginPatient = "select * from patientdetails where email='"+emailId+"'and password='"+password+"';";
            ResultSet rst= stm.executeQuery(loginPatient);
            
            if(rst.next()){
                loggedInPatient.setEmail(rst.getString("email"));
                loggedInPatient.setPassword(rst.getString("password"));
                loggedInPatient.setName(rst.getString("name"));
                loggedInPatient.setContactNo(rst.getString("contact"));
                loggedInPatient.setAge(Integer.parseInt(rst.getString("age")));
                loggedInPatient.setAddress(rst.getString("address"));
            }
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return loggedInPatient;
    }

    @Override
    public int getTotalCount() {
        int total = 0;
        try {
        Connection connection= DBConnection.dbconnector();
        Statement stm = connection.createStatement();
        String query = "select count(*) as total from patientdetails;";
        ResultSet rst= stm.executeQuery(query);
        rst.next();
        total = Integer.parseInt(rst.getString("total"));
        System.out.print(total);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return total;
    }

    @Override
    public float getTotalProfit() {
        float total = 0;
        try {
        Connection connection= DBConnection.dbconnector();
        Statement stm = connection.createStatement();
        String query = "select sum(totalPrice) as totalPrice from patientpurchasehistory;";
        ResultSet rst= stm.executeQuery(query);
        rst.next();
        total = Integer.parseInt(rst.getString("totalPrice"));
        System.out.print(total);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return total;
    }
}
