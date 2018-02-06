/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mongodbdemolecture;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author vikas
 */
public class ListOfCollection {

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
        System.out.println("Collection created successfully");
        for (String name : database.listCollectionNames()) {
            System.out.println(name);
        }
    }
}
