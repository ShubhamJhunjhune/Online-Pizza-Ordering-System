package com.app.pojos;

import javax.persistence.*;
@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "u_email")
	private String userEmail;
	@Column(name = "u_pass")
	private String password;
	@Column(name = "u_role")
	@Enumerated(EnumType.STRING)
	private UserRole role;

	public User() {
		System.out.println("in ctor of " + getClass().getName());
	}

	public User(String userEmail, String password, UserRole role) {
		super();
		this.userEmail = userEmail;
		this.password = password;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public UserRole getRole() {
		return role;
	}

	public void setRole(UserRole role) {
		this.role = role;
	}

}
