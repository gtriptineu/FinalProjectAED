/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQLConnection;

import java.sql.DriverManager;
import static constants.DBConnection.*;
import com.mysql.jdbc.Connection;

/**
 *
 * @author Lenovo
 */
public class DBConnection {
    Connection con=null;
    public static Connection dbconnector()
    {
        try
        {
            Class.forName(DB_CLASSNAME);

            Connection con=(Connection) DriverManager.getConnection(DB_URL, DB_USER, DB_PASS );
            System.out.println("Connection Sucessfull"+DB_URL);

           Connection con=(Connection) DriverManager.getConnection(DB_URL, DB_USER, DB_PASS );
            //System.out("Connection Sucessfull");

            return con;
            
        }
        catch(Exception e)
                {
                    return null;
                }
        
    }
}
