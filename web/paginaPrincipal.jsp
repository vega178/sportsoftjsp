<%-- 
    Document   : paginaPrincipal
    Created on : 9/09/2016, 07:41:53 AM
    Author     : santhyago
--%>

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

        <script src="js/pace.min.js" type="text/javascript"></script>
         <link href="templates/pace-theme-corner-indicator.tmpl.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <nav>
            <div class="nav-wrapper  green accent-4">
                <a href="#!" class="brand-logo"><img src="imgs/logop.png"></a>
                <a href="#" data-activates="mobile-demo" class="button-collapse"><i class="material-icons">menu</i></a>
                <ul class="right hide-on-med-and-down">
                    <li><a href="personal.jsp"  id="personal" class="personal">Personal</a></li>
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
        </ul>

        <br><br>
        
      <!--  <div class="container">-->
            <div style="background-color: black">
         <div class="slider">
    <ul class="slides">
      <li>
        <img src="http://www.wsfint.co/images/soccer-1.jpeg"> <!-- random image -->
        <div class="caption center-align">
          <h3 style="background-color:#43a047;opacity: 0.9">Jugadores</h3>
        </div>
      </li>
      <li>
        <img src="http://www.kansascity.com/sports/mls/fc-kansas-city/vw12/picture87510197/ALTERNATES/LANDSCAPE_1140/soccer%20stock"> <!-- random image -->
        <div class="caption center-align">
          <h3 style="background-color:#43a047;opacity: 0.9">Implementos Deportivos</h3>
        </div>
      </li>
      <li>
        <img src="http://www.e-dublin.com.br/wp-content/uploads/2013/09/soccer.jpg"> <!-- random image -->
        <div class="caption center-align">
            <h3 style="background-color:#43a047;opacity: 0.9">Gestión de Empleados</h3>
        </div>
      </li>
      <li>
        <img src="http://thornhillsoccer.com/wp-content/uploads/2016/02/Soccer-Stadium.jpg"> <!-- random image -->
        <div class="caption center-align">
          <h3 style="background-color:#43a047;opacity: 0.9">Organización de Torneos Deportivos</h3>
        </div>
      </li>
    </ul>
  </div>
            </div>
            
            
       <!-- </div>-->
        
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
                  <li><a class="grey-text text-lighten-3" href="manualusuario.jsp">Manual de usuario</a></li>
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
