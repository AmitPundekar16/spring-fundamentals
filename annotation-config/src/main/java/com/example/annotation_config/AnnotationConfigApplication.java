package com.example.annotation_config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnnotationConfigApplication {

	public static void main(String[] args) {

		SpringApplication.run(AnnotationConfigApplication.class, args);
		System.out.println("hello");
	}

}
