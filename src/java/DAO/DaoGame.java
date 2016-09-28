/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

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
public class DaoGame extends Conexion {
    public int selectCountTeam(int idTorneo){
    int numero = 0;
        PreparedStatement pst;
        ResultSet rs;
        String sql;
        sql = "SELECT COUNT(*) FROM equipo WHERE id_torneo = ?";
        Connection con = this.conectar("mysql");
        
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1,idTorneo);
            rs = pst.executeQuery();
            if(rs.next()){
            numero =rs.getMetaData().getColumnCount();
            }
            
        } catch (SQLException ex) {
            System.out.println("error metodo selectCountTeam");    
        }
    return numero;
    
    }
    
}
