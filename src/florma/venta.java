package florma;

/**
 *
 * @author elcar
 */
public class venta {
    private int IdVenta;
    private int IdCliente;
    private int IdCajero;
    private String Fecha;
    private double Subtotal;
    private double Total;

    public venta() {
    }
    

    public int getIdVenta() {
        return IdVenta;
    }

    public void setIdVenta(int IdVenta) {
        this.IdVenta = IdVenta;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public double getSubtotal() {
        return Subtotal;
    }

    public void setSubtotal(double Subtotal) {
        this.Subtotal = Subtotal;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    public int getIdCajero() {
        return IdCajero;
    }

    public void setIdCajero(int IdCajero) {
        this.IdCajero = IdCajero;
    }
    
    
}
