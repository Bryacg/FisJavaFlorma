package dao;

import florma.conexion;
import florma.producto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class rl_producto {

    conexion cn = new conexion();

    public rl_producto() {
    }

    public void guardarProducto(producto cp) {

        try {
            String sqlInsert = "INSERT INTO producto(Nombre,PrecioCompra,PrecioVenta,Stock) VALUES(?,?,?,?)";
            PreparedStatement ps = cn.Conectar().prepareStatement(sqlInsert);
            ps.setString(1, cp.getNombre());
            ps.setDouble(2, cp.getPrecioCompra());
            ps.setDouble(3, cp.getPrecioVenta());
            ps.setInt(4, cp.getStock());

            ps.execute();
            ps.close();
            ps = null;
            cn.Desconectar();
            JOptionPane.showMessageDialog(null, " se Inserto el Producto");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se Inserto  el Producto");
            Logger.getLogger(rl_producto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<producto> readC() {

        ArrayList<producto> listaa = new ArrayList<producto>();
        try {
            String sql = "SELECT * FROM producto";
            PreparedStatement ps = cn.Conectar().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                producto a = new producto();
                a.setCodigo(rs.getInt("Codigo"));
                a.setNombre(rs.getString("Nombre"));
                a.setPrecioCompra(rs.getInt("PrecioCompra"));
                a.setPrecioVenta(rs.getDouble("PrecioVenta"));
                a.setStock(rs.getInt("Stock"));

                listaa.add(a);
            }
            ps.close();
            ps = null;
            cn.Desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(rl_producto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaa;
    }

    public producto BuscarProducto(String Nombre) {
        producto a = new producto();
        try {
            // Utilizar un PreparedStatement y un parámetro para evitar problemas de seguridad
            String query = "SELECT * FROM producto WHERE Nombre = ?";
            PreparedStatement ps = cn.Conectar().prepareStatement(query);

            // Establecer el valor del parámetro
            ps.setString(1, Nombre);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                a.setCodigo(rs.getInt("Codigo"));
                a.setNombre(rs.getString("Nombre"));
                a.setPrecioCompra(rs.getDouble("PrecioCompra"));
                a.setPrecioVenta(rs.getDouble("PrecioVenta"));
                a.setStock(rs.getInt("Stock"));

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
