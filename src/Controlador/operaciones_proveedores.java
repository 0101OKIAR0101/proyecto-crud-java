
package Controlador;
import Modelo.Proveedores;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class operaciones_proveedores {
    
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    conexion conectar = new conexion();
    Proveedores p = new Proveedores();

    //metodo insertar.
   public int Agregar(Proveedores Proveedores) {  
        int r=0;
        String sql="INSERT INTO Proveedores(Id,Nombre,Telefono,Precio,correo)VALUES(?,?,?,?)";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);            
            ps.setInt(1,Proveedores.getId());
            ps.setString(2,Proveedores.getNombre());
            ps.setInt(3,Proveedores.getTelefono());
            ps.setString(4,Proveedores.getCorreo());
            r=ps.executeUpdate();    
            if(r==1){
                return 1;
            }
            else{
                return 0;
            }
        } catch (Exception e) {
        }  
        return r;
    }
  //metodo lista.
  public List Lista (){
   List<Proveedores> datos = new ArrayList<>();
   try {
     con = conectar.getConnection();
     ps= con.prepareStatement("select * from Proveedores");
     rs = ps.executeQuery();
     while (rs.next()){
         Proveedores p = new Proveedores();
         p.setId(rs.getInt(1));
         p.setNombre(rs.getString(2));
         p.setTelefono(rs.getInt(3));
         p.setCorreo(rs.getString(4));

         datos.add(p);
     }
   }catch(Exception e){
   }
   return datos;
  }
  //metodo eliminar
  public int Eliminar(String Id){
      int r =0;
      String sql = "DELETE FROM Proveedores Where Id="+"'"+Id + "'";
      try{
         con = conectar.getConnection();
         ps = con.prepareStatement(sql);
         r = ps.executeUpdate();
      }catch(Exception e){
          System.out.println(e);
      }
      return r;
  }
  
  //metodo modificar
  public int Modificar(Proveedores Proveedores){
      int r=0;
      String sql="update Proveedores SET Id=?,Nombre=?,Telefono=?,Correo=? WHERE Id=?";
      try {
        con = conectar.getConnection();
        ps = con.prepareStatement(sql);
        ps.setInt(1, Proveedores.getId());
        ps.setString(2, Proveedores.getNombre());
        ps.setInt(3, Proveedores.getTelefono());
        ps.setString(4, Proveedores.getCorreo());
        r = ps.executeUpdate();
        if(r==1){
            return 1;
        }
        else{
            return 0;
        }
        
      }catch (Exception e){
          
      }
   return r;
}
}
