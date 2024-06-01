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
	
	private User createNewUserInstance(ArrayList<String> userData) {
		User newUser = new User();
		newUser.setEmail(userData.get(0));
		newUser.setPassword(userData.get(1));
		newUser.setFirstName(userData.get(2));
		newUser.setLastName(userData.get(3));
		newUser.setGenderId(1);
		newUser.setUserTypeId(1);
		return newUser;
	}
	
	public User createUser(ArrayList<String> userData) {
		User newUser = createNewUserInstance(userData);
		userDao.insertUser(newUser);
		return newUser;
	}
	
	public User userExistanceStatus(String email, String password) {
		return userDao.findUserByEmailAndPassword(email, password);
	}
	
	
	public ArrayList<User> getAllUsers() {
		return userDao.getAlluser();
	}
	
}
