package com.nissan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name="login")
public class Login {
	//instance variable / table fields generation
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer loginId;
	@Column(nullable = false)
	@Pattern(regexp = "^[a-zA-Z0-9]{5,15}$",
    message = "username must be of 5 to 15 length with no special characters")
	private String userName;
	
	@Column(nullable = false)
	@Size(min = 6,max= 15, message = "password must be between 6 to 15" )
	private String password;
	
	@Column(nullable = false)
	private String userType;
	//default constructor
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	//parameterized constructor
	public Login(Integer loginId, String userName, String password, String userType) {
		super();
		this.loginId = loginId;
		this.userName = userName;
		this.password = password;
		this.userType = userType;
	}
	//getters and setters
	public Integer getLoginId() {
		return loginId;
	}
	public void setLoginId(Integer loginId) {
		this.loginId = loginId;
	}
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
	//to String
	@Override
	public String toString() {
		return "Login [loginId=" + loginId + ", userName=" + userName + ", password=" + password + ", userType="
				+ userType + "]";
	}
	

}
