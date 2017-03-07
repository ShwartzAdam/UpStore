package org.upstore.marketplace.dataAccess;

import java.net.UnknownHostException;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.ServerAddress;

import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;

import org.bson.Document;
import java.util.Arrays;
import com.mongodb.Block;

import com.mongodb.client.MongoCursor;
import static com.mongodb.client.model.Filters.*;
import com.mongodb.client.result.DeleteResult;
import static com.mongodb.client.model.Updates.*;
import com.mongodb.client.result.UpdateResult;
import java.util.ArrayList;
import java.util.List;

public class demoDBMongo {

	public static void main(String[] args) {
		
		MongoClientURI uri  = new MongoClientURI("mongodb://admin:password@ds157509.mlab.com:57509/upstoredb"); 
		MongoClient client = new MongoClient(uri);
		MongoDatabase db = client.getDatabase(uri.getDatabase());
		
		MongoCollection<Document> stores = db.getCollection("Store");
		
		MongoCursor<Document> cursor = stores.find().iterator();
		
		 try {
	            while (cursor.hasNext()) {
	                Document doc = cursor.next();
	                System.out.println(
	                    " " + doc.get("storeName") + ", " + doc.get("storeDesc")
	                );
	            }
	        } finally {
	            cursor.close();
	        }
	}

}
