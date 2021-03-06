/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
import Modelo.ClienteDAO;
import Modelo.Producto;
import Modelo.ProductoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Eber
 */
public class Controlador extends HttpServlet {

            Cliente cli =  new Cliente();
            ClienteDAO clidao = new ClienteDAO();
            private int ide;
            Producto pro = new Producto();
            ProductoDAO pdao = new ProductoDAO();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String menu = request.getParameter("menu");
            String accion = request.getParameter("accion");
            
            if(menu.equalsIgnoreCase("Principal")){
                 request.getRequestDispatcher("Principal.jsp").forward(request, response);
            }
            
            if(menu.equalsIgnoreCase("Cliente")){
                switch(accion){
                    case "Listar":
                         List lista = clidao.listar();
                         request.setAttribute("clientes", lista);
                        break;
                    
                    case "Agregar":
                        String codigo=request.getParameter("txtCodigo");
                        String nombre=request.getParameter("txtNombre");
                        String zona=request.getParameter("txtZona");
                        String telefono=request.getParameter("txtTelefono");
                        String direcion=request.getParameter("txtDireccion");
                        String saldo=request.getParameter("txtSaldo");
                        String estado=request.getParameter("txtEsado");
                        cli.setCodigo_cliente(codigo);
                        cli.setNombre(nombre);
                        cli.setZona(zona);
                        cli.setTelefono(Integer.parseInt(telefono));
                        cli.setDireccion(direcion);
                        cli.setSaldo(Float.parseFloat(saldo));
                        cli.setEstado(estado);
                        clidao.agregar(cli);
                        
                        request.getRequestDispatcher("Controlador?menu=Cliente&accion=Listar").forward(request, response);
                        
                        break;
                    
                    case "Editar":
                        ide = Integer.parseInt(request.getParameter("id"));
                        Cliente cl= clidao.listarId(ide);
                        request.setAttribute("cliente", cl);
                        request.getRequestDispatcher("Controlador?menu=Cliente&accion=Listar").forward(request, response);
                        break;  
                        
                    case "Actualizar":
                             
                                  String codigo1= request.getParameter("txtCodigo");
                                  String nombre1= request.getParameter("txtNombre");
                                  String zona1= request.getParameter("txtZona");
                                  String telefono1= request.getParameter("txtTelefono");
                                  String direcion1= request.getParameter("txtDireccion");
                                  String saldo1= request.getParameter("txtSaldo");
                                  String estado1= request.getParameter("txtEsado");
                                    cli.setCodigo_cliente(codigo1);
                                    cli.setNombre(nombre1);
                                    cli.setZona(zona1);
                                    cli.setTelefono(Integer.parseInt(telefono1));
                                    cli.setDireccion(direcion1);
                                    cli.setSaldo(Float.parseFloat(saldo1));
                                    cli.setEstado(estado1);
                                    cli.setId(ide);
                                    clidao.actualizar(cli);
                               
                                    request.getRequestDispatcher("Controlador?menu=Cliente&accion=Listar").forward(request, response);
                                
                                break;  
                        
                        
                     case "Eliminar":
                                ide = Integer.parseInt(request.getParameter("id"));
                                clidao.eleminar(ide);
                                request.getRequestDispatcher("Controlador?menu=Cliente&accion=Listar").forward(request, response);
                        break;   
                        
                }
                 request.getRequestDispatcher("Clientes.jsp").forward(request, response);
            }
            if(menu.equalsIgnoreCase("Producto")){
                switch(accion){
                    case "Listar":
                            List lista = pdao.listar();                            
                            request.setAttribute("productos", lista);
                             break;
                        
                    case "Agregar":
                         String codigo = request.getParameter("txtCodigo");
                         String linea = request.getParameter("txtLinea");
                         String nombre = request.getParameter("txtNombre");
                         String numeracion = request.getParameter("txtNumeracion");
                         String descripcion = request.getParameter("txtDescripcion");
                         String stock = request.getParameter("txtStock");
                         String precio = request.getParameter("txtPrecio");
                         String proveedor = request.getParameter("txtProveedor");
                         String estado = request.getParameter("txtEstado");
                         
                         pro.setCodigo(codigo);
                         pro.setLinea(linea);
                         pro.setNombre(nombre);
                         pro.setNumeracion(Integer.parseInt(numeracion));
                         pro.setDescripcion(descripcion);
                         pro.setStock(Integer.parseInt(stock));
                         pro.setPrecio(Float.parseFloat(precio));
                         pro.setProovedor(proveedor);
                         pro.setEstado(estado);
                         pdao.agregar(pro);
                          request.getRequestDispatcher("Controlador?menu=Producto&accion=Listar").forward(request, response);
                        break;
                        
                    case "Editar":
                            ide = Integer.parseInt(request.getParameter("id"));
                            Producto pr = pdao.listarId(ide);
                            request.setAttribute("pro", pr);
                            request.getRequestDispatcher("Controlador?menu=Producto&accion=Listar").forward(request, response);
                        break;
                 
                    case "Actualizar":
                         String codigo1 = request.getParameter("txtCodigo");
                         String linea1 = request.getParameter("txtLinea");
                         String nombre1 = request.getParameter("txtNombre");
                         String numeracion1 = request.getParameter("txtNumeracion");
                         String descripcion1 = request.getParameter("txtDescripcion");
                         String stock1 = request.getParameter("txtStock");
                         String precio1 = request.getParameter("txtPrecio");
                         String proveedor1 = request.getParameter("txtProveedor");
                         String estado1 = request.getParameter("txtEstado");
                         
                         pro.setCodigo(codigo1);
                         pro.setLinea(linea1);
                         pro.setNombre(nombre1);
                         pro.setNumeracion(Integer.parseInt(numeracion1));
                         pro.setDescripcion(descripcion1);
                         pro.setStock(Integer.parseInt(stock1));
                         pro.setPrecio(Float.parseFloat(precio1));
                         pro.setProovedor(proveedor1);
                         pro.setEstado(estado1);
                         pro.setIdProducto(ide);
                         
                         pdao.actualizar(pro);
                        request.getRequestDispatcher("Controlador?menu=Producto&accion=Listar").forward(request, response);
                        break;
                        
                    case "Eliminar":
                            ide = Integer.parseInt(request.getParameter("id"));
                            pdao.eliminar(ide);
                            request.getRequestDispatcher("Controlador?menu=Producto&accion=Listar").forward(request, response);
                        
                        break;
                }
                    
               
                
                 request.getRequestDispatcher("Producto.jsp").forward(request, response);
            }
            if(menu.equalsIgnoreCase("Cobranza")){
                 request.getRequestDispatcher("Cobranzas.jsp").forward(request, response);
            }
            if(menu.equalsIgnoreCase("Venta")){
                 request.getRequestDispatcher("Ventas.jsp").forward(request, response);
            }
            
            
           
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
