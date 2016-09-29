<%-- 
    Document   : web
    Created on : 28/09/2016, 01:09:10 PM
    Author     : santhyago
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
    
        <script src="js/pace.min.js" type="text/javascript"></script>
         <link href="templates/pace-theme-corner-indicator.tmpl.css" rel="stylesheet" type="text/css"/>
         
    </head>
    <body>
         <nav>
            <div class="nav-wrapper  green accent-4">
                <a href="#!" class="brand-logo"><img src="imgs/logop.png"></a>
                <a href="#" data-activates="mobile-demo" class="button-collapse"><i class="material-icons">menu</i></a>
                <ul class="right hide-on-med-and-down">
                    <li><a href="login.jsp"  id="personal" class="personal">Iniciar Sesion</a></li>
                   

                </ul>
                <ul class="side-nav" id="mobile-demo">
                   <li><a href="personal.jsp"  id="" class="personal">Iniciar Sesión</a></li>

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
                  <li><a class="grey-text text-lighten-3" href="#!">Manual técnico</a></li>
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
          <div class="footer-copyright center-align">
            <div class="container">
            © 2016 Copyright SportSoft 2.0
           <!-- <a class="grey-text text-lighten-4 right" href="#!">More Links</a>-->
            </div>
          </div>
        </footer>
            
    </body>
</html>
