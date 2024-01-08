package com.example.jenkinstest;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Slf4j
class JenkinsTestApplicationTests {

	@Test
	void contextLoads() {
		log.info("test case executing...");
		log.info("test case executing2...");
		assertEquals(true, true);
	}

}
