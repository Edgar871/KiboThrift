/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Edgar Hadhyra J
 */
public class DBConnection {
    public Connection open(){
        Connection con;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            String url="jdbc:mysql://localhost:3306/kibo";
            String username = "root";
            String password = "";
            
            con = (Connection) DriverManager.getConnection(url, username, password);
            System.out.println("Connected");
            return con;
        }
        catch(Exception e){
            System.err.println(e);
            return null;
        }
    }
}
