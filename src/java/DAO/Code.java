/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author santhyago
 */
public class Code {
     private MessageDigest md;     
   private byte[] bytesdeDatos;
   private StringBuffer sb;
   
   public String codeMD5(String clave) {
       // BigInteger numero;
       // String hashtext;
       
        try {
            // Primera forma:                        
            md = MessageDigest.getInstance("MD5");
            md.update(clave.getBytes());
            
            bytesdeDatos = md.digest();
            
            //convert the byte to hex format
            //convierte el byte a formato hexadecimal
            
            sb = new StringBuffer();
            for (int i = 0; i < bytesdeDatos.length; i++) {
                sb.append(Integer.toString((bytesdeDatos[i] & 0xff) + 0x100, 16).substring(1));    
            }            
            
            
            return sb.toString();
        } catch (NoSuchAlgorithmException ex) {
            System.out.println("ERROR"+ex);
        }
        
        return "";        
    } // fin método cifrarMD5 (tipo 4)
}
