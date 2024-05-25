package com.springBoot.api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	@Column(name = "user_name")
	private String userName;
	@Column(name = "user_phone_number")
	private String userPhoneNumber;
	@Column(name = "user_location")
	private String userLocation;
	
	public User() {
		
	}
	
	public User(String userName, String userPhoneNumber, String userLocation) {
		super();
		this.userName = userName;
		this.userPhoneNumber = userPhoneNumber;
		this.userLocation = userLocation;
	}

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPhoneNumber() {
		return userPhoneNumber;
	}
	public void setUserPhoneNumber(String userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}
	public String getUserLocation() {
		return userLocation;
	}
	public void setUserLocation(String userLocation) {
		this.userLocation = userLocation;
	}

	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPhoneNumber=" + userPhoneNumber
				+ ", userLocation=" + userLocation + "]";
	}
	
	

}
