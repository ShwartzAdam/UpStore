package org.upstore.marketplace.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Orders {

	private long consumerId;
	private long serviceId;
	private long orderId;
	
	public Orders(){}
	
	public Orders(long consumerId, long serviceId, long orderId) {
		super();
		this.consumerId = consumerId;
		this.serviceId = serviceId;
		this.orderId = orderId;
	}

	public long getConsumerId() {
		return consumerId;
	}

	public void setConsumerId(long consumerId) {
		this.consumerId = consumerId;
	}

	public long getServiceId() {
		return serviceId;
	}

	public void setServiceId(long serviceId) {
		this.serviceId = serviceId;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	
	
}
