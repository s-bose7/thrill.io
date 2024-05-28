package com.semanticsquare.thrillio.dao;


import java.util.ArrayList;

import com.semanticsquare.thrillio.entities.BookMark;
import com.semanticsquare.thrillio.entities.User;
import com.semanticsquare.thrillio.entities.UserBookmark;

public class BookmarkDao {
	
	
	public void addUserBookmarkToDB(UserBookmark userBookmark) {
//		postgresqlDatabase.setUserBookmark(userBookmark);
	}

	public ArrayList<BookMark> getUserBookMarks(User user) {
//		return postgresqlDatabase.getUserBookmarks(user);
		return new ArrayList<BookMark>();
	}
	
	
}
