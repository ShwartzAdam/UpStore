package org.upstore.marketplace.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Store {
	
	private String _id;
	private String storeName;
	private String storeDesc;
	
	public Store( String storeName, String storeDesc, String _id) {
		this._id = _id;
		this.storeName = storeName;
		this.storeDesc = storeDesc;
	}

	public Store(){}
	
	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getStoreDesc() {
		return storeDesc;
	}
	public void setStoreDesc(String storeDesc) {
		this.storeDesc = storeDesc;
	}


}
