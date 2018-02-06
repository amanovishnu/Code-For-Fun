import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
public class button extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	public void start(Stage primaryStage) {
		Button btn = new Button("Click Me");
		StackPane rootnode = new StackPane();
		rootnode.getChildren().add(btn);
		Scene myscene = new Scene(rootnode,250,250);
		primaryStage.setTitle("JavaFxButton");
		primaryStage.setScene(myscene);
		primaryStage.show();
	}
}