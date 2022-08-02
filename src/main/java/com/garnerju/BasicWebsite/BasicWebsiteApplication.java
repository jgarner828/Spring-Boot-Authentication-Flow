package com.garnerju.BasicWebsite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// for  testing @SpringBootApplication(exclude = { SecurityAutoConfiguration.class})
@SpringBootApplication
public class BasicWebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicWebsiteApplication.class, args);
	}

}
