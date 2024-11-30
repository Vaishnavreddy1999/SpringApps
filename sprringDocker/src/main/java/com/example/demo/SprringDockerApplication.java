package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SprringDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprringDockerApplication.class, args);
		System.out.println("Hi Docker");
	}

}
