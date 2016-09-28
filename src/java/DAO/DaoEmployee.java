/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import beans.Employee;
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
public class DaoEmployee extends Conexion {

    public int addEmployee(Employee em) {
        int insert = 0;
        PreparedStatement pst = null;
        String sql;

        Connection con = this.conectar("mysql");
        sql = "INSERT INTO usuario (nombre,apellido,tipo_documento,numero_documento,correo,telefono,direccion,id_tipoUsuario)"
                + "VALUES (?,?,?,?,?,?,?,?)";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, em.getName());
            pst.setString(2, em.getLastName());
            pst.setString(3, em.getDocumentType());
            pst.setString(4, em.getDocumentNumber());
            pst.setString(5, em.getEmail());
            pst.setString(6, em.getTelephone());
            pst.setString(7, em.getAddress());
            pst.setInt(8, em.getUserType());

            if (pst.executeUpdate() == 1) {
                insert = 1;
                System.out.println("jjjjjj");
            }

        } catch (SQLException ex) {
            System.out.println("error al insertar usuario" + ex);

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

    public int consultIdUserType(String id) {
        int exists = 0;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql;
        Connection con = Conexion.conectar("mysql");
        sql = "SELECT id FROM tipo_usuario WHERE tipo_usuario = ?";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, id);
            rs = pst.executeQuery();
            if (rs.next()) {
                Employee em = new Employee();
                exists = rs.getInt("id");
                em.setUserType(exists);
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

    public ArrayList<Employee> listEmployee() {
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql;
        sql = "SELECT id,nombre,apellido,tipo_documento,numero_documento,correo,telefono,direccion FROM usuario";
        Connection con = Conexion.conectar("mysql");
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            ArrayList<Employee> list = new ArrayList<>();
            while (rs.next()) {
                Employee em = new Employee();
                em.setId(rs.getInt(1));
                em.setName(rs.getString(2));
                em.setLastName(rs.getString(3));
                em.setDocumentType(rs.getString(4));
                em.setDocumentNumber(rs.getString(5));
                em.setEmail(rs.getString(6));
                em.setTelephone(rs.getString(7));
                em.setAddress(rs.getString(8));

                list.add(em);
            }
            return list;

        } catch (SQLException ex) {
            System.out.println("error en el metodo mostrar usuarios" + ex);
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

    public int deleteEmployee(String id) {
        int eliminado = 0;
        PreparedStatement pst = null;
        String sql;
        sql = "DELETE FROM usuario WHERE id = ?";
        Connection con = Conexion.conectar("mysql");

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, id);
            if (pst.executeUpdate() == 1) {
                eliminado = 1;
            }
            pst.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("error metodo eliminar empleado");
        } finally {
            try {
                pst.close();
                con.close();
            } catch (SQLException ex) {
                System.out.println("error en el finally cerrar conexion" + ex.getMessage());
            }
            return eliminado;
        }
    }
    
    
    public int updateEmployee(Employee em){
    int modifico = 0;
    PreparedStatement pst = null;
    String sql;
    sql = "UPDATE usuario SET nombre = ?,apellido = ?,tipo_documento = ?,numero_documento = ?,correo = ?,telefono = ?,direccion = ? WHERE id = ?";
    Connection con = this.conectar("mysql");
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(8, em.getId());
            pst.setString(1, em.getName());
            pst.setString(2, em.getLastName());
            pst.setString(3,em.getDocumentType());
            pst.setString(4, em.getDocumentNumber());
            pst.setString(5, em.getEmail());
            pst.setString(6, em.getTelephone());
            pst.setString(7, em.getAddress());
            
            if(pst.executeUpdate()==1){
            modifico = 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoEmployee.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                pst.close();
                con.close();
            } catch (SQLException ex) {
                System.out.println("error en el finally cerrar conexion" + ex.getMessage());
            }
               return modifico;
        }

    
 
    }

}
