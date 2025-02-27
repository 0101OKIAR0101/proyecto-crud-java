
package Vista;
import Controlador.conexion;
import java.sql.Connection;
public class Main {

    
    public static void main(String[] args) {
      // Instancio el Jframe
        Ventana jframe = new Ventana();
        jframe.setVisible(true);
        
        conexion conexion = new conexion();
        Connection con = conexion.getConnection();
    }
    
}
