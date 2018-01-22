package application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
public class MainController2 {
/************************************************ LOGIN FORM **********************************************************/
	@FXML Label labelstatus;
	@FXML TextField username;
	@FXML TextField password;
	public void login(ActionEvent event) throws Exception{
		if(loginModel.isLogin(username.getText(),password.getText())) {
			labelstatus.setText("Login Success");
		} else {
			labelstatus.setText("Login Failed");
		}
		/*if(username.getText().equals("user") && password.getText().equals("pass")) {
			labelstatus.setText("Login Success");
			((Node)event.getSource()).getScene().getWindow().hide();
			Stage primaryStage = new Stage();
			Parent rootnode = FXMLLoader.load(getClass().getResource("/application/Final.fxml"));
			Scene scene = new Scene(rootnode);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("JavaFx Application");
			primaryStage.show();
		} else if(username.getText().equals("") && password.getText().equals("")) {
			labelstatus.setText("Please Enter Login Credentials");
		} else {
			labelstatus.setText("Login Failed");
		}*/
	}
/*******************************************************************************************************************/
/***************************************** REGISTER HERE ***********************************************************/
	@FXML Hyperlink registerhere;
	public void registeruser(ActionEvent event) throws Exception {
		((Node)event.getSource()).getScene().getWindow().hide();
		Stage primaryStage = new Stage();
		Parent rootnode = FXMLLoader.load(getClass().getResource("/application/Register.fxml"));
		Scene scene = new Scene(rootnode);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("JavaFx Application");
		primaryStage.show();
	}
/*******************************************************************************************************************/
/*************************************** FORGOT PASSWORD ***********************************************************/
	@FXML Hyperlink lostpassword;
	public void lostuser(ActionEvent event) throws Exception {
		((Node)event.getSource()).getScene().getWindow().hide();
		Stage primaryStage = new Stage();
		Parent rootnode = FXMLLoader.load(getClass().getResource("/application/Forget.fxml"));
		Scene scene = new Scene(rootnode);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("JavaFx Application");
		primaryStage.show();
	}
/*******************************************************************************************************************/
/************************************** SIGN OUT********************************************************************/
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
/********************************************************************************************************************/

}