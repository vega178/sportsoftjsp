<%-- 
    Document   : equipos
    Created on : 10/09/2016, 07:25:20 PM
    Author     : santhyago
--%>

<%@page import="beans.Player"%>
<%@page import="DAO.DaoPlayer"%>
<%@page import="java.util.ArrayList"%>
<%@page import="beans.Team"%>
<%@page import="DAO.DaoTeam"%>
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
            <div class="nav-wrapper  green accent-4">
                <a href="#!" class="brand-logo"><img src="imgs/logop.png"></a>
                <a href="#" data-activates="mobile-demo" class="button-collapse"><i class="material-icons">menu</i></a>
                <ul class="right hide-on-med-and-down">
                   
                   <li><a class="dropdown-button deportes" href="#!" data-activates="personal">Personal<i class="material-icons right">arrow_drop_down</i></a></li>
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
        

        <ul id="crearEquipos" class="dropdown-content">
            <li><a class="waves-effect waves-light modal-trigger" href="#modal1">Nuevo</a></li>

            <li><a href="#">Ver</a></li>
        </ul>
        <nav>
            <div class="nav-wrapper green accent-4">
                <a href="paginaPrincipal.jsp" class="brand-logo"><img src="imgs/logop.png"></a>
                <a href="#" data-activates="mobile-demo" class="button-collapse"><i class="material-icons">menu</i></a>
                <ul class="right hide-on-med-and-down">
                    <li><a class="dropdown-button" href="#" data-activates="crearEquipos">Equipos<i class="material-icons right">arrow_drop_down</i></a></li>
                    <li><a href="#" id="nuevoTorneo" onclick="calendario()">Calendario</a></li>
                    <li><a href="#" id="clasificacion" onclick="tablaPosiion()">Clasificación</a></li>

                </ul>
                <ul class="side-nav" id="mobile-demo">
                    <li><a class="dropdown-button" href="#" data-activates="crearEquipo">Equipos<i class="material-icons right">arrow_drop_down</i></a></li>
                    <li><a href="#" id="nuevoTorne">Partidos</a></li>
                    <li><a href="#" id="clasificacio">Clasificacion</a></li>

                </ul>
            </div>
        </nav>

        <%if (Integer.parseInt(request.getParameter("idTorneo")) != 0) {
                int id = Integer.parseInt(request.getParameter("idTorneo"));
        %>

        <label id="labelCambiante"><%=id%></label>
        <%
            }
        %>

        <br><br>

        <div class="container">
  <h3 class="center-align">Equipos</h3>
            <!-- Modal Structure -->
            <div id="modal1" class="modal">
                <div class="modal-content">
                    <h4>Equipo</h4>

                    <div class="row" id="formEquipo">
                        <form class="col s12">
                            <div class="row">
                                <div class="input-field col s12">
                                    <input id="nombreEquipo" type="text">
                                    <label for="nombreEquipo" data-error="wrong" data-success="right">Nombre Del Equipo</label>
                                </div>
                            </div>
                            <button class="btn waves-effect waves-light green accent-4" type="button" id="insertarEquipo" >Insertar</button>
                            <button class="btn waves-effect waves-light green accent-4" type="button" id="modEquipo" >Modifica</button>
                            <button class="btn waves-effect waves-light green accent-4 cancelarTorneo" type="button" id="btncancelarTorneo">Cancelar</button>

                        </form>
                    </div>
                </div>
            </div>
            
            
            <div id="divModificarEquipo">
                 <form class="col s12">
                            <div class="row">
                                <div class="input-field col s12">
                                    <input id="nombreEquipoModificar" type="text">
                                    <label for="nombreEquipo" data-error="wrong" data-success="right">Nombre Del Equipo</label>
                                </div>
                            </div>
                            <button class="btn waves-effect waves-light green accent-4" type="button" id="insertarEquipo" >Insertar</button>
                            <button class="btn waves-effect waves-light green accent-4 btnModificarEquipo" type="button" id="modEquipo" >Modificar</button>
                            <button class="btn waves-effect waves-light green accent-4 cancelarTorneo" type="button" id="btncancelarTorneo">Cancelar</button>

                        </form>
            </div>
            
            
            
            
            
            
            

            <div id="datosEquipo" class="card-panel lighten-1">
                <%String id = request.getParameter("idTorneo");
                    DaoTeam daote = new DaoTeam();
                    Team te = new Team();
                    ArrayList<Team> list = daote.listTeamxTournament(id);


                    if (list != null) {
                        for (int i = 0; i < list.size(); i++) {
                            te = list.get(i);
             String json = "[{id:'"+te.getId()+"',cod:'"+te.getName()+"'}]";

                %>
                <div class="collection">
                    <a href="#!" class="collection-item "><%=te.getName()%><span class="badge"><span><button class="insertPlayer " value="<%=te.getId()%>">Jugadores</button></span>     <button class="modificarEquipo" id="<%=json%>" onclick="modificarEquipo(this)"><i class="material-icons prefix tiny">mode_edit</i></button><button class="elimiarEquipo " value="<%=te.getId()%>"><i class="material-icons prefix tiny">delete</i></button></span></a>
                </div>
                <%  }
                    } else {
                        out.print("no existen datos");
                    }
                %>
            </div>
        </div>
        <!-------------------------------------------GESTIÓN DE JUGADORES-------------------------------------->
        <div  id="divContenedorJugador" class="card-panel lighten-1 center-align">
            <div id="divDatosJugador" > </div>
            <button class="btn waves-effect green accent-4 btnAgregarJugador" type="button" onclick="insertPlayer()" id="btnAgregarJugador">Agregar Jugador</button>

        </div>


        <!--------------------------------------------------FORMULARIO JUGADOR----------------------------------------->
        <div class="container">
            <div id="divFormJugador">
                <form class="class col s8 card-panel lighten-1" id="Jugador">
                    <div class="row">
                        <div class="input-field col s6 ">
                            <input id="nombre" type="text" class="validate " name="nombre" required>
                            <label for="name">Nombre</label>

                        </div>
                        <div class="input-field col s6">
                            <input id="apellido" type="text" class="validate" name="apellido" required>
                            <label for="last_name">Apellido</label>
                        </div>

                        <div class="input-field col s6">
                            <select name="tipo" id="tipoDocumento" required>
                                <option>Cédula de ciudadania</option>
                                <option>Tarjeta de identidad</option>
                                <option>Cédula de extranjería</option>
                            </select>
                            <label for="tipo_documento">Tipo de documento</label>

                        </div>
                        <div class="input-field col s6">
                            <input id="numero_documento" type="text" class="validate" name="numero_documento" required onkeypress="return isNumberKey(event)">
                            <label for="numero_documento">Número de documento</label>
                        </div>

                        <div class="input-field col s6">
                            <input type="date" id="fecha_nacimiento"  class="datepicker" name="fecha_nac" required>
                            <label for="fecha_nac" style="margin-top: -30px">Fecha de nacimiento</label>
                        </div> 
                        <div class="input-field col s6">
                            <input id="direccion" type="text" class="validate" name="direccion" required>
                            <label for="address">Dirección</label>
                        </div>
                        <div class="input-field col s6">
                            <input id="telefono" type="text" class="validate" name="telefono" required>
                            <label for="movile">Teléfono</label>
                        </div>
                        <div class="input-field col s6">
                            <input id="correo" type="email" class="validate" name="correo" required>
                            <label for="email" data-error="Correo no valido" data-success="Correo valido">Correo</label>
                        </div>

                        <div class="input-field col s6">
                            <input id="numero_camiseta" type="text" class="validate" name="num_camiseta" required onkeypress="return isNumberKey(event)">
                            <label for="numero_camiseta">Número de la camiseta</label>
                        </div>
                        <div class="input-field col s6">
                            <input id="peso" type="text" class="validate" name="peso" required onkeypress="return isNumberKey(event)">
                            <label for="peso">Peso</label>
                        </div>
                        <div class="input-field col s6">
                            <input id="estatura" type="text" class="validate" name="estatura"required onkeypress="return isNumberKey(event)">
                            <label for="estatura">Estatura</label>
                        </div>

                        <div class="input-field col s6">
                            <input id="posicion" type="text" class="validate" name="posicion" required>
                            <label for="posicion">Posición</label>
                        </div> 
                    </div><!-- fin de la clase fila-->

                    <br>

                    <div class="row center-align">

                        <button  class="btn waves-effect green accent-4 registrarJugador " type="button" id="registrarJugador" class="Registrar">Registrar</button>
                        <button class="btn waves-effect green accent-4 " type="button" id="btnModificarJugador" class="cancelar">Modificar</button>
                        <button class="btn waves-effect green accent-4 " type="button" id="Cancelar" class="cancelar">Cancelar</button>


                    </div>

                </form>
            </div>


            <!----------------------------------TABLA POSICION------------------------------------->
            <div class="card-panel lighten-1 " id="tableposicion" >
                <h4 class="center-align">Tabla de posición</h4>
                <table cellspacing="0" cellpadding="0"  class=" bordered striped centered responsive-table tblPosicion" id="tblPosicion">
                    <thead>
                    <th>Posición</th>
                    <th>Nombre</th>
                    <th>PG</th>
                    <th>PP</th>
                    <th>PE</th>
                    <th>GF</th>
                    <th>GC</th>
                    <th>PTS</th>
                    </thead>
                    <tr class="fondo1">
                        <td>
                            <p>1</p>
                        </td>
                        <td>
                            Atlético de Madrid
                        </td>
                        <td>20</td>
                        <td>7</td>
                        <td>3</td>
                        <td>21</td>
                        <td>12</td>
                        <td>68</td>
                    </tr>
                    <tr class="fondo2">
                        <td>
                            <p>2</p>
                        </td>
                        <td>Real Madrid</td>
                        <td>15</td>
                        <td>10</td>
                        <td>5</td>
                        <td>16</td>
                        <td>6</td>
                        <td>53</td>
                    </tr>
                    <tr class="fondo1">
                        <td>
                            <p>3</p>
                        </td>
                        <td>Barcelona</td>
                        <td>12</td>
                        <td>8</td>
                        <td>4</td>
                        <td>24</td>
                        <td>9</td>
                        <td>46</td>
                    </tr>
                    <tr>
                        <td>4</td>
                        <td>Valencia</td>
                        <td>6</td>
                        <td>5</td>
                        <td>25</td>
                        <td>3</td>
                        <td>5</td>
                        <td>39</td>
                    </tr>
                </table>
            </div>


            <!-------------------------------------------FECHAS DE COMPETICIÓN-------------------------------->
 
            
            <div id="fechasCompeticion">
                <ul class="collection with-header">
                    <li class="collection-header"><h4>Fechas de competición</h4></li>
                    <li class="collection-item"><a href="#!" class="collection-item" onclick="partidos()">fecha 1</a></li>
                    <li class="collection-item"><a href="#!" class="collection-item">fecha 2</a></li>
                    <li class="collection-item"><a href="#!" class="collection-item">fecha 3</a></li>
                    <li class="collection-item"><a href="#!" class="collection-item">fecha 4</a></li>
                </ul>
            </div>


            <!---------------------------------PARTIDOS-------------------------------------------------------->
            <div class="card-panel lighten-1 " id="divPartidos"> 
                <table class="bordered striped centered responsive-table" id="tblPartidos">
    <thead>
     
      <tr>
        <th>
          Juego
        </th>
         <th>
          Fecha
        </th>
        <th>
          Hora
        </th>
        <th COLSPAN=4>
          Equipo vs equipo
        </th>
        
        
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>
          1
        </td>
         <td>
          <time datetime="2014-06-12">12-octubre-14</time>
        </td>
         <td>
          <time>15:00 HRS</time> 
        </td>
        <td>
          Real Madrid
        </td>        
        <td>
          Juventus
        </td>
         
      </tr>
       <tr>
        <td>
          2
        </td>
         <td>
          <time datetime="2014-06-13">13-octubre-14</time>
        </td>
         <td>
          <time>11:00 HRS</time> 
        </td>
       <td>
          Barcelona
        </td>        
        <td>
          Milan
        </td>
      </tr>
        <tr>
        <td>
          3
        </td>
         <td>
          <time datetime="2014-06-13">13-octubre-14</time>
        </td>
         <td>
          <time>14:00 HRS</time> 
        </td>
       <td>
          Porto
        </td>        
        <td>
          Bayer
        </td>
      </tr>
       <tr>
        <td>
          4
        </td>
         <td>
          <time datetime="2014-06-13">13-octubre-16</time>
        </td>
         <td>
          <time>17:00 HRS</time> 
        </td>
       <td>
          Valencia
        </td>        
        <td>
          Borussia dortmund
        </td>
      </tr>
      
    </tbody>
  </table>
            </div>



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
