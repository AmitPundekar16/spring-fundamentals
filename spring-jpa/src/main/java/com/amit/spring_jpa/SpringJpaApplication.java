package com.amit.spring_jpa;

import com.amit.spring_jpa.controller.StudentController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJpaApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringJpaApplication.class, args);
		System.out.println("hello i am amit");

	}

}
