package com.semanticsquare.thrillio.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("Movie")
public class Movie extends Bookmark {
	
	@Basic
	@Column(name = "release_year")
	private int releaseYear;
	
	@Basic
	@Column(name = "genre")
	private String genre;
	
	@Basic
	@Column(name = "imdb_rating")
	private double imdbRating;

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
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
