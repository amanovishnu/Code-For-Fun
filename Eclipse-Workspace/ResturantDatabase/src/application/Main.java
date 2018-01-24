package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;	
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		MongoClient connection = new MongoClient("localhost",27017);
		System.out.println("Connected to MongoServer");
		
		@SuppressWarnings("deprecation")
		DB database = connection.getDB("resturants");
		System.out.println("Connection to Database: Resturants");
	
		DBCollection collection = database.getCollection("customerdata");
		System.out.println("Collections Imported");
		
		BasicDBObject searchQuery = new BasicDBObject();
		searchQuery.put("borough", "Manhattan");
		BasicDBObject fields = new BasicDBObject();
	    fields.put("name",10);

		DBCursor cursor = collection.find(searchQuery,fields);

		while (cursor.hasNext()) {
			System.out.println(cursor.next());
		}

		//launch(args);
	}
}
