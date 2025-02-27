
package Controlador;
import Modelo.Ventas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class operaciones_venta {
    
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    conexion conectar = new conexion();
    Ventas p = new Ventas();

    //metodo insertar.
   public int Agregar(Ventas Ventas) {  
        int r=0;
        String sql="INSERT INTO Ventas (Id,Total,CodigoProducto)VALUES(?,?,?)";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);            
            ps.setInt(1,Ventas.getId());
            ps.setInt(2,Ventas.getTotal());
            ps.setInt(3,Ventas.getCodigoProducto());
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
   List<Ventas> datos = new ArrayList<>();
   try {
     con = conectar.getConnection();
     ps= con.prepareStatement("select * from Ventas");
     rs = ps.executeQuery();
     while (rs.next()){
         Ventas p = new Ventas();
         p.setId(rs.getInt(1));
         p.setTotal(rs.getInt(2));
         p.setCodigoProducto(rs.getInt(4));

         datos.add(p);
     }
   }catch(Exception e){
   }
   return datos;
  }
  //metodo eliminar
  public int Eliminar(String Id){
      int r =0;
      String sql = "DELETE FROM Ventas Where Id="+"'"+Id + "'";
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
  public int Modificar(Ventas Ventas){
      int r=0;
      String sql="update Ventas SET Id,Total=?,CodigoProducto=? WHERE Id=?";
      try {
        con = conectar.getConnection();
        ps = con.prepareStatement(sql);
        ps.setInt(1, Ventas.getId());
        ps.setInt(2, Ventas.getTotal());
        ps.setInt(3, Ventas.getCodigoProducto());
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
