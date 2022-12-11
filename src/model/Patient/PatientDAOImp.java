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
        Patient loggedInPatient = new Patient();
        try
        {
            Connection connection= DBConnection.dbconnector();
            Statement stm = connection.createStatement();
            String loginPatient = "select email,password,name from patientdetails where email='"+emailId+"'and password='"+password+"';";
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
}
