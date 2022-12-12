/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.vendor;

import SQLConnection.DBConnection;
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author rodri
 */
public class VendorDAOImp implements VendorDao {

    @Override
    public void add(Vendor v) {
        try{
            Connection connection= DBConnection.dbconnector();
            Statement stm = connection.createStatement();
            String insertPharmacistDetails = "insert into vendordetails(username,name,address,community,password,contactNumber) values('"+v.getEmail()+"','"+v.getName()+"','"+v.getAddress()+"','"+v.getCommunity()+"','"+v.getPassword()+"','"+v.getContactNo()+"')";
            System.out.println("insert Pharmacist--"+ insertPharmacistDetails);
            stm.executeUpdate(insertPharmacistDetails);
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void delete(Vendor v) {
         try{
            Connection connection= DBConnection.dbconnector();
            Statement stm = connection.createStatement();
            System.out.println("in delete"+v.getEmail());
            String deleteNgoDetails = "delete from vendordetails where username='"+v.getEmail()+"'";
            System.out.println(deleteNgoDetails);
            stm.executeUpdate(deleteNgoDetails);
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
    }

    @Override
    public VendorDirectory getAll() {
        VendorDirectory venDir = new VendorDirectory();
        try{
            Connection connection= DBConnection.dbconnector();
            Statement stm = connection.createStatement();
            String pharmacySearch = "select * from vendordetails;";
            ResultSet rst= stm.executeQuery(pharmacySearch);
            if(rst.isBeforeFirst()){
                while(rst.next()){
                    Vendor i = venDir.addVendor();
                    i.setEmail(rst.getString("username"));
                    i.setName(rst.getString("name"));
                    i.setAddress(rst.getString("address"));
                    i.setCommunity(rst.getString("community"));
                    i.setPassword(rst.getString("password"));
                    i.setContactNo(rst.getString("contactNumber"));
                    
                }
            }
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return venDir;
       
    }

    @Override
    public Vendor getVendor(String emailId, String password) {
        
        Vendor loggedInVendor = new Vendor();
        try
        {
            Connection connection= DBConnection.dbconnector();
            Statement stm = connection.createStatement();
            String loginVendor = "select * from vendordetails where username='"+emailId+"' and password='"+password+"';";          
            ResultSet rst= stm.executeQuery(loginVendor);
            if(rst.next()){
                loggedInVendor.setEmail(rst.getString("username"));
                loggedInVendor.setName(rst.getString("name"));
                loggedInVendor.setAddress(rst.getString("address"));
                loggedInVendor.setCommunity(rst.getString("community"));
                loggedInVendor.setPassword(rst.getString("password"));
                loggedInVendor.setContactNo(rst.getString("contact"));
                
            }
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return loggedInVendor;
    }

   
    
}
