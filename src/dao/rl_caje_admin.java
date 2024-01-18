/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import florma.caje_admin;
import florma.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class rl_caje_admin {
    conexion cn = new conexion();
    
    
     public void guardarCompra(caje_admin cp){
        
        try {
            String sqlInsert = "INSERT INTO cajero_admin(IdAdmin,IdProvedor,Fecha,Total) VALUES(?,?,?,?)";
            PreparedStatement ps = cn.Conectar().prepareStatement(sqlInsert);
            ps.setString(1, cp.getUduario());
            ps.setString(2,cp.getPass());
            ps.execute();
            ps.close();
            ps = null;
            cn.Desconectar();
            JOptionPane.showMessageDialog(null, " se Inserto Usuario y contraseña");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se Inserto Usuario y contraseña");
            Logger.getLogger(rl_caje_admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<caje_admin> readC(){
       
        ArrayList<caje_admin> listaa = new ArrayList<caje_admin>();
        try {
           
           PreparedStatement ps = cn.Conectar().prepareStatement("SELECT * FROM cajero_admin");
           ResultSet rs = ps.executeQuery();
           while(rs.next()){
               caje_admin a = new caje_admin();
               a.setId(rs.getInt("idCajero_admin"));
               a.setUduario(rs.getString("usuaio"));
               a.setPass(rs.getString("contasenia"));
               
               listaa.add(a);
            }
            ps.close();
            ps = null;
            cn.Desconectar();
        } catch (SQLException ex) {
           Logger.getLogger(rl_caje_admin.class.getName()).log(Level.SEVERE, null, ex);
       }
       return listaa;
    }

     public boolean validaUsuario(String user, String contrasenia) {
    try {
        String sqlSelect = "SELECT * FROM cajero_admin WHERE usuario = ? AND contrasenia = ?";
        PreparedStatement ps = cn.Conectar().prepareStatement(sqlSelect);
        ps.setString(1, user);
        ps.setString(2, contrasenia);
        ResultSet rs = ps.executeQuery();
        boolean usuarioValido = rs.next();

        ps.close();
        ps = null;
        cn.Desconectar();

        if (usuarioValido) {
            JOptionPane.showMessageDialog(null, "Usuario y contraseña válidos");
        } else {
            JOptionPane.showMessageDialog(null, "Usuario y/o contraseña incorrectos");
           //  return true;
        }

        return usuarioValido;
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al validar usuario y contraseña");
        Logger.getLogger(rl_caje_admin.class.getName()).log(Level.SEVERE, null, ex);
        return false;
    }
}

}