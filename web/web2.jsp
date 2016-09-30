<%-- 
    Document   : web2
    Created on : 30/09/2016, 01:11:00 AM
    Author     : ESTEBAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <title>SportSoft</title>
         <!------------------------------------MATERIALIZECSS--------------------------------------->
        <link href="css/materialize.min.css" rel="stylesheet" type="text/css"/>
        <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
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
        <link rel="icon" type="image/png" href="imgs/logop.png"/>
         
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
        <!--parallax---------------------------------------------->
        <div class="parallax-container">
            <div class="parallax"><img src="imgs/mm.jpg"></div>
        </div>
        <div class="section white">
            <div class="row container">
                <h2 class="header">SportSoft</h2>
                <!----------------------------------------------------------------->
                <div class="chip">
                    <img src="imgs/Entrenador.jpg" alt="Contact Person">
                    Jane Doe
                </div>
                <div class="chip">
                    <img src="imgs/arbitros1.jpg" alt="Contact Person">
                    Jane Doe
                </div>

        
                
                <div class="carousel">
                    <a class="carousel-item" href="#one!"><img src="http://www.exposureguide.com/images/soccer-photography-tips/soccer-photography-tips4-e.jpg"></a>
                    <a class="carousel-item" href="#two!"><img src="http://www.active.com/Assets/active-family/620/drill-of-the-week-soccer-passing.jpg"></a>
                    <a class="carousel-item" href="#three!"><img src="http://www.gannett-cdn.com/-mm-/9ae2a90976bcbab7645d8dd2996716dc54797fa4/c=0-69-1348-831&r=x329&c=580x326/local/-/media/2015/07/02/Westchester/Westchester/635714678539442762-socc.jpg"></a>
                    <a class="carousel-item" href="#four!"><img src="https://15128-presscdn-0-60-pagely.netdna-ssl.com/wp-content/uploads/2016/04/american-soccer-994x559.jpg"></a>
                    <a class="carousel-item" href="#five!"><img src="http://plstore.mx/c/46-category_default/futbol-soccer.jpg"></a>
                </div>
                
                
            
                <ul class="collapsible" data-collapsible="accordion">
                    <li>
                        <div class="collapsible-header"><i class="material-icons">filter_drama</i>First</div>
                        <div class="collapsible-body"><p>Lorem ipsum dolor sit amet.</p></div>
                    </li>
                    <li>
                        <div class="collapsible-header"><i class="material-icons">place</i>Second</div>
                        <div class="collapsible-body"><p>Lorem ipsum dolor sit amet.</p></div>
                    </li>
                    <li>
                        <div class="collapsible-header"><i class="material-icons">whatshot</i>Third</div>
                        <div class="collapsible-body"><p>Lorem ipsum dolor sit amet.</p></div>
                    </li>
                </ul>
             
                
                <!----------------------------------------------------------------->            
            </div>
        </div>
        <div class="parallax-container">
            <div class="parallax"><img src="imgs/qq.jpg"></div>
        </div>
      
        <!------------------------------------------------------>

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
