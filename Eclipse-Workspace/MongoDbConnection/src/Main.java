import java.util.List;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
//import com.mongodb.client.MongoDatabase;
public class Main {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		MongoClient connection = new MongoClient("localhost",27017);
		System.out.println("Server Status: connectioned");
		
		DB database = connection.getDB("mano");
		System.out.println("DataBase Status: connectioned");
		System.out.println("Selected Database: "+database.getName());
		
		List<String>databasenames = connection.getDatabaseNames();
		System.out.println("Database Names: "+databasenames);
		
		/*connection.dropDatabase("DemoDataBase");
		databasenames = connection.getDatabaseNames();
		System.out.println("Database Names: "+databasenames);*/
		
		DBCollection collection = database.getCollection("employee");
		System.out.println("Collection Created Successfully");
	}
}
