/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mongodbdemolecture;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

import java.util.Iterator;
import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;

/**
 *
 * @author vikas
 */
public class DeletingDocuments {

    public static void execute() {

        // Creating a Mongo client 
        MongoClient mongo = new MongoClient("localhost", 27017);

        // Creating Credentials 
//        MongoCredential credential;
//        credential = MongoCredential.createCredential("sampleUser", "myDb",
//                "password".toCharArray());
        System.out.println("Connected to the database successfully");

        // Accessing the database 
        MongoDatabase database = mongo.getDatabase("myDb");

        // Retrieving a collection
        MongoCollection<Document> collection = database.getCollection("sampleCollection");
        System.out.println("Collection sampleCollection selected successfully");

        // Deleting the documents 
        collection.deleteOne(Filters.eq("id", 1));
        System.out.println("Document deleted successfully...");

        // Retrieving the documents after updation 
        // Getting the iterable object 
        FindIterable<Document> iterDoc = collection.find();
        int i = 1;

        // Getting the iterator 
        Iterator it = iterDoc.iterator();

        while (it.hasNext()) {
            System.out.println("Inserted Document: " + i);
            System.out.println(it.next());
            i++;
        }
    }
}
