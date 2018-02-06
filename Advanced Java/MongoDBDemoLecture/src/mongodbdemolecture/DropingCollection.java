/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mongodbdemolecture;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;

/**
 *
 * @author vikas
 */
public class DropingCollection {

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

        // Creating a collection 
        System.out.println("Collections created successfully");

        // Retieving a collection
        MongoCollection<Document> collection = database.getCollection("sampleCollection");

        // Dropping a Collection 
        collection.drop();
        System.out.println("Collection dropped successfully");
    }
}
