
package Modelo;


public class Proveedores {
    private int Id;
    private String Nombre;
    private int Telefono;
    private String Correo;
    
    

    public Proveedores() {
    }

    public Proveedores(int Id, String Nombre, int Telefono, String Correo) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Telefono = Telefono;
        this.Correo = Correo;
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

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    
    
    
    
}
