/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import beans.Tournaments;
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
public class DaoTournaments extends Conexion{
     public boolean insertarTorneos(Tournaments t) {
        boolean insert = false;
        PreparedStatement pst = null;
        String sql;
        Connection con = this.conectar("mysql");
        sql = "INSERT INTO torneos (nombre_torneo,fecha_inicio,fecha_finalizacion,id_usuario,detalle,id_deportes) "
                + "VALUES (?,?,?,?,?,?)";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, t.getName_tournaments());
            pst.setString(2, t.getStart_date());
            pst.setString(3, t.getFinis_date());
            pst.setInt(4, t.getId_user());
            pst.setString(5, t.getDescription());
            pst.setInt(6, t.getId_sport());

            if (pst.executeUpdate() == 1) {
                insert = true;
            }

        } catch (SQLException ex) {
            System.out.println("error en el metodo insertar torneo");
        } finally {
            try {
                pst.close();
                con.close();
            } catch (SQLException ex) {
                System.out.println("error en el finally cerrar conexion" + ex.getMessage());
            }
            return insert;
        }
    }
     
     public static ResultSet consultNameEmployee() {
        PreparedStatement pst;
        ResultSet rs = null;
        String sql;
        sql = "SELECT nombre FROM usuario";
        Connection con = Conexion.conectar("mysql");

        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex);
        }

        return rs;
    }

    public static ResultSet consultSport() {
        PreparedStatement pst;
        ResultSet rs = null;
        String sql;

        sql = "SELECT nombre FROM deportes";
        Connection con = Conexion.conectar("mysql");

        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex);
        }

        return rs;
    }

    public int consultIdUser(String id) {
        int exists = 0;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql;
        Connection con = Conexion.conectar("mysql");
        sql = "SELECT id FROM usuario WHERE nombre = ?";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, id);
            rs = pst.executeQuery();
            if (rs.next()) {
                Tournaments t = new Tournaments();
                exists = rs.getInt("id");
                t.setId_user(exists);
            }
        } catch (SQLException ex) {
            System.out.println("error tipo usuario");
        } finally {
            try {
                pst.close();
                con.close();
            } catch (SQLException ex) {
                System.out.println("error en el finally cerrar conexion" + ex.getMessage());
            }
            return exists;
        }
    }

    public int consultIdSport(String id) {
        int exists = 0;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql;
        Connection con = Conexion.conectar("mysql");
        sql = "SELECT id FROM deportes WHERE nombre = ?";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, id);
            rs = pst.executeQuery();
            if (rs.next()) {
              Tournaments t = new Tournaments();
                exists = rs.getInt("id");
                t.setId_sport(exists);
            }
        } catch (SQLException ex) {
            System.out.println("error id torneo");
        } finally {
            try {
                pst.close();
                con.close();
            } catch (SQLException ex) {
                System.out.println("error en el finally cerrar conexion" + ex.getMessage());
            }
        }
                    return exists;

    }
     
    
    public ArrayList<Tournaments> listTournamens() {
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql;
        sql = "SELECT id,nombre_torneo,fecha_inicio,fecha_finalizacion,detalle FROM torneos";
        Connection con = Conexion.conectar("mysql");

        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            ArrayList<Tournaments> list = new ArrayList<>();
            while (rs.next()) {
                Tournaments t = new Tournaments();
                t.setId(rs.getInt(1));
                t.setName_tournaments(rs.getString(2));
                t.setStart_date(rs.getString(3));
                t.setFinis_date(rs.getString(4));
                t.setDescription(rs.getString(5));
                list.add(t);
            }
            return list;
        } catch (SQLException ex) {
            System.out.println("error listar torneos");
        } finally {
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
     
    public int deleteTournament(String id){
    int eliminado = 0;
    PreparedStatement pst = null;
    String sql;
    sql = "DELETE FROM torneos WHERE id = ?";
    Connection con = Conexion.conectar("mysql");
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, id);
            if(pst.executeUpdate()==1){
            eliminado = 1;
            }
        } catch (SQLException ex) {
            System.out.println("error eliminar torneo");
        }finally{
        try {
                pst.close();
                con.close();
            } catch (SQLException ex) {
                System.out.println("error en el finally cerrar conexion" + ex.getMessage());
            }
            return eliminado;
        }
    }
     
    
    public int updateTournament(Tournaments t){
    int modificar = 0;
    PreparedStatement pst = null;
    String sql;
    sql = "UPDATE torneos SET nombre_torneo = ?,fecha_inicio = ?,fecha_finalizacion = ?,detalle = ? WHERE id = ?";
            Connection con = this.conectar("mysql");
         try {
             pst = con.prepareStatement(sql);
             pst.setInt(5, t.getId());
             pst.setString(1, t.getName_tournaments());
             pst.setString(2,t.getStart_date());
             pst.setString(3,t.getFinis_date());
             pst.setString(4,t.getDescription());
             
             if(pst.executeUpdate()==1){
             modificar = 1;
             }
             
         } catch (SQLException ex) {
             Logger.getLogger(DaoTournaments.class.getName()).log(Level.SEVERE, null, ex);
         }finally{
        try {
                pst.close();
                con.close();
            } catch (SQLException ex) {
                System.out.println("error en el finally cerrar conexion" + ex.getMessage());
            }
                return modificar;

        }
    }
}
