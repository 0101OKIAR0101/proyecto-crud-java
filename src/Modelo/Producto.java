
package Modelo;


public class Producto {
    private int Id;
    private String Nombre;
    private String Descripcion;
    private int Precio;
    private int CantidadEnStock;
    private String Marca;
    private String Categoria;
    
    public Producto() {
    }

    public Producto(int Id, String Nombre, String Descripcion, int Precio, int CantidadEnStock, String Marca, String Categoria) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Precio = Precio;
        this.CantidadEnStock = CantidadEnStock;
        this.Marca = Marca;
        this.Categoria = Categoria;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public int getCantidadEnStock() {
        return CantidadEnStock;
    }

    public void setCantidadEnStock(int CantidadEnStock) {
        this.CantidadEnStock = CantidadEnStock;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }
    
}