package com.springboot.springbootproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

// To exclude the spring security credentials page in start use below: exclude = SecurityAutoConfiguration.class
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class SpringbootprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootprojectApplication.class, args);
	}

}
