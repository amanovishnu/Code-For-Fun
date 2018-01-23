package application;
import java.sql.*;
public class LoginModel {
	Connection connection;
	public LoginModel () {
		connection = SqliteConnection.Connector();
		if(connection == null) {
			System.out.println("Connection not Successful");
			System.exit(1);
		}
	}
	public boolean isDbconnected() {
		try {
			return !connection.isClosed();
		}
		catch(SQLException e) {
			e.printStackTrace();
			return false;
		}		
	}
	public boolean isLogin(String user,String pass) throws SQLException {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		String query = "select * from logindata where Username = ? and Password = ? ";
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1,user);
			preparedStatement.setString(2,pass);
			resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				return true;
			} else {
				return false;
			}
			
		} catch (Exception e) {
			return false;
		} /*finally {
			preparedStatement.close();
			resultSet.close();
		}*/
	}
	public boolean isrelogin(String email,String security) throws SQLException {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		String query = "select * from logindata where EmailAddress = ? and SecurityAnswer = ? ";
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1,email);
			preparedStatement.setString(2,security);
			resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				return true;
			} else {
				return false;
			}
			
		} catch (Exception e) {
			return false;
		} /*finally {
			preparedStatement.close();
			resultSet.close();
		}*/
	}
	/****************************************************************************************************************************/
	public boolean isregister(String rname,String runame,String remail, String rpass,String rsec) throws SQLException {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		String query = "INSERT INTO logindata (Name,Username,EmailAddress,Password,SecurityAnswer) VALUES (?,?, ?, ?, ?)";
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1,rname);
			preparedStatement.setString(2,runame);
			preparedStatement.setString(3,remail);
			preparedStatement.setString(4,rpass);
			preparedStatement.setString(5,rsec);
			resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				int rowsInserted = preparedStatement.executeUpdate();
				if (rowsInserted > 0) {
				    System.out.println("A new user was inserted successfully!");
				}
				return true;
			} else {
				return false;
			}
			
		} catch (Exception e) {
			return false;
		} /*finally {
			preparedStatement.close();
			resultSet.close();
		}*/
	}
	/*************************************************************************************************************************/
	
}
