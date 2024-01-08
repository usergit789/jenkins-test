package com.example.jenkinstest;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class JenkinsTestApplication {

	@PostConstruct
	public void init() {
		log.info("application started!!!");
	}

	public static void main(String[] args) {
		log.info("application executed!!!");
		SpringApplication.run(JenkinsTestApplication.class, args);
	}

}
