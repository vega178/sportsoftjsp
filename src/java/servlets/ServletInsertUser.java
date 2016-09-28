/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import DAO.Code;
import DAO.DaoUsers;
import beans.Login;
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
public class ServletInsertUser extends HttpServlet {

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
       
           String user = request.getParameter("users");
           String password = request.getParameter("password");
           String conPassword = request.getParameter("confirmPassword");
           if(!user.isEmpty()){
           DaoUsers daou  = new DaoUsers();
           int u = daou.selectUsers(user);
          int id = daou.consultIdUser(user);
           if(u != 0){
               if(!password.isEmpty()){
               if(!conPassword.isEmpty()){
              if(password.equals(password)== conPassword.equals(conPassword)){
                Code code = new Code();
                String p = code.codeMD5(password);
                Login l = new Login();
                l.setClave(p);
                l.setIdUser(id);
               int insert = daou.insertUser(l);
                if(insert != 0){
                out.print("Usuario Registrado");
                }else{
                out.print("Error al Intentar Registrar");
                }

              }else{
              out.print("las claves deben coincidir");
              }
              
               }else{
               out.print("debe confirmar su clave");
               }
               }else{
               out.print("debe ingresar una clave");
               }
          
           }else{
           out.print("el usuari no existe");
           }
         
           }else{
           out.print("Debe llenar todos los campos");
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
