package com.semanticsquare.thrillio;

import java.util.ArrayList;

import com.semanticsquare.thrillio.entities.BookMark;
import com.semanticsquare.thrillio.entities.User;
import com.semanticsquare.thrillio.entities.UserBookmark;

public class Database {

	private ArrayList<User> users = new ArrayList<>();
	private int userIdTracker = 0;
	private int bookIdTracker = 0;
	private ArrayList<UserBookmark> userBookmarks = new ArrayList<>();
	public Database() {}
	
	
	public ArrayList<User> getUsers() {
		return users;
	}
	

	public ArrayList<UserBookmark> getUserBookmarks() {
		return userBookmarks;
	}

	
	public void setUser(User user) {
		++this.userIdTracker;
		user.setUserId(userIdTracker);
		this.users.add(user);
	}
	
	/* APP becoming state less */
	public User searchForUser(String email, String password) {
		for(User user : this.users) {
			if(user.getEmail() == email) {
				if(user.getPassword() == password) {
					return user;
				}
			}
		}
		return null;
	}


	public void setUserBookmark(UserBookmark userBookmark) {
		++this.bookIdTracker;
		userBookmark.getBookMark().setId(bookIdTracker);
		this.userBookmarks.add(userBookmark);
		System.out.println("New bookmark added for: "+userBookmark.getUser().getUserName());
	}


	public ArrayList<BookMark> getUserBookmarks(User user) {
		ArrayList<BookMark> bookMarks = new ArrayList<>();
		for(UserBookmark userBookmark : userBookmarks) {
//			if(user.getUserId() == userBookmark.getUser().getUserId()) {
//				bookMarks.add(userBookmark.getBookMark());
//			}
			bookMarks.add(userBookmark.getBookMark());
		}
		return bookMarks;
	}

}
