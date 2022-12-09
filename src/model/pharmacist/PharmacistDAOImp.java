/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.pharmacist;

import SQLConnection.DBConnection;
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nikethanann
 */
public class PharmacistDAOImp implements PharmacistDao{


    @Override
    public Pharmacist getPharmacist(String emailId, String password) {
        Pharmacist loggedInPharmacist = new Pharmacist();
        try
        {
            Connection connection= DBConnection.dbconnector();
            Statement stm = connection.createStatement();
            String loginPharmacist = "select * from pharmacistdetails where username='"+emailId+"' and password='"+password+"';";          
            ResultSet rst= stm.executeQuery(loginPharmacist);
            if(rst.next()){
                loggedInPharmacist.setEmail(rst.getString("username"));
                loggedInPharmacist.setName(rst.getString("name"));
                loggedInPharmacist.setAddress(rst.getString("address"));
                loggedInPharmacist.setStoreId(rst.getString("storeId"));
                loggedInPharmacist.setCommunity(rst.getString("community"));
                loggedInPharmacist.setAge(Integer.parseInt(rst.getString("age")));
                loggedInPharmacist.setPassword(rst.getString("password"));
                loggedInPharmacist.setContactNo(rst.getString("contact"));
                loggedInPharmacist.setStoreName(rst.getString("storeName"));
            }
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return loggedInPharmacist;
    }

    @Override
    public void add(Pharmacist p) {
        try{
            Connection connection= DBConnection.dbconnector();
            Statement stm = connection.createStatement();
            String insertPharmacistDetails = "insert into patientdetails(username,name,address,storeId,community,age,password,contactNumber,storeName) values('"+p.getEmail()+"','"+p.getName()+"','"+p.getAddress()+"','"+p.getStoreId()+"','"+p.getCommunity()+"','"+p.getAge()+"','"+p.getPassword()+"','"+p.getContactNo()+"','"+p.getStoreName()+"')";
            stm.executeUpdate(insertPharmacistDetails);
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
    

