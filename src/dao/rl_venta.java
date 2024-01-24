package dao;


import florma.conexion;
import florma.venta;
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
public class rl_venta {
    conexion cn = new conexion();

    public rl_venta() {
    }
    
    
    public void guardarVenta(venta cp){
         try {
            String sqlInsert = "INSERT INTO venta(IdCliente,idCajero_admin,Fecha,SubTotal,Total) VALUES(?,?,CURDATE(),?,?)";
            PreparedStatement ps = cn.Conectar().prepareStatement(sqlInsert);
            ps.setInt(1, cp.getIdCliente());
            ps.setInt(2,cp.getIdCajero());
            //ps.setString(3,cp.getFecha());
            ps.setDouble(3,cp.getSubtotal());
            ps.setDouble(4,cp.getTotal());
            ps.execute();
            ps.close();
            ps = null;
            cn.Desconectar();
            JOptionPane.showMessageDialog(null, " se Inserto la venta");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se Inserto la venta");
            Logger.getLogger(rl_venta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<venta> readC(){
       
        ArrayList<venta> listaa = new ArrayList<venta>();
        try {
           
           PreparedStatement ps = cn.Conectar().prepareStatement("SELECT * FROM venta");
           ResultSet rs = ps.executeQuery();
           while(rs.next()){
               venta a = new venta();
               a.setIdVenta(rs.getInt("Idventa"));
               a.setIdCliente(rs.getInt("IdCliente"));
               a.setIdCajero(rs.getInt("idCajero_admin"));
               a.setFecha(rs.getString("Fecha"));
               a.setSubtotal(rs.getDouble("SubTotal"));
               a.setTotal(rs.getDouble("Total"));
               
               listaa.add(a);
            }
            ps.close();
            ps = null;
            cn.Desconectar();
        } catch (SQLException ex) {
           Logger.getLogger(rl_venta.class.getName()).log(Level.SEVERE, null, ex);
       }
       return listaa;
    }
    
    public int obtenerCantidadDeVentas() {
    int cantidadVentas = 0;

    try {
        // Utilizar un PreparedStatement y un parámetro para evitar problemas de seguridad
        String query = "SELECT COUNT(*) AS cantidad FROM venta";
        PreparedStatement ps = cn.Conectar().prepareStatement(query);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            cantidadVentas = rs.getInt("cantidad");
        }

        // Cerrar recursos adecuadamente
        rs.close();
        ps.close();
        cn.Desconectar();

    } catch (SQLException ex) {
        Logger.getLogger(rl_usuario.class.getName()).log(Level.SEVERE, null, ex);
    }

    return cantidadVentas;
}
    
    public int obtenerIdVentaRecienGuardada() {
    int idVenta = 0;

    try {
        // Utilizar un PreparedStatement y un parámetro para evitar problemas de seguridad
        String query = "SELECT MAX(Idventa) AS maxId FROM venta";
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
