package Controlador;
import Modelo.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class operaciones_tecno {
    
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    conexion conectar = new conexion();
    Producto p = new Producto();

    //metodo insertar.
   public int Agregar(Producto Producto) {  
        int r=0;
        String sql="INSERT INTO Productos(Id,Nombre,Descripcion,Precio,CantidadEnStock,Marca,Categoria)VALUES(?,?,?,?,?,?,?)";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);            
            ps.setInt(1,Producto.getId());
            ps.setString(2,Producto.getNombre());
            ps.setString(3,Producto.getDescripcion());
            ps.setInt(4,Producto.getPrecio());
            ps.setInt(5,Producto.getCantidadEnStock());
            ps.setString(6,Producto.getMarca());
            ps.setString(7,Producto.getCategoria());
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
   List<Producto> datos = new ArrayList<>();
   try {
     con = conectar.getConnection();
     ps= con.prepareStatement("select * from productos");
     rs = ps.executeQuery();
     while (rs.next()){
         Producto p = new Producto();
         p.setId(rs.getInt(1));
         p.setNombre(rs.getString(2));
         p.setDescripcion(rs.getString(3));
         p.setPrecio(rs.getInt(4));
         p.setCantidadEnStock(rs.getInt(5));
         p.setMarca(rs.getString(6));
         p.setCategoria(rs.getString(7));

         datos.add(p);
     }
   }catch(Exception e){
   }
   return datos;
  }
  //metodo eliminar
  public int Eliminar(String Id){
      int r =0;
      String sql = "DELETE FROM productos Where Id="+"'"+Id + "'";
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
  public int Modificar(Producto Producto){
      int r=0;
      String sql="update Productos SET Id=?,Nombre=?,Descripcion=?,Precio=?,CantidadEnStock=?,Marca=?,Categoria=? WHERE Id=?";
      try {
        con = conectar.getConnection();
        ps = con.prepareStatement(sql);
        ps.setInt(1, Producto.getId());
        ps.setString(2, Producto.getNombre());
        ps.setString(3, Producto.getDescripcion());
        ps.setInt(4, Producto.getPrecio());
        ps.setInt(5, Producto.getCantidadEnStock());
        ps.setString(6, Producto.getMarca());
        ps.setString(7, Producto.getCategoria());
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
   
