package com.example.student_reg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan
@SpringBootApplication
public class StudentRegApplication extends SpringBootServletInitializer{
	@Override
	protected SpringApplicationBuilder configure (SpringApplicationBuilder application){
         return application.sources(StudentRegApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(StudentRegApplication.class, args);
	}

}
 