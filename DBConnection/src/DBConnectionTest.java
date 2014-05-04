import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionTest {

	/**
	 * @param args
	 */
	public static void main(String[] argv) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return;
		}

		Connection connection = null;
		String url = "jdbc:mysql://localhost/goygoyedu";
		String user = "root";
		String password = "Kat132141";

		try {
			connection = DriverManager.getConnection(url, user, password);

		} catch (SQLException e) {
			System.out.println("Bağlantı başarısız...");
			e.printStackTrace();
			return;
		}

		if (connection != null) {
			System.out.println("Veritabanına bağlandı.");
		} else {
			System.out.println("Bağlantı başarısız...");
		}
	}

}
