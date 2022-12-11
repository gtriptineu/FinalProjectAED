/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.inventory;

import SQLConnection.DBConnection;
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Lenovo
 */
public class InventoryDAOImp implements InventoryDAO{

    @Override
    public void add(Inventory i) {
        try{
            Connection connection= DBConnection.dbconnector();
            Statement stm = connection.createStatement();
            String insertInventory = "insert into inventory(medicineId,name,quantity,dosage,storeId,community,price) values('"+i.getMedicineID()+"','"+i.getMedicineName()+"','"+i.getQuantity()+"','"+i.getDosage()+"','"+i.getStoreID()+"','"+i.getComm()+"','"+i.getPrice()+"')";
            System.out.println("Inventory add query --"+ insertInventory);
            stm.executeUpdate(insertInventory);
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public InventoryDirectory getByMedicine(String medicineName) {
        InventoryDirectory invDir = new InventoryDirectory();
        try{
            Connection connection= DBConnection.dbconnector();
            Statement stm = connection.createStatement();
            String medicineSearch = "select *from inventory where name='"+medicineName+"';";
            ResultSet rst= stm.executeQuery(medicineSearch);
            if(rst.isBeforeFirst()){
                while(rst.next()){
                    Inventory i = invDir.addNewInventory();
                    i.setMedicineID(rst.getString("medicineId"));
                    i.setMedicineName(rst.getString("name"));
                    i.setQuantity(Integer.parseInt(rst.getString("quantity")));
                    i.setDosage(rst.getString("dosage"));
                    i.setStoreID(rst.getString("storeId"));
                    i.setComm(rst.getString("community"));
                    i.setPrice(Float.parseFloat(rst.getString("price")));
                }
            }
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
        System.out.println("inv in medicine" + invDir);
        return invDir;
        
    }

    @Override
    public InventoryDirectory getByMedicineCommunity(String medicineName, String community) {
        InventoryDirectory invDir = new InventoryDirectory();
        try{
            Connection connection= DBConnection.dbconnector();
            Statement stm = connection.createStatement();
            String medicineSearch = "select * from inventory where name='"+medicineName+"'and community='"+community+"';";
            ResultSet rst= stm.executeQuery(medicineSearch);
            if(rst.isBeforeFirst()){
                while(rst.next()){
                    Inventory i = invDir.addNewInventory();
                    i.setMedicineID(rst.getString("medicineId"));
                    i.setMedicineName(rst.getString("name"));
                    i.setQuantity(Integer.parseInt(rst.getString("quantity")));
                    i.setDosage(rst.getString("dosage"));
                    i.setStoreID(rst.getString("storeId"));
                    i.setComm(rst.getString("community"));
                    i.setPrice(Float.parseFloat(rst.getString("price")));
                }
            }
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return invDir;
    }

    @Override
    public InventoryDirectory getByMedicineDosage(String medicineName, String dosage) {
        InventoryDirectory invDir = new InventoryDirectory();
        try{
            Connection connection= DBConnection.dbconnector();
            Statement stm = connection.createStatement();
            String medicineSearch = "select * from inventory where name='"+medicineName+"'and dosage='"+dosage+"';";
            ResultSet rst= stm.executeQuery(medicineSearch);
            if(rst.isBeforeFirst()){
                while(rst.next()){
                    Inventory i = invDir.addNewInventory();
                    i.setMedicineID(rst.getString("medicineId"));
                    i.setMedicineName(rst.getString("name"));
                    i.setQuantity(Integer.parseInt(rst.getString("quantity")));
                    i.setDosage(rst.getString("dosage"));
                    i.setStoreID(rst.getString("storeId"));
                    i.setComm(rst.getString("community"));
                    i.setPrice(Float.parseFloat(rst.getString("price")));
                }
            }
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return invDir;
    }

    @Override
    public InventoryDirectory getByMedicineCommunityDosage(String medicineName, String community, String dosage) {
        InventoryDirectory invDir = new InventoryDirectory();
        try{
            Connection connection= DBConnection.dbconnector();
            Statement stm = connection.createStatement();
            String medicineSearch = "select * from inventory where name='"+medicineName+"'and dosage='"+dosage+"'and community='"+community+"';";
            ResultSet rst= stm.executeQuery(medicineSearch);
            if(rst.isBeforeFirst()){
                while(rst.next()){
                    Inventory i = invDir.addNewInventory();
                    i.setMedicineID(rst.getString("medicineId"));
                    i.setMedicineName(rst.getString("name"));
                    i.setQuantity(Integer.parseInt(rst.getString("quantity")));
                    i.setDosage(rst.getString("dosage"));
                    i.setStoreID(rst.getString("storeId"));
                    i.setComm(rst.getString("community"));
                    i.setPrice(Float.parseFloat(rst.getString("price")));
                }
            }
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return invDir;
    }

    @Override
    public InventoryDirectory getAll() {
        InventoryDirectory invDir = new InventoryDirectory();
        try{
            Connection connection= DBConnection.dbconnector();
            Statement stm = connection.createStatement();
            String medicineSearch = "select * from inventory;";
            ResultSet rst= stm.executeQuery(medicineSearch);
            if(rst.isBeforeFirst()){
                while(rst.next()){
                    Inventory i = invDir.addNewInventory();
                    i.setMedicineID(rst.getString("medicineId"));
                    i.setMedicineName(rst.getString("name"));
                    i.setQuantity(Integer.parseInt(rst.getString("quantity")));
                    i.setDosage(rst.getString("dosage"));
                    i.setStoreID(rst.getString("storeId"));
                    i.setComm(rst.getString("community"));
                    i.setPrice(Float.parseFloat(rst.getString("price")));
                }
            }
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return invDir;
    }

    @Override
    public void delete(Inventory inv) {
        try{
            Connection connection= DBConnection.dbconnector();
            Statement stm = connection.createStatement();
            System.out.println("in delete"+inv.getMedicineID());
            String deleteNgoDetails = "delete from inventory where medicineId='"+inv.getMedicineID()+"'";
            System.out.println(deleteNgoDetails);
            stm.executeUpdate(deleteNgoDetails);
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public InventoryDirectory getByMedicineStoreId(String medicinename, String storeId) {
        InventoryDirectory invDir = new InventoryDirectory();
        try{
            Connection connection= DBConnection.dbconnector();
            Statement stm = connection.createStatement();
            String medicineSearch = "select * from inventory where name='"+medicinename+"'and storeId='"+storeId+"';";
            ResultSet rst= stm.executeQuery(medicineSearch);
            if(rst.isBeforeFirst()){
                while(rst.next()){
                    Inventory i = invDir.addNewInventory();
                    i.setMedicineID(rst.getString("medicineId"));
                    i.setMedicineName(rst.getString("name"));
                    i.setQuantity(Integer.parseInt(rst.getString("quantity")));
                    i.setDosage(rst.getString("dosage"));
                    i.setStoreID(rst.getString("storeId"));
                    i.setComm(rst.getString("community"));
                    i.setPrice(Float.parseFloat(rst.getString("price")));
                }
            }
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return invDir;
    }

    @Override
    public void updateQuantity(String medicineId, int quantity) {
        try{
            Connection connection= DBConnection.dbconnector();
            Statement stm = connection.createStatement();
            String updateInvDetails = "UPDATE inventory SET quantity = quantity - '"+quantity+"' WHERE medicineId = '"+medicineId+"';";

            System.out.println(updateInvDetails);
            stm.executeUpdate(updateInvDetails);
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Inventory getByMedicineID(String medicineId) {
        Inventory i = new Inventory();
        try{
            Connection connection= DBConnection.dbconnector();
            Statement stm = connection.createStatement();
            String medicineSearch = "select *from inventory where medicineId='"+medicineId+"';";
            ResultSet rst= stm.executeQuery(medicineSearch);
            if(rst.next()){
                    i.setMedicineID(rst.getString("medicineId"));
                    i.setMedicineName(rst.getString("name"));
                    i.setQuantity(Integer.parseInt(rst.getString("quantity")));
                    i.setDosage(rst.getString("dosage"));
                    i.setStoreID(rst.getString("storeId"));
                    i.setComm(rst.getString("community"));
                    i.setPrice(Float.parseFloat(rst.getString("price")));
            }
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
        System.out.println("inv in medicine" + i);
        return i;
    }
    
}
