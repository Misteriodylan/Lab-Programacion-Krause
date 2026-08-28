package dylan;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class Conexionbd {
	
public static final String url = "jdbc:mysql://localhost:3306/sistema_usuarios?useSSL=false&serverTimezone=UTC";
private static final String user = "root";
private static final String password = "usbw";

public static Connection conectar() throws SQLException{
	return DriverManager.getConnection(url,user,password);
}
}
