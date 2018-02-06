import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
public class Skeleton extends Application {
	public static void main(String[] args) {
		System.out.println("JavaFx Skeleton");
		launch(args);
	}
	@Override
	public void init() {
		System.out.println("Inside the Init Method");
	}
	@Override
	public void start(Stage primaryStage) {
		System.out.println("Inside the Start Method");
		StackPane rootnode = new StackPane();
		Scene myscene = new Scene(rootnode,300,300);
		primaryStage.setScene(myscene);
		primaryStage.setTitle("JavaFX Skeleton");
		primaryStage.show();
	}
	@Override
	public void stop() {
		System.out.println("Inside the Stop Method");
	}
}