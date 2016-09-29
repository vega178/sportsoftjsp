<%-- 
    Document   : arbitros
    Created on : 28/09/2016, 09:57:22 PM
    Author     : santhyago
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="beans.Referee"%>
<%@page import="DAO.DaoReferee"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="icon" type="image/png" href="imgs/logop.png"/>
       
        <title>SportSoft</title>
         <!------------------------------------MATERIALIZECSS--------------------------------------->
         <link href="css/materialize.min.css" rel="stylesheet" type="text/css"/>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
        <script src="js/materialize.min.js" type="text/javascript"></script>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <script src="js/inicioMaterializecss.js" type="text/javascript"></script>
        <!------------------------------------AJAX---------------------------------------->
        <script src="js/ajax.js" type="text/javascript"></script>
        <!------------------------------------JQUERY------------------------------------->
        <script src="js/jquery.js" type="text/javascript"></script>
        <script src="js/validaciones.js" type="text/javascript"></script>
        <!------------------------------------CSS---------------------------------------->
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
        <!------------------------------------SWEETALERT------------------------------------->
        <link href="css/sweetalert.css" rel="stylesheet" type="text/css"/>
        <script src="js/sweetalert.min.js" type="text/javascript"></script>
        <script src="js/datatable.js" type="text/javascript"></script>
        <!------------------------------------DATATABLE------------------------------------------------------------------->
         <script type="text/javascript" src="http://cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js"></script>
         <link href="https://cdn.datatables.net/1.10.12/css/jquery.dataTables.min.css" rel="stylesheet" type="text/css"/>
         <link href="https://cdn.datatables.net/buttons/1.2.2/css/buttons.dataTables.min.css" rel="stylesheet" type="text/css"/>
         <script src="code.jquery.com/jquery-1.12.3.js" type="text/javascript"></script>
          <script src="https://cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js" type="text/javascript"></script>
          <script src="https://cdn.datatables.net/buttons/1.2.2/js/dataTables.buttons.min.js" type="text/javascript"></script>
          <script src="//cdnjs.cloudflare.com/ajax/libs/jszip/2.5.0/jszip.min.js" type="text/javascript"></script>
          <script src="//cdn.rawgit.com/bpampuch/pdfmake/0.1.18/build/pdfmake.min.js" type="text/javascript"></script>
          <script src="//cdn.rawgit.com/bpampuch/pdfmake/0.1.18/build/vfs_fonts.js" type="text/javascript"></script>
          <script src="//cdn.datatables.net/buttons/1.2.2/js/buttons.html5.min.js" type="text/javascript"></script>
          <link href="https://cdn.datatables.net/1.10.12/css/jquery.dataTables.min.css" rel="stylesheet" type="text/css"/>
          <link href="https://cdn.datatables.net/buttons/1.2.2/css/buttons.dataTables.min.css" rel="stylesheet" type="text/css"/>
          <link href="//cdnjs.cloudflare.com/ajax/libs/font-awesome/4.4.0/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>

    
         <!---------------------------------------------------------PACE------------------------------------------->
         <script src="js/pace.min.js" type="text/javascript"></script>
         <link href="templates/pace-theme-corner-indicator.tmpl.css" rel="stylesheet" type="text/css"/>
   <!------------------------------------------------------------------------------------------------------------------------------->
          
    </head>
    <body>
     <nav>
            <div class="nav-wrapper  green accent-4">
                                                <a href="paginaPrincipal.jsp" class="brand-logo"><img src="imgs/logop.png"></a>

                <a href="#" data-activates="mobile-demo" class="button-collapse"><i class="material-icons">menu</i></a>
                <ul class="right hide-on-med-and-down">
                   
                   <li><a class="dropdown-button deportes active" href="#!" data-activates="personal">Personal<i class="material-icons right">arrow_drop_down</i></a></li>
                    <li><a class="dropdown-button deportes" href="#!" data-activates="deportes">Deportes<i class="material-icons right">arrow_drop_down</i></a></li>
                    <li><a href="inventario.jsp" id="inicio" class="inicio">Inventario</a></li>
                    <li><a class="dropdown-button" href="#" class="conf" data-activates="configuracion">Configuración<i class="material-icons right">arrow_drop_down</i></a></li>

                </ul>
                <ul class="side-nav" id="mobile-demo">
                   <li><a href="personal.jsp"  id="" class="personal">Personal</a></li>
                    <li><a class="dropdown-button deportes" href="#!" data-activates="deporte">Deportes<i class="material-icons right">arrow_drop_down</i></a></li>
                    <li><a href="implementos.jsp" id="" class="inicio">Inventario</a></li>
                    <li><a class="dropdown-button" href="#" class="conf" data-activates="configuracio">Configuracion<i class="material-icons right">arrow_drop_down</i></a></li>
                </ul>
            </div>
        </nav>
        <!----------------------------------DROPDOWN CONFIGURACION-------------------------------------------------->
        <ul id="configuracion" class="dropdown-content">
            <li><a href="login.jsp?cerrar=true">salir</a></li>
        <!----------------------------------DROPDOWN DEPORTES-------------------------------------------------->
            <ul id="deportes" class="dropdown-content">
                <li><a href="torneos.jsp">Futbol</a></li>
            </ul>
        
        <ul id="personal" class="dropdown-content">
                <li><a href="empleados.jsp">Empleados</a></li>
                <li><a href="arbitros.jsp">Arbitros</a></li>
            </ul>
        </ul>

        <br><br>
        <div class="container">
            <h4 class="center-align">Árbitros</h4>
        </div>
        
        
         <div class="row" id="tabsArbitro">
    <div class="col s12">
      <ul class="tabs">
          <li class="tab col s3"><a class="active" href="#test1" onclick="cancel()">Ver árbitros</a></li>
          <li class="tab col s3"><a href="#test2" onclick="formReferee()">Agregar árbitros</a></li>
   
           
        </li>
      </ul>
    </div>
    <div id="test1" class="col s12">Ver árbitros
      <div id="divDatosArbitros" class="card-panel lighten-1">
                <table id="datosArbitro" class="bordered striped responsive-table highlight" cellspacing="0" width="100%">
                    <thead>
                        <tr>
                            <th>Nombre</th>
                            <th>Apellido</th>
                            <th>Tipo de documento</th>
                            <th>Número de documento</th>
                            <th>Posición</th>
                            <th>Correo</th>
                            <th>Telefono</th>
                            <th>Direccion</th>
                            <th>Modificar</th>
                            <th>Eliminar</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%DaoReferee daore = new DaoReferee();
                            Referee re = new Referee();
                           
                            ArrayList<Referee> lis = daore.listReferee();
                            if (lis != null) {
                                for (int i = 0; i < lis.size(); i++) {
                                    re = lis.get(i);
                                    
                    String json = "[{id:'"+re.getId()+"',nom:'"+re.getName()+"',ape:'"+re.getLastName()+"',tipoDoc:'"+re.getDocumentType()+"',numDoc:'"+re.getDocumentNumber()+"',posic:'"+re.getPosition()+"',corr:'"+re.getEmail()+"',tel:'"+re.getTelephone()+"',direc:'"+re.getAddress()+"'}]";
                            %>
                        <tr>
                            <td><%=re.getName()%></td>
                            <td><%=re.getLastName()%></td>
                            <td><%=re.getDocumentType()%></td>
                            <td><%=re.getDocumentNumber()%></td>
                            <td><%=re.getPosition()%></td>
                            <td><%=re.getEmail()%></td>
                            <td><%=re.getTelephone()%></td>
                            <td><%=re.getAddress()%></td>
                            <td ><button class="modificarArbitros " id="<%=json%>" onclick="updateReferee(this)" ><i class="material-icons small " id="modificarImplementos" value="" >mode_edit</i></button></td>
                            <td><button class="eliminarArbitro  " value="<%=re.getId()%>"><i class="material-icons small">delete</i></button></td>
                        </tr>
                        <%
                            }
                        } else {%>
                    <h3>no existen datos</h3>
                    <%   }

                    %>
                    </tbody>

                </table>
                    </div>
    </div>
             
             
    <div id="test2" class="col s12 row" onclick="">Agregar árbitro
        
    </div>
  </div>
                    
               <div id="divFormArbitros">
                <form class="col s10 card-panel lighten-1">
                    <div class="row">
                        <div class="row">
                            <div class="input-field col s6">
                                <input type="text" id="nombreArbitro" class="valid" name="nombreArbitro">
                                <label for="nombreArbitro"  >Nombres *</label>
                            </div>
                            <div class="input-field col s6">
                                <input type="text" id="apellidoArbitro" class="valid" name="apellidoArbitro">
                                <label for="apellidoArbitro" >Apellidos *</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s6" name="" class="valid">
                                <select name="tipoDocArbitro" id="tipoDocArbitro">
                                    <option value="Cedula De Ciudadania">Cédula de ciudadania</option>
                                    <option value="Tarjeta De Identidad">Tarjeta de identidad</option>
                                    <option value="Cedula Extranjera">Cédula de extranjería</option>
                                </select>
                                <label >Tipo de documento</label>

                            </div>
                            <div class="input-field col s6">
                                <input type="text" id="numDocumentoArbitro" class="valid" name="numDocumentoArbitro" onkeypress="return soloNumeros(event);">
                                <label for="numDocumentoArbitro"  >Numero de documento:</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s6">
                                <input type="text" id="posicionArbitro" class="valid" name="posicionArbitro">
                                <label for="posicionArbitro"  >Posición:</label>

                            </div>
                            <div class="input-field col s6">
                                <input type="text" id="telefonoArbitro" class="valid" name="telefonoArbitro" onkeypress="return soloNumeros(event);">
                                <label for="telefonoArbitro"  >Teléfono:</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s6">
                                <input type="email" id="correoArbitro" class="valid" name="correoArbitro">
                                <label for="correoArbitro"  >Correo:</label>
                            </div>
                            <div class="input-field col s6">
                                <input type="text" id="direccionArbitro" class="valid" name="direccionArbitro">
                                <label for="direccionArbitro"  >Dirección:</label>
                            </div>

                        </div>
                    </div>
                    <div class="center-align">
                    <button class="btn waves-effect green accent-4 center-align" type="button" name="action" id="btnGuardarArbitros">Guardar </button>
                    <button class="btn waves-effect green accent-4 center-align" type="button" name="action" id="btnModificarArbitros">Modificar </button>
                    <button class="btn waves-effect green accent-4 center-align"  type="button" name="action" id="cancelar1" onclick="cancel()">Cancelar
                    </button>
                    </div>
                </form>
            </div>     
                    
                    
                    
                    
        
      
            
        
           
                    
      
                    
                        <footer class="page-footer green accent-4">
            <div class="container">
                <div class="row">
                    <div class="col l4 s4">
                        <p class="white-text">Datos de la empresa</p>
                        <p class="grey-text text-lighten-4">Nombre: Grupo SportSoft.</p>
                        <p class="grey-text text-lighten-4">Direccion: Cr 23b Nr 38b - 274</p>
                        <p class="grey-text text-lighten-4">Teléfono: 5283318</p>
                        <p class="grey-text text-lighten-4">Correo: gruposportsoft@gmail.com</p>

                    </div>
                    <div class="col l4  s14">
                        <p class="white-text">Acerca de</p>
                        <ul>
                            <li><a class="grey-text text-lighten-3" href="manualusuario.jsp">Manual de usuario</a></li>
                            <li><a class="grey-text text-lighten-3" href="manualTecnico.jsp">Manual técnico</a></li>
                            <li><a class="grey-text text-lighten-3" href="condiciones.jsp">Términos de uso</a></li>
                            <!--<li><a class="grey-text text-lighten-3" href="#!">Link 3</a></li>
                            <li><a class="grey-text text-lighten-3" href="#!">Link 4</a></li>-->
                        </ul>
                    </div>
                    <div class="col l4  s14">
                        <a href="#"> <p class="white-text" onclick="contac()">Contáctenos</p></a>
                        <form id="formulario-contacto" action="script.php" method="post" class="card-panel lighten-1">
                            <input type="hidden" name="redireccion" value="http://www.opencademy.com" />  
                            <fieldset>
                                <legend>Contactenos:</legend>
                                <ul>
                                    <li>
                                        <label for="nombre">Nombre:</label>
                                        <input type="text" name="nombre" id="nombre" value="" />
                                    </li>
                                    <li>
                                        <label for="correo-e">Correo:</label>
                                        <input type="text" name="correo-e" id="correo-e" value="" />
                                    </li>
                                    <li>
                                        <label for="comentario">Comentario:</label>
                                        <textarea name="comentario" id="comentario" cols="25" rows="3"></textarea>
                                    </li>

                                    <li>
                                        <input type="submit" value="Enviar" />
                                        <input type="reset" value="Borrar todo" />
                                    </li>
                                </ul>
                            </fieldset>
                        </form>

                    </div>

                </div>
            </div>

            <div class="footer">
                <p class="white-text">redes sociales</p>
                <div class="social"><a >&#62220;</a></div>
                <div class="social"><a href="https://twitter.com/?request_context=signup">&#62217;</a></div>
                <div class="social"><a href="https://plus.google.com/u/0/">&#62223;</a></div>

            </div>
            <div class="footer-copyright right-align">
                <div class="container">
                    Copyright 2016 SportSoft© 2.0
                    <!--<a class="grey-text text-lighten-4 right" href="#!">More Links</a>-->
                </div>
            </div>
        </footer>
    </body>
</html>
