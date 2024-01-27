package com.semanticsquare.thrillio.entities;

public class WebLink extends BookMark {
	private String hostString;
	private String urlString;

	public String getHostString() {
		return hostString;
	}

	public void setHostString(String hostString) {
		this.hostString = hostString;
	}

	public String getUrlString() {
		return urlString;
	}

	public void setUrlString(String urlString) {
		this.urlString = urlString;
	}
}
