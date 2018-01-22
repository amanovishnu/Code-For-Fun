package application;	
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Statement;
//import javax.naming.spi.DirStateFactory.Result;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			/*Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
			System.out.println("Connection Success");*/
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws SQLException {
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
			String query = "SELECT * FROM student_table";
			Statement stmt = (Statement) conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				System.out.println("Student ID:  "+rs.getString("s_id")+"  Name:  "+rs.getString("s_name")+"   class   "+rs.getString("s_class")+"  Mobile   "+rs.getString("s_phone"));
			}
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Connection Success");
		launch(args);
	}
}
