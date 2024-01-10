package com.example.jenkinstest;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Slf4j
@RestController
public class JenkinsTestApplication {

	@PostConstruct
	public void init() {
		log.info("application started!!!....");
	}

	@GetMapping("/welcome")
	public String welcome() {
		return "welcome to javatechi";
	}

	public static void main(String[] args) {
		log.info("application executed!!!....");
		SpringApplication.run(JenkinsTestApplication.class, args);
	}

}
