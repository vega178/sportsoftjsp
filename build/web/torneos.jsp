<%-- 
    Document   : tournaments
    Created on : 10/09/2016, 03:27:21 PM
    Author     : santhyago
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="beans.Tournaments"%>
<%@page import="DAO.DaoTournaments"%>
<%@page import="java.sql.ResultSet"%>
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

          <script src="js/pace.min.js" type="text/javascript"></script>
         <link href="templates/pace-theme-corner-indicator.tmpl.css" rel="stylesheet" type="text/css"/>
   <!------------------------------------------------------------------------------------------------------------------------------->
  
    </head>
    <body>
        <nav>
            <div class="nav-wrapper green accent-4">
                <a href="paginaPrincipal.jsp" class="brand-logo"><img src="imgs/logop.png"></a>
                <a href="#" data-activates="mobile-demo" class="button-collapse"><i class="material-icons">menu</i></a>
                <ul class="right hide-on-med-and-down">
                    <li><a href="#" id="nuevoTorneo" class="crearTorneo" onclick="addTournaments()">Crear Torneo</a></li>


                </ul>
                <ul class="side-nav" id="mobile-demo">
                    <li><a href="#">Crear Torneo</a></li>

                </ul>
            </div>
        </nav>

        <div class="container">
              <h3 class="center-align">Torneos</h3>
            <div class="row card-panel lighten-1 divFormTorneo" id="divFormTorneos" >
                <h4>Nuevo Torneo</h4>
                <form id="formTorneo col s10">
                    <div class="row">
                        <div class="row">
                            <div class="input-field col s6 ">

                                <input type="text" id="nombreT" name="nombreTorneo">
                                <label for="nombreT" data-success="right">Nombre del torneo:</label>
                            </div>
                            <div class="input-field col s6">
                           <select name="deporte" id="idDeporte">
                                    <%ResultSet rs = DaoTournaments.consultSport();
                                        while (rs.next()) {

                                    %>
                                    <option><%=rs.getString("nombre")%></option>
                                    <%
                                        }
                                    %>
                                </select>
                                <label>Deporte</label>
                               
                            </div>
                        </div>
                        <div class="row">
                             <div class="input-field col s6" >
                                <input type="date" id="fechaIni" name="fechaInicio">
                                <label for="fechaIni"  style="margin-top: -30px">Fecha De Inicio:</label>
                            </div>
                            <div class="input-field col s6 ">
                                <input type="date" id="fechaFin" name="fechaFin">
                                <label for="fechaFin"  style="margin-top: -30px">Fecha De Finalizacion:</label>
                            </div>
                        </div>

                        <div class="input-field ">
                            <textarea id="descripcion" name="detalle" class="materialize-textarea" ></textarea>
                            <label for="descripcion">Descripción</label>
                        </div>

                        <div class="input-field " name="">

                            <select name="encargado" id="encargado">
                              

                                <%
                                    rs = DaoTournaments.consultNameEmployee();
                                    while (rs.next()) {


                                %>
                                <option><%=rs.getString("nombre")%></option>

                                <%
                                    }
                                %>
                            </select>
                            <label>encargado</label>
                        </div>

                    </div>
                            <div class="center-align">
                    <button class="btn waves-effect waves-light green accent-4 btnCrearTorneo" type="button" id="btnCrearTorneo">Crear </button>
                    <button class="btn waves-effect waves-light green accent-4 btnModTorneo" type="button" id="btnModTorneo">Modificar </button>
                    <button class="btn waves-effect waves-light green accent-4 btncancelarTorneo" type="button" id="btncancelarTorneo" onclick="cancel()">Cancelar</button>
                            </div>
                </form>
            </div>
                            <br><br>
                            <div id="divDatosTorneo" class="card-panel lighten-1">
                <table id="datosTorneo" class="bordered striped centered responsive-table highlight" cellspacing="0" width="100%">
                    <thead>
                        <tr>
                            <th>Nombre</th>
                            <th>Fecha de Inicio</th>
                            <th>Fecha de Finalización</th>
                            <th>Descripción</th>
                            <th>Equipos</th>
                            <th>Modificar</th>
                            <th>Eliminar</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% DaoTournaments daot = new DaoTournaments();
                            Tournaments t = new Tournaments();
                            ArrayList<Tournaments> list = daot.listTournamens();

                            if (list != null) {
                                for (int i = 0; i < list.size(); i++) {
                                    t = list.get(i);
                        String json = "[{id:'"+t.getId()+"',name:'"+t.getName_tournaments()+"',fechaIni:'"+t.getStart_date()+"',fechaFin:'"+t.getFinis_date()+"',desc:'"+t.getDescription()+"'}]";            
                        %>
                        <tr>
                            <td id=""><%=t.getName_tournaments()%></td>
                            <td id=""><%=t.getStart_date()%></td> 
                            <td id=""><%=t.getFinis_date()%></td>
                            <td id=""><%=t.getDescription()%></td>
                            <td id=""><a class="irEquiposs" href="equipos.jsp?idTorneo=<%=t.getId()%>"><i class="material-icons small">add_circle</i></a></td>
                            <td><button class="btnModificarTorneos" id="<%=json%>" onclick="updateTorneos(this)"><i class="material-icons small" >mode_edit</i></button></td>
                            <td><button class="btnEliminarTorneos" value="<%=t.getId()%>"><i class="material-icons small">delete</i></button></td>
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
                         <footer class="page-footer green accent-4" >
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
