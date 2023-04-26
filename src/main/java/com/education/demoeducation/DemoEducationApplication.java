package com.education.demoeducation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.education"})
public class DemoEducationApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoEducationApplication.class, args);
	}

}
