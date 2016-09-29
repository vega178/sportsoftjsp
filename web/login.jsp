<%-- 
    Document   : login
    Created on : 9/09/2016, 06:55:53 AM
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
          <li><a onclick="login()" id="iniciarSesion">Iniciar sesión</a></li>
          <li><a onclick="registro()" id="registroini">Registrarse</a></li>
        
      </ul>
      <ul class="side-nav" id="mobile-demo">
          <li><a onclick="login()">Iniciar sesión</a></li>
        <li><a href="" onclick="registro()">Registrarse</a></li>
      </ul>
    </div>
  </nav>
         
        <div class="container">
        <div class="row card-panel teal grey lighten-4" id="divLogin">
            <div id="divImagenLogin"><img src="imgs/logog.png" style="width: 60%;"></div>
            <form class="col s12 card-panel teal grey lighten-4">
                <div class="row">
                    <div class="input-field col s12">
                        <i class="material-icons prefix">account_circle</i>
                        <input id="usuario" type="text" class="valid" onkeypress="return isNumberKey(event)">
                        <label for="icon_prefix">Número de documento</label>
                    </div>                
                </div>
                <div class="row"> 
                    <div class="input-field col s12">
                        <i class="material-icons prefix">lock</i>
                        <input id="clave" type="password" class="valid">
                        <label for="icon_telephone">Clave</label>
                    </div>
                </div>
                <div class="center-align">
                    <button class="btn waves-effect green accent-4" type="button" id="btnLogin" onclick="">Ingresar</button>
                    <button class="btn waves-effect green accent-4"  type="button" id="btncancelarLogin">Cancelar</button>
                            </div>
                
                <span><p><span>Olvidé mi contraseña</span></p></span>
            </form>
        </div>
        
        
        <div class="row card-panel teal grey lighten-4" id="divRegistro">
         <div id="divImagenLogin"><img src="imgs/logog.png" style="width: 60%;"></div>
            <form class="col s12 card-panel teal grey lighten-4">
                <div class="row">
                    <div class="input-field col s12">
                        <i class="material-icons prefix">account_circle</i>
                        <input id="usuarioRegisro" type="text" class="valid" onkeypress="return isNumberKey(event)">
                        <label for="icon_prefix">Numero de documento</label>
                    </div>                
                </div>
                <div class="row"> 
                    <div class="input-field col s12">
                        <i class="material-icons prefix">lock</i>
                        <input id="claveRegistro" type="password" class="valid">
                        <label for="icon_telephone">Clave</label>
                    </div>
                </div>
                 <div class="row"> 
                    <div class="input-field col s12">
                        <i class="material-icons prefix">lock</i>
                        <input id="confirmarClave" type="password" class="valid">
                        <label for="icon_telephone">Confirmar clave</label>
                    </div>
                </div>
                <div class="center-align">
                    <button class="btn waves-effect green accent-4" type="button" id="btnRegistro" onclick="">Ingresar</button>
                    <button class="btn waves-effect green accent-4" type="button" id="btncancelarRegistro">Cancelar</button>
                           
                </div>
            </form>
        </div>

        </div>
        
        <!-- calle 48c sur # 43a 270 envigado
             gestionhumana@estampadosdiueicx.com
        --><div>
            <h3></h3><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
        </div>
        
        <footer class="page-footer green accent-4" id="footerLogin">
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
