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

public class MainController/* implements Initializable */{
	public LoginModel loginModel = new LoginModel();
//**********************************************ALREADY REGISTERED ************************************************************************//
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
//*****************************************************************************************************************************************//
//*****************************************LOGIN.REGISTER.HERE*****************************************************************************//
	@FXML Hyperlink registerhere;
	public void registeruser(ActionEvent event) throws Exception {
		((Node)event.getSource()).getScene().getWindow().hide();
		Stage primaryStage = new Stage();
		Parent rootnode = FXMLLoader.load(getClass().getResource("/application/CreateAccount.fxml"));
		Scene scene = new Scene(rootnode);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("JavaFx Application");
		primaryStage.show();
	}
//*****************************************************************************************************************************************//
//***************************************LOGIN.FORGOT.PASSWORD*****************************************************************************//
	@FXML Hyperlink lostpassword;
	public void lostpassword(ActionEvent event) throws Exception {
		((Node)event.getSource()).getScene().getWindow().hide();
		Stage primaryStage = new Stage();
		Parent rootnode = FXMLLoader.load(getClass().getResource("/application/ForgotPassword.fxml"));
		Scene scene = new Scene(rootnode);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("JavaFx Application");
		primaryStage.show();
	}
//*****************************************************************************************************************************************//
//****************************************LOGIN.LOGIN.BUTTON*******************************************************************************//
	@FXML Label labelstatus;
	@FXML TextField lusername;
	@FXML TextField lpassword;
	public void login(ActionEvent event) throws Exception{
		if(loginModel.isLogin(lusername.getText(),lpassword.getText())) {
			labelstatus.setText("Login Success");
			//((Node)event.getSource()).getScene().getWindow().hide();
			Stage primaryStage = new Stage();
			Parent rootnode = FXMLLoader.load(getClass().getResource("/application/Welcome.fxml"));
			Scene scene = new Scene(rootnode);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("JavaFx Application");
			primaryStage.show();
		} else if(lusername.getText().equals("") && lpassword.getText().equals("")) {
			labelstatus.setText("Please Enter Login Credentials");
		}else {
			labelstatus.setText("Login Failed");
		}
	}
//****************************************************************************************************************************************//
//******************************************WELCOME.SIGN.OUT*******************************************************************************//
	public void usersignout(ActionEvent event) throws Exception {
		((Node)event.getSource()).getScene().getWindow().hide();
		Stage primaryStage = new Stage();
		Parent rootnode = FXMLLoader.load(getClass().getResource("/application/Login.fxml"));
		Scene scene = new Scene(rootnode);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("JavaFx Application");
		primaryStage.show();
	}
//**************************************************************************************************************************************//
//**************************************COMBO BOX CONFIGURATION***************************************************************************//
		/*@FXML public ComboBox<String> combobox;
		ObservableList<String> list = FXCollections.observableArrayList("What was your First book?",
																		"What's your Wife DOB?",
																		"What was your First Pet?",
																		"Who was your first Love?");
		public void initialize(URL location, ResourceBundle resources) {
			combobox.setItems(list);
		}*/
//*****************************************************************************************************************************************//

	
	
	
	
	
	
	
//*****************************************************************************************************************************************//
}