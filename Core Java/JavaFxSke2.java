import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
public class JavaFxSke2 extends Application {
	public static void main(String[] args) {
		System.out.println("JavaFxSke2 File");
		launch(args);
	}
	public void init () {
		System.out.println("Inside The Init() Method");
	}
	public void start (Stage primaryStage) {
		System.out.println("Inside Start Method");
		primaryStage.setTitle("JavaFx Application");
		VBox rootnode = new VBox();
		Button btn = new Button("Click Me");
		Label mylabel = new Label ("This is Fucking JavaFx");
		Scene myscene = new Scene(rootnode,300,300);
		rootnode.getChildren().add(btn);
		rootnode.getChildren().add(mylabel);
		primaryStage.setScene(myscene);
		primaryStage.show();
	}
	public void stop() {
		System.out.println("Inside Stop Method");
	}
}