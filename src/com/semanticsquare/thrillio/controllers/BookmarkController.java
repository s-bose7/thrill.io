package com.semanticsquare.thrillio.controllers;

import java.util.ArrayList;

import com.semanticsquare.thrillio.entities.BookMark;
import com.semanticsquare.thrillio.entities.User;
import com.semanticsquare.thrillio.service.BookmarkService;

public class BookmarkController {

	public static void createBookMark(User user, String bookmarkTypeString, String url) {
		BookmarkService.getInstanceBookmarkService().createUserBookmark(user, bookmarkTypeString, url);
		
	}

	public static ArrayList<BookMark> getUserBookMarks(User user) {
		return BookmarkService.getInstanceBookmarkService().getUserBookMarks(user);
		
	}

}
