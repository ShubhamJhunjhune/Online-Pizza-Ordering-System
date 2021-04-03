package com.app.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginRequest {
	@JsonProperty(value = "custId")
	private String customerId;
	private String password;
	public LoginRequest() {
		// TODO Auto-generated constructor stub
	}
	public LoginRequest(String customerId, String password) {
		super();
		this.customerId = customerId;
		this.password = password;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginRequest [customerId=" + customerId + ", password=" + password + "]";
	}
	
}
