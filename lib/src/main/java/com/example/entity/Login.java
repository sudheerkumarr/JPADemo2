package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Login {
	
	// Fields
	@Id
	private String email;
	
	private String password;
	
	private String role;
	
	private boolean isLogin;
	
	
	// Constructors
	public Login() {}
	public Login(String email, String password, String role) {
		super();
		this.email = email;
		this.password = password;
		this.role = role;
	}
	
	
	public Login(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	
	// Getters/Setters
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public boolean isLogin() {
		return isLogin;
	}
	public void setLogin(boolean isLogin) {
		this.isLogin = isLogin;
	}
	
	@Override
	public String toString() {
		return "Login [email=" + email + ", password=" + password + ", role=" + role + ", isLogin=" + isLogin + "]";
	}
	
}
