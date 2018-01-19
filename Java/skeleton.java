import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
public class skeleton extends Application {
	public static void main (String[] args) {
		System.out.println("JavaFx Application Skeleton");
		launch(args);
	}
	public void init() {
		System.out.println("Inside the Initialize Method Overloading it");
	}
	public void start(Stage myStage) {
		System.out.println("Inside the Start Method");
		myStage.setTitle("JavaFX Skeleton");
		FlowPane rootnode = new FlowPane();
		Scene myscene = new Scene(rootnode,300,300);
		myStage.setScene(myscene);
		myStage.show();
	}
	public void stop() {
		System.out.println("Inside the Stop Method");
	}
}