import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
public class HelloWorld extends Application {
	public static void main(String[] args) {
		System.out.println("JavaFx phase1");
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		Button btn = new Button("Out me");
		btn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("Task Acheived");
			}
		});
		StackPane root= new StackPane();
		root.getChildren().add(btn);
		Scene scene = new Scene (btn,300,300);
		arg0.setScene(scene);
		arg0.show();
	}
}