/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.*;
/**
 *
 * @author User
 */
public class ConnectionProvider {
    public static Connection getCon(){
        String jdbcUrl = "jdbc:mysql://localhost:3306/cafe_management_system";
        String username = "root";
        String password = "";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            return connection;
        }
        catch(Exception e){
            return null;
        }
    }
}
