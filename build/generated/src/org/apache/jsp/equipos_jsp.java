package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import beans.Player;
import DAO.DaoPlayer;
import java.util.ArrayList;
import beans.Team;
import DAO.DaoTeam;

public final class equipos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script src=\"js/datatable.js\" type=\"text/javascript\"></script>\n");
      out.write("        <!------------------------------------CSS---------------------------------------->\n");
      out.write("        <link href=\"css/estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!------------------------------------SWEETALERT------------------------------------->\n");
      out.write("        <link href=\"css/sweetalert.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"js/sweetalert.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <!------------------------------------DATATABLE------------------------------------------------------------------->\n");
      out.write("        <script type=\"text/javascript\" src=\"http://cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js\"></script>\n");
      out.write("        <link href=\"https://cdn.datatables.net/1.10.12/css/jquery.dataTables.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"https://cdn.datatables.net/buttons/1.2.2/css/buttons.dataTables.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"code.jquery.com/jquery-1.12.3.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"https://cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"https://cdn.datatables.net/buttons/1.2.2/js/dataTables.buttons.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jszip/2.5.0/jszip.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"//cdn.rawgit.com/bpampuch/pdfmake/0.1.18/build/pdfmake.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"//cdn.rawgit.com/bpampuch/pdfmake/0.1.18/build/vfs_fonts.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"//cdn.datatables.net/buttons/1.2.2/js/buttons.html5.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"https://cdn.datatables.net/1.10.12/css/jquery.dataTables.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"https://cdn.datatables.net/buttons/1.2.2/css/buttons.dataTables.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"//cdnjs.cloudflare.com/ajax/libs/font-awesome/4.4.0/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"js/pace.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"templates/pace-theme-corner-indicator.tmpl.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!------------------------------------------------------------------------------------------------------------------------------->\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <ul id=\"crearEquipos\" class=\"dropdown-content\">\n");
      out.write("            <li><a class=\"waves-effect waves-light modal-trigger\" href=\"#modal1\">Nuevo</a></li>\n");
      out.write("\n");
      out.write("            <li><a href=\"#\">Ver</a></li>\n");
      out.write("        </ul>\n");
      out.write("        <nav>\n");
      out.write("            <div class=\"nav-wrapper green accent-4\">\n");
      out.write("                <a href=\"paginaPrincipal.jsp\" class=\"brand-logo\"><img src=\"imgs/logop.png\"></a>\n");
      out.write("                <a href=\"#\" data-activates=\"mobile-demo\" class=\"button-collapse\"><i class=\"material-icons\">menu</i></a>\n");
      out.write("                <ul class=\"right hide-on-med-and-down\">\n");
      out.write("                    <li><a class=\"dropdown-button\" href=\"#\" data-activates=\"crearEquipos\">Equipos<i class=\"material-icons right\">arrow_drop_down</i></a></li>\n");
      out.write("                    <li><a href=\"#\" id=\"nuevoTorneo\" onclick=\"calendario()\">Calendario</a></li>\n");
      out.write("                    <li><a href=\"#\" id=\"clasificacion\" onclick=\"tablaPosiion()\">Clasificación</a></li>\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"side-nav\" id=\"mobile-demo\">\n");
      out.write("                    <li><a class=\"dropdown-button\" href=\"#\" data-activates=\"crearEquipo\">Equipos<i class=\"material-icons right\">arrow_drop_down</i></a></li>\n");
      out.write("                    <li><a href=\"#\" id=\"nuevoTorne\">Partidos</a></li>\n");
      out.write("                    <li><a href=\"#\" id=\"clasificacio\">Clasificacion</a></li>\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        ");
if (Integer.parseInt(request.getParameter("idTorneo")) != 0) {
                int id = Integer.parseInt(request.getParameter("idTorneo"));
        
      out.write("\n");
      out.write("\n");
      out.write("        <label id=\"labelCambiante\">");
      out.print(id);
      out.write("</label>\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("\n");
      out.write("        <br><br>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <!-- Modal Structure -->\n");
      out.write("            <div id=\"modal1\" class=\"modal\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <h4>Equipo</h4>\n");
      out.write("\n");
      out.write("                    <div class=\"row\" id=\"formEquipo\">\n");
      out.write("                        <form class=\"col s12\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"input-field col s12\">\n");
      out.write("                                    <input id=\"nombreEquipo\" type=\"text\">\n");
      out.write("                                    <label for=\"nombreEquipo\" data-error=\"wrong\" data-success=\"right\">Nombre Del Equipo</label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <button class=\"btn waves-effect waves-light green accent-4\" type=\"button\" id=\"insertarEquipo\" >Insertar</button>\n");
      out.write("                            <button class=\"btn waves-effect waves-light green accent-4\" type=\"button\" id=\"modEquipo\" >Insertar</button>\n");
      out.write("                            <button class=\"btn waves-effect waves-light green accent-4 cancelarTorneo\" type=\"button\" id=\"btncancelarTorneo\">Cancelar</button>\n");
      out.write("\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"datosEquipo\" class=\"card-panel lighten-1\">\n");
      out.write("                ");
String id = request.getParameter("idTorneo");
                    DaoTeam daote = new DaoTeam();
                    Team te = new Team();
                    ArrayList<Team> list = daote.listTeamxTournament(id);

                    String json = "[{id:'" + te.getId() + "',name:'" + te.getName() + "'}]";

                    if (list != null) {
                        for (int i = 0; i < list.size(); i++) {
                            te = list.get(i);

                
      out.write("\n");
      out.write("                <div class=\"collection\">\n");
      out.write("                    <a href=\"#!\" class=\"collection-item \">");
      out.print(te.getName());
      out.write("<span class=\"badge\"><span><button class=\"insertPlayer \" value=\"");
      out.print(te.getId());
      out.write("\">Jugadores</button></span>     <button class=\"modificarEquipo \" id=\"");
      out.print(json);
      out.write("\" onclick=\"updateTeam(this)\"><i class=\"material-icons prefix tiny\">mode_edit</i></button><button class=\"elimiarEquipo \" value=\"");
      out.print(te.getId());
      out.write("\"><i class=\"material-icons prefix tiny\">delete</i></button></span></a>\n");
      out.write("                </div>\n");
      out.write("                ");
  }
                    } else {
                        out.print("no existen datos");
                    }
                
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-------------------------------------------GESTIÓN DE JUGADORES-------------------------------------->\n");
      out.write("        <div  id=\"divContenedorJugador\" class=\"card-panel lighten-1 center-align\">\n");
      out.write("            <div id=\"divDatosJugador\" > </div>\n");
      out.write("            <button class=\"btn waves-effect green accent-4 btnAgregarJugador\" type=\"button\" onclick=\"insertPlayer()\" id=\"btnAgregarJugador\">Agregar Jugador</button>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--------------------------------------------------FORMULARIO JUGADOR----------------------------------------->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div id=\"divFormJugador\">\n");
      out.write("                <form class=\"class col s8 card-panel lighten-1\" id=\"Jugador\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"input-field col s6 \">\n");
      out.write("                            <input id=\"nombre\" type=\"text\" class=\"validate \" name=\"nombre\" required>\n");
      out.write("                            <label for=\"name\">Nombre</label>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"input-field col s6\">\n");
      out.write("                            <input id=\"apellido\" type=\"text\" class=\"validate\" name=\"apellido\" required>\n");
      out.write("                            <label for=\"last_name\">Apellido</label>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"input-field col s6\">\n");
      out.write("                            <select name=\"tipo\" id=\"tipoDocumento\" required>\n");
      out.write("                                <option value=\"\" disabled selected></option>\n");
      out.write("                                <option>Cédula de ciudadania</option>\n");
      out.write("                                <option>Tarjeta de identidad</option>\n");
      out.write("                                <option>Cédula de extranjería</option>\n");
      out.write("                            </select>\n");
      out.write("                            <label for=\"tipo_documento\">Tipo de documento</label>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"input-field col s6\">\n");
      out.write("                            <input id=\"numero_documento\" type=\"text\" class=\"validate\" name=\"numero_documento\" required onkeypress=\"return isNumberKey(event)\">\n");
      out.write("                            <label for=\"numero_documento\">Número de documento</label>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"input-field col s6\">\n");
      out.write("                            <input type=\"date\" id=\"fecha_nacimiento\"  class=\"datepicker\" name=\"fecha_nac\" required>\n");
      out.write("                            <label for=\"fecha_nac\" style=\"margin-top: -30px\">Fecha de nacimiento</label>\n");
      out.write("                        </div> \n");
      out.write("                        <div class=\"input-field col s6\">\n");
      out.write("                            <input id=\"direccion\" type=\"text\" class=\"validate\" name=\"direccion\" required>\n");
      out.write("                            <label for=\"address\">Dirección</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"input-field col s6\">\n");
      out.write("                            <input id=\"telefono\" type=\"text\" class=\"validate\" name=\"telefono\" required>\n");
      out.write("                            <label for=\"movile\">Teléfono</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"input-field col s6\">\n");
      out.write("                            <input id=\"correo\" type=\"email\" class=\"validate\" name=\"correo\" required>\n");
      out.write("                            <label for=\"email\" data-error=\"Correo no valido\" data-success=\"Correo valido\">Correo</label>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"input-field col s6\">\n");
      out.write("                            <input id=\"numero_camiseta\" type=\"text\" class=\"validate\" name=\"num_camiseta\" required onkeypress=\"return isNumberKey(event)\">\n");
      out.write("                            <label for=\"numero_camiseta\">Número de la camiseta</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"input-field col s6\">\n");
      out.write("                            <input id=\"peso\" type=\"text\" class=\"validate\" name=\"peso\" required onkeypress=\"return isNumberKey(event)\">\n");
      out.write("                            <label for=\"peso\">Peso</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"input-field col s6\">\n");
      out.write("                            <input id=\"estatura\" type=\"text\" class=\"validate\" name=\"estatura\"required onkeypress=\"return isNumberKey(event)\">\n");
      out.write("                            <label for=\"estatura\">Estatura</label>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"input-field col s6\">\n");
      out.write("                            <input id=\"posicion\" type=\"text\" class=\"validate\" name=\"posicion\" required>\n");
      out.write("                            <label for=\"posicion\">Posición</label>\n");
      out.write("                        </div> \n");
      out.write("                    </div><!-- fin de la clase fila-->\n");
      out.write("\n");
      out.write("                    <br>\n");
      out.write("\n");
      out.write("                    <div class=\"row center-align\">\n");
      out.write("\n");
      out.write("                        <button  class=\"btn waves-effect green accent-4 registrarJugador \" type=\"button\" id=\"registrarJugador\" class=\"Registrar\">Registrar</button>\n");
      out.write("                        <button class=\"btn waves-effect green accent-4 \" type=\"button\" id=\"btnModificarJugador\" class=\"cancelar\">Modificar</button>\n");
      out.write("                        <button class=\"btn waves-effect green accent-4 \" type=\"button\" id=\"Cancelar\" class=\"cancelar\">Cancelar</button>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!----------------------------------TABLA POSICION------------------------------------->\n");
      out.write("            <div class=\"card-panel lighten-1 \" id=\"tableposicion\" >\n");
      out.write("                <h4 class=\"center-align\">Tabla de posición</h4>\n");
      out.write("                <table cellspacing=\"0\" cellpadding=\"0\"  class=\" bordered striped centered responsive-table tblPosicion\" id=\"tblPosicion\">\n");
      out.write("                    <thead>\n");
      out.write("                    <th>Posición</th>\n");
      out.write("                    <th>Nombre</th>\n");
      out.write("                    <th>PG</th>\n");
      out.write("                    <th>PP</th>\n");
      out.write("                    <th>PE</th>\n");
      out.write("                    <th>GF</th>\n");
      out.write("                    <th>GC</th>\n");
      out.write("                    <th>PTS</th>\n");
      out.write("                    </thead>\n");
      out.write("                    <tr class=\"fondo1\">\n");
      out.write("                        <td>\n");
      out.write("                            <p>1</p>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            Atlético de Madrid\n");
      out.write("                        </td>\n");
      out.write("                        <td>20</td>\n");
      out.write("                        <td>7</td>\n");
      out.write("                        <td>3</td>\n");
      out.write("                        <td>21</td>\n");
      out.write("                        <td>12</td>\n");
      out.write("                        <td>68</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr class=\"fondo2\">\n");
      out.write("                        <td>\n");
      out.write("                            <p>2</p>\n");
      out.write("                        </td>\n");
      out.write("                        <td>Real Madrid</td>\n");
      out.write("                        <td>15</td>\n");
      out.write("                        <td>10</td>\n");
      out.write("                        <td>5</td>\n");
      out.write("                        <td>16</td>\n");
      out.write("                        <td>6</td>\n");
      out.write("                        <td>53</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr class=\"fondo1\">\n");
      out.write("                        <td>\n");
      out.write("                            <p>3</p>\n");
      out.write("                        </td>\n");
      out.write("                        <td>Barcelona</td>\n");
      out.write("                        <td>12</td>\n");
      out.write("                        <td>8</td>\n");
      out.write("                        <td>4</td>\n");
      out.write("                        <td>24</td>\n");
      out.write("                        <td>9</td>\n");
      out.write("                        <td>46</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>4</td>\n");
      out.write("                        <td>Valencia</td>\n");
      out.write("                        <td>6</td>\n");
      out.write("                        <td>5</td>\n");
      out.write("                        <td>25</td>\n");
      out.write("                        <td>3</td>\n");
      out.write("                        <td>5</td>\n");
      out.write("                        <td>39</td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-------------------------------------------FECHAS DE COMPETICIÓN-------------------------------->\n");
      out.write(" \n");
      out.write("            <button  class=\"btn waves-effect green accent-4 generarPartidos col s10\" type=\"button\" id=\"generarPartidos\" >Generar Partidos</button>\n");
      out.write("            \n");
      out.write("            <div id=\"fechasCompeticion\">\n");
      out.write("                <ul class=\"collection with-header\">\n");
      out.write("                    <li class=\"collection-header\"><h4>Fechas de competición</h4></li>\n");
      out.write("                    <li class=\"collection-item\"><a href=\"#!\" class=\"collection-item\">fecha 1</a></li>\n");
      out.write("                    <li class=\"collection-item\"><a href=\"#!\" class=\"collection-item\">fecha 2</a></li>\n");
      out.write("                    <li class=\"collection-item\"><a href=\"#!\" class=\"collection-item\">fecha 3</a></li>\n");
      out.write("                    <li class=\"collection-item\"><a href=\"#!\" class=\"collection-item\">fecha 4</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <footer class=\"page-footer green accent-4\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col l6 s12\">\n");
      out.write("                        <h5 class=\"white-text\">Datos de la empresa</h5>\n");
      out.write("                        <p class=\"grey-text text-lighten-4\">Nombre: Grupo SportSoft.</p>\n");
      out.write("                        <p class=\"grey-text text-lighten-4\">Direccion:</p>\n");
      out.write("                        <p class=\"grey-text text-lighten-4\">Teléfono: 5283318</p>\n");
      out.write("                        <p class=\"grey-text text-lighten-4\">Correo: gruposportsoft@gmail.com</p>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col l4 offset-l2 s12\">\n");
      out.write("                        <h5 class=\"white-text\">Acerca de</h5>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a class=\"grey-text text-lighten-3\" href=\"#!\">Manual de usuario</a></li>\n");
      out.write("                            <li><a class=\"grey-text text-lighten-3\" href=\"#!\">Manual técnico</a></li>\n");
      out.write("                            <!--<li><a class=\"grey-text text-lighten-3\" href=\"#!\">Link 3</a></li>\n");
      out.write("                            <li><a class=\"grey-text text-lighten-3\" href=\"#!\">Link 4</a></li>-->\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"footer\">\n");
      out.write("                <h4 class=\"white-text\">redes sociales</h4>\n");
      out.write("                <div class=\"social\"><a >&#62220;</a></div>\n");
      out.write("                <div class=\"social\"><a href=\"https://twitter.com/?request_context=signup\">&#62217;</a></div>\n");
      out.write("                <div class=\"social\"><a href=\"https://plus.google.com/u/0/\">&#62223;</a></div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"footer-copyright center-align\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    © 2014 Copyright SportSoft (V1)\n");
      out.write("                    <!-- <a class=\"grey-text text-lighten-4 right\" href=\"#!\">More Links</a>-->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("\n");
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
