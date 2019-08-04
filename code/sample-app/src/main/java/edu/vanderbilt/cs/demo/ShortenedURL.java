package edu.vanderbilt.cs.demo;

public class ShortenedURL {

	private final String url;

	private final long creationTime = System.currentTimeMillis();
	
	public ShortenedURL(String url) {
		super();
		this.url = url;
	}

	public String getURL() {
		return url;
	}

	public long getCreationTime() {
		return creationTime;
	}

}
