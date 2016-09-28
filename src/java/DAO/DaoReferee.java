/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import beans.Referee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.Conexion;

/**
 *
 * @author santhyago
 */
public class DaoReferee extends Conexion {
      public int addReferee(Referee re){
    int insert = 0;
        PreparedStatement pst = null;
        String sql;
        sql = "INSERT INTO arbitro (num_documento,tipo_documento,nombre,apellido,direccion,telefono,correo,posicion)"
                + "VALUES (?,?,?,?,?,?,?,?)";
        
        Connection con = this.conectar("mysql");
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1,re.getDocumentNumber());
            pst.setString(2,re.getDocumentType());
            pst.setString(3,re.getName());
            pst.setString(4,re.getLastName());
            pst.setString(5,re.getAddress());
            pst.setString(6,re.getTelephone());
            pst.setString(7, re.getEmail());
            pst.setString(8,re.getPosition());
            
            if(pst.executeUpdate()==1){
            insert = 1;
            }
        } catch (SQLException ex) {
            System.out.println("error metodo insertar arbitro"+ex);
        }finally{
        try {
            pst.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("error en el finally cerrar conexion"+ex.getMessage()); 
        }
            return insert;
        }
    }
      
      public ArrayList<Referee> listReferee(){
    PreparedStatement pst = null;
        ResultSet rs = null;
        String sql;
        sql = "SELECT id,num_documento,tipo_documento,nombre,apellido,direccion,telefono,correo,posicion FROM arbitro";
        Connection con = Conexion.conectar("mysql");
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            ArrayList<Referee> list = new ArrayList<>();
            while(rs.next()){
            Referee re = new Referee();
            re.setId(rs.getInt(1));
            re.setDocumentNumber(rs.getString(2));
            re.setDocumentType(rs.getString(3));
            re.setName(rs.getString(4));
            re.setLastName(rs.getString(5));
            re.setAddress(rs.getString(6));
            re.setTelephone(rs.getString(7));
            re.setEmail(rs.getString(8));
            re.setPosition(rs.getString(9));
            
            list.add(re);
            }
            return list;
        } catch (SQLException ex) {
            System.out.println("error metodo listar arbitro");
        }finally{
        try {
            pst.close();
            rs.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("error en el finally cerrar conexion"+ex.getMessage());        }
        }
      return null;
    }
      
      
       public int deleteReferee(String id){
    int delete = 0;
    PreparedStatement pst = null;
    String sql;
    sql = "DELETE FROM arbitro WHERE id = ?";
    Connection con = Conexion.conectar("mysql");
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, id);
            if(pst.executeUpdate()==1){
            delete = 1;
            }
        } catch (SQLException ex) {
            System.out.println("error metodo eliminar arbitro"+ex);
        }finally{
        try {
            pst.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("error en el finally cerrar conexion"+ex.getMessage());    
        }
            return delete;
        }
    }
       
       
       public int updateReferee(Referee re){
   int modificado = 0;
   PreparedStatement pst = null;
   String sql;
   sql = "UPDATE arbitro SET num_documento = ?,tipo_documento = ?,nombre = ?,apellido = ?,direccion = ?,telefono = ?,correo = ?,posicion = ? WHERE id=?";
   Connection con = Conexion.conectar("mysql");
   
         try {
             pst = con.prepareStatement(sql);
             pst.setInt(9,re.getId());
             pst.setString(1,re.getDocumentNumber());
             pst.setString(2, re.getDocumentType());
             pst.setString(3, re.getName());
             pst.setString(4, re.getLastName());
             pst.setString(5,re.getAddress());
             pst.setString(6, re.getTelephone());
             pst.setString(7,re.getEmail());
             pst.setString(8, re.getPosition());
             
             if(pst.executeUpdate()==1){
             modificado = 1;
             }
         } catch (SQLException ex) {
             System.out.println("error metodo update referee");         }finally{
         try {
           pst.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("error en el finally cerrar conexion"+ex.getMessage());        }
         }
                       return modificado;
   } 
    
      
}
