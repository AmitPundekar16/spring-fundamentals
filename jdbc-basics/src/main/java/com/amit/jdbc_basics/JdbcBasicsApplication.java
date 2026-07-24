package com.amit.jdbc_basics;

import com.amit.jdbc_basics.models.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JdbcBasicsApplication {

	public static void main(String[] args) {

		ApplicationContext apk=SpringApplication.run(JdbcBasicsApplication.class, args);
		Start st=apk.getBean(Start.class);
		st.start(apk);
		System.out.println("hello");
	}

}
