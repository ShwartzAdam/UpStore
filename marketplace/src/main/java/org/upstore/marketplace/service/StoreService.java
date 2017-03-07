package org.upstore.marketplace.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.bson.Document;
import org.bson.types.ObjectId;
import org.upstore.marketplace.dataAccess.MongoDB;
import org.upstore.marketplace.dataAccess.dbClass;
import org.upstore.marketplace.model.Store;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;

public class StoreService {
	
	private List<Document> store = MongoDB.getDb("Store");
	private static MongoDB dao = new MongoDB();
	
	public StoreService(){
	}

	public List<Store> getAllStores(){
		// list of document from db to list stores
		List<Store> list = new ArrayList<Store>(store.size());
		Iterator<Document> it = store.iterator();
		
		while(it.hasNext()){
			Document doc = it.next();
			
			Store st = new Store(doc.get("storeName").toString(), doc.get("storeDesc").toString(), doc.get("_id").toString() );
			list.add(st);
		}
	  return list;
	}

	public Store getStore(int id)
	{
		Document doc = store.get(id - 1);
		Store st =  new Store(doc.get("storeName").toString(), doc.get("storeDesc").toString(), doc.get("_id").toString() );
		return st;
	}
	public Store addStore(Store _store)
	{
		Integer newIndex = (store.size() + 1);
		String index = newIndex.toString();
		
		Store str = new Store();
		str.set_id(index);
		str.setStoreDesc(_store.getStoreDesc());
		str.setStoreName(_store.getStoreName());
		
		Document doc = new Document("_id", index ).append("storeDesc", _store.getStoreDesc()).append("storeName", _store.getStoreName());
		MongoDB.getCol().insertOne(doc);
		return _store;
	}
	
	/*
	public Store updateStore(Store store)
	{
		if(store.getId() <= 0){
			return null;
		}
		else{
			stores.put(store.getId(), store);
			return store;
		}
	}

	
	public Store removeStore(long id)
	{
		return stores.remove(id);
	}
		*/
	
	
}
