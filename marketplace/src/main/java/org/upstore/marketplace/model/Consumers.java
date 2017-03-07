package org.upstore.marketplace.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Consumers {
	
	private String consumerName;
	private long consumerId;
	private String consumerEmail;
	private String consumerAddress;
	
	public Consumers(){}
	
	public Consumers(String consumerName, long consumerId, String consumerEmail, String consumerAddress) {
		super();
		this.consumerName = consumerName;
		this.consumerId = consumerId;
		this.consumerEmail = consumerEmail;
		this.consumerAddress = consumerAddress;
	}

	public String getConsumerName() {
		return consumerName;
	}

	public void setConsumerName(String consumerName) {
		this.consumerName = consumerName;
	}

	public long getConsumerId() {
		return consumerId;
	}

	public void setConsumerId(long consumerId) {
		this.consumerId = consumerId;
	}

	public String getConsumerEmail() {
		return consumerEmail;
	}

	public void setConsumerEmail(String consumerEmail) {
		this.consumerEmail = consumerEmail;
	}

	public String getConsumerAddress() {
		return consumerAddress;
	}

	public void setConsumerAddress(String consumerAddress) {
		this.consumerAddress = consumerAddress;
	}


	

}
