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
public class ProductoDAO {
    Conexion cn = new Conexion();
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;
    private int r;
    
    public List listar(){
        String sql = "select * from producto";
        List<Producto> lista = new ArrayList<>();
        try {
            con = cn.get_connection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Producto pro = new Producto();
                pro.setIdProducto(rs.getInt(1));
                pro.setCodigo(rs.getString(2));
                pro.setNombre(rs.getString(3));
                pro.setDescripcion(rs.getString(4));
                pro.setStock(rs.getInt(5));
                pro.setLinea(rs.getString(6));
                pro.setNumeracion(rs.getFloat(7));
                pro.setEstado(rs.getString(8));
                pro.setProovedor(rs.getString(9));
                pro.setPrecio(rs.getFloat(10));
                
               
                lista.add(pro);
                
            }
            
        } catch (Exception e) {
        }
        
        return lista;
    }
    
    public int agregar(Producto pro){
        String sql = "insert into producto(codigo_articulo,nombre,descripcion,stock,linea,numeracion,estado,proveedor,precio) values(?,?,?,?,?,?,?,?,?)";
        try {
            con = cn.get_connection();
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getCodigo());
            ps.setString(2, pro.getNombre());
            ps.setString(3, pro.getDescripcion());
            ps.setInt(4, pro.getStock());
            ps.setString(5, pro.getLinea());
            ps.setFloat(6, pro.getNumeracion());
            ps.setString(7, pro.getEstado());
            ps.setString(8, pro.getProovedor());
            ps.setFloat(9, pro.getPrecio());
            ps.executeUpdate();
            
        } catch (Exception e) {
        }
        
        
        return r;
    }
    
    public Producto listarId(int id){
        Producto pro = new Producto();
        String sql = "select * from producto where id_producto="+id;
        
        try {
            con = cn.get_connection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                pro.setIdProducto(rs.getInt(1));
                pro.setCodigo(rs.getString(2));
                pro.setNombre(rs.getString(3));
                pro.setDescripcion(rs.getString(4));
                pro.setStock(rs.getInt(5));
                pro.setLinea(rs.getString(6));
                pro.setNumeracion(rs.getFloat(7));
                pro.setEstado(rs.getString(8));
                pro.setProovedor(rs.getString(9));
                pro.setPrecio(rs.getFloat(10));
            }
        } catch (Exception e) {
        }
        
        
        return pro;
    }
    
    public int actualizar(Producto pro){
         String sql = "update producto set codigo_articulo=?,nombre=?,descripcion=?,stock=?,linea=?,numeracion=?,estado=?,proveedor=?,precio=? where id_producto=?";
        try {
            con = cn.get_connection();
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getCodigo());
            ps.setString(2, pro.getNombre());
            ps.setString(3, pro.getDescripcion());
            ps.setInt(4, pro.getStock());
            ps.setString(5, pro.getLinea());
            ps.setFloat(6, pro.getNumeracion());
            ps.setString(7, pro.getEstado());
            ps.setString(8, pro.getProovedor());
            ps.setFloat(9, pro.getPrecio());
            ps.setInt(10, pro.getIdProducto());
            ps.executeUpdate();
            
        } catch (Exception e) {
        }
        
        
        return r;
    }
    
    public void eliminar(int id){
        String sql = "delete from producto where  id_producto="+id;
        try {
            con = cn.get_connection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
}
