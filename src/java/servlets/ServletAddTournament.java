/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import DAO.DaoTournaments;
import beans.Tournaments;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author santhyago
 */
public class ServletAddTournament extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    int idU = 0;
    int idSport = 0;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
          String name = request.getParameter("name");
          String sport = request.getParameter("sport");
          String startDate = request.getParameter("startDate");
          String finishDate = request.getParameter("finishDate");
          String description = request.getParameter("description");
          String idUser = request.getParameter("idUser");
          
          if(!description.isEmpty()){
              Tournaments t = new Tournaments();
              DaoTournaments daot = new DaoTournaments();
              idSport = daot.consultIdSport(sport);
              if(idSport != 0){
                  idU = daot.consultIdUser(idUser);
                  if(idU != 0){
                      t.setName_tournaments(name);
                      t.setId_sport(idSport);
                      t.setStart_date(startDate);
                      t.setFinis_date(finishDate);
                      t.setDescription(description);
                      t.setId_user(idU);
                      boolean insert = daot.insertarTorneos(t);
                      if(insert == true){
                      out.print("Torneo Creado Exitosamente");
                      }else{
                      out.print("Error al Crear Torneo");
                      }
                  }else{
                  out.print("Debe Insertar un Encargado");
                  }
              }else{
              out.print("Debe Elegir un Deporte");
              }
          }else{
          out.print("Error al insertar");
          }
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
