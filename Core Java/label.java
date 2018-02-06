import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Label;
public class label extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	public void start(Stage primaryStage) {
		Label mylabel = new Label("JavaFxScript Application");
		StackPane rootnode = new StackPane();
		rootnode.getChildren().add(mylabel);
		Scene myscene = new Scene(rootnode,250,250);
		primaryStage.setTitle("JavaFxButton");
		primaryStage.setScene(myscene);
		primaryStage.show();
	}
}