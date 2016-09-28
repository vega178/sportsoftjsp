package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import beans.Tournaments;
import DAO.DaoTournaments;
import java.sql.ResultSet;

public final class torneos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>SportSoft</title>\n");
      out.write("         <!------------------------------------MATERIALIZECSS--------------------------------------->\n");
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
      out.write("        <script src=\"js/datatable.js\" type=\"text/javascript\"></script>\n");
      out.write("        <!------------------------------------DATATABLE------------------------------------------------------------------->\n");
      out.write("         <script type=\"text/javascript\" src=\"http://cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js\"></script>\n");
      out.write("         <link href=\"https://cdn.datatables.net/1.10.12/css/jquery.dataTables.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("         <link href=\"https://cdn.datatables.net/buttons/1.2.2/css/buttons.dataTables.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("       \n");
      out.write("          <script src=\"js/pace.min.js\" type=\"text/javascript\"></script>\n");
      out.write("         <link href=\"templates/pace-theme-corner-indicator.tmpl.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("   <!------------------------------------------------------------------------------------------------------------------------------->\n");
      out.write("  \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav>\n");
      out.write("            <div class=\"nav-wrapper green accent-4\">\n");
      out.write("                <a href=\"paginaPrincipal.jsp\" class=\"brand-logo\"><img src=\"imgs/logop.png\"></a>\n");
      out.write("                <a href=\"#\" data-activates=\"mobile-demo\" class=\"button-collapse\"><i class=\"material-icons\">menu</i></a>\n");
      out.write("                <ul class=\"right hide-on-med-and-down\">\n");
      out.write("                    <li><a href=\"#\" id=\"nuevoTorneo\" class=\"crearTorneo\" onclick=\"addTournaments()\">Crear Torneo</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"side-nav\" id=\"mobile-demo\">\n");
      out.write("                    <li><a href=\"#\">Crear Torneo</a></li>\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row card-panel lighten-1 divFormTorneo\" id=\"divFormTorneos\" >\n");
      out.write("                <h4>Nuevo Torneo</h4>\n");
      out.write("                <form id=\"formTorneo col s10\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"input-field col s6 \">\n");
      out.write("\n");
      out.write("                                <input type=\"text\" id=\"nombreT\" name=\"nombreTorneo\">\n");
      out.write("                                <label for=\"nombreT\" data-success=\"right\">Nombre Del Torneo:</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"input-field col s6\">\n");
      out.write("                           <select name=\"deporte\" id=\"idDeporte\">\n");
      out.write("                                    <option value=\"futbol\"></option>\n");
      out.write("                                    ");
ResultSet rs = DaoTournaments.consultSport();
                                        while (rs.next()) {

                                    
      out.write("\n");
      out.write("                                    <option>");
      out.print(rs.getString("nombre"));
      out.write("</option>\n");
      out.write("                                    ");

                                        }
                                    
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                                <label>Deporte</label>\n");
      out.write("                               \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                             <div class=\"input-field col s6\" >\n");
      out.write("                                <input type=\"date\" id=\"fechaIni\" name=\"fechaInicio\">\n");
      out.write("                                <label for=\"fechaIni\" data-success=\"right\" style=\"margin-top: -30px\">Fecha De Inicio:</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"input-field col s6 \">\n");
      out.write("                                <input type=\"date\" id=\"fechaFin\" name=\"fechaFin\">\n");
      out.write("                                <label for=\"fechaF\" data-success=\"right\" style=\"margin-top: -30px\">Fecha De Finalizacion:</label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"input-field \">\n");
      out.write("                            <textarea id=\"descripcion\" name=\"detalle\" class=\"materialize-textarea\" ></textarea>\n");
      out.write("                            <label for=\"descripcion\">Descripción</label>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"input-field \" name=\"\">\n");
      out.write("\n");
      out.write("                            <select name=\"encargado\" id=\"encargado\">\n");
      out.write("                                <option>Encargado</option>\n");
      out.write("\n");
      out.write("                                ");

                                    rs = DaoTournaments.consultNameEmployee();
                                    while (rs.next()) {


                                
      out.write("\n");
      out.write("                                <option>");
      out.print(rs.getString("nombre"));
      out.write("</option>\n");
      out.write("\n");
      out.write("                                ");

                                    }
                                
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                            <label>encargado</label>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <button class=\"btn waves-effect waves-light green accent-4 btnCrearTorneo\" type=\"button\" id=\"btnCrearTorneo\">Crear\n");
      out.write("                    </button>\n");
      out.write("                            <button class=\"btn waves-effect waves-light green accent-4 btncancelarTorneo\" type=\"button\" id=\"btncancelarTorneo\" onclick=\"cancel()\">Cancelar\n");
      out.write("                    </button>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("                            <br><br>\n");
      out.write("                            <div id=\"divDatosTorneo\" class=\"card-panel lighten-1\">\n");
      out.write("                <table id=\"datosTorneo\" class=\"bordered striped centered responsive-table highlight\" cellspacing=\"0\" width=\"100%\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Nombre</th>\n");
      out.write("                            <th>Fecha de Inicio</th>\n");
      out.write("                            <th>Fecha de Finalización</th>\n");
      out.write("                            <th>Descripción</th>\n");
      out.write("                            <th>Equipos</th>\n");
      out.write("                            <th>Modificar</th>\n");
      out.write("                            <th>Eliminar</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        ");
 DaoTournaments daot = new DaoTournaments();
                            Tournaments t = new Tournaments();
                            ArrayList<Tournaments> list = daot.listTournamens();

                            if (list != null) {
                                for (int i = 0; i < list.size(); i++) {
                                    t = list.get(i);
                        String json = "[{id:'"+t.getId()+"',name:'"+t.getName_tournaments()+"'}]";            
//String json = "[{id:'"+u.getId()+"',nom:'"+u.getNombre()+"',ape:'"+u.getApellido()+"'}]";
                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td id=\"\">");
      out.print(t.getName_tournaments());
      out.write("</td>\n");
      out.write("                            <td id=\"\">");
      out.print(t.getStart_date());
      out.write("</td> \n");
      out.write("                            <td id=\"\">");
      out.print(t.getFinis_date());
      out.write("</td>\n");
      out.write("                            <td id=\"\">");
      out.print(t.getDescription());
      out.write("</td>\n");
      out.write("                            <td id=\"\"><a class=\"irEquiposs\" href=\"equipos.jsp?idTorneo=");
      out.print(t.getId());
      out.write("\"><i class=\"material-icons small\">add_circle</i></a></td>\n");
      out.write("                            <td><i class=\"material-icons small \" id=\"modificarIcon\" value=\"\">mode_edit</i>\n");
      out.write("                            </td>\n");
      out.write("                            <td><button class=\"btnEliminarTorneos\" value=\"");
      out.print(t.getId());
      out.write("\"><i class=\"material-icons small\">delete</i></button></td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");

                            }
                        } else {
      out.write("\n");
      out.write("                    <h3>no existen datos</h3>\n");
      out.write("                    ");
   }

                    
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
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
