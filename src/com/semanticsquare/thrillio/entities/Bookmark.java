package com.semanticsquare.thrillio.entities;

public abstract class BookMark {
	private long id;
	private String title;
	private String type;
	private String profileUrlString;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getProfileUrlString() {
		return profileUrlString;
	}

	public void setProfileUrlString(String profileUrlString) {
		this.profileUrlString = profileUrlString;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
