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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>SportSoft</title>\n");
      out.write("         <!------------------------------------MATERIALIZECSS--------------------------------------->\n");
      out.write("        <link href=\"css/materialize.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/materialize.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"js/inicioMaterializecss.js\" type=\"text/javascript\"></script>\n");
      out.write("        <!------------------------------------AJAX---------------------------------------->\n");
      out.write("        <script src=\"js/ajax.js\" type=\"text/javascript\"></script>\n");
      out.write("        <!------------------------------------JQUERY------------------------------------->\n");
      out.write("        <script src=\"js/jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/validaciones.js\" type=\"text/javascript\"></script>\n");
      out.write("        <!------------------------------------CSS---------------------------------------->\n");
      out.write("        <link href=\"css/estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!------------------------------------SWEETALERT------------------------------------->\n");
      out.write("        <link href=\"css/sweetalert.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"js/sweetalert.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    \n");
      out.write("        <script src=\"js/pace.min.js\" type=\"text/javascript\"></script>\n");
      out.write("         <link href=\"templates/pace-theme-corner-indicator.tmpl.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("         \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <nav>\n");
      out.write("            <div class=\"nav-wrapper  green accent-4\">\n");
      out.write("                <a href=\"#!\" class=\"brand-logo\"><img src=\"imgs/logop.png\"></a>\n");
      out.write("                <a href=\"#\" data-activates=\"mobile-demo\" class=\"button-collapse\"><i class=\"material-icons\">menu</i></a>\n");
      out.write("                <ul class=\"right hide-on-med-and-down\">\n");
      out.write("                    <li><a href=\"login.jsp\"  id=\"personal\" class=\"personal\">Iniciar Sesion</a></li>\n");
      out.write("                   \n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"side-nav\" id=\"mobile-demo\">\n");
      out.write("                   <li><a href=\"personal.jsp\"  id=\"\" class=\"personal\">Iniciar Sesión</a></li>\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <!----------------------------------DROPDOWN CONFIGURACION-------------------------------------------------->\n");
      out.write("        <ul id=\"configuracion\" class=\"dropdown-content\">\n");
      out.write("            <li><a href=\"login.jsp?cerrar=true\">salir</a></li>\n");
      out.write("        <!----------------------------------DROPDOWN DEPORTES-------------------------------------------------->\n");
      out.write("            <ul id=\"deportes\" class=\"dropdown-content\">\n");
      out.write("                <li><a href=\"torneos.jsp\">Futbol</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("        <br><br>\n");
      out.write("        \n");
      out.write("      <!--  <div class=\"container\">-->\n");
      out.write("            <div style=\"background-color: black\">\n");
      out.write("         <div class=\"slider\">\n");
      out.write("    <ul class=\"slides\">\n");
      out.write("      <li>\n");
      out.write("        <img src=\"http://www.wsfint.co/images/soccer-1.jpeg\"> <!-- random image -->\n");
      out.write("        <div class=\"caption center-align\">\n");
      out.write("          <h3 style=\"background-color:#43a047;opacity: 0.9\">Jugadores</h3>\n");
      out.write("        </div>\n");
      out.write("      </li>\n");
      out.write("      <li>\n");
      out.write("        <img src=\"http://www.kansascity.com/sports/mls/fc-kansas-city/vw12/picture87510197/ALTERNATES/LANDSCAPE_1140/soccer%20stock\"> <!-- random image -->\n");
      out.write("        <div class=\"caption center-align\">\n");
      out.write("          <h3 style=\"background-color:#43a047;opacity: 0.9\">Implementos Deportivos</h3>\n");
      out.write("        </div>\n");
      out.write("      </li>\n");
      out.write("      <li>\n");
      out.write("        <img src=\"http://www.e-dublin.com.br/wp-content/uploads/2013/09/soccer.jpg\"> <!-- random image -->\n");
      out.write("        <div class=\"caption center-align\">\n");
      out.write("            <h3 style=\"background-color:#43a047;opacity: 0.9\">Gestión de Empleados</h3>\n");
      out.write("        </div>\n");
      out.write("      </li>\n");
      out.write("      <li>\n");
      out.write("        <img src=\"http://thornhillsoccer.com/wp-content/uploads/2016/02/Soccer-Stadium.jpg\"> <!-- random image -->\n");
      out.write("        <div class=\"caption center-align\">\n");
      out.write("          <h3 style=\"background-color:#43a047;opacity: 0.9\">Organización de Torneos Deportivos</h3>\n");
      out.write("        </div>\n");
      out.write("      </li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("       <!-- </div>-->\n");
      out.write("        \n");
      out.write("              <footer class=\"page-footer green accent-4\">\n");
      out.write("          <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col l4 s4\">\n");
      out.write("                <p class=\"white-text\">Datos de la empresa</p>\n");
      out.write("                <p class=\"grey-text text-lighten-4\">Nombre: Grupo SportSoft.</p>\n");
      out.write("                                <p class=\"grey-text text-lighten-4\">Direccion: Cr 23b Nr 38b - 274</p>\n");
      out.write("                <p class=\"grey-text text-lighten-4\">Teléfono: 5283318</p>\n");
      out.write("                <p class=\"grey-text text-lighten-4\">Correo: gruposportsoft@gmail.com</p>\n");
      out.write("\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col l4  s14\">\n");
      out.write("                <p class=\"white-text\">Acerca de</p>\n");
      out.write("                <ul>\n");
      out.write("                  <li><a class=\"grey-text text-lighten-3\" href=\"manualusuario.jsp\">Manual de usuario</a></li>\n");
      out.write("                  <li><a class=\"grey-text text-lighten-3\" href=\"#!\">Manual técnico</a></li>\n");
      out.write("                  <li><a class=\"grey-text text-lighten-3\" href=\"condiciones.jsp\">Términos de uso</a></li>\n");
      out.write("                  <!--<li><a class=\"grey-text text-lighten-3\" href=\"#!\">Link 3</a></li>\n");
      out.write("                  <li><a class=\"grey-text text-lighten-3\" href=\"#!\">Link 4</a></li>-->\n");
      out.write("                </ul>\n");
      out.write("              </div>\n");
      out.write("                              <div class=\"col l4  s14\">\n");
      out.write("                                  <a href=\"#\"> <p class=\"white-text\" onclick=\"contac()\">Contáctenos</p></a>\n");
      out.write("                                                  <form id=\"formulario-contacto\" action=\"script.php\" method=\"post\" class=\"card-panel lighten-1\">\n");
      out.write(" <input type=\"hidden\" name=\"redireccion\" value=\"http://www.opencademy.com\" />  \n");
      out.write(" <fieldset>\n");
      out.write(" <legend>Contactenos:</legend>\n");
      out.write(" <ul>\n");
      out.write("  <li>\n");
      out.write("   <label for=\"nombre\">Nombre:</label>\n");
      out.write("   <input type=\"text\" name=\"nombre\" id=\"nombre\" value=\"\" />\n");
      out.write("  </li>\n");
      out.write("  <li>\n");
      out.write("   <label for=\"correo-e\">Correo:</label>\n");
      out.write("   <input type=\"text\" name=\"correo-e\" id=\"correo-e\" value=\"\" />\n");
      out.write("  </li>\n");
      out.write("  <li>\n");
      out.write("   <label for=\"comentario\">Comentario:</label>\n");
      out.write("   <textarea name=\"comentario\" id=\"comentario\" cols=\"25\" rows=\"3\"></textarea>\n");
      out.write("  </li>\n");
      out.write("  \n");
      out.write("  <li>\n");
      out.write("   <input type=\"submit\" value=\"Enviar\" />\n");
      out.write("   <input type=\"reset\" value=\"Borrar todo\" />\n");
      out.write("  </li>\n");
      out.write(" </ul>\n");
      out.write("</fieldset>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("                              </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("            \n");
      out.write("<div class=\"footer\">\n");
      out.write("    <p class=\"white-text\">redes sociales</p>\n");
      out.write("    <div class=\"social\"><a >&#62220;</a></div>\n");
      out.write("    <div class=\"social\"><a href=\"https://twitter.com/?request_context=signup\">&#62217;</a></div>\n");
      out.write("    <div class=\"social\"><a href=\"https://plus.google.com/u/0/\">&#62223;</a></div>\n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("          <div class=\"footer-copyright center-align\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("            © 2014 Copyright SportSoft (V1)\n");
      out.write("           <!-- <a class=\"grey-text text-lighten-4 right\" href=\"#!\">More Links</a>-->\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </footer>\n");
      out.write("            \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
