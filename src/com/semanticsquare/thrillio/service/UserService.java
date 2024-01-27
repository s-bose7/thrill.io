package com.semanticsquare.thrillio.service;


import java.util.ArrayList;

import com.semanticsquare.thrillio.dao.UserDao;
import com.semanticsquare.thrillio.entities.User;

public class UserService {
	
	private static UserDao userDao = new UserDao();
	
	/* Singleton pattern */
	private static UserService instanceUserService = new UserService();
	private UserService() {}
	public static UserService getInstanceUserService() {
		return instanceUserService;
	}
	/*Ends here*/
	
	public User createUser(ArrayList<String> userData) {
		User newUser = new User();
		newUser.setEmail(userData.get(0));
		newUser.setPassword(userData.get(1));
		newUser.setUserName(userData.get(2));
		newUser.setGenderString(userData.get(3));
		newUser.setUserTypeString(userData.get(4));
		userDao.addUserToDB(newUser);
		return newUser;
	}
	
	public User userExistanceStatus(String email, String password) {
		User user = userDao.checkWhetherUserExist(email, password);
		return user;
	}
	
	
	public ArrayList<User> getAllUsers() {
		return userDao.getAlluser();
	}
	
}
