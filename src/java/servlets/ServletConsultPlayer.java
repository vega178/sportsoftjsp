/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import DAO.DaoPlayer;
import beans.Player;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author santhyago
 */
public class ServletConsultPlayer extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String idGame = request.getParameter("idGame");

            out.print(
                    "                    <table id=\"datosJugador\" class=\"bordered striped centered responsive-table tblDatosJugador\" cellspacing=\"0\" width=\"100%\">\n"
                    + "                      <thead>\n"
                    + "                        <tr>\n"
                    + "                        <th>Nombre</th>\n"
                    + "                        <th>Apellido</th>\n"
                    + "                <th>Tipo de documento</th>\n"
                    + "                        <th>Identificación</th>\n"
                    + "                        <th>Telefono</th>\n"
                    + "                        <th>Correo</th>\n"
                    + "                        <th>Número de camiseta</th>\n"
                    + "                        <th>Posición</th>\n"
                    + "                        <th>Peso</th>\n"
                    + "                        <th>Estatura</th>\n"
                    + "                        <th>Modificar</th>\n"
                    + "                        <th>Eliminar</th>\n"
                    + "                        </tr>\n"
                    + "                </thead>\n"
                    + "                <tbody>");

            DaoPlayer daoplayer = new DaoPlayer();
            Player player = new Player();

            ArrayList<Player> lis = daoplayer.consultPlayerTournament(idGame);
            if (lis != null) {
                for (int i = 0; i < lis.size(); i++) {
                    player = lis.get(i);
String json = "[{id:'"+player.getId()+"',name:'"+player.getName()+"',ape:'"+player.getLastName()+"',tipodoc:'"+player.getDocumentType()+"',doc:'"+player.getDocumentNumber()+"',tel:'"+player.getTelephone()+"',"
        + "email:'"+player.getEmail()+"',dir:'"+player.getAddress()+"',numc:'"+player.getNumberShirt()+"',peso:'"+player.getWeight()+"',est:'"+player.getHeight()+"',nac:'"+player.getBirhtDate()+"',pos:'"+player.getPosition()+"',}]";
                    out.print(" <tr>\n"
                            + "                        <td>" + player.getName() + "</td>\n"
                            + "                        <td>" + player.getLastName() + "</td>\n"
                            + "                        <td>" + player.getDocumentType() + "</td>\n"
                            + "                        <td>" + player.getDocumentNumber() + "</td>\n"
                            + "                        <td>" + player.getTelephone() + "</td>\n"
                            + "                        <td>" + player.getEmail() + "</td>\n"
                            + "                        <td>" + player.getNumberShirt() + "</td>\n"
                            + "                        <td>" + player.getPosition() + "</td>\n"
                            + "                        <td>" + player.getWeight() + "</td>\n"
                            + "                        <td>" + player.getHeight() + "</td>\n"
                            + "                        <td ><button class=\"modificarJugador\" onclick=\"updatePlayer(this)\" id=\""+json+"\" value=\"\"><i class=\"material-icons small \" id=\"\" value=\"\" >mode_edit</i></button></td>\n"
                            + "                        <td><button class=\"btnEliminarJugador\"  value=\"" + player.getId() + "\" onclick=\"deletePlayer()\"><i class=\"material-icons small\">delete</i></button></td>\n"
                            + "                        </tr>");

                }
            } else {
                out.print(" <h3>no existen datos</h3>");
            }
            out.print("\n"
                    + "                </tbody>\n"
                    + "                \n"
                    + "                    </table>\n"
                    + "                 <br><br>\n"
                    + "                ");

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
