import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
public class JavaFxSke1 extends Application {
	public static void main(String[] args) {
		System.out.println("JavaFx Application");
		launch(args);
	}
	public void init() {
		System.out.println("Inside Init() Method");
	}
	public void start(Stage primaryStage) {
		System.out.println("Inside Start() Method");
		primaryStage.setTitle("JavaFx Application");
		VBox rootnode = new VBox();
		Scene myscene = new Scene(rootnode,300,300);
		Button btn = new Button("Click me");
		Label mylabel = new Label("MyFirstLabel");
		rootnode .getChildren() .add(btn);
		rootnode .getChildren() .add(mylabel);
		primaryStage.setScene(myscene);
		primaryStage.show();
	}
	public void stop() {
		System.out.println("Inside Stop Method");
	}
}