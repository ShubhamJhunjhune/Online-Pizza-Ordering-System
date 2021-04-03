package com.app.dto;

public class UserDTO {
	private String userEmail;
	private String password;

	public UserDTO() {
		System.out.println("in ctor in " + getClass().getName());
	}

	public UserDTO(String userEmail, String password) {
		super();
		this.userEmail = userEmail;
		this.password = password;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
