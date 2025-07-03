package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String URL = "jdbc:mysql://localhost:3306/imcapp";
    private static final String USER = "root";
    private static final String PASSWORD = "Quieropollo56"; 

    public static Connection getConexion() {
    try {
        System.out.println("Intentando conectar a MySQL...");
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        System.out.println("Conexión exitosa.");
        return conn;
    } catch (ClassNotFoundException | SQLException e) {
        System.out.println("Error al conectar con la base de datos: " + e.getMessage());
        return null;
    }
  }

}
