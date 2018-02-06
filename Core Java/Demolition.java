import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
public class Demolition extends Application {
	public static void main(String[] args) {
		System.out.println("Inside the Main Method");
		launch(args);
	}
	public void init() {
		System.out.println("Inside the Init() Method");
	}
	public void start(Stage primaryStage) {
		System.out.println("Inside the Start() Method");
		primaryStage.setTitle("JavaFX Skeleton Application");
		GridPane rootnode = new GridPane();
		Scene myScene = new Scene(rootnode,300,400);
		primaryStage.setScene(myScene);
		primaryStage.show();
	}
	public void stop() {
		System.out.println("Inside the Stop Method");
	}
}