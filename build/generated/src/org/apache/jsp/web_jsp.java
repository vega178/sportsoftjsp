package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class web_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>SportSoft</title>\r\n");
      out.write("         <!------------------------------------MATERIALIZECSS--------------------------------------->\r\n");
      out.write("        <link href=\"css/materialize.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"js/materialize.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\r\n");
      out.write("        <script src=\"js/inicioMaterializecss.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <!------------------------------------AJAX---------------------------------------->\r\n");
      out.write("        <script src=\"js/ajax.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <!------------------------------------JQUERY------------------------------------->\r\n");
      out.write("        <script src=\"js/jquery.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"js/validaciones.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <!------------------------------------CSS---------------------------------------->\r\n");
      out.write("        <link href=\"css/estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <!------------------------------------SWEETALERT------------------------------------->\r\n");
      out.write("        <link href=\"css/sweetalert.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <script src=\"js/sweetalert.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    \r\n");
      out.write("        <script src=\"js/pace.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <link href=\"templates/pace-theme-corner-indicator.tmpl.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"imgs/logop.png\"/>\r\n");
      out.write("         \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <nav>\r\n");
      out.write("            <div class=\"nav-wrapper  green accent-4\">\r\n");
      out.write("                <a href=\"#!\" class=\"brand-logo\"><img src=\"imgs/logop.png\"></a>\r\n");
      out.write("                <a href=\"#\" data-activates=\"mobile-demo\" class=\"button-collapse\"><i class=\"material-icons\">menu</i></a>\r\n");
      out.write("                <ul class=\"right hide-on-med-and-down\">\r\n");
      out.write("                    <li><a href=\"login.jsp\"  id=\"personal\" class=\"personal\">Iniciar Sesion</a></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </ul>\r\n");
      out.write("                <ul class=\"side-nav\" id=\"mobile-demo\">\r\n");
      out.write("                    <li><a href=\"personal.jsp\"  id=\"\" class=\"personal\">Iniciar Sesión</a></li>\r\n");
      out.write("\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("        <!----------------------------------DROPDOWN CONFIGURACION-------------------------------------------------->\r\n");
      out.write("        <ul id=\"configuracion\" class=\"dropdown-content\">\r\n");
      out.write("            <li><a href=\"login.jsp?cerrar=true\">salir</a></li>\r\n");
      out.write("            <!----------------------------------DROPDOWN DEPORTES-------------------------------------------------->\r\n");
      out.write("            <ul id=\"deportes\" class=\"dropdown-content\">\r\n");
      out.write("                <li><a href=\"torneos.jsp\">Futbol</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </ul>\r\n");
      out.write("\r\n");
      out.write("        <br><br>\r\n");
      out.write("\r\n");
      out.write("        <!--  <div class=\"container\">-->\r\n");
      out.write("        <div style=\"background-color: black\">\r\n");
      out.write("            <div class=\"slider\">\r\n");
      out.write("                <ul class=\"slides\">\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <img src=\"http://www.wsfint.co/images/soccer-1.jpeg\"> <!-- random image -->\r\n");
      out.write("                        <div class=\"caption center-align\">\r\n");
      out.write("                            <h3 style=\"background-color:#43a047;opacity: 0.9\">Jugadores</h3>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <img src=\"http://www.kansascity.com/sports/mls/fc-kansas-city/vw12/picture87510197/ALTERNATES/LANDSCAPE_1140/soccer%20stock\"> <!-- random image -->\r\n");
      out.write("                        <div class=\"caption center-align\">\r\n");
      out.write("                            <h3 style=\"background-color:#43a047;opacity: 0.9\">Implementos Deportivos</h3>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <img src=\"http://www.e-dublin.com.br/wp-content/uploads/2013/09/soccer.jpg\"> <!-- random image -->\r\n");
      out.write("                        <div class=\"caption center-align\">\r\n");
      out.write("                            <h3 style=\"background-color:#43a047;opacity: 0.9\">Gestión de Empleados</h3>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <img src=\"http://thornhillsoccer.com/wp-content/uploads/2016/02/Soccer-Stadium.jpg\"> <!-- random image -->\r\n");
      out.write("                        <div class=\"caption center-align\">\r\n");
      out.write("                            <h3 style=\"background-color:#43a047;opacity: 0.9\">Organización de Torneos Deportivos</h3>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- </div>-->\r\n");
      out.write("\r\n");
      out.write("        <footer class=\"page-footer green accent-4\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col l4 s4\">\r\n");
      out.write("                        <p class=\"white-text\">Datos de la empresa</p>\r\n");
      out.write("                        <p class=\"grey-text text-lighten-4\">Nombre: Grupo SportSoft.</p>\r\n");
      out.write("                        <p class=\"grey-text text-lighten-4\">Direccion: Cr 23b Nr 38b - 274</p>\r\n");
      out.write("                        <p class=\"grey-text text-lighten-4\">Teléfono: 5283318</p>\r\n");
      out.write("                        <p class=\"grey-text text-lighten-4\">Correo: gruposportsoft@gmail.com</p>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col l4  s14\">\r\n");
      out.write("                        <p class=\"white-text\">Acerca de</p>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a class=\"grey-text text-lighten-3\" href=\"manualusuario.jsp\">Manual de usuario</a></li>\r\n");
      out.write("                            <li><a class=\"grey-text text-lighten-3\" href=\"manualTecnico.jsp\">Manual técnico</a></li>\r\n");
      out.write("                            <li><a class=\"grey-text text-lighten-3\" href=\"condiciones.jsp\">Términos de uso</a></li>\r\n");
      out.write("                            <!--<li><a class=\"grey-text text-lighten-3\" href=\"#!\">Link 3</a></li>\r\n");
      out.write("                            <li><a class=\"grey-text text-lighten-3\" href=\"#!\">Link 4</a></li>-->\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col l4  s14\">\r\n");
      out.write("                        <a href=\"#\"> <p class=\"white-text\" onclick=\"contac()\">Contáctenos</p></a>\r\n");
      out.write("                        <form id=\"formulario-contacto\" action=\"script.php\" method=\"post\" class=\"card-panel lighten-1\">\r\n");
      out.write("                            <input type=\"hidden\" name=\"redireccion\" value=\"http://www.opencademy.com\" />  \r\n");
      out.write("                            <fieldset>\r\n");
      out.write("                                <legend>Contactenos:</legend>\r\n");
      out.write("                                <ul>\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <label for=\"nombre\">Nombre:</label>\r\n");
      out.write("                                        <input type=\"text\" name=\"nombre\" id=\"nombre\" value=\"\" />\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <label for=\"correo-e\">Correo:</label>\r\n");
      out.write("                                        <input type=\"text\" name=\"correo-e\" id=\"correo-e\" value=\"\" />\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <label for=\"comentario\">Comentario:</label>\r\n");
      out.write("                                        <textarea name=\"comentario\" id=\"comentario\" cols=\"25\" rows=\"3\"></textarea>\r\n");
      out.write("                                    </li>\r\n");
      out.write("\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <input type=\"submit\" value=\"Enviar\" />\r\n");
      out.write("                                        <input type=\"reset\" value=\"Borrar todo\" />\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </fieldset>\r\n");
      out.write("                        </form>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"footer\">\r\n");
      out.write("                <p class=\"white-text\">redes sociales</p>\r\n");
      out.write("                <div class=\"social\"><a >&#62220;</a></div>\r\n");
      out.write("                <div class=\"social\"><a href=\"https://twitter.com/?request_context=signup\">&#62217;</a></div>\r\n");
      out.write("                <div class=\"social\"><a href=\"https://plus.google.com/u/0/\">&#62223;</a></div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"footer-copyright right-align\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    Copyright 2016 SportSoft© 2.0\r\n");
      out.write("                    <!--<a class=\"grey-text text-lighten-4 right\" href=\"#!\">More Links</a>-->\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </footer>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
