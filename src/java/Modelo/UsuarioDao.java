/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Eber
 */
public class UsuarioDao {
    Conexion cn = new Conexion();
   private Connection con;
   private PreparedStatement ps;
   private ResultSet rs;
    
    public Usuario validar(String nombre, String contrasenia){
        Usuario usu = new Usuario();
        String sql = "select * from usuario where nombre=? and contrasenia=?";
        try {
           con = cn.get_connection();
           ps = con.prepareStatement(sql);
           ps.setString(1, nombre);
           ps.setString(2, contrasenia);
           rs = ps.executeQuery();
            while(rs.next()){
                usu.setId_usuario(rs.getInt("id_usuario"));
                usu.setNombre(rs.getString("nombre"));
                usu.setContrasenia(rs.getString("contrasenia"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        return usu;
    }
    
}
