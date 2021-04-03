package com.app.pojos;
//ADDR_ID	E_ID	House	street	city	PIN	addr_type

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "cust_addr")
public class CustomerAddress {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer addrId;

	// private int custId;
	@Column(name = "cust_house")
	private String custHouse;
	@Column(name = "cust_street")
	private String custStreet;
	@Column(name = "cust_city")
	private String custcity;
	@Column(name = "cust_pin")
	private String custPin;
	@ManyToOne(optional = false)
	@JoinColumn(name = "custId", nullable = false) // to specify name of FK column n adds NOT NULL constraint
	private Customers customer;
	@Enumerated(EnumType.STRING)
	private AddrType custAddrType;

	public CustomerAddress() {
		System.out.println("in ctor of " + getClass().getName());
	}

	public CustomerAddress(String custHouse, String custStreet, String custcity, String custPin) {
		super();
		this.custHouse = custHouse;
		this.custStreet = custStreet;
		this.custcity = custcity;
		this.custPin = custPin;
	}

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
		return "CustomerAddress [addrId=" + addrId + ", custHouse=" + custHouse + ", custStreet=" + custStreet
				+ ", custcity=" + custcity + ", custPin=" + custPin + ", customer=" + customer + ", custAddrType="
				+ custAddrType + "]";
	}

}
