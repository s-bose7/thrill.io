package com.semanticsquare.thrillio.service;


import java.util.ArrayList;

import com.semanticsquare.thrillio.dao.BookmarkDao;
import com.semanticsquare.thrillio.entities.BookMark;
import com.semanticsquare.thrillio.entities.User;
import com.semanticsquare.thrillio.entities.UserBookmark;
import com.semanticsquare.thrillio.entities.WebLink;


public class BookmarkService {
	
	private static BookmarkDao bookmarkDao = new BookmarkDao();
	private static BookmarkService BookMarkService = new BookmarkService();
	/* Singleton pattern */
	private BookmarkService() {}
	public static BookmarkService getInstanceBookmarkService() {
		return BookMarkService;
	}
	
	public void createUserBookmark(User user, String bookmarkTypeString, String url) {
		BookMark bookMark;
		if(bookmarkTypeString.equalsIgnoreCase("weblink")) {
			bookMark = new WebLink();
			bookMark.setProfileUrlString(url);
			bookmarkDao.addUserBookmarkToDB(new UserBookmark(user, bookMark));
		}
	}
	
	public ArrayList<BookMark> getUserBookMarks(User user) {
		return bookmarkDao.getUserBookMarks(user);		
	}
	
	
}
