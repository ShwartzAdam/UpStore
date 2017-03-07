package org.upstore.marketplace.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Tasks {

	private long consumerId;
	private long providerId;
	private long orderId;
	private String review;
	private String Status; // enum if much better
	
	public Tasks(){}

	public Tasks(long consumerId, long providerId, long orderId, String review, String status) {
		super();
		this.consumerId = consumerId;
		this.providerId = providerId;
		this.orderId = orderId;
		this.review = review;
		Status = status;
	}

	public long getConsumerId() {
		return consumerId;
	}

	public void setConsumerId(long consumerId) {
		this.consumerId = consumerId;
	}

	public long getProviderId() {
		return providerId;
	}

	public void setProviderId(long providerId) {
		this.providerId = providerId;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}
	
	
}
