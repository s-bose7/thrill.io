package com.semanticsquare.thrillio.dao;

import java.util.ArrayList;

import com.semanticsquare.thrillio.entities.User;

public class UserDao {
	
	public ArrayList<User> getAlluser() {
		return new ArrayList<User>();
	}
	
	public User checkWhetherUserExist(String email, String password) {
		User user = null;
		return user;
	}
	
	public void addUserToDB(User user) {
	}
	
}
