package org.upstore.marketplace.dataAccess;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bson.Document;
import org.upstore.marketplace.model.Store;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class MongoDB {

	private static MongoClientURI uri  = new MongoClientURI("mongodb://admin:password@ds157509.mlab.com:57509/upstoredb"); 
	private static MongoClient client = new MongoClient(uri);
	private static MongoDatabase db = client.getDatabase(uri.getDatabase());
	private static MongoCollection<Document> col;
	
	public static MongoCollection<Document> getCol() {
		return col;
	}

	public MongoDB(){};
	
	public static List<Document> getDb(String dbName){
		List<Document> tmp = new ArrayList<Document>();
		col = db.getCollection(dbName);
		MongoCursor<Document> cursor = col.find().iterator();
		
		 try {
	            while (cursor.hasNext()) {
	                Document doc = cursor.next();
	                
	                tmp.add(doc);
	                
	            }
	        } finally {
	            cursor.close();
	        }
	   return tmp;
	}
}
