package SQL;

public class Principal {
    public static void main(String[] args) {
        Conexion con = new Conexion();
        //con.conectar();
        con.InsertarLibros();
    }
}