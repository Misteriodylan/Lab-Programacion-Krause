package dylan;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Crud {

    // CREATE - INSERT
    public static void insertarUsuario(Connection conexion) {

        String sql = "INSERT INTO usuarios (nombre, apellido, dni, email) VALUES (?, ?, ?, ?)";

        try (PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setString(1, "Dylan");
            ps.setString(2, "Atanacio");
            ps.setString(3, "12345678");
            ps.setString(4, "dylan@mail.com");

            int filasAfectadas = ps.executeUpdate();

            System.out.println("Filas insertadas: " + filasAfectadas);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    // READ - SELECT
    public static void consultarUsuarios(Connection conexion) {

        String sql = "SELECT id, nombre, apellido, dni, email FROM usuarios";

        try (PreparedStatement ps = conexion.prepareStatement(sql)) {

            try (ResultSet rs = ps.executeQuery()) {

                while (rs.next()) {

                    int id = rs.getInt("id");
                    String nombre = rs.getString("nombre");
                    String apellido = rs.getString("apellido");
                    String dni = rs.getString("dni");
                    String email = rs.getString("email");

                    System.out.println(
                        id + " - " +
                        nombre + " - " +
                        apellido + " - " +
                        dni + " - " +
                        email
                    );
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    // UPDATE
    public static void actualizarUsuario(Connection conexion) {

        String sql = "UPDATE usuarios SET nombre = ?, apellido = ?, dni = ?, email = ? WHERE id = ?";

        try (PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setString(1, "Dylan");
            ps.setString(2, "Aguirre");
            ps.setString(3, "12345678");
            ps.setString(4, "dylan@mail.com");
            ps.setInt(5, 1);

            int filasAfectadas = ps.executeUpdate();

            System.out.println("Filas actualizadas: " + filasAfectadas);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    // DELETE
    public static void eliminarUsuario(Connection conexion) {

        String sql = "DELETE FROM usuarios WHERE id = ?";

        try (PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setInt(1, 1);

            int filasAfectadas = ps.executeUpdate();

            System.out.println("Filas eliminadas: " + filasAfectadas);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}