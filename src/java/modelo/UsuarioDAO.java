package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {

    public boolean guardarHistorial(String nombre, double peso, double estatura, double imc, String clasificacion) {
        String sql = "INSERT INTO historial (nombre, peso, estatura, imc, clasificacion) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = Conexion.getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nombre);
            stmt.setDouble(2, peso);
            stmt.setDouble(3, estatura);
            stmt.setDouble(4, imc);
            stmt.setString(5, clasificacion);

            stmt.executeUpdate();
            return true;

        } catch (SQLException e) {
            System.out.println("Error al guardar en historial: " + e.getMessage());
            return false;
        }
    }
}
