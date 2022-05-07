/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Eber
 */
public class Cliente {
    private int id;
    private String codigo_cliente;
    private String nombre;
    private String zona;
    private int telefono;
    private String direccion;
    private float saldo;
    private int decuento;
    private String estado;
    
    public Cliente(){
    
    }

    public Cliente(int id, String codigo_cliente, String nombre, String zona, int telefono, String direccion, float saldo, int decuento, String estado) {
        this.id = id;
        this.codigo_cliente = codigo_cliente;
        this.nombre = nombre;
        this.zona = zona;
        this.telefono = telefono;
        this.direccion = direccion;
        this.saldo = saldo;
        this.decuento = decuento;
        this.estado = estado;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo_cliente() {
        return codigo_cliente;
    }

    public void setCodigo_cliente(String codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

 
    public int getDecuento() {
        return decuento;
    }

    public void setDecuento(int decuento) {
        this.decuento = decuento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
