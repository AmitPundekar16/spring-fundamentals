package com.example.annotation_config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


@SpringBootApplication
public class AnnotationConfigApplication {

	public static void main(String[] args) {

		ApplicationContext apk=SpringApplication.run(AnnotationConfigApplication.class, args);
        Hospital h=(Hospital)apk.getBean("hospital");
		h.display();
	}

}
