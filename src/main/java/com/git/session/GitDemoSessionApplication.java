package com.git.session;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitDemoSessionApplication {
//Fixed
	public static void main(String[] args) {
		SpringApplication.run(GitDemoSessionApplication.class, args);
		System.out.println("Test Added");
	}
}
