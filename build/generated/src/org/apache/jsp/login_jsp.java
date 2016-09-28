package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <!------------------------------------MATERIALIZECSS--------------------------------------->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.7/css/materialize.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.7/js/materialize.min.js\"></script>\n");
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
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <nav>\n");
      out.write("    <div class=\"nav-wrapper  green accent-4\">\n");
      out.write("        <a href=\"#!\" class=\"brand-logo\"><img src=\"imgs/logop.png\"></a>\n");
      out.write("      <a href=\"#\" data-activates=\"mobile-demo\" class=\"button-collapse\"><i class=\"material-icons\">menu</i></a>\n");
      out.write("      <ul class=\"right hide-on-med-and-down\">\n");
      out.write("          <li><a onclick=\"login()\" id=\"iniciarSesion\">Iniciar sesión</a></li>\n");
      out.write("          <li><a onclick=\"registro()\" id=\"registroini\">Registrarse</a></li>\n");
      out.write("        \n");
      out.write("      </ul>\n");
      out.write("      <ul class=\"side-nav\" id=\"mobile-demo\">\n");
      out.write("          <li><a onclick=\"login()\">Iniciar sesión</a></li>\n");
      out.write("        <li><a href=\"\" onclick=\"registro()\">Registrarse</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("        <div class=\"container\">\n");
      out.write("        <div class=\"row card-panel teal grey lighten-4\" id=\"divLogin\">\n");
      out.write("            <div id=\"divImagenLogin\"><img src=\"imgs/logog.png\" style=\"width: 60%;\"></div>\n");
      out.write("            <form class=\"col s12 card-panel teal grey lighten-4\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"input-field col s12\">\n");
      out.write("                        <i class=\"material-icons prefix\">account_circle</i>\n");
      out.write("                        <input id=\"usuario\" type=\"text\" class=\"valid\" onkeypress=\"return isNumberKey(event)\">\n");
      out.write("                        <label for=\"icon_prefix\">Número de documento</label>\n");
      out.write("                    </div>                \n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\"> \n");
      out.write("                    <div class=\"input-field col s12\">\n");
      out.write("                        <i class=\"material-icons prefix\">lock</i>\n");
      out.write("                        <input id=\"clave\" type=\"password\" class=\"valid\">\n");
      out.write("                        <label for=\"icon_telephone\">Clave</label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"center-align\">\n");
      out.write("                    <button class=\"btn waves-effect green accent-4\" type=\"button\" id=\"btnLogin\" onclick=\"\">Ingresar</button>\n");
      out.write("                    <button class=\"btn waves-effect green accent-4\"  type=\"button\" id=\"btncancelarLogin\">Cancelar</button>\n");
      out.write("                            </div>\n");
      out.write("                \n");
      out.write("                <span><a><p>Olvidé mi contraseña</p></a></span>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"row card-panel teal grey lighten-4\" id=\"divRegistro\">\n");
      out.write("         <div id=\"divImagenLogin\"><img src=\"imgs/logog.png\" style=\"width: 60%;\"></div>\n");
      out.write("            <form class=\"col s12 card-panel teal grey lighten-4\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"input-field col s12\">\n");
      out.write("                        <i class=\"material-icons prefix\">account_circle</i>\n");
      out.write("                        <input id=\"usuarioRegisro\" type=\"text\" class=\"valid\" onkeypress=\"return isNumberKey(event)\">\n");
      out.write("                        <label for=\"icon_prefix\">Numero de documento</label>\n");
      out.write("                    </div>                \n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\"> \n");
      out.write("                    <div class=\"input-field col s12\">\n");
      out.write("                        <i class=\"material-icons prefix\">lock</i>\n");
      out.write("                        <input id=\"claveRegistro\" type=\"password\" class=\"valid\">\n");
      out.write("                        <label for=\"icon_telephone\">Clave</label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                 <div class=\"row\"> \n");
      out.write("                    <div class=\"input-field col s12\">\n");
      out.write("                        <i class=\"material-icons prefix\">lock</i>\n");
      out.write("                        <input id=\"confirmarClave\" type=\"password\" class=\"valid\">\n");
      out.write("                        <label for=\"icon_telephone\">Confirmar clave</label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"center-align\">\n");
      out.write("                    <button class=\"btn waves-effect green accent-4\" type=\"button\" id=\"btnRegistro\" onclick=\"\">Ingresar</button>\n");
      out.write("                    <button class=\"btn waves-effect green accent-4\" type=\"button\" id=\"btncancelarRegistro\">Cancelar</button>\n");
      out.write("                           \n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <!-- calle 48c sur # 43a 270 envigado\n");
      out.write("             gestionhumana@estampadosdiueicx.com\n");
      out.write("        --><div>\n");
      out.write("            <h3></h3><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <footer class=\"page-footer green accent-4\" id=\"footerLogin\">\n");
      out.write("          <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col l6 s12\">\n");
      out.write("                <h5 class=\"white-text\">Datos de la empresa</h5>\n");
      out.write("                <p class=\"grey-text text-lighten-4\">Nombre: Grupo SportSoft.</p>\n");
      out.write("                <p class=\"grey-text text-lighten-4\">Direccion: Cr 23b Nr 38b - 274</p>\n");
      out.write("                <p class=\"grey-text text-lighten-4\">Teléfono: 5283318</p>\n");
      out.write("                <p class=\"grey-text text-lighten-4\">Correo: gruposportsoft@gmail.com</p>\n");
      out.write("\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col l4 offset-l2 s12\">\n");
      out.write("                <h5 class=\"white-text\">Acerca de</h5>\n");
      out.write("                <ul>\n");
      out.write("                  <li><a class=\"grey-text text-lighten-3\" href=\"#!\">Manual de usuario</a></li>\n");
      out.write("                  <li><a class=\"grey-text text-lighten-3\" href=\"#!\">Manual técnico</a></li>\n");
      out.write("                  <li><a class=\"grey-text text-lighten-3\" href=\"condiciones.jsp\">Términos de uso</a></li>\n");
      out.write("                  <!--<li><a class=\"grey-text text-lighten-3\" href=\"#!\">Link 3</a></li>\n");
      out.write("                  <li><a class=\"grey-text text-lighten-3\" href=\"#!\">Link 4</a></li>-->\n");
      out.write("                </ul>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("            \n");
      out.write("<div class=\"footer\">\n");
      out.write("    <h4 class=\"white-text\">redes sociales</h4>\n");
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
