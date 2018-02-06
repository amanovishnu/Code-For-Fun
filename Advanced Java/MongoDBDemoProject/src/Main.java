import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class Main {
	public static void main(String[] args) {
		
		//Connection to MongoDB server
		@SuppressWarnings("resource")
		MongoClient connection = new MongoClient("localhost",27017);
		System.out.println("Server Connection Successfull");
		
		//Connection to Database
		@SuppressWarnings("deprecation")
		DB database = connection.getDB("test");
		System.out.println("Connection to Database: test");
		
		//Connection to Database>Collections
		@SuppressWarnings("unused")
		DBCollection collection = database.getCollection("employeedata");
		System.out.println("Connected to Collection Employee Data");
		
		//Adding Data to DataBase
		/*for (int i=1; i <= 10; i++) {
	        collection.insert(new BasicDBObject().append("employeeId", i).append("employeeName", "TestEmployee_"+i));
	    }*/
		
		//Selecting all Data from Database
		/*DBCursor cursor = collection.find();
	    while(cursor.hasNext()) {
	        System.out.println(cursor.next());
	    }*/
		
		//Selecting First Document from Database
		/*DBObject dbObject = collection.findOne();
	    System.out.println(dbObject);*/
		
		//Selecting Database with Limited Feilds
		/*BasicDBObject whereQuery = new BasicDBObject();
	    whereQuery.put("employeeId", 5);
	    BasicDBObject fields = new BasicDBObject();
	    fields.put("employeeId", 1);
	    DBCursor cursor = collection.find(whereQuery, fields);
	    while (cursor.hasNext()) {
	        System.out.println(cursor.next());
	    }*/
		
		 BasicDBObject whereQuery = new BasicDBObject();
		 whereQuery.put("employeeId", 5);
		 DBCursor cursor = collection.find(whereQuery);
		 while(cursor.hasNext()) {
		 System.out.println(cursor.next());
		    }
	
	}	
}
