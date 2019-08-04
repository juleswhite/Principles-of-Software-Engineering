package edu.vanderbilt.cs.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * This sample app provides a simple URL shortener similar to goo.gl
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
 * 
 * @author jules
 *
 */
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Bean
	public IDEncodingSystem idEncodingSystem() {
		return new IDEncodingSystemBase62();
	}
	
	@Bean
	public URLRepository urlRepository() {
		return new URLRepositoryInMemory();
	}

}
