package org.upstore.marketplace.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Provider {
	
	
	private String providerName;
	private long providerId;
	private String providerEmail;
	private String providerLocation;
	
	public Provider(){}

	public Provider(String providerName, long providerId, String providerEmail, String providerLocation) {
		super();
		this.providerName = providerName;
		this.providerId = providerId;
		this.providerEmail = providerEmail;
		this.providerLocation = providerLocation;
	}
	
	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public long getProviderId() {
		return providerId;
	}

	public void setProviderId(long providerId) {
		this.providerId = providerId;
	}

	public String getProviderEmail() {
		return providerEmail;
	}

	public void setProviderEmail(String providerEmail) {
		this.providerEmail = providerEmail;
	}

	public String getProviderLocation() {
		return providerLocation;
	}

	public void setProviderLocation(String providerLocation) {
		this.providerLocation = providerLocation;
	}


}
