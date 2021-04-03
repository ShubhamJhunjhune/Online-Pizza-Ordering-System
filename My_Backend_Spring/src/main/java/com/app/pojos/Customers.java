
package com.app.pojos;

import java.time.LocalDate; //C_ID email pwd name mob ADDR_ID user_status
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "customers")
public class Customers {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int custId;
	@Column(name = "cust_email", length = 25, unique = true)
	private String custEmail;
	@Column(name = "cust_pass", nullable = false)
	private String custPass;
	@Column(name = "cust_name", length = 25)
	private String custName;
	@Column(name = "cust_mob", length = 15)
	private String custMobile;
	@JsonIgnore
	@OneToMany(mappedBy = "customer",fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<CustomerAddress> custAddr = new ArrayList<>();
	@Enumerated(EnumType.STRING)
	private CustomerStatus custStatus;
	@Column(name = "cust_img")
	private String custImg;
	@Column(name = "role")
	private String role;

	public Customers() {
		System.out.println("in ctor of  " + getClass().getName());
	}

	public Customers(String custEmail, String custPass, String custName, String custMobile, String role) {
		super();
		this.custEmail = custEmail;
		this.custPass = custPass;
		this.custName = custName;
		this.custMobile = custMobile;
		this.role = role;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustEmail() {
		return custEmail;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	public String getCustPass() {
		return custPass;
	}

	public void setCustPass(String custPass) {
		this.custPass = custPass;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustMobile() {
		return custMobile;
	}

	public void setCustMobile(String custMobile) {
		this.custMobile = custMobile;
	}

	public List<CustomerAddress> getCustAddr() {
		return custAddr;
	}

	public void setCustAddr(List<CustomerAddress> custAddr) {
		this.custAddr = custAddr;
	}

	public CustomerStatus getCustStatus() {
		return custStatus;
	}

	public void setCustStatus(CustomerStatus custStatus) {
		this.custStatus = custStatus;
	}

	public String getCustImg() {
		return custImg;
	}

	public void setCustImg(String custImg) {
		this.custImg = custImg;
	}
	
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Customers [custId=" + custId + ", custEmail=" + custEmail + ", custPass=" + custPass + ", custName="
				+ custName + ", custMobile=" + custMobile + ", role=" + role + "]";
	}

}
