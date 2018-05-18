package com.springtutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@ComponentScan(basePackages="com.springtutorial")
@SpringBootApplication
public class SpringBootExample {
	
	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootExample.class, args);
	
	}

}
