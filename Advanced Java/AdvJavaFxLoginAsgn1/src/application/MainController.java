package application;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
public class MainController implements Initializable {
	public LoginModel loginModel = new LoginModel();
	/***********************************************COMBO BOX CONFIGURATION*******************************************************/
	@FXML public ComboBox<String> combobox;
	ObservableList<String> list = FXCollections.observableArrayList("What was your First book?",
																	"What's your Wife DOB?",
																	"What was your First Pet?",
																	"Who was your first Love?");
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		combobox.setItems(list);
	}
/*****************************************************************************************************************************/
/**********************************************ALREADY REGISTERED *************************************************************/
	@FXML Hyperlink alreadyregistered;
	public void registereduser(ActionEvent event) throws Exception {
		((Node)event.getSource()).getScene().getWindow().hide();
		Stage primaryStage = new Stage();
		Parent rootnode = FXMLLoader.load(getClass().getResource("/application/Login.fxml"));
		Scene scene = new Scene(rootnode);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("JavaFx Application");
		primaryStage.show();
	}
/*****************************************************************************************************************************/
/****************************************** CREATE ACCOUNT *******************************************************************/
	@FXML TextField regname;
	@FXML TextField regusername;
	@FXML TextField regemail;
	@FXML TextField regpassword;
	@FXML TextField regsecurity;
	public void usersignin(ActionEvent event) throws Exception {
		if(loginModel.isregister(regname.getText(),regusername.getText(),regemail.getText(),regpassword.getText(),regsecurity.getText())) {
			System.out.println("Account Created");
		};
		((Node)event.getSource()).getScene().getWindow().hide();
		Stage primaryStage = new Stage();
		Parent rootnode = FXMLLoader.load(getClass().getResource("/application/Final.fxml"));
		Scene scene = new Scene(rootnode);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("JavaFx Application");
		primaryStage.show();
		/*String sql ="INSERT INTO `logindata` (`Name`,`Username`,`EmailAddress`,`Password`,`SecurityAnswer`) VALUES (?,?,?,?,?)";
		String Name = name.getText();
		String Username = registerusername.getText();
		String EmailAddress = emailaddress.getText();
		String Password = registerpassword.getText();
		String SecurityAnswer = securityanswer.getText();
		/*private Connection conn = null;
		String sql = "INSERT INTO Users (username, password, fullname, email) VALUES (?, ?, ?, ?)"; */
		/*Connection conn = null;
		PreparedStatement statement = (PreparedStatement) conn .prepareStatement(sql);
		statement.setString(1,Name);
		statement.setString(2,Username);
		statement.setString(3,EmailAddress);
		statement.setString(4,Password);
		statement.setString(5,SecurityAnswer);
		 
		int rowsInserted = statement.executeUpdate();
		if (rowsInserted > 0) {
		    System.out.println("A new user was inserted successfully!");
		}*/
		
		
	}
/*****************************************************************************************************************************/
	/************************************* LOST PASSWORD ***************************************************************/
	@FXML TextField address;
	@FXML TextField answer;
	@FXML Label reloginstatus;
	public void recover(ActionEvent event) throws Exception{
		if(loginModel.isrelogin(address.getText(),answer.getText())) {
			reloginstatus.setText("Password Recovered");
			((Node)event.getSource()).getScene().getWindow().hide();
			Stage primaryStage = new Stage();
			Parent rootnode = FXMLLoader.load(getClass().getResource("/application/Final.fxml"));
			Scene scene = new Scene(rootnode);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("JavaFx Application");
			primaryStage.show();
		} else if(address.getText().equals("") && answer.getText().equals("")) {
			reloginstatus.setText("Please Enter Details");
		}else {
			reloginstatus.setText("Wrong Details");
		}
	}
/************************************************************************************************************************/	

/*************************************************************************************************************************/
	
}
