package application;
import java.sql.*;
public class loginModel {
	Connection connection;
	public loginModel() {
		connection = SqliteConnection.Connector();
		if (connection == null) System.exit(1);
	}
	public boolean isDbConnected() {
		try {
			return  !connection.isClosed();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
}
