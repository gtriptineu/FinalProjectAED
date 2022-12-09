/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.ngo;

import SQLConnection.DBConnection;
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.inventory.Inventory;

/**
 *
 * @author Lenovo
 */
public class NgoDAOImp implements NgoDAO{

    @Override
    public void add(Ngo ngo) {
        try{
            Connection connection= DBConnection.dbconnector();
            Statement stm = connection.createStatement();
            System.out.println(ngo.getCity()+"---"+ngo.getId()+"--"+ngo.getName());
            String insertNgoDetails = "insert into ngodetails(id,name,community,city,functionality) values('"+ngo.getId()+"','"+ngo.getName()+"','"+ngo.getCommunity()+"','"+ngo.getCity()+"','"+ngo.getFunctionality()+"')";
            stm.executeUpdate(insertNgoDetails);
            
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void delete(Ngo ngo) {
        try{
            Connection connection= DBConnection.dbconnector();
            Statement stm = connection.createStatement();
            String deleteNgoDetails = "delete from ngodetails where name='"+ngo.getName()+"'";
            stm.executeUpdate(deleteNgoDetails);
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public NgoDirectory getAll() {
        NgoDirectory ngoDir = new NgoDirectory();
        try{
            Connection connection= DBConnection.dbconnector();
            Statement stm = connection.createStatement();
            String medicineSearch = "select * from ngodetails;";
            ResultSet rst= stm.executeQuery(medicineSearch);
            if(rst.isBeforeFirst()){
                while(rst.next()){
                    Ngo i = ngoDir.addNewNgo();
                    i.setId(rst.getString("id"));
                    i.setName(rst.getString("name"));
                    i.setCommunity(rst.getString("community"));
                    i.setCity(rst.getString("city"));
                    i.setFunctionality(rst.getString("functionality"));
                }
            }
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return ngoDir;
    }
    
}
