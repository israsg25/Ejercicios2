package Ingles;
import java.sql.*;
import java.util.Scanner;

public class Ingles {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        try {
            String url = "jdbc:sqlserver://ALEX_ALCANTARA:" +"1433"+ "databaseName="+"Ingles";
            Connection conectar = DriverManager.getConnection(url);
            Statement statement = conectar.createStatement();
            do {
                menu();
                opcion = entrada.nextInt();
                entrada.nextLine();
                switch (opcion) {
                    case 1:
                        Present.TimePresent();
                        System.out.println("Back to menu...");
                        break;
                    case 2:
                        Past.TimePast();
                        System.out.println("Back to menu...");
                        break;
                    case 3:
                        Future.TimeFuture();
                        System.out.println("Back to menu...");
                        break;
                    case 4:
                        System.out.println("Saliendo....");
                        break;
                    default:
                        System.out.println("No válido");
                        break;
                }
            }
            while (opcion != 4) ;
            statement.close();
            conectar.close();

        } catch(SQLException e){
            e.printStackTrace();
        }
    }
    private static void menu() {
        System.out.println("_________________________________________");
        System.out.println(" Hello, welcome ");
        System.out.println("This program performs passive and active voice sentences");
        System.out.println("1.- PRESENT");
        System.out.println("2.- PAST");
        System.out.println("3.- FUTURE");
        System.out.println("4.- SALIR");
        System.out.print("Elige tu opción: ");
    }

}

