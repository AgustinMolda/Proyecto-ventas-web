<%-- 
    Document   : Clientes
    Created on : May 1, 2022, 2:26:02 AM
    Author     : Eber
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <meta name="viewport" content="width=device-width, initial-scale=1">
         <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">   
    </head>
    <body>
      <div class="d-flex">
        <div class="card col-sm-6">
            
                <div class="card-body">
                    <form action="Controlador?menu=Cliente" method="POST">
                    <div class="form-group">
                        <label>código</label>
                        <input type="text" value="${cliente.getCodigo_cliente()}" name="txtCodigo" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>nombre</label>
                        <input type="text" value="${cliente.getNombre()}"name="txtNombre" class="form-control">
                        
                    </div>
                    <div class="form-group">
                        <label>zona/barrio</label>
                        <input type="text" value="${cliente.getZona()}" name="txtZona" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>teléfono</label>
                        <input type="text" value="${cliente.getTelefono()}" name="txtTelefono" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>dirección</label>
                        <input type="text" value="${cliente.getDireccion()}" name="txtDireccion" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>saldo</label>
                        <input type="text" value="${cliente.getSaldo()}" name="txtSaldo" class="form-control">
                    </div>
                    
                    
                     <div class="form-group">
                        <label>estado</label>
                        <input type="text" value="${cliente.getEstado() }"name="txtEsado" class="form-control">
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
                    <td>NOMBRE</td>
                    <td>ZONA/BARRIO</td>
                    <td>TELEFONO</td>
                    <td>DIRECCION</td>
                    <td>SALDO</td>
                    <td>ESTADO</td>
                    <td>ACCIONES</td>
                    
                </tr>
                <c:forEach var="cli" items="${clientes}">
                  <tr>
                    <td>${cli.getCodigo_cliente()}</td>
                    <td>${cli.getNombre()}</td>
                    <td>${cli.getZona()}</td>
                    <td>${cli.getTelefono()}</td>
                    <td>${cli. getDireccion()}</td>
                    <td>${cli.getSaldo()}</td>
                    <td>${cli.getEstado()}</td>
                    <td>
                        <a class="btn btn-warning" href="Controlador?menu=Cliente&accion=Editar&id=${cli.getId()}">Editar</a>
                        <a class="btn btn-danger" href="Controlador?menu=Cliente&accion=Eliminar&id=${cli.getId()}">Eliminar</a>
                        
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
