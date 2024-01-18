package florma;

/**
 *
 * @author elcar
 */
public class compra {
    private int IdCompra;
    private int IdAdmin;
    private int IdProovedor;
    private String Fecha;
    private double Total;

    public compra() {
    }

    public int getIdCompra() {
        return IdCompra;
    }

    public void setIdCompra(int IdCompra) {
        this.IdCompra = IdCompra;
    }

    public int getIdAdmin() {
        return IdAdmin;
    }

    public void setIdAdmin(int IdAdmin) {
        this.IdAdmin = IdAdmin;
    }

    public int getIdProovedor() {
        return IdProovedor;
    }

    public void setIdProovedor(int IdProovedor) {
        this.IdProovedor = IdProovedor;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }
    
}
