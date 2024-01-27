package com.semanticsquare.thrillio.controllers;

import java.util.ArrayList;

import com.semanticsquare.thrillio.entities.User;
import com.semanticsquare.thrillio.service.UserService;

public class UserController {
	
	/* Starts here */
	private static UserController userController = new UserController();
	private UserController() {}
	public static UserController getInstanceUserController() {
		return userController;
	}
	/* Ends here */
	
	public User createNewUser(ArrayList<String> userData) {
		User user = UserService.getInstanceUserService().createUser(userData);
		return user;
	}
	
	public User verifyUserAuthStatus(String email, String password) {
		User user = UserService.getInstanceUserService().userExistanceStatus(email, password);
		return user;
	}
}
