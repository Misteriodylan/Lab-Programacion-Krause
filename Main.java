package dylan;

import java.sql.Connection;

public class Main {

    public static void main(String[] args) {

        try (Connection conexion = Conexionbd.conectar()) {

            Crud.insertarUsuario(conexion);

            Crud.consultarUsuarios(conexion);

            Crud.actualizarUsuario(conexion);

            Crud.eliminarUsuario(conexion);

        } catch (Exception e) {

            e.printStackTrace();

        }
    }
}