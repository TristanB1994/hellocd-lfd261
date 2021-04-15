package com.example.helloCD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloCdApplication {

	@RequestMapping("/")
	String home() {
		return "Hello world";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloCdApplication.class, args);
	}

}
