package com.app.dto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.List;

import com.app.pojos.CustomerAddress;
import com.app.pojos.CustomerStatus;

public class CustomerDTO {
	private int custId;
	private String custEmail;
	private String custPass;
	private String custName;
	private String custMobile;
	@JsonIgnore
	private List<CustomerAddress> custAddr = new ArrayList<>();
	private CustomerStatus custStatus;
	private String custImg;
	private String role;
	
	public CustomerDTO() {
	}
	
	public CustomerDTO(int custId, String custEmail, String custPass, String custName, String custMobile,
			List<CustomerAddress> custAddr, CustomerStatus custStatus, String custImg,String role) {
		this.custId = custId;
		this.custEmail = custEmail;
		this.custPass = custPass;
		this.custName = custName;
		this.custMobile = custMobile;
		this.custAddr = custAddr;
		this.custStatus = custStatus;
		this.custImg = custImg;
		this.role =role;
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
		return "Customerdto [custId=" + custId + ", custEmail=" + custEmail + ", custPass=" + custPass + ", custName="
				+ custName + ", custMobile=" + custMobile + /*", custAddr=" + custAddr +*/ ", custStatus=" + custStatus
				+ ", custImg=" + custImg + ", Role="+role+"]";
	}
	
}
