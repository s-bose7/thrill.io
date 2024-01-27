package com.semanticsquare.thrillio.entities;

public class User {

	private long userId;
	private String userName;
	private String email;
	private String password;
	private String userTypeString;
	private String genderString;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserTypeString() {
		return userTypeString;
	}

	public void setUserTypeString(String userTypeString) {
		this.userTypeString = userTypeString;
	}

	public String getGenderString() {
		return genderString;
	}

	public void setGenderString(String genderString) {
		this.genderString = genderString;
	}

}
