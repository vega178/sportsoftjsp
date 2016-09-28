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
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author santhyago
 */
public class ServletUpdatePlayer extends HttpServlet {

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
            String idPlayer = request.getParameter("idPlayer");
            String name = request.getParameter("name");
            String lastName = request.getParameter("lastName");
            String documentType = request.getParameter("documentType");
            String documentNumber = request.getParameter("documentNumber");
            String birthday = request.getParameter("birthday");
            String address = request.getParameter("address");
            String telephone = request.getParameter("telephone");
            String email = request.getParameter("email");
            String numbershirt = request.getParameter("numbershirt");
            String weight = request.getParameter("weight");
            String height = request.getParameter("height");
            String position = request.getParameter("position");
            
            double wei = Double.parseDouble(weight);
            double hei = Double.parseDouble(height);
            Player player = new Player();
            DaoPlayer daoplayer = new DaoPlayer();
            System.out.println("entro");
            int id = Integer.parseInt(idPlayer);
            if (id != 0){
                System.out.println("va bien");
            player.setId(id);
            player.setName(name);
            player.setLastName(lastName);
            player.setDocumentType(documentType);
            player.setDocumentNumber(documentNumber);
            player.setBirhtDate(birthday);
            player.setAddress(address);
            player.setTelephone(telephone);
            player.setEmail(email);
            player.setNumberShirt(numbershirt);
            player.setWeight(wei);
            player.setHeight(hei);
            player.setPosition(position);
            
            int insert = daoplayer.updatePlayer(player);
            if(insert ==1){
            out.print("Datos modificados");
            }else{
            out.print("Error al modificar");
            }
            
           
            }else{
            out.print("Error al modificar1");
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
