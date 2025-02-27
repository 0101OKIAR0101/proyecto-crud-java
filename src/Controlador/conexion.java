package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
 private final String ip = "127.0.0.1"; //Ej: 127.0.0.1
    private final String bd = "tiendadb";
    private final String url="jdbc:mysql://"+ip+":3306/"+bd;
    private final String user="root"; //Acá debes incorporar el user del motor de bases de datos.
    private final String pass="";    

        Connection con;
    
    //metodo para verificar la conexion 
    public Connection getConnection (){
        try{
         //establecemos la conexion usando la libreria JDBC
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(url,user,pass);
        //si la conexion es correcta imprimira en la consola el mensaje
        System.out.println("conexion exitosa");        
    }
    catch (ClassNotFoundException | SQLException e){
    // establece que si la conexion imprime mal dara error y nos mostrara donde se produce el error.
    System.out.println("error al conectar" + e.getMessage());
    }
    return con;

    }    
}

    
