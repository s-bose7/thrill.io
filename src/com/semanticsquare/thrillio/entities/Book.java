package com.semanticsquare.thrillio.entities;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Book")
public class Book extends Bookmark {
	
	@Basic
	@Column(name="publisher_name")
	private String publisher;
	
	@Basic
	@Column(name="publication_year")
	private int publicationYear;
	
	@Basic
	@Column(name="genre")
	private String genre;
	
	private List<String> authorStrings;
	
	@Basic
	@Column(name="amazon_rating")
	private double amazonRating;

	/**
	 * @return the publisher
	 */
	public String getPublisher() {
		return publisher;
	}

	/**
	 * @return the publicationYear
	 */
	public int getPublicationYear() {
		return publicationYear;
	}

	/**
	 * @return the genre
	 */
	public String getGenre() {
		return genre;
	}

	/**
	 * @return the authorStrings
	 */
	public List<String> getAuthorStrings() {
		return authorStrings;
	}

	/**
	 * @return the amazonRating
	 */
	public double getAmazonRating() {
		return amazonRating;
	}

	/**
	 * @param publisher the publisher to set
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	/**
	 * @param publicationYear the publicationYear to set
	 */
	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	/**
	 * @param genre the genre to set
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}

	/**
	 * @param authorStrings the authorStrings to set
	 */
	public void setAuthorStrings(List<String> authorStrings) {
		this.authorStrings = authorStrings;
	}

	/**
	 * @param amazonRating the amazonRating to set
	 */
	public void setAmazonRating(double amazonRating) {
		this.amazonRating = amazonRating;
	}
}
