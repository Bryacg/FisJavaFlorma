package dao;
import florma.compra;
import florma.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class rl_compra {
    
    conexion cn = new conexion();
    public rl_compra() {
    }
    
    public void guardarCompra(compra cp){
        
        try {
            String sqlInsert = "INSERT INTO compra(idCajero_admin,IdProvedor,Fecha,Total) VALUES(?,?,CURDATE(),?)";
            PreparedStatement ps = cn.Conectar().prepareStatement(sqlInsert);
            ps.setInt(1, cp.getIdAdmin());
            ps.setInt(2,cp.getIdProovedor());
            //ps.setString(3,cp.getFecha());
            ps.setDouble(3,cp.getTotal());
            
            ps.execute();
            ps.close();
            ps = null;
            cn.Desconectar();
            JOptionPane.showMessageDialog(null, " se Inserto la Compra");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se Inserto la Compra");
            Logger.getLogger(rl_compra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<compra> readC(){
       
        ArrayList<compra> listaa = new ArrayList<compra>();
        try {
           
           PreparedStatement ps = cn.Conectar().prepareStatement("SELECT * FROM compra");
           ResultSet rs = ps.executeQuery();
           while(rs.next()){
               compra a = new compra();
               a.setIdCompra(rs.getInt("IdCompra"));
               a.setIdAdmin(rs.getInt("idCajero_admin"));
               a.setIdProovedor(rs.getInt("IdProvedor"));
               a.setFecha(rs.getString("Fecha"));
               a.setTotal(rs.getDouble("Total"));
               
               listaa.add(a);
            }
            ps.close();
            ps = null;
            cn.Desconectar();
        } catch (SQLException ex) {
           Logger.getLogger(rl_compra.class.getName()).log(Level.SEVERE, null, ex);
       }
       return listaa;
    }
    
    public int obtenerIdCompraRecienGuardada() {
    int idCompra = 0;

    try {
        // Utilizar un PreparedStatement y un parámetro para evitar problemas de seguridad
        String query = "SELECT MAX(IdCompra) AS maxId FROM compra";
        PreparedStatement ps = cn.Conectar().prepareStatement(query);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            idCompra = rs.getInt("maxId");
        }

        // Cerrar recursos adecuadamente
        rs.close();
        ps.close();
        cn.Desconectar();

    } catch (SQLException ex) {
        Logger.getLogger(rl_usuario.class.getName()).log(Level.SEVERE, null, ex);
    }

    return idCompra;
}
    
}
