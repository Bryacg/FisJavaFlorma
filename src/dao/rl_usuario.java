package dao;


import florma.conexion;
import florma.usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author elcar
 */
public class rl_usuario {
    conexion cn = new conexion();

    public rl_usuario() {
    }
    
    
    public void guardarUsuario(usuario cp){
        
        try {
            String sqlInsert = "INSERT INTO usuario(Ci,ApellidoPaterno,ApellidoMaterno,Nombres,Rol,Direccion,telefono,correo) VALUES(?,?,?,?,?,?,?,?)";
            PreparedStatement ps = cn.Conectar().prepareStatement(sqlInsert);
            ps.setString(1, cp.getCi());
            ps.setString(2,cp.getApellidoPaterno());
            ps.setString(3,cp.getApellidoMaterno());
            ps.setString(4,cp.getNombres());
            ps.setInt(5,cp.getRol());
            ps.setString(6,cp.getDireccion());
            ps.setString(7,cp.getTelefono());
            ps.setString(8,cp.getCorreo());
            
            
            ps.execute();
            ps.close();
            ps = null;
            cn.Desconectar();
            JOptionPane.showMessageDialog(null, " se Inserto el Uuario");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se Inserto el Uuario");
            Logger.getLogger(rl_usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<usuario> readC(){
       
        ArrayList<usuario> listaa = new ArrayList<usuario>();
        try {
           
           PreparedStatement ps = cn.Conectar().prepareStatement("SELECT * FROM usuario  ");
           ResultSet rs = ps.executeQuery();
           while(rs.next()){
               usuario a = new usuario();
               a.setIdPersona(rs.getInt("idPersona"));
               a.setCi(rs.getString("Ci"));
               a.setApellidoPaterno(rs.getString("ApellidoPaterno"));
               a.setApellidoMaterno(rs.getString("ApellidoMaterno"));
               a.setNombres(rs.getString("Nombres"));
               a.setRol(rs.getInt("Rol"));
               a.setDireccion(rs.getString("Direccion"));
               a.setTelefono(rs.getString("telefono"));
               a.setCorreo(rs.getString("correo"));
               
               listaa.add(a);
            }
            ps.close();
            ps = null;
            cn.Desconectar();
        } catch (SQLException ex) {
           Logger.getLogger(rl_usuario.class.getName()).log(Level.SEVERE, null, ex);
       }
       return listaa;
    }
    
     public ArrayList<usuario> readCLIENTE(){
       
        ArrayList<usuario> listaa = new ArrayList<usuario>();
        try {
           
           PreparedStatement ps = cn.Conectar().prepareStatement("SELECT * FROM usuario WHERE Rol = 1;  ");
           ResultSet rs = ps.executeQuery();
           while(rs.next()){
               usuario a = new usuario();
               a.setIdPersona(rs.getInt("idPersona"));
               a.setCi(rs.getString("Ci"));
               a.setApellidoPaterno(rs.getString("ApellidoPaterno"));
               a.setApellidoMaterno(rs.getString("ApellidoMaterno"));
               a.setNombres(rs.getString("Nombres"));
               a.setRol(rs.getInt("Rol"));
               a.setDireccion(rs.getString("Direccion"));
               a.setTelefono(rs.getString("telefono"));
               a.setCorreo(rs.getString("correo"));
               
               listaa.add(a);
            }
            ps.close();
            ps = null;
            cn.Desconectar();
        } catch (SQLException ex) {
           Logger.getLogger(rl_usuario.class.getName()).log(Level.SEVERE, null, ex);
       }
       return listaa;
    }
    
     public ArrayList<usuario> readpROVEDOR(){
       
        ArrayList<usuario> listaa = new ArrayList<usuario>();
        try {
           
           PreparedStatement ps = cn.Conectar().prepareStatement("SELECT * FROM usuario WHERE Rol = 2;  ");
           ResultSet rs = ps.executeQuery();
           while(rs.next()){
               usuario a = new usuario();
               a.setIdPersona(rs.getInt("idPersona"));
               a.setCi(rs.getString("Ci"));
               a.setApellidoPaterno(rs.getString("ApellidoPaterno"));
               a.setApellidoMaterno(rs.getString("ApellidoMaterno"));
               a.setNombres(rs.getString("Nombres"));
               a.setRol(rs.getInt("Rol"));
               a.setDireccion(rs.getString("Direccion"));
               a.setTelefono(rs.getString("telefono"));
               a.setCorreo(rs.getString("correo"));
               
               listaa.add(a);
            }
            ps.close();
            ps = null;
            cn.Desconectar();
        } catch (SQLException ex) {
           Logger.getLogger(rl_usuario.class.getName()).log(Level.SEVERE, null, ex);
       }
       return listaa;
    }
     
     
     public usuario BuscarCliente2(String ced) {
    
          usuario a = new usuario();
    try {
        // Utilizar un PreparedStatement y un parámetro para evitar problemas de seguridad
        String query = "SELECT * FROM usuario WHERE Ci = ?";
        PreparedStatement ps = cn.Conectar().prepareStatement(query);
        
        // Establecer el valor del parámetro
        ps.setString(1, ced);

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

    
}
