/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.store;

import SQLConnection.DBConnection;
import com.mysql.jdbc.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author Lenovo
 */
public class StoreDAOImp implements StoreDAO{

    @Override
    public StoreDirectory getMultipleStore(ArrayList<String> storeIdList) {
        StoreDirectory sd = new StoreDirectory();
        try{
            Connection connection= DBConnection.dbconnector();
            Statement stm = connection.createStatement();
            for(int i =0; i<storeIdList.size(); i++){
                String storeSearch = "select * from storedetails where storeId='"+storeIdList.get(i)+"';";
                ResultSet rs= stm.executeQuery(storeSearch);
                while(rs.next()){
                    Store s = sd.addNewStore();
                    s.setStoreId(rs.getString("storeId"));
                    s.setStoreName(rs.getString("storeName"));
                    s.setCommunity(rs.getString("community"));
                }
            }
         } catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return sd;
    }

    @Override
    public void add(Store s) {
        try{
            Connection connection= DBConnection.dbconnector();
            Statement stm = connection.createStatement();
            String insertInventory = "insert into storedetails(storId,storeName,community) values('"+s.getStoreId()+"','"+s.getStoreName()+"','"+s.getCommunity()+"')";
            stm.executeUpdate(insertInventory);
         } catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String getStoreId(String storeName, String comm) {
        String storeId = null;
        try{
            Connection connection= DBConnection.dbconnector();
            Statement stm = connection.createStatement();
            String storeSearch = "select * from storedetails where storeName='"+storeName+"'and community='"+comm+"';";
            ResultSet rs= stm.executeQuery(storeSearch);
            if(rs.next()){
                storeId = rs.getString("storeId");
            }
         } catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return storeId;
    }

    @Override
    public String getStoreName(String storeId) {
        String storeName = null;
        try{
            Connection connection= DBConnection.dbconnector();
            Statement stm = connection.createStatement();
            String storeSearch = "select * from storedetails where storeId='"+storeId+"';";
            ResultSet rs= stm.executeQuery(storeSearch);
            if(rs.next()){
                storeId = rs.getString("storeName");
            }
         } catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return storeId;
    }
    
}
