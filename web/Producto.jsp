<%-- 
    Document   : Producto
    Created on : May 1, 2022, 2:25:43 AM
    Author     : Eber
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <meta name="viewport" content="width=device-width, initial-scale=1">
         <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"> 
        <title>Productos</title>
    </head>
    <body>
        <div class="d-flex">
        <div class="card col-sm-6">
            
                <div class="card-body">
                    <form action="Controlador?menu=Producto" method="POST">
                    <div class="form-group">
                        <label>Código</label>
                        <input type="text" value="${pro.getCodigo()}"  name="txtCodigo" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Línea</label>
                        <input type="text" value="${pro.getLinea()}"  name="txtLinea" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Nómbre</label>
                        <input type="text" value="${pro.getNombre()}" name="txtNombre" class="form-control">
                        
                    </div>
                    <div class="form-group">
                        <label>Numeración</label>
                        <input type="text" value="${pro.getNumeracion()}" name="txtNumeracion" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Descripción</label>
                        <input type="text" value="${pro.getDescripcion()}"  name="txtDescripcion" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Stock</label>
                        <input type="text" value="${pro.getStock()}"  name="txtStock" class="form-control">
                    </div>
                        
                      
                     <div class="form-group">
                        <label>Precio</label>
                        <input type="text" value="${pro.getPrecio()}" name="txtPrecio" class="form-control">
                    </div>
                      
                  
                     <div class="form-group">
                        <label>Proovedor</label>
                        <input type="text" value="${pro.getProovedor()}" name="txtProveedor" class="form-control">
                    </div>
                    
                     <div class="form-group">
                        <label>Estado</label>
                        <input type="text"value="${pro.getEstado()}" name="txtEstado" class="form-control">
                    </div>
             
                    <input type="submit" name="accion" value="Agregar" class="btn btn-info">
                    <input type="submit" name="accion" value="Actualizar" class="btn btn-success">
          
                </form>
            </div>
        </div>
        
        <div class="col-sm-8">
            <table class="table table-hover">
                <tr>
                    <td>CODIGO</td>
                    <td>LINEA</td>
                    <td>NOMBRE</td>
                    <td>NUMERACION</td>
                    <td>DESCRPICON</td>
                    <td>STOCK</td>
                    <td>PROVEEDOR</td>
                    <td>PRECIO</td>
                    <td>ESTADO</td>
                    <td>ACCIONES</td>
                    
                </tr>
                <c:forEach var="p" items="${productos}">
                  <tr>
                    <td>${p.getCodigo()}</td>
                    <td>${p.getLinea()}</td>
                    <td>${p.getNombre()}</td>
                    <td>${p.getNumeracion()}</td>
                    <td>${p.getDescripcion()}</td>
                    <td>${p.getStock()}</td>
                    <td>${p.getProovedor()}</td>
                    <td>${p.getPrecio()}</td>
                    <td>${p.getEstado()}</td>
                    <td>
                      <a class="btn btn-warning" href="Controlador?menu=Producto&accion=Editar&id=${p.getIdProducto()}">Editar</a>
                      <a class="btn btn-danger" href="Controlador?menu=Producto&accion=Eliminar&id=${p.getIdProducto()}">Eliminar</a>
                        
                    </td>
                       
                 </tr>
               </c:forEach>

            </table>
        </div>
     </div>
            
        
        
        
        <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
    </body>
</html>
