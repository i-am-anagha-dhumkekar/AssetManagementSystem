package com.nissan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="userregistration")
public class UserRegistration {
	//instance variable / table column fields
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer userId;
	@Column(nullable = false)
	@Pattern(regexp = "^[a-zA-Z]{5,15}$",
    message = "FirstName must be of 5 to 15 length with no special characters")
	private String fName;
	@Column(nullable = false)
	@Pattern(regexp = "^[a-zA-Z]{5,15}$",
    message = "FirstName must be of 5 to 15 length with no special characters")
	private String lName;
	@Column(nullable = false)
	private Integer age;
	private String gender;
	private String address;
	@Column(nullable = false)
	//Validation to mobile number
	@Pattern(regexp="(^$|[0-9]{10})")
	private Long phoneNo;
	private Integer loginId;
	//Foreign Key
	@JoinColumn(name="loginId",insertable=false,updatable=false)
	@OneToOne
	private Login login;
	//default constructor
	public UserRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}
	//parameterized constructor
	public UserRegistration(Integer userId, String fName, String lName, Integer age, String gender, String address,
			Long phoneNo, Integer loginId, Login login) {
		super();
		this.userId = userId;
		this.fName = fName;
		this.lName = lName;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.phoneNo = phoneNo;
		this.loginId = loginId;
		this.login = login;
	}
	//getters and setters
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Integer getLoginId() {
		return loginId;
	}
	public void setLoginId(Integer loginId) {
		this.loginId = loginId;
	}
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	//To string
	@Override
	public String toString() {
		return "UserRegistration [userId=" + userId + ", fName=" + fName + ", lName=" + lName + ", age=" + age
				+ ", gender=" + gender + ", address=" + address + ", phoneNo=" + phoneNo + ", loginId=" + loginId
				+ ", login=" + login + "]";
	}
	
	
	
}
