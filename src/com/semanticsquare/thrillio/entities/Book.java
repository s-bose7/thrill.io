package com.semanticsquare.thrillio.entities;

public class Book extends BookMark {
	private int publicationYear;
	private String genreString;
	private String[] authorStrings;
	private String publisherString;
	private double amazonRating;

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	public String getGenreString() {
		return genreString;
	}

	public void setGenreString(String genreString) {
		this.genreString = genreString;
	}

	public String[] getAuthorStrings() {
		return authorStrings;
	}

	public void setAuthorStrings(String[] authorStrings) {
		this.authorStrings = authorStrings;
	}

	public String getPublisherString() {
		return publisherString;
	}

	public void setPublisherString(String publisherString) {
		this.publisherString = publisherString;
	}

	public double getAmazonRating() {
		return amazonRating;
	}

	public void setAmazonRating(double amazonRating) {
		this.amazonRating = amazonRating;
	}
}
