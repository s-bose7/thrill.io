package com.semanticsquare.thrillio;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import com.semanticsquare.thrillio.controllers.BookmarkController;
import com.semanticsquare.thrillio.controllers.UserController;
import com.semanticsquare.thrillio.entities.Bookmark;
import com.semanticsquare.thrillio.entities.User;


public class View {
	/* STARTS HERE */
	private static View instanceView = new View();
	private static Scanner scanner = new Scanner(System.in);
	private View() {}
	public static Scanner getIOScanner() { return scanner; }
	public static View getInstanceView() { return instanceView; }
	/*ENDS HERE*/
	
	/* User session tracker */
	private boolean userLoggedIn = false;
	private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	
	public User createNewUser() throws IOException {
		System.out.println("\nEnter user details: ");
		
		String userEmail = readString("signup email");
		String firstName = readString("first name");
		String lastName = readString("last name");
		String userPassword = readString("password");
		String userGender = readString("gender");
		String userType = readString("user type");
		
		ArrayList<String> userDataArrayList = new ArrayList<>();
		userDataArrayList.add(userEmail);
		userDataArrayList.add(userPassword);
		userDataArrayList.add(firstName);
		userDataArrayList.add(lastName);
		userDataArrayList.add(userGender);
		userDataArrayList.add(userType);
		User user =	UserController.getInstanceUserController().createNewUser(userDataArrayList);
		return user;
	}
	
	public void signUp() throws IOException {
		User user = createNewUser();
		this.userLoggedIn = true;
		homeThrillio(user);
	}
	
	private User userVerificationStatus(String userEmail, String userPassword) {
		return UserController.getInstanceUserController().verifyUserAuthStatus(userEmail, userPassword);
	}
	
	private String readString(String arg) throws IOException {
	    System.out.print("Enter "+arg+" >>> ");
	    return reader.readLine();
	}
	
	public void logIn() throws IOException {
		String userEmail = readString("login email");
		String userPassword = readString("password");
		User user = userVerificationStatus(userEmail, userPassword);
		if(user == null) {
			System.out.println("Either wrong password or user doesn't exist..\n In that case kindly register");
			return;
		}
		this.userLoggedIn = true;
		homeThrillio(user);
	}
	
	private void logoutCurrentSession() {
		this.userLoggedIn = false;
		System.out.println("\nLogging out... ..done\nBye");
	}
	
	
	private void showAllBookmarks(User user) {
		ArrayList<Bookmark> userBookMarks = BookmarkController.getUserBookMarks(user);
		System.out.println("\n"+user.getFirstName()+" bookmarks...("+userBookMarks.size()+")");
		for(Bookmark bookMark : userBookMarks) {
			System.out.println("bookMark type: "+ bookMark.getType() +" bookMark url: "+bookMark.getUrl());
		}
	}
	
	private void showMyAccountOptions(User user) {
	}
	
	private void createNewBookmark(User user) throws IOException {
		String bookmarkTypeString = readString("bookmark type");
		String profileUrlString = readString("url");
		BookmarkController.createBookMark(user, bookmarkTypeString, profileUrlString);
	}
	
	private void markBookmarkAsKidFriendly(User user) {
		
	}
	
	public void homeThrillio(User sessionUser) throws IOException {
		/* Home page */
		while (this.userLoggedIn) {
	        /* (ON_PRESS_KEY) */
	        System.out.println("\n1. My account info");
	        /* (ON_PRESS_KEY) */
	        System.out.println("2. Create a new bookmark");
	        /* (ON_PRESS_KEY) (Authorization required) */
	        System.out.println("3. Mark a bookmark as Favourite");
	        /* (ON_PRESS_KEY) */
	        System.out.println("4. Logout\n");
	        
	        /* (DEFAULT)  */
	        showAllBookmarks(sessionUser);

	        System.out.print("\nEnter choice here>>> ");
	        int userChoice = scanner.nextInt();
	        scanner.nextLine();
	        switch (userChoice) {
	            case 1:
	                showMyAccountOptions(sessionUser);
	                break;
	            case 2:
	                createNewBookmark(sessionUser);
	                break;
	            case 3:
	                 markBookmarkAsKidFriendly(sessionUser);
	                break;
	            default:
	                logoutCurrentSession();
	                break;
	        }
	    }
	}

}
