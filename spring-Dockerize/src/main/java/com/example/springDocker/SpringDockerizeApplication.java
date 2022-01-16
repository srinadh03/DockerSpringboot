package com.example.springDocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDockerizeApplication {
	
	@GetMapping("/message")
	public String getMessage() {
		return "Welcome First Spring Docker File";
		}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDockerizeApplication.class, args);
	}

}
