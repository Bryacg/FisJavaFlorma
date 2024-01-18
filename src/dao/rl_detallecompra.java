package dao;


import florma.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import florma.detallecompra;

/**
 *
 * @author elcar
 */
public class rl_detallecompra {
    conexion cn = new conexion();

    public rl_detallecompra() {
    }
    
    
    
    public void guardarDCompra(detallecompra dcp){
        
        try {
            String sqlInsert = "INSERT INTO detallecompra(IdCompra,IdProducto,cant,total) VALUES(?,?,?,?)";
            PreparedStatement ps = cn.Conectar().prepareStatement(sqlInsert);
            ps.setInt(1, dcp.getIdCompra());
            ps.setInt(2,dcp.getIdProducto());
            ps.setInt(3,dcp.getCant());
            ps.setDouble(4,dcp.getTotal());
            
            ps.execute();
            ps.close();
            ps = null;
            cn.Desconectar();
            JOptionPane.showMessageDialog(null, " se Inserto el Detalle Compra");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se Inserto el Detalle Compra");
            Logger.getLogger(rl_compra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<detallecompra> readC(){
       
        ArrayList<detallecompra> listaa = new ArrayList<detallecompra>();
        try {
           
           PreparedStatement ps = cn.Conectar().prepareStatement("SELECT * FROM detallecompra");
           ResultSet rs = ps.executeQuery();
           while(rs.next()){
               detallecompra a = new detallecompra();
               a.setCodDcompra(rs.getInt("CodDcompra"));
               a.setIdCompra(rs.getInt("IdCompra"));
               a.setIdProducto(rs.getInt("IdProducto"));
               a.setCant(rs.getInt("cant"));
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
}
