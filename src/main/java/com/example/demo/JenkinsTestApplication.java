package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsTestApplication {

	private static Logger log =LoggerFactory
			.getLogger(JenkinsTestApplication.class);
	public void info() {
		
		log.info("Application Started");
		
	}
	
	
	public static void main(String[] args) {
		log.info("Aplication Executed");
		
		SpringApplication.run(JenkinsTestApplication.class, args);
	}

}
