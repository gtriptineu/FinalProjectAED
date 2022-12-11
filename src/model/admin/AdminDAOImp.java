/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.admin;

import SQLConnection.DBConnection;
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Lenovo
 */
public class AdminDAOImp implements AdminLoginDAO{

    @Override
    public boolean loginAdmin(AdminLogin admin) {
        boolean loggedIn = false;
        
        try{
            Connection connection= DBConnection.dbconnector();
            Statement stm = connection.createStatement();
            String loginPatient = "select username,password from adminlogin where username='"+admin.getUsername()+"'and password='"+admin.getPassword()+"' and type ='"+admin.getAdminType()+"';";
            ResultSet rst= stm.executeQuery(loginPatient);
            if(rst.next()){
                loggedIn = true;
            }
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
        return loggedIn;
    }
    
}
