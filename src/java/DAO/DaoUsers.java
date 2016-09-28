/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import beans.Employee;
import beans.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.Conexion;

/**
 *
 * @author santhyago
 */
public class DaoUsers extends Conexion {
     public boolean login(String user, String pass){
    boolean existe = false;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql;
        Connection con = Conexion.conectar("mysql");
        sql = "SELECT u.numero_documento,l.clave FROM usuario as u, login as l WHERE u.id = l.id_usuario and u.numero_documento=? and l.clave=? and id_tipoUsuario = 11";

        try {
            pst = con.prepareStatement(sql);
           pst.setString(1, user);
           pst.setString(2, pass);
           rs = pst.executeQuery();
           if(rs.next()){
           existe = true;
           }
         
        } catch (SQLException ex) {
            System.out.println("error en el metodo login"+ex);
        }finally{
        try {
            pst.close();
            rs.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("error en el finally cerrar conexion"+ex.getMessage());        }
           return existe;
        }
    }
     
     public int selectUsers(String documento){
     int exists = 0;
     PreparedStatement pst = null;
     ResultSet rs = null;
     String sql;
     sql = "SELECT numero_documento FROM usuario WHERE numero_documento = ?";
     Connection con = Conexion.conectar("mysql");
         try {
             pst = con.prepareStatement(sql);
             pst.setString(1, documento);
             rs = pst.executeQuery();
             if(rs.next()){
             exists = 1;
             }
         } catch (SQLException ex) {
             System.out.println("error metodo select user");   
         }finally{
        try {
            pst.close();
            rs.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("error en el finally cerrar conexion"+ex.getMessage());        }
           return exists;
        }
     }
  
     public int insertUser(Login l){
     int insert = 0;
     PreparedStatement pst= null;
     String sql;
     sql = "INSERT INTO login (clave,id_usuario) VALUES (?,?)";
      Connection con = Conexion.conectar("mysql");
         try {
             pst = con.prepareStatement(sql);
             pst.setString(1,l.getClave());
             pst.setInt(2, l.getIdUser());
             
             if(pst.executeUpdate()==1){
             insert = 1;
             }
         } catch (SQLException ex) {
             Logger.getLogger(DaoUsers.class.getName()).log(Level.SEVERE, null, ex);
         }
      

     return insert;
     }
     
     
     public int consultIdUser(String id){
    int exists = 0;
    PreparedStatement pst = null;
    ResultSet rs = null;
    String sql;
    Connection con = Conexion.conectar("mysql");
    sql = "SELECT id FROM usuario WHERE numero_documento = ?";
    
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, id);
            rs = pst.executeQuery();
            if(rs.next()){
                Employee em = new Employee();
                exists = rs.getInt("id");
                em.setUserType(exists);
            }
        } catch (SQLException ex) {
            System.out.println("error tipo usuario");
        }finally{
        try {
            pst.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("error en el finally cerrar conexion"+ex.getMessage());
        }
           return exists;
        }
    }
     
     public int consultPassword(String id){
     int existe = 0;
     PreparedStatement pst;
     ResultSet rs;
     String sql;
     sql = "SELECT clave,id_usuari FROM login WHERE id_usuario = ?";
         Connection con = Conexion.conectar("mysql");
         try {
             pst = con.prepareStatement(sql);
             pst.setString(1, id);
             rs=pst.executeQuery();
             if(rs.next()){
             existe = 1;
             }
         } catch (SQLException ex) {
             System.out.println("error metodo consulpasswrd");         }

     return existe;
     }
    
     
     public boolean loginEmployee(String user, String pass){
    boolean existe = false;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql;
        Connection con = Conexion.conectar("mysql");
        sql = "SELECT u.numero_documento,l.clave FROM usuario as u, login as l WHERE u.id = l.id_usuario and u.numero_documento=? and l.clave=? and id_tipoUsuario = 12";

        try {
            pst = con.prepareStatement(sql);
           pst.setString(1, user);
           pst.setString(2, pass);
           rs = pst.executeQuery();
           if(rs.next()){
           existe = true;
           }
         
        } catch (SQLException ex) {
            System.out.println("error en el metodo login"+ex);
        }finally{
        try {
            pst.close();
            rs.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("error en el finally cerrar conexion"+ex.getMessage());        }
           return existe;
        }
    }
     
}
