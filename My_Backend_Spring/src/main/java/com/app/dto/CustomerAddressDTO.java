package com.app.dto;

import com.app.pojos.AddrType;
import com.app.pojos.Customers;

public class CustomerAddressDTO {
	
	private Integer addrId;
	private String custHouse;
	private String custStreet;
	private String custcity;
	private String custPin;
	private Customers customer;
	private AddrType custAddrType;
	
	
	
	public Integer getAddrId() {
		return addrId;
	}



	public void setAddrId(Integer addrId) {
		this.addrId = addrId;
	}



	public String getCustHouse() {
		return custHouse;
	}



	public void setCustHouse(String custHouse) {
		this.custHouse = custHouse;
	}



	public String getCustStreet() {
		return custStreet;
	}



	public void setCustStreet(String custStreet) {
		this.custStreet = custStreet;
	}



	public String getCustcity() {
		return custcity;
	}



	public void setCustcity(String custcity) {
		this.custcity = custcity;
	}



	public String getCustPin() {
		return custPin;
	}



	public void setCustPin(String custPin) {
		this.custPin = custPin;
	}



	public Customers getCustomer() {
		return customer;
	}



	public void setCustomer(Customers customer) {
		this.customer = customer;
	}



	public AddrType getCustAddrType() {
		return custAddrType;
	}



	public void setCustAddrType(AddrType custAddrType) {
		this.custAddrType = custAddrType;
	}



	@Override
	public String toString() {
		return "CustomerAddressDTO [addrId=" + addrId + ", custHouse=" + custHouse + ", custStreet=" + custStreet
				+ ", custcity=" + custcity + ", custPin=" + custPin + /*", customer=" + customer +*/ ", custAddrType="
				+ custAddrType + "]";
	}
}
