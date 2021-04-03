package com.app.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginRequest_emp {
	@JsonProperty(value = "empEmail")
	private String employeeEmail;
	private String password;
	public LoginRequest_emp() {
		// TODO Auto-generated constructor stub
	}
	public LoginRequest_emp(String employeeEmail, String password) {
		super();
		this.employeeEmail = employeeEmail;
		this.password = password;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginRequest_emp [employeeEmail=" + employeeEmail + ", password=" + password + "]";
	}
	
}
