package com.semanticsquare.thrillio.dao;

import java.util.ArrayList;

import com.semanticsquare.thrillio.Database;
import com.semanticsquare.thrillio.entities.User;

public class UserDao {
	
	private Database postgresqlDatabase = new Database();
	
	public ArrayList<User> getAlluser() {
		return postgresqlDatabase.getUsers();
	}
	
	public User checkWhetherUserExist(String email, String password) {
		User user = postgresqlDatabase.searchForUser(email, password);
		return user;
	}
	
	public void addUserToDB(User user) {
		postgresqlDatabase.setUser(user);
	}
	
}
