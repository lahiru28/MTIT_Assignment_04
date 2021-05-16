package com.sliit.mtit.microservice.orderservice.dto;

public class OrderRequest {

	private String fullName;
	private String age;
	private String orderType;
	private String orderDetaild;
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getOrderDetaild() {
		return orderDetaild;
	}
	public void setOrderDetaild(String orderDetaild) {
		this.orderDetaild = orderDetaild;
	}
	@Override
	public String toString() {
		return "OrderRequest [fullName=" + fullName + ","
				+ " age=" + age + ","
				+ " orderType=" + orderType + ","
				+ " orderDetaild="+ orderDetaild + "]";
	}
	
	
	
}
