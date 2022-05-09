<%-- 
    Document   : Principal
    Created on : Apr 30, 2022, 1:03:31 PM
    Author     : Eber
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu de usuarios</title>
         <meta name="viewport" content="width=device-width, initial-scale=1">
         <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">   
        
    </head>
    <body>
            <nav class="navbar navbar-expand-md bg-info navbar-dark">
                <a class="navbar-brand" href="#">Oeste Cosmetica</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
               <span class="navbar-toggler-icon"></span>
                </button>
                    <div class="collapse navbar-collapse" id="collapsibleNavbar">
                        <ul class="navbar-nav">
                            <li class="nav-item">
                                <a style="margin-left: 10px; border: none;" class="btn btn-outline-light" href="Controlador?menu=Cliente&accion=Listar" target="myFrame">Clientes</a>
                            </li>
                            <li class="nav-item">
                                 <a style="margin-left: 10px; border: none;" class="btn btn-outline-light"  href="Controlador?menu=Producto&accion=Listar" target="myFrame">Productos</a>
                            </li>
                            <li class="nav-item">
                                 <a style="margin-left: 10px; border: none;" class="btn btn-outline-light" href="Controlador?menu=Venta" target="myFrame">Venta</a>
                            </li>
                            <li class="nav-item">
                                 <a style="margin-left: 10px; border: none;" class="btn btn-outline-light" href="Controlador?menu=Cobranza" target="myFrame">Cobranzas</a>
                            </li>
                        </ul>
                        </div>
                        <div class="navbar navbar-nav " > 
                            
                            <div class="dropdown">
                            
                            <button style="border: none;" type="button"  class="btn btn-outline-light dropdown-toggle justify-content-end" data-toggle="dropdown">
                                     ${usuario.getNombre()}
                            </button>
                            <div class="dropdown-menu text-center">
                                <div>
                                    <img src="img/usuarioIngresado.png" alt=""/>
                                </div>
                                <div>
                                    <a href="#"> gentionar cuenta</a>
                                </div>
                                    
                            <div class="dropdown-divider"></div>
                            <form action="Validar" method="POST">     
                                <button name="accion" value="Salir" class="dropdown-item" href="#">Salir</button>
                                        
                                     </form>    
                            </div>
                           </div>    
                        </div>
                        
                 
              </nav>
                            
                            <div class="m-4" style="height: 62.5rem;">
                                <iframe name="myFrame" style="height: 100%; width: 100%; border: none"></iframe>
                            </div>
        
        
        
        
        
        <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
    </body>
</html>
