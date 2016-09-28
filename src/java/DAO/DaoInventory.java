/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import beans.Implements;
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
public class DaoInventory extends Conexion{
    
     public int InsertImplements (Implements in){
         int insert = 0;
         PreparedStatement pst = null;
         String sql;
         sql = "INSERT INTO imp_deportivos (codigo, nombre, marca, cantidad, descripcion, estado) VALUES (?, ?, ?, ?, ?, ?)";
           Connection con = this.conectar("mysql");
         try {
             pst = con.prepareStatement(sql);
             pst.setString(1,in.getCode());
             pst.setString(2,in.getName());
             pst.setString(3, in.getBrand());
             pst.setString(4,in.getQuantity());
             pst.setString(5, in.getDescription());
             pst.setString(6,in.getState());
             
             if(pst.executeUpdate() !=0){
             insert = 1;
             }
         } catch (SQLException ex) {
             System.out.println("error al insertar implemento");
         }finally{
          try {
           pst.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("error en el finally cerrar conexion"+ex.getMessage());        }
                       return insert;

         }

    }
     
     
     public ArrayList<Implements> listImplements(){
     PreparedStatement pst;
     ResultSet rs;
     String sql;
     sql = "SELECT id,codigo,nombre,marca,cantidad,descripcion,estado FROM imp_deportivos";
     Connection con = Conexion.conectar("mysql");
         try {
             pst = con.prepareStatement(sql);
             rs = pst.executeQuery();
             ArrayList<Implements> list = new ArrayList<>();
             while(rs.next()){
                 Implements imp = new Implements();
                 imp.setId(rs.getInt(1));
                 imp.setCode(rs.getString(2));
                 imp.setName(rs.getString(3));
                 imp.setBrand(rs.getString(4));
                 imp.setQuantity(rs.getString(5));
                 imp.setDescription(rs.getString(6));
                 imp.setState(rs.getString(7));
                 list.add(imp);
                 
             }
             return list;
           
         } catch (SQLException ex) {
             System.out.println("error metodo listar implementos");
         }
     
     return null;
     }
     
     
     public int deleteImplements(String id){
     int delete = 0;
     PreparedStatement pst = null;
     String sql;
     sql = "DELETE FROM imp_deportivos WHERE id = ?";
     Connection con = this.conectar("mysql");
     
         try {
             pst = con.prepareStatement(sql);
             pst.setString(1, id);
             if(pst.executeUpdate()==1){
             delete = 1;
             }
         } catch (SQLException ex) {
             System.out.println("error metodo eliminar implementos");
         }finally{
          try {
           pst.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("error en el finally cerrar conexion"+ex.getMessage());        }
                  return delete;
         }
     }
     
     
     public int UpdateImplements(Implements in ){
   int modificado = 0;
   PreparedStatement pst = null;
   String sql;
   sql = "UPDATE imp_deportivos SET codigo = ?,nombre = ?,marca = ?,cantidad = ?,descripcion = ?,estado = ? WHERE id=?";
   Connection con = Conexion.conectar("mysql");
   
         try {
             pst = con.prepareStatement(sql);
             pst.setInt(7,in.getId());
             pst.setString(1,in.getCode());
             pst.setString(2, in.getName());
             pst.setString(3, in.getBrand());
             pst.setString(4,in.getQuantity());
             pst.setString(5,in.getDescription());
             pst.setString(6, in.getState());
             
             if(pst.executeUpdate()==1){
             modificado = 1;
             }
         } catch (SQLException ex) {
             System.out.println("error metodo modificar implementos");
         }finally{
         try {
           pst.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("error en el finally cerrar conexion"+ex.getMessage());        }
         }
                       return modificado;
   } 
    
     
     
}
