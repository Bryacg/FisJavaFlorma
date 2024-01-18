package florma;

/**
 *
 * @author elcar
 */
public class detalleventa {
    private int CodDVenta;
    private int IdVenta;
    private int IdProducto;
    private int cant;
    private double total;

    public detalleventa() {
    }

    public int getCodDVenta() {
        return CodDVenta;
    }

    public void setCodDVenta(int CodDVenta) {
        this.CodDVenta = CodDVenta;
    }

    public int getIdVenta() {
        return IdVenta;
    }

    public void setIdVenta(int IdVenta) {
        this.IdVenta = IdVenta;
    }

    public int getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(int IdProducto) {
        this.IdProducto = IdProducto;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
}
