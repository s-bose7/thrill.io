package com.semanticsquare.thrillio.entities;

public class Movie extends BookMark {
	private int releaseYear;
	private String[] castStrings;
	private String[] directorStrings;
	private String genre;
	private double imdbRating;

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String[] getCastStrings() {
		return castStrings;
	}

	public void setCastStrings(String[] castStrings) {
		this.castStrings = castStrings;
	}

	public String[] getDirectorStrings() {
		return directorStrings;
	}

	public void setDirectorStrings(String[] directorStrings) {
		this.directorStrings = directorStrings;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getImdbRating() {
		return imdbRating;
	}

	public void setImdbRating(double imdbRating) {
		this.imdbRating = imdbRating;
	}

}
