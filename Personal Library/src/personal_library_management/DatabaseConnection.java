/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal_library_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Fazle Rabbi
 */
public class DatabaseConnection {
  
   public void  DataBase()
    {   
        try{
            //mysql connection
            String userName = "root";
            String password = "";
            String url      = "jdbc:mysql://localhost:3306/personal_Book_Manager";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con  = DriverManager.getConnection(url, userName, password);
            Statement st    = con.createStatement();
        }
    catch(Exception e){
        e.printStackTrace();
        }
    }
    
}
