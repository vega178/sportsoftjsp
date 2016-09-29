<%-- 
    Document   : personal
    Created on : 9/09/2016, 10:47:52 AM
    Author     : santhyago
--%>

<%@page import="beans.Referee"%>
<%@page import="DAO.DaoReferee"%>
<%@page import="java.util.ArrayList"%>
<%@page import="beans.Employee"%>
<%@page import="DAO.DaoEmployee"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <link rel="icon" type="image/png" href="imgs/logop.png"/>

        <title>SportSoft</title>
        <!------------------------------------MATERIALIZECSS--------------------------------------->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.7/css/materialize.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.7/js/materialize.min.js"></script>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <script src="js/inicioMaterializecss.js" type="text/javascript"></script>
        <!------------------------------------AJAX---------------------------------------->
        <script src="js/ajax.js" type="text/javascript"></script>
        <!------------------------------------JQUERY------------------------------------->
        <script src="js/jquery.js" type="text/javascript"></script>
        <script src="js/validaciones.js" type="text/javascript"></script>
        <script src="js/datatable.js" type="text/javascript"></script>
        <!------------------------------------CSS---------------------------------------->
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
        <!------------------------------------SWEETALERT------------------------------------->
        <link href="css/sweetalert.css" rel="stylesheet" type="text/css"/>
        <script src="js/sweetalert.min.js" type="text/javascript"></script>
        <!--------------------------------------------DATATABLE-------------------------------->
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





         
         <!--------------------------------------PACE------------------------------------------------->
         <script src="js/pace.min.js" type="text/javascript"></script>
         <link href="templates/pace-theme-corner-indicator.tmpl.css" rel="stylesheet" type="text/css"/>
   <!------------------------------------------------------------------------------------------------------------------------------->
  
    </head>
    <body id="bodyPersonal">

        <nav>
            <div class="nav-wrapper green accent-4">
                                               <a href="paginaPrincipal.jsp" class="brand-logo"><img src="imgs/logop.png"></a>

                <a href="#" data-activates="mobile-demo" class="button-collapse"><i class="material-icons">menu</i></a>
                <ul class="right hide-on-med-and-down">
                    <li><a href="#" id="verUsuarios" onclick="tableEmployee()">Ver empleados</a></li>
                    <li><a href="#" id="verArbitros" onclick="tableReferee()">Ver arbitros</a></li>

                </ul>
                <ul class="side-nav" id="mobile-demo">
                    <li><a href="#">Ver empleados</a></li>
                    <li><a href="#" id="verArbitros">Ver arbitros</a></li>

                </ul>
            </div>
        </nav>
        <br><br>
        <div class="container">
            <h3 class="center-align" id="tituloPersonal">Personal</h3>
            <h2 id="tituloArbitro" class="center-align">Árbitros</h2>

            <div class="row" id="card" >
                <div class="card col s6" id="cardPersonal">
                    <div class="card-image waves-effect waves-block waves-light">
                        <img class="activator" src="imgs/Entrenador.jpg">
                    </div>
                    <div class="card-content">
                        <span class="card-title activator grey-text text-darken-4">Empleados<i class="material-icons right">more_vert</i></span>
                        <p><a href="#" id="agregarPersonal" onclick="formPerson()">Agregar</a></p>
                    </div>
                    <div class="card-reveal">
                        <span class="card-title grey-text text-darken-4">Empleados<i class="material-icons right">close</i></span>
                        <p></p>
                    </div>
                </div>


                <div class="card col s6" id="cardArbitro">
                    <div class="card-image waves-effect waves-block waves-light">
                        <img class="activator" src="imgs/arbitros1.jpg">
                    </div>
                    <div class="card-content">
                        <span class="card-title activator grey-text text-darken-4">Árbitros<i class="material-icons right">more_vert</i></span>
                        <p><a href="#" id="agregarArbitro" onclick="formReferee()">Agregar</a> </p>
                    </div>
                    <div class="card-reveal">
                        <span class="card-title grey-text text-darken-4">Árbitros<i class="material-icons right">close</i></span>
                        <p>La función principal de un árbitro es hacer que el juego se lleve a cabo con la menor cantidad posibles de interferencias, y su responsabilidad fundamental, cuidar la integridad física de los jugadores. .</p>
                    </div>
                </div>     
            </div> 



            <div id="formPersonal"  class="formPersonal card-panel lighten-1">
                <h5 id="tregistro">Empleados</h5>
                <form class="col s10">
                    <div class="row">
                        <div class="row">
                            <div class="input-field col s6">

                                <input type="text" id="nombreUsuario" class="valid" name="nombreUsuario" >
                                <label for="nombreUsuario" >Nombres *</label>
                            </div>
                            <div class="input-field col s6">


                                <input type="text" id="apellidoUsuario" class="valid" name="apellidoUsuario">
                                <label for="apellidoUsuario"  >Apellidos *</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s6" name="" class="valid">
                                <select name="tipoDocUsuario" id="tipoDocUsuario" class="valid">

                                    <option value="Cedula De Ciudadania">Cédula de ciudadania</option>
                                    <option value="Tarjeta De Identidad">Tarjéta de identidad</option>
                                    <option value="Cedula Extranjera">Cédula de extranjería</option>
                                </select>
                                <label >Tipo de documento *</label>

                            </div>
                            <div class="input-field col s6">
                                <input type="text" id="numDocumentoUsuario" class="valid" name="numDocumentoUsuario" onkeypress="return isNumberKey(event)">
                                <label for="numDocumentoUsuario"  >Número de documento *</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s6" name="" class="valid">

                                <select name="tipoUsuario" id="tipoUsuario" class="valid">
                                    <option>personal de trabajo</option>
                                    <option>administrador</option>

                                </select>
                                <label >Tipo de usuario *</label>
                            </div>
                            <div class="input-field col s6">
                                <input type="text" id="telefonoUsuario"  class="valid" name="telefonoUsuario" onkeypress="return isNumberKey(event)">
                                <label for="telefonoUsuario">Teléfono:</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s6">
                                <input type="email" id="correoUsuario" class="valid" name="correoUsuario">
                                <label for="correoUsuario"  >Correo *</label>
                            </div>
                            <div class="input-field col s6">
                                <input type="text" id="direccionUsuario" class="valid" name="direccionUsuario">
                                <label for="direccionUsuario" >Dirección:</label>
                            </div>

                        </div>
                    </div>
                    <div class="center-align">
                    <button class="btn waves-effect green accent-4 col s6" type="button" name="action" id="btnGuardarPersonas">Guardar </button>
                    <button class="btn waves-effect green accent-4 col s6 btnModificarPersonas" type="button" name="action" id="btnModificarPersonas">Modificar </button>
                    <button class="btn waves-effect green accent-4 col s6" type="button" name="action" id="cancelar" onclick="cancel()">Cancelar 
                    </button>
                    </div>
                </form>
            </div>
            
            
            <div id="divFormArbitros">
                <h5>Árbitros</h5>
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
    </div>

            
            
            <!-----------------------------------------------DATOS EMPLEADO---------------------------------------------------->
            <div id="divDatos" class="card-panel lighten-1">
                <table id="datosEmpleado" class="bordered striped responsive-table highlight card-panel lighten-1" cellspacing="0" width="100%">
                    <thead>
                        <tr>
                            <th>Nombre</th>
                            <th>Apellido</th>
                            <th>Tipo de documento</th>
                            <th>Número de documento</th>
                            <th>Correo</th>
                            <th>Telefono</th>
                            <th>Dirección</th>
                            <th>Modificar</th>
                            <th>Eliminar</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%DaoEmployee daoem = new DaoEmployee();
                            Employee em = new Employee();
                            ArrayList<Employee> list = daoem.listEmployee();
                            if (list != null) {
                                for (int i = 0; i < list.size(); i++) {
                                    em = list.get(i);
                                    
                   String json = "[{id:'" + em.getId() + "',nom:'" + em.getName() + "',ape:'" + em.getLastName() + "',tipoDoc:'" + em.getDocumentType() + "',numdocum:'" + em.getDocumentNumber() + "',corr:'" + em.getEmail() + "',tel:'" + em.getTelephone() + "',direc:'" + em.getAddress() + "'}]";
                        %>
                        <tr>
                            <td><%=em.getName()%></td>
                            <td><%=em.getLastName()%></td>
                            <td><%=em.getDocumentType()%></td>
                            <td><%=em.getDocumentNumber()%></td>
                            <td><%=em.getEmail()%></td>
                            <td><%=em.getTelephone()%></td>
                            <td><%=em.getAddress()%></td>
                            <td ><button class="modificarUsuario " value="<%=em.getId()%>" id="<%=json%>" onclick="updateEmployee(this)"><i class="material-icons small ">mode_edit</i></button></td>
                            <td><button class="btnEliminarUsuario "  value="<%=em.getId()%>"><i class="material-icons small">delete</i></button></td>
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
                    
            <!----------------------------------------------------DATOS ARBITRO-------------------------------------->
            
            <div id="divDatosArbitro" class="card-panel lighten-1">
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

     <footer class="page-footer green accent-4">
          <div class="container">
            <div class="row">
              <div class="col l6 s12">
                <h5 class="white-text">Datos de la empresa</h5>
                <p class="grey-text text-lighten-4">Nombre: Grupo SportSoft.</p>
                <p class="grey-text text-lighten-4">Direccion: Cr 23b Nr 38b - 274</p>
                <p class="grey-text text-lighten-4">Teléfono: 5283318</p>
                <p class="grey-text text-lighten-4">Correo: gruposportsoft@gmail.com</p>

              </div>
              <div class="col l4 offset-l2 s12">
                <h5 class="white-text">Acerca de</h5>
                <ul>
                  <li><a class="grey-text text-lighten-3" href="#!">Manual de usuario</a></li>
                  <li><a class="grey-text text-lighten-3" href="#!">Manual técnico</a></li>
                  <li><a class="grey-text text-lighten-3" href="condiciones.jsp">Términos de uso</a></li>
                  <!--<li><a class="grey-text text-lighten-3" href="#!">Link 3</a></li>
                  <li><a class="grey-text text-lighten-3" href="#!">Link 4</a></li>-->
                </ul>
              </div>
            </div>
          </div>
            
<div class="footer">
    <h4 class="white-text">redes sociales</h4>
    <div class="social"><a >&#62220;</a></div>
    <div class="social"><a href="https://twitter.com/?request_context=signup">&#62217;</a></div>
    <div class="social"><a href="https://plus.google.com/u/0/">&#62223;</a></div>
  
</div>
          <div class="footer-copyright center-align">
            <div class="container">
            © 2014 Copyright SportSoft (V1)
           <!-- <a class="grey-text text-lighten-4 right" href="#!">More Links</a>-->
            </div>
          </div>
        </footer>
            
            
            
    </body>
</html>
