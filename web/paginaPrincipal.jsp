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
            <li><a href="web.jsp?cerrar=true">salir</a></li>
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
        
      <!--  <div class="container">-->
               <div class="container">
            <h2 id="tituloArbitro" class="center-align">Árbitros</h2>

            <div class="row" id="card" >
                <div class="card col s4" id="cardPersonal">
                    <div class="card-image waves-effect waves-block waves-light">
                        <img class="activator" src="imgs/Entrenador.jpg">
                    </div>
                    <div class="card-content">
                        <span class="card-title activator grey-text text-darken-4">Empleados<i class="material-icons right">more_vert</i></span>
                        <p><a href="#" id="agregarPersonal" onclick="">Acceder</a></p>
                    </div>
                    <div class="card-reveal">
                        <span class="card-title grey-text text-darken-4">Empleados<i class="material-icons right">close</i></span>
                        <p></p>
                    </div>
                </div>
                
                    


                <div class="card col s4" id="cardArbitro">
                    <div class="card-image waves-effect waves-block waves-light">
                        <img class="activator" src="imgs/arbitros1.jpg">
                    </div>
                    <div class="card-content">
                        <span class="card-title activator grey-text text-darken-4">Árbitros<i class="material-icons right">more_vert</i></span>
                        <p><a href="#" id="agregarArbitro" onclick="">Acceder</a> </p>
                    </div>
                    <div class="card-reveal">
                        <span class="card-title grey-text text-darken-4">Árbitros<i class="material-icons right">close</i></span>
                        <p>La función principal de un árbitro es hacer que el juego se lleve a cabo con la menor cantidad posibles de interferencias, y su responsabilidad fundamental, cuidar la integridad física de los jugadores. .</p>
                    </div>
                </div> 
                
                
               <div class="card col s4" id="cardPersonal">
                    <div class="card-image waves-effect waves-block waves-light">
                        <img class="activator" src="imgs/torneo_opt.jpg">
                    </div>
                    <div class="card-content">
                        <span class="card-title activator grey-text text-darken-4">Torneos<i class="material-icons right">more_vert</i></span>
                        <p><a href="#" id="agregarPersonal" onclick="">Acceder</a></p>
                    </div>
                    <div class="card-reveal">
                        <span class="card-title grey-text text-darken-4">Torneos<i class="material-icons right">close</i></span>
                        <p></p>
                    </div>
                </div>
            </div> </div>

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
