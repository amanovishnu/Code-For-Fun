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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainController2 implements Initializable {
	public LoginModel loginModel = new LoginModel();
	@FXML public ComboBox<String> createcombobox;
	ObservableList<String> list = FXCollections.observableArrayList("What was your First book?",
																	"What's your Wife DOB?",
																	"What was your First Pet?",
																	"Who was your first Love?");
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		createcombobox.setItems(list);
	}
	@FXML TextField createname;
	@FXML TextField createusername;
	@FXML TextField createemail;
	@FXML TextField createpassword;
	@FXML TextField createanswer;
	@FXML Label createlabelstatus; 
	public void createaccount(ActionEvent event) throws Exception {
		if(loginModel.isregister(createname.getText(),createusername.getText(),createemail.getText(),createpassword.getText(),createanswer.getText())) {
				createlabelstatus.setText("Account Created");
				((Node)event.getSource()).getScene().getWindow().hide();
				Stage primaryStage = new Stage();
				Parent rootnode = FXMLLoader.load(getClass().getResource("/application/Welcome.fxml"));
				Scene scene = new Scene(rootnode);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setScene(scene);
				primaryStage.setTitle("JavaFx Application");
				primaryStage.show();
			} else if(createname.getText().equals("") || createusername.getText().equals("") || createemail.getText().equals("")){
				createlabelstatus.setText("Enter Valid Details");
			}
	}
	public void alreadyregisteredclickhere(ActionEvent event) throws Exception {
		((Node)event.getSource()).getScene().getWindow().hide();
		Stage primaryStage = new Stage();
		Parent rootnode = FXMLLoader.load(getClass().getResource("/application/Login.fxml"));
		Scene scene = new Scene(rootnode);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("JavaFx Application");
		primaryStage.show();
	}
	@FXML Label forgotlabelstatus;
	@FXML TextField forgotemail;
	@FXML TextField forgotanswer;
	public void recoveraccount(ActionEvent event) throws Exception {
		if(loginModel.isrelogin(forgotemail.getText(),forgotanswer.getText())) {
			forgotlabelstatus.setText("Login Success");
			//((Node)event.getSource()).getScene().getWindow().hide();
			Stage primaryStage = new Stage();
			Parent rootnode = FXMLLoader.load(getClass().getResource("/application/Welcome.fxml"));
			Scene scene = new Scene(rootnode);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("JavaFx Application");
			primaryStage.show();		
		} else if(forgotemail.getText().equals("")&&forgotanswer.getText().equals("")) {
			forgotlabelstatus.setText("Please Enter Login Credentials");
		} else {
			forgotlabelstatus.setText("Login Failed");
		}
	}	
	public void returntologinpage(ActionEvent event) throws Exception {
		((Node)event.getSource()).getScene().getWindow().hide();
		Stage primaryStage = new Stage();
		Parent rootnode = FXMLLoader.load(getClass().getResource("/application/Login.fxml"));
		Scene scene = new Scene(rootnode);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("JavaFx Application");
		primaryStage.show();
	}
	
}