/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import beans.Player;
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
public class DaoPlayer extends Conexion {
        public int insertPlayer(Player p){
        int insert = 0;
        PreparedStatement pst = null;
        String sql;
         sql = ("INSERT INTO jugador (num_documento,tipo_documento,nombre,apellido,direccion,telefono,correo,num_camiseta,peso,estatura,fecha_nacimiento,posicion,id_equipo)"
                               + " values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
       Connection con = this.conectar("mysql");
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, p.getDocumentNumber());
            pst.setString(2, p.getDocumentType());
            pst.setString(3, p.getName());
            pst.setString(4, p.getLastName());
            pst.setString(5, p.getAddress());
            pst.setString(6, p.getTelephone());
            pst.setString(7, p.getEmail());
            pst.setString(8, p.getNumberShirt());
            pst.setDouble(9, p.getWeight());
            pst.setDouble(10,p.getHeight());
            pst.setString(11,p.getBirhtDate());
            pst.setString(12,p.getPosition());
            pst.setInt(13, p.getIdTeam());
            
            if(pst.executeUpdate()==1){
            insert = 1;
            }
        } catch (SQLException ex) {
            System.out.println("error en el metodo insertar jugador");
        }finally{
        try {
            pst.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("error en el finally cerrar conexion metodo insertar jugador"+ex.getMessage()); 
        }
            return insert;
        }
  
    }
        
       public ArrayList<Player> consultPlayer(){
       PreparedStatement pst = null;
       ResultSet rs = null;
       String sql;
       sql = "SELECT id,num_documento,tipo_documento,nombre,apellido,direccion,telefono,correo,num_camiseta,peso,estatura,fecha_nacimiento,posicion,id_equipo FROM jugador";
           Connection con = this.conectar("mysql");
            try {
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery();
                ArrayList<Player> list = new ArrayList<>();
                while(rs.next()){
                Player player = new Player();
                player.setId(rs.getInt(1));
                player.setDocumentNumber(rs.getString(2));
                player.setDocumentType(rs.getString(3));
                player.setName(rs.getString(4));
                player.setLastName(rs.getString(5));
                player.setAddress(rs.getString(6));
                player.setTelephone(rs.getString(7));
                player.setEmail(rs.getString(8));
                player.setNumberShirt(rs.getString(9));
                player.setWeight(rs.getDouble(10));
                player.setHeight(rs.getDouble(11));
                player.setBirhtDate(rs.getString(12));
                player.setPosition(rs.getString(13));
                player.setIdTeam(rs.getInt(14));
                list.add(player);
                
                }
                return list;
            } catch (SQLException ex) {
                Logger.getLogger(DaoPlayer.class.getName()).log(Level.SEVERE, null, ex);
            }finally {
            try {
                pst.close();
                rs.close();
                con.close();
            } catch (SQLException ex) {
                System.out.println("error en el finally cerrar conexion" + ex.getMessage());
            }
        }
           
       return null;
       }
       
       
       public int deletePlayer(String id){
       int delete = 0;
       
       PreparedStatement pst = null;
       String sql;
       sql = "DELETE FROM jugador WHERE id = ?";
       Connection con = this.conectar("mysql");
            try {
                pst = con.prepareStatement(sql);
                pst.setString(1, id);
                if(pst.executeUpdate()==1){
                delete = 1;
                }
            } catch (SQLException ex) {
                Logger.getLogger(DaoPlayer.class.getName()).log(Level.SEVERE, null, ex);
            }finally {
            try {
                pst.close();
                con.close();
            } catch (SQLException ex) {
                System.out.println("error en el finally cerrar conexion" + ex.getMessage());
            }
                   return delete;

        }
       
       }
       
       
       public ArrayList<Player> consultPlayerTournament(String id){
       PreparedStatement pst = null;
       ResultSet rs = null;
       String sql;
       sql = "SELECT id,num_documento,tipo_documento,nombre,apellido,direccion,telefono,correo,num_camiseta,peso,estatura,fecha_nacimiento,posicion,id_equipo FROM jugador WHERE id_equipo = ?";
           Connection con = this.conectar("mysql");
            try {
                pst = con.prepareStatement(sql);
                pst.setString(1, id);
                rs = pst.executeQuery();
                ArrayList<Player> list = new ArrayList<>();
                while(rs.next()){
                Player player = new Player();
                player.setId(rs.getInt(1));
                player.setDocumentNumber(rs.getString(2));
                player.setDocumentType(rs.getString(3));
                player.setName(rs.getString(4));
                player.setLastName(rs.getString(5));
                player.setAddress(rs.getString(6));
                player.setTelephone(rs.getString(7));
                player.setEmail(rs.getString(8));
                player.setNumberShirt(rs.getString(9));
                player.setWeight(rs.getDouble(10));
                player.setHeight(rs.getDouble(11));
                player.setBirhtDate(rs.getString(12));
                player.setPosition(rs.getString(13));
                player.setIdTeam(rs.getInt(14));
                list.add(player);
                
                }
                return list;
            } catch (SQLException ex) {
                Logger.getLogger(DaoPlayer.class.getName()).log(Level.SEVERE, null, ex);
            }finally {
            try {
                pst.close();
                rs.close();
                con.close();
            } catch (SQLException ex) {
                System.out.println("error en el finally cerrar conexion" + ex.getMessage());
            }
        }
           
       return null;
       }
       
       
       public int updatePlayer(Player player){
       int modifi = 0;
       PreparedStatement pst;
       String sql;
       sql = "UPDATE jugador SET num_documento = ?,tipo_documento = ?,nombre = ?,apellido = ?,direccion = ?,telefono = ?,correo = ?,num_camiseta = ?,peso = ?,estatura = ?,fecha_nacimiento = ?,posicion = ? WHERE id = ?";
       Connection con = Conexion.conectar("mysql");
       
            try {
                pst = con.prepareStatement(sql);
                pst.setInt(13, player.getId());
                pst.setString(1, player.getDocumentNumber());
                pst.setString(2, player.getDocumentType());
                pst.setString(3, player.getName());
                pst.setString(4, player.getLastName());
                pst.setString(5, player.getAddress());
                pst.setString(6, player.getTelephone());
                pst.setString(7, player.getEmail());
                pst.setString(8, player.getNumberShirt());
                pst.setDouble(9, player.getWeight());
                pst.setDouble(10, player.getHeight());
                pst.setString(11, player.getBirhtDate());
                pst.setString(12, player.getPosition());
                
                if(pst.executeUpdate()==1){
                modifi = 1;
                }

                
            } catch (SQLException ex) {
                System.out.println("error metodo updatePlayer");
            }
       
       return modifi;
       }
    
}
