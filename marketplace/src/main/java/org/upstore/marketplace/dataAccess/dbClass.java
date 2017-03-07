package org.upstore.marketplace.dataAccess;

import java.util.HashMap;
import java.util.Map;

import org.upstore.marketplace.model.Store;

public class dbClass {
	
	private static Map<Long,Store> stores =  new HashMap<>();
	
	public static Map <Long,Store> getStores(){
		return stores;
	}

}
