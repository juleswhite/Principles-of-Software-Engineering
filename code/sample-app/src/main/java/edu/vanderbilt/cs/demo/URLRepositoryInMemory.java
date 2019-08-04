package edu.vanderbilt.cs.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Lots of bugs and efficiency issues lurk in this class....
 * 
 * 
 * @author jules
 *
 */
public class URLRepositoryInMemory implements URLRepository {

	private AtomicLong id = new AtomicLong();
	
	private Map<Long,ShortenedURL> urls = new HashMap<>();
	
	@Override
	public Long saveURL(ShortenedURL url) {
		long idv = this.id.incrementAndGet();
		urls.put(idv, url);
		return idv;
	}

	@Override
	public ShortenedURL getURLById(Long id) {
		return urls.get(id);
	}

	
	
}
