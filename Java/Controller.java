package application;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
public class MainController /*implements Initializable*/{
	@FXML
	private Hyperlink lostuser;
	@FXML
	private Hyperlink newuser;
	@FXML
	private Hyperlink userback;
	@FXML
	private Label statuslabel;
	@FXML
	private TextField username;
	@FXML
	private TextField password;
	@FXML
	/*public ComboBox<String> combobox;
	ObservableList<String> list = FXCollections.observableArrayList("What's your Petname?","What is your Anniversary Date ?","When is your Wife's DOB?");
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		combobox.setItems(list);	
	}*/
	public void Login(ActionEvent event) throws Exception{
		if(username.getText().equals("user")&&password.getText().equals("pass")) {
			statuslabel.setText("Login Success");
			Stage primaryStage = new Stage();
			Parent rootnode = FXMLLoader.load(getClass().getResource("/application/Welcome.fxml"));
			Scene scene = new Scene(rootnode);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("JavaFx Application");
			primaryStage.show();
		} else {
			statuslabel.setText("Login Failed");
		}
	}
	
	public void newuser(ActionEvent event) throws Exception {
	newuser.setOnAction(new EventHandler<ActionEvent>()  {
		@Override
		public void handle(ActionEvent e)  {
			Stage primaryStage = new Stage();
			Parent rootnode = null;
			try {
				rootnode = FXMLLoader.load(getClass().getResource("/application/register.fxml"));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			Scene scene = new Scene(rootnode);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("JavaFx Application");
			primaryStage.show();
			}
		});	
	}
	
	public void lostuser(ActionEvent event) throws Exception {
		lostuser.setOnAction(new EventHandler<ActionEvent>()  {
			@Override
			public void handle(ActionEvent e)  {
				Stage primaryStage = new Stage();
				Parent rootnode = null;
				try {
					rootnode = FXMLLoader.load(getClass().getResource("/application/Forget.fxml"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Scene scene = new Scene(rootnode);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setScene(scene);
				primaryStage.setTitle("JavaFx Application");
				primaryStage.show();
				}
			});	
		}
	/*public void userback(ActionEvent event) throws Exception {
		userback.setOnAction(new EventHandler<ActionEvent>()  {
			@Override
			public void handle(ActionEvent e)  {
				Stage primaryStage = new Stage();
				Parent rootnode = null;
				try {
					rootnode = FXMLLoader.load(getClass().getResource("/application/Login.fxml"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Scene scene = new Scene(rootnode);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setScene(scene);
				primaryStage.setTitle("JavaFx Application");
				primaryStage.show();
				}
			});	
		}*/
	
}