/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import DAO.DaoEmployee;
import beans.Employee;
import beans.TypeUser;
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
public class ServletAddEmployee extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    int idUser = 0;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
         String name = request.getParameter("name");
         String lastName = request.getParameter("lastName");
         String documetType = request.getParameter("documentType");
         String documentNumber = request.getParameter("documentNumber");
         String email = request.getParameter("email");
         String telephone = request.getParameter("telephone");
         String address = request.getParameter("address");
         String userType = request.getParameter("userType");
         
          DaoEmployee daoe = new DaoEmployee();
            idUser = daoe.consultIdUserType(userType);
            System.out.println("entro");
         if(!address.isEmpty()){
            Employee em = new Employee();
            TypeUser tu = new TypeUser();
            
            if(idUser !=0){
                System.out.println(idUser);
            em.setName(name);
            em.setLastName(lastName);
            em.setDocumentType(documetType);
            em.setDocumentNumber(documentNumber);
            em.setEmail(email);
            em.setTelephone(telephone);
            em.setAddress(address);
            em.setUserType(idUser);
                System.out.println("entro");
            int insert = daoe.addEmployee(em);
            if(insert ==1){
                System.out.println("entro");
            out.print("Empleado insertado correctamente");
            }else{
            out.print("ocurrio un error al guardar1111");
            }
            }else{
            out.print("ocurrio un error al guardar22222222");
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
