import java.sql.*;
import javax.swing.*;

public class hotelData {
	public static Connection ConnectDB() {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\deysa\\eclipse-workspace\\Hotel\\hoteldb.db");
			JOptionPane.showMessageDialog(null, "connection Made");
			return conn;
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "connection Error");
			return null;
		}
	}

}
