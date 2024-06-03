package com.semanticsquare.thrillio.entities;

public class UserBookmark {

	private User user;
	private Bookmark bookMark;
	
	public UserBookmark(User user, Bookmark bookMark) {
		this.user = user;
		this.bookMark = bookMark;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Bookmark getBookMark() {
		return bookMark;
	}

	public void setBookMark(Bookmark bookMark) {
		this.bookMark = bookMark;
	}
}
