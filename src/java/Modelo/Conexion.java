/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Eber
 */
public class Conexion {
    private Connection con;
    private final String URL ="jdbc:mysql://localhost/oestecosmetica";
    private final String USER = "root";
    private final String PASSWORD = "";
    
    public Connection get_connection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            
        } catch (Exception e) {
        }
        
        return con;
    }
    
}
