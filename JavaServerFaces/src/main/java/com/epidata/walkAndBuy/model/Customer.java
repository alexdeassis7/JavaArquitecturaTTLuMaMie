package com.epidata.walkAndBuy.model;

import java.util.Date;

//VO Value Object : Representa a una entidad de nuestra dabse de datos 
public class Customer{
	
	public long customerId;
	public String name;
	public String address;
	public Date createdDate;
	
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
}