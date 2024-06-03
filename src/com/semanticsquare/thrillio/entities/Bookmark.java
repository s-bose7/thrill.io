package com.semanticsquare.thrillio.entities;


import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
public abstract class Bookmark {
	
	
	@Id
	@Basic
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Basic
	@Column(name = "bookmark_type")
	private String type;
	
	@Basic
	@Column(name = "URL")
	private String url;
	
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

}
