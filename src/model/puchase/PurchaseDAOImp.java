/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.puchase;

import SQLConnection.DBConnection;
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
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
            
            ResultSet rst= stm.executeQuery(insertNgoDetails);
            if(rst.isBeforeFirst()){
               while(rst.next()){
                   Purchase one = p.addNewPurchase();
                   one.setPatientEmail(rst.getString("patientEmail"));
                   one.setMedicinId(rst.getString("medicineId"));
                   one.setStoreId(rst.getString("storeId"));
                   one.setQuantity(Integer.parseInt(rst.getString("quantity")));
                   one.setStatus(rst.getString("status"));
                   one.setUpdateTime(rst.getString("timestamp"));
                   one.setTotalPrice(Float.parseFloat(rst.getString("totalPrice")));
               }
            }
            
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
        return p;
    }

    @Override
    public PurchaseDirectory salesReport() {
        PurchaseDirectory p = new PurchaseDirectory();
        try{
            Connection connection= DBConnection.dbconnector();
            Statement stm = connection.createStatement();
            String insertNgoDetails = "SELECT *, sum(quantity) as totalQuantity, sum(totalPrice) as sumPrice FROM patientpurchasehistory GROUP BY medicineId;";
            
            ResultSet rst= stm.executeQuery(insertNgoDetails);
            if(rst.isBeforeFirst()){
               while(rst.next()){
                   Purchase one = p.addNewPurchase();
                   one.setPatientEmail(rst.getString("patientEmail"));
                   one.setMedicinId(rst.getString("medicineId"));
                   one.setStoreId(rst.getString("storeId"));
                   one.setQuantity(Integer.parseInt(rst.getString("totalQuantity")));
                   one.setStatus(rst.getString("status"));
                   one.setUpdateTime(rst.getString("timestamp"));
                   one.setTotalPrice(Float.parseFloat(rst.getString("sumPrice")));
               }
            }
            
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
        return p;
    }

    @Override
    public PurchaseDirectory getAll() {
        PurchaseDirectory p = new PurchaseDirectory();
        try{
            Connection connection= DBConnection.dbconnector();
            Statement stm = connection.createStatement();
            String insertNgoDetails = "select * from patientpurchasehistory;";
            
            ResultSet rst= stm.executeQuery(insertNgoDetails);
            if(rst.isBeforeFirst()){
               while(rst.next()){
                   Purchase one = p.addNewPurchase();
                   one.setPatientEmail(rst.getString("patientEmail"));
                   one.setMedicinId(rst.getString("medicineId"));
                   one.setStoreId(rst.getString("storeId"));
                   one.setQuantity(Integer.parseInt(rst.getString("quantity")));
                   one.setStatus(rst.getString("status"));
                   one.setUpdateTime(rst.getString("timestamp"));
                   one.setTotalPrice(Float.parseFloat(rst.getString("totalPrice")));
               }
            }
            
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return p;
    }
}
