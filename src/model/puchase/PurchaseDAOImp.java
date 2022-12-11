/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.puchase;

import SQLConnection.DBConnection;
import com.mysql.jdbc.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Lenovo
 */
public class PurchaseDAOImp implements PurchaseDAO{

    @Override
    public void add(String email, String medicineId, String storeId, int quantity, String status, String timestamp, float totalPrice) {
        try{
            Connection connection= DBConnection.dbconnector();
            Statement stm = connection.createStatement();
            String insertNgoDetails = "insert into patientpurchasehistory(patientEmail,medicineId,storeId,quantity,status, timestamp, totalPrice) values('"+email+"','"+medicineId+"','"+storeId+"','"+quantity+"','"+status+"','"+timestamp+"','"+totalPrice+"')";
            stm.executeUpdate(insertNgoDetails);
            
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public PurchaseDirectory pastOrder(String email) {
        PurchaseDirectory p = new PurchaseDirectory();
        try{
            Connection connection= DBConnection.dbconnector();
            Statement stm = connection.createStatement();
            String insertNgoDetails = "select * from patientpurchasehistory where patientEmail='"+email+"';";
            stm.executeUpdate(insertNgoDetails);
            
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
        return p;
    }
    
}
