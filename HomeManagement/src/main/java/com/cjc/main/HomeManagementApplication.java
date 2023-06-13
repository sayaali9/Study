package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HomeManagementApplication {

	public static void main(String[] args) {
		System.out.println("Start");
		SpringApplication.run(HomeManagementApplication.class, args);
		System.out.println("End");
	}

}
