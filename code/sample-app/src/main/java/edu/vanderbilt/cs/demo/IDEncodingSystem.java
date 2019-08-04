package edu.vanderbilt.cs.demo;

public interface IDEncodingSystem {

	public long decocdeId(String encodedId);
	
	public String encodeId(long id);
	
}
