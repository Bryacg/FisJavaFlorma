/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import florma.caje_admin;
import florma.conexion;
import florma.usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class rl_caje_admin {

    conexion cn = new conexion();

    public void guardarCajeAdmin(String user, String cont, int i) {

        try {
            String sqlInsert = "INSERT INTO cajero_admin(idCajero_admin ,usuario,contrasenia) VALUES(?,?,?)";
            PreparedStatement ps = cn.Conectar().prepareStatement(sqlInsert);
            ps.setInt(1, i);
             ps.setString(2, user);
            ps.setString(3, cont);
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

    public ArrayList<caje_admin> readC() {

        ArrayList<caje_admin> listaa = new ArrayList<caje_admin>();
        try {

            PreparedStatement ps = cn.Conectar().prepareStatement("SELECT * FROM cajero_admin");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
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

    public usuario Extraercaje_admin(String user, String contrasenia) {
        usuario a = new usuario();
        try {
            String sqlSelect = "SELECT usuario.* FROM usuario INNER JOIN cajero_admin ON usuario.idPersona = cajero_admin.idCajero_admin WHERE cajero_admin.usuario= ? AND cajero_admin.contrasenia = ?;";
            PreparedStatement ps = cn.Conectar().prepareStatement(sqlSelect);
            ps.setString(1, user);
            ps.setString(2, contrasenia);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
           
            a.setIdPersona(rs.getInt("idPersona"));
            a.setCi(rs.getString("Ci"));
            a.setApellidoPaterno(rs.getString("ApellidoPaterno"));
            a.setApellidoMaterno(rs.getString("ApellidoMaterno"));
            a.setNombres(rs.getString("Nombres"));
            a.setRol(rs.getInt("Rol"));
            a.setDireccion(rs.getString("Direccion"));
            a.setTelefono(rs.getString("telefono"));
            a.setCorreo(rs.getString("correo"));
         }

        // Cerrar recursos adecuadamente
        rs.close();
        ps.close();
        cn.Desconectar();
        
    } catch (SQLException ex) {
        Logger.getLogger(rl_usuario.class.getName()).log(Level.SEVERE, null, ex);
    }

    return a;
}
    
    public int obtenerIdUsuarioRecienGuardada() {
    int idVenta = 0;

    try {
        // Utilizar un PreparedStatement y un parámetro para evitar problemas de seguridad
        String query = "SELECT MAX(idPersona) AS maxId FROM usuario";
        PreparedStatement ps = cn.Conectar().prepareStatement(query);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            idVenta = rs.getInt("maxId");
        }

        // Cerrar recursos adecuadamente
        rs.close();
        ps.close();
        cn.Desconectar();

    } catch (SQLException ex) {
        Logger.getLogger(rl_usuario.class.getName()).log(Level.SEVERE, null, ex);
    }

    return idVenta;
}
}
