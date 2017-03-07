package org.upstore.marketplace.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Services {

	private String serviceName;
	private long serviceId;
	private String serviceDesc;
	private double servicePrice;
	private String images;
	private String videos;
	
	public Services(){}

	public Services(String serviceName, long serviceId, String serviceDesc, double servicePrice, String images,
			String videos) {
		super();
		this.serviceName = serviceName;
		this.serviceId = serviceId;
		this.serviceDesc = serviceDesc;
		this.servicePrice = servicePrice;
		this.images = images;
		this.videos = videos;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public long getServiceId() {
		return serviceId;
	}

	public void setServiceId(long serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceDesc() {
		return serviceDesc;
	}

	public void setServiceDesc(String serviceDesc) {
		this.serviceDesc = serviceDesc;
	}

	public double getServicePrice() {
		return servicePrice;
	}

	public void setServicePrice(double servicePrice) {
		this.servicePrice = servicePrice;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public String getVideos() {
		return videos;
	}

	public void setVideos(String videos) {
		this.videos = videos;
	}
	
	
}
