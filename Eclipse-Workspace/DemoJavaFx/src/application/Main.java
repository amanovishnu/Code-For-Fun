package application;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
public class Main extends Application {
	public static void main(String[] args) {
		System.out.println("Hello World in the Main Application");
		launch(args);
	}
	@Override
	public void init() {
		System.out.println("Inside the Init Method");
	}
	@Override
	public void start(Stage primaryStage) {
		System.out.println("Inside the Start Method");
		Button btn = new Button("Click Me");
		Label lbl = new Label("This is Sparta");
		StackPane rootnode = new StackPane();
		rootnode.getChildren().add(lbl);
		rootnode.getChildren().add(btn);
		//Scene myscene = new Scene(rootnode,300,300);
		primaryStage.setTitle("JavaFX Skeleton");
		primaryStage.setScene(new Scene(rootnode,300,300));
		primaryStage.show();
	}
	@Override
	public void stop() {
		System.out.println("Inside Stop Method");
	}

}
