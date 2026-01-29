package com.bean;

import java.util.Objects;

//POJO Bean 
public class User {
	String userName;
	String password;
	
	public User(String userName, String password) { //parameterized constructor
		super();
		this.userName = userName;
		this.password = password;
	}

	
	public User() { // Default Constructor
		super();
		
	}

	// Public Setters And Getters

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

//toString method
	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + "]";
	}

  //Hashcode Method 
	@Override
	public int hashCode() {
		return Objects.hash(password, userName);
	}

 //Equals Method 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(password, other.password) && Objects.equals(userName, other.userName);
	}
	
	
	
	

	
	
	
	
	
	
	

}
