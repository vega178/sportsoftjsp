/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import beans.Team;
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
public class DaoTeam extends Conexion {
    public int addTeam(Team te) {
        int insert = 0;
        PreparedStatement pst = null;
        String sql;
        sql = "INSERT INTO equipo (nombre,id_torneo) VALUES (?,?)";
        Connection con = this.conectar("mysql");

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, te.getName());
            pst.setInt(2, te.getId_Tornament());
            if (pst.executeUpdate() == 1) {
                insert = 1;
            }
        } catch (SQLException ex) {
            System.out.println("error al insertar equipo" + ex);
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
    
     public ArrayList<Team> listTeamxTournament(String idTorneo) {
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql;
        sql = "SELECT id,nombre FROM equipo WHERE id_torneo = ?";
        Connection con = this.conectar("mysql");
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, idTorneo);
            rs = pst.executeQuery();
            ArrayList<Team> list = new ArrayList<>();
            while (rs.next()) {
                Team te = new Team();
                te.setId(rs.getInt(1));
                te.setName(rs.getString(2));
                list.add(te);
            }
            return list;

        } catch (SQLException ex) {
            System.out.println("error listar equipo");
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

     
      public boolean deleteTeam(String equipo) {
        boolean delete = false;
        PreparedStatement pst = null;
        String sql;
        sql = "DELETE FROM equipo WHERE id = ?";
        Connection con = this.conectar("mysql");
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, equipo);
            if (pst.executeUpdate() == 1) {
                delete = true;
            }
        } catch (SQLException ex) {
            System.out.println("error elimiar equipo");
        } finally {
            try {
                pst.close();
                con.close();
            } catch (SQLException ex) {
                System.out.println("error en el finally cerrar conexion" + ex.getMessage());
            }
            return delete;
        }
    }

      
      public int updateTeam(Team t){
      int modifico = 0;
          PreparedStatement pst;
          String sql;
          sql = "UPDATE equipo SET nombre = ? WHERE id = ?";
          Connection con = Conexion.conectar("mysql");
          
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(2, t.getId());
            pst.setString(1,t.getName());
            if(pst.executeUpdate()==1){
            modifico = 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoTeam.class.getName()).log(Level.SEVERE, null, ex);
        }
      return modifico;
      }
    
}
