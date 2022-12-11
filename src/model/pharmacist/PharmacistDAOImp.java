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
                loggedInPharmacist.setStatus(rst.getString("status"));
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
            String insertPharmacistDetails = "insert into pharmacistdetails(username,name,address,storeId,community,age,password,contactNumber,storeName,status) values('"+p.getEmail()+"','"+p.getName()+"','"+p.getAddress()+"','"+p.getStoreId()+"','"+p.getCommunity()+"','"+p.getAge()+"','"+p.getPassword()+"','"+p.getContactNo()+"','"+p.getStoreName()+"','"+p.getStatus()+"')";
            System.out.println("insert Pharmacist--"+ insertPharmacistDetails);
            stm.executeUpdate(insertPharmacistDetails);
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public PharmacistDirectory getAll() {
        PharmacistDirectory invDir = new PharmacistDirectory();
        try{
            Connection connection= DBConnection.dbconnector();
            Statement stm = connection.createStatement();
            String pharmacySearch = "select * from pharmacistdetails;";
            ResultSet rst= stm.executeQuery(pharmacySearch);
            if(rst.isBeforeFirst()){
                while(rst.next()){
                    Pharmacist i = invDir.addPharmacist();
                    i.setEmail(rst.getString("username"));
                    i.setName(rst.getString("name"));
                    i.setAddress(rst.getString("address"));
                    i.setStoreId(rst.getString("storeId"));
                    i.setCommunity(rst.getString("community"));
                    i.setAge(Integer.parseInt(rst.getString("age")));
                    i.setPassword(rst.getString("password"));
                    i.setContactNo(rst.getString("contactNumber"));
                    i.setStoreName(rst.getString("storeName"));
                    i.setStatus(rst.getString("status"));
                    
                }
            }
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return invDir;
    }

    @Override
    public void delete(Pharmacist p) {
        try{
            Connection connection= DBConnection.dbconnector();
            Statement stm = connection.createStatement();
            System.out.println("in delete"+p.getEmail());
            String deleteNgoDetails = "delete from pharmacistdetails where username='"+p.getEmail()+"'";
            System.out.println(deleteNgoDetails);
            stm.executeUpdate(deleteNgoDetails);
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
    

