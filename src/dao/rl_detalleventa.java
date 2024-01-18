package dao;


import florma.conexion;
import florma.detalleventa;
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
public class rl_detalleventa {
    conexion cn = new conexion();
    

    public rl_detalleventa() {
    }
    
    
    public void guardarCompra(detalleventa dtv){
        
        try {
            String sqlInsert = "INSERT INTO detalleventa(Idventa,IdProducto,cant,total) VALUES(?,?,?,?)";
            PreparedStatement ps = cn.Conectar().prepareStatement(sqlInsert);
            ps.setInt(1, dtv.getIdVenta());
            ps.setInt(2,dtv.getIdProducto());
            ps.setInt(3,dtv.getCant());
            ps.setDouble(4,dtv.getTotal());
            
            ps.execute();
            ps.close();
            ps = null;
            cn.Desconectar();
            JOptionPane.showMessageDialog(null, " se Inserto el Detalle de la Venta");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se Inserto el Detalle de la Venta");
            Logger.getLogger(rl_detalleventa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<detalleventa> readDTV(){
       
        ArrayList<detalleventa> listaa = new ArrayList<detalleventa>();
        try {
           
           PreparedStatement ps = cn.Conectar().prepareStatement("SELECT * FROM detalleventa");
           ResultSet rs = ps.executeQuery();
           while(rs.next()){
               detalleventa a = new detalleventa();
               a.setCodDVenta(rs.getInt("CodDVenta"));
               a.setIdVenta(rs.getInt("Idventa"));
               a.setIdProducto(rs.getInt("IdProducto"));
               a.setCant(rs.getInt("cant"));
               a.setTotal(rs.getDouble("total"));
               
               listaa.add(a);
            }
            ps.close();
            ps = null;
            cn.Desconectar();
        } catch (SQLException ex) {
           Logger.getLogger(rl_detalleventa.class.getName()).log(Level.SEVERE, null, ex);
       }
       return listaa;
    }
}
