package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsTestApplicationTests {
	private static Logger log =LoggerFactory
			.getLogger(JenkinsTestApplicationTests.class);
	@Test
	void contextLoads()
	{
		log.info("Application");
		assertEquals(true, true);
	}
	
	

}
