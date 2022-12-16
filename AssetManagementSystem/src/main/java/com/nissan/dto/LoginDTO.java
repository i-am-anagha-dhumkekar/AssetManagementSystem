package com.nissan.dto;

import javax.validation.constraints.Pattern;

public class LoginDTO {
	//map multiple fields of different object in one single objects
	private String userName;
	private String password;
	private String userType;
	//getters and setters
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	
}
