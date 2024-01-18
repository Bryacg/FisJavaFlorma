package florma;

/**
 *
 * @author elcar
 */
public class detallecompra {
    private int CodDcompra;
    private int IdCompra;
    private int IdProducto;
    private int cant;
    private double total;

    public detallecompra() {
    }

    public int getCodDcompra() {
        return CodDcompra;
    }

    public void setCodDcompra(int CodDcompra) {
        this.CodDcompra = CodDcompra;
    }

    public int getIdCompra() {
        return IdCompra;
    }

    public void setIdCompra(int IdCompra) {
        this.IdCompra = IdCompra;
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
