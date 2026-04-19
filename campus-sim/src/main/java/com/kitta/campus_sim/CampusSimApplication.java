package com.kitta.campus_sim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CampusSimApplication {

	public static void main(String[] args) {
		SpringApplication.run(CampusSimApplication.class, args);
	}

}
	