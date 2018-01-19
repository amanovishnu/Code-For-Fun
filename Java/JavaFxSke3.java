import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
public class JavaFxSke3 extends Application {
	public static void main(String[] args) {
		System.out.println("Hello World");
		launch(args);
	}
	public void init() {
		System.out.println("Inside the Init() function");
	}
	public void start(Stage primaryStage) {
		System.out.println("Inside the Start Method");
		StackPane rootnode = new StackPane();
		Button btn = new Button ("Click Me");
		Label mylabel = new Label("This is Sparta");
		rootnode.getChildren().add(btn);
		rootnode.getChildren().add(mylabel);
		Scene myscene = new Scene(rootnode,300,500);
		primaryStage.setTitle("javaFx Skeleton");
		primaryStage.setScene(myscene);
		primaryStage.show();
	}
}