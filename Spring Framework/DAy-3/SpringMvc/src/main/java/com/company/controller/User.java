package com.company.controller;


public class User {
  private String userName;
  private String email;
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(String userName, String email) {
	super();
	this.userName = userName;
	this.email = email;
}
@Override
public String toString() {
	return "User [userName=" + userName + ", email=" + email + "]";
}
  
  
}
