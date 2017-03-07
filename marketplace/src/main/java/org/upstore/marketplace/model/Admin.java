package org.upstore.marketplace.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Admin {

	private String adminName;
	private long adminID;
	private String email;
	private String storeName; // incase the admin have only one store
	
	public Admin(){}
	
	public Admin(String adminName, long adminID, String email, String storeName) {
		super();
		this.adminName = adminName;
		this.adminID = adminID;
		this.email = email;
		this.storeName = storeName;
	}

	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public long getAdminID() {
		return adminID;
	}
	public void setAdminID(long adminID) {
		this.adminID = adminID;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	
	
}
