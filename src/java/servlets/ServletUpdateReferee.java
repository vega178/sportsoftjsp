/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import DAO.DaoReferee;
import beans.Referee;
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
public class ServletUpdateReferee extends HttpServlet {

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
         String idReferee = request.getParameter("idArbitro");
         String name = request.getParameter("nomArbitroModifcar");
         String lastName = request.getParameter("apeArbitroModificar");
         String documentType = request.getParameter("tipoDocArbitroModificar");
         String DocumentNumber = request.getParameter("numDocArbitroModificar");
         String position = request.getParameter("posicionArbitroModificar");
         String telephone = request.getParameter("telArbitroModificar");
         String email = request.getParameter("correoArbitroModificar");
         String address = request.getParameter("direccionArbitroModificar");
         
         int id = Integer.parseInt(idReferee);
         if(id != 0){
        Referee re = new Referee();
         DaoReferee daore = new DaoReferee();
           re.setId(id);
           re.setName(name);
           re.setLastName(lastName);
           re.setDocumentType(documentType);
           re.setDocumentNumber(DocumentNumber);
           re.setPosition(position);
           re.setTelephone(telephone);
           re.setEmail(email);
           re.setAddress(address);
           
           int mod = daore.updateReferee(re);
           if(mod ==1){
           out.print("Datos modificados correctamente");
           }else{
           out.print("ocurrio in error al modificar los datos");
           }
         }else{
        
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
