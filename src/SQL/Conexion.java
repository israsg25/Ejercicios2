package SQL;

import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.PreparedStatement;
        import java.sql.ResultSet;
        import java.sql.SQLException;

        import javax.swing.JOptionPane;

public class Conexion {

    Connection conexion = null;

    String usuario = "sa";
    String contrasena = "123";
    String db = "Libros";
    String puerto = "1433";

    public Connection obtenerConexion() {
        try{
            String cadena = "jdbc:sqlserver://LAPTOP-V22M3GKC:"+puerto+";"+"databaseName="+db;
            conexion = DriverManager.getConnection(cadena, usuario, contrasena);
            JOptionPane.showMessageDialog(null, "Conexion exitosa");
        } catch (Exception e) {
            System.out.printf("Error: "+e.toString());
        }
        return conexion;
    }

    public PreparedStatement InsertarLibros() {
        Conexion op=new Conexion();
        Connection cn=null;
        PreparedStatement ps=null;
        try {
            cn=op.obtenerConexion();
            String id=JOptionPane.showInputDialog("Introduzca su ID:");
            String nom=JOptionPane.showInputDialog("Introduzca su Nombre:");
            String edi=JOptionPane.showInputDialog("Introduzca Editorial:");
            String dir=JOptionPane.showInputDialog("Introduzca su Precio:");
            String query="Insert into Libros values (?,?,?,?)";
            ps=cn.prepareStatement(query);
            ps.setString(1, id);
            ps.setString(2, nom);
            ps.setString(3, edi);
            ps.setString(4, dir);
            ps.executeUpdate();
            System.out.println("Registro Correcto ");

        }catch(SQLException e){
            System.out.println("Error de registro");
            e.printStackTrace();
        }
        return ps;
    }

}