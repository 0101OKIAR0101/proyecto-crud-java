
package Modelo;


public class Ventas {
    private int Id;
    private int Total;
    private int CodigoProducto;

    public Ventas() {
    }

    public Ventas(int Id, int Total, int CodigoProducto) {
        this.Id = Id;
        this.Total = Total;
        this.CodigoProducto = CodigoProducto;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int Total) {
        this.Total = Total;
    }

    public int getCodigoProducto() {
        return CodigoProducto;
    }

    public void setCodigoProducto(int CodigoProducto) {
        this.CodigoProducto = CodigoProducto;
    }
    
    
    
    
}
