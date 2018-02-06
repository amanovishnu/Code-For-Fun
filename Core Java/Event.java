package application;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;
public class Main extends Application {
	Label response;
	public static void main(String[] args) {
		launch(args);	
	}
	public void start(Stage primaryStage) {
		Button Alpha = new Button("Alpha");
		Button Beta = new Button("Beta");
		response = new Label("Push a Button");
		FlowPane rootnode = new FlowPane(10,10);
		rootnode.setAlignment(Pos.CENTER);
		rootnode.getChildren().addAll(Alpha,response,Beta);
		Scene myscene = new Scene(rootnode,300,300);
		primaryStage.setScene(myscene);
		primaryStage.setTitle("JavaFxEvents");
		
		Alpha.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
				response.setText("Alpha Was Pressed");
			}
		});
		Beta.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
				response.setText("Beta Was Pressed");
			}
		});
		primaryStage.show();
	}
}
