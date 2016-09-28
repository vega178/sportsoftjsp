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
public class ServletAddReferee extends HttpServlet {

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
            String name = request.getParameter("name");
            String lastName = request.getParameter("lastName");
            String documentType = request.getParameter("documentType");
            String documetNumber = request.getParameter("documentNumber");
            String position = request.getParameter("position");
            String telephone = request.getParameter("telephone");
            String email = request.getParameter("email");
            String address = request.getParameter("address");
            
            if(!name.isEmpty()){
            Referee re = new Referee();
            DaoReferee daore = new DaoReferee();
            re.setName(name);
            re.setLastName(lastName);
            re.setDocumentType(documentType);
            re.setDocumentNumber(documetNumber);
            re.setPosition(position);
            re.setTelephone(telephone);
            re.setEmail(email);
            re.setAddress(address);
            int insert = daore.addReferee(re);
            if(insert !=1){
            out.print("No se pudo insertar");
            }else{
                out.print("Arbritro insertado correctamete");
            }
                        
            }else{
            out.print("los campos con * son obligatorios");
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
