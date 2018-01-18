package application;
import java.awt.Label;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
public class loginController implements Initializable {
	public loginModel loginModel = new loginModel();
	@FXML
	private Label isConnected;
	@Override
	public void initialize(URL location,ResourceBundle resources) {
		//TODO Auto-generated method stub
		if (loginModel.isDbConnected()) {
			isConnected.setText("Connected");
		} else {
			isConnected.setText("Not Connected");
		}
	}
}
