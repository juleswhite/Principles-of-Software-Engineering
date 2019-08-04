package edu.vanderbilt.cs.demo;

/**
 * The URLRepository is an interface for a system to store URLs and associate
 * them with unique IDs. A URL can be looked up by its ID after it is saved.
 * 
 * @author jules
 *
 */
public interface URLRepository {

	/**
	 * Given a ShortenedURL object, the underlying repository will save
	 * the ShortenedURL and return the ID of the ShortenedURL. If the
	 * ShortenedURL already exists in the repository as determined by the
	 * equals() method, the existing ID of the ShortenedURL will be returned. 
	 * 
	 * @param URL the ShortenedURL to save
	 * @return the ID of the saved ShortenedURL
	 */
	public Long saveURL(ShortenedURL URL);
	
	/**
	 * Returns the ShortenedURL associated with the given ID. If no
	 * ShortenedURL exists with the given ID, null will be returned.
	 * 
	 * @param id the ID to lookup
	 * @return the ShortenedURL with that ID or null
	 */
	public ShortenedURL getURLById(Long id);
	
}
