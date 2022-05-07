/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eber
 */
public class ClienteDAO {
    
      Conexion cn = new Conexion();
      private Connection con;
      private PreparedStatement ps;
      private ResultSet rs;
      private int r;
              
    
    public List listar(){
        String sql = "select * from cliente";
        List<Cliente> lista = new ArrayList<>();
        
        try {
            con = cn.get_connection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Cliente cli = new Cliente();
                cli.setId(rs.getInt(1));
                cli.setCodigo_cliente(rs.getString(2));
                cli.setNombre(rs.getString(3));
                cli.setZona(rs.getString(4));
                cli.setTelefono(rs.getInt(5));
                cli.setDireccion(rs.getString(6));
                cli.setEstado(rs.getString(7));
                
                lista.add(cli);
                
            }
                   
        } catch (Exception e) {
        }
        return lista;
    }
    
    public int agregar(Cliente cli){
        String sql = "insert into cliente(codigo_cliente,nombre,zona,telefono,direccion,saldo,estado)values(?,?,?,?,?,?,?)";
        
        try {
            con = cn.get_connection();
            ps = con.prepareStatement(sql);
            ps.setString(1, cli.getCodigo_cliente());
            ps.setString(2, cli.getNombre());
            ps.setString(3, cli.getZona());
            ps.setInt(4, cli.getTelefono());
            ps.setString(5,cli.getDireccion());
            ps.setDouble(6, cli.getSaldo());
            ps.setString(7, cli.getEstado());
            ps.executeUpdate();
        } catch (Exception e) {
        }
                
                
        return r;
    }
    public Cliente listarId(int id){
        Cliente cli = new Cliente();
        String sql = "select * from cliente where id_cliente="+id;
        try {
            con = cn.get_connection();
            ps = con.prepareCall(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                cli.setId(rs.getInt(1));
                cli.setCodigo_cliente(rs.getString(2));
                cli.setNombre(rs.getString(3));
                cli.setZona(rs.getString(4));
                cli.setTelefono(rs.getInt(5));
                cli.setDireccion(rs.getString(6));
                cli.setSaldo(rs.getFloat(7));
                cli.setEstado(rs.getString(9));
                
            }
          
            
        } catch (Exception e) {
        }
        return cli;
    }
    
    
     public int actualizar(Cliente cli){
         
          String sql = "update cliente set codigo_cliente=?, nombre=?, zona=?, telefono=?, direccion=?, saldo=?, estado=? where id_cliente=?";
        
        try {
            con = cn.get_connection();
            ps = con.prepareStatement(sql);
            ps.setString(1, cli.getCodigo_cliente());
            ps.setString(2, cli.getNombre());
            ps.setString(3, cli.getZona());
            ps.setInt(4, cli.getTelefono());
            ps.setString(5,cli.getDireccion()); 
            ps.setFloat(6, cli.getSaldo());
            ps.setString(7, cli.getEstado());
            ps.setInt(8, cli.getId());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
                
               return r;
    }  
        
    
     
     public void eleminar(int id){
         String sql = "delete from cliente where id_cliente="+id;
         try {
             con = cn.get_connection();
             ps = con.prepareStatement(sql);
             ps.executeUpdate();
         } catch (Exception e) {
         }
     }
}
