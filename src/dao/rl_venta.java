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
            String sqlInsert = "INSERT INTO venta(IdCliente,IdCajero,Fecha,SubTotal,Total) VALUES(?,?,?,?,?)";
            PreparedStatement ps = cn.Conectar().prepareStatement(sqlInsert);
            ps.setInt(1, cp.getIdCliente());
            ps.setInt(2,cp.getIdCajero());
            ps.setString(3,cp.getFecha());
            ps.setDouble(4,cp.getSubtotal());
            ps.setDouble(5,cp.getTotal());
            
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
}
