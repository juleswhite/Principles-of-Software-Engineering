package edu.vanderbilt.cs.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;


/**
 * This controller implements a simple URL shortener similar to goo.gl
 * 
 * Run the DemoApplication and try opening the following links in your
 * browser in this order:
 * 
 * http://localhost:8080/e?url=http://www.vanderbilt.edu
 * 
 * http://localhost:8080/e/1/metadata
 * 
 * http://localhost:8080/e/1
 * 
 * @author jules
 *
 */
@RestController
public class URLShortenerController {

	private final URLRepository urlRepository;
	
	private final IDEncodingSystem encodingSystem;
	
	@Autowired
	public URLShortenerController(URLRepository urlRepository, IDEncodingSystem urlStringEncoder) {
		super();
		this.urlRepository = urlRepository;
		this.encodingSystem = urlStringEncoder;
	}
	
	/**
	 * 
	 * Submit a URL to be shortened. 
	 * 
	 * @param url
	 * @return the code for the shortened URL
	 */
	@RequestMapping("/e")
	public String shortenUrl(@RequestParam("url") String url) {
		ShortenedURL surl = new ShortenedURL(url);
		long id = this.urlRepository.saveURL(surl);
		return this.encodingSystem.encodeId(id);
	}
	
	/**
	 * Expands a code for a shortened URL and provides information
	 * on where it points and when it was created.
	 * 
	 * @param shortCode
	 * @return a ShortenedURL object with metadata about the URL
	 */
	@RequestMapping("/e/{shortCode}/metadata")
	public ShortenedURL expandUrlWithMetadata(@PathVariable("shortCode") String shortCode) {
		long id = this.encodingSystem.decocdeId(shortCode);
		return this.urlRepository.getURLById(id);
	}
	
	/**
	 * Expands a code for a shortened URL and redirects the requestor to
	 * the URL that it points to.
	 * 
	 * @param shortCode
	 * @return an HTTP redirect to the expanded URL
	 */
	@RequestMapping("/e/{shortCode}")
	public RedirectView expandUrl(@PathVariable("shortCode") String shortCode) {
		long id = this.encodingSystem.decocdeId(shortCode);
		String url = this.urlRepository.getURLById(id).getURL();
		return new RedirectView(url);
	}
}
