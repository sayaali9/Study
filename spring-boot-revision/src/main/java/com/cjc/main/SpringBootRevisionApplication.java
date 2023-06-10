package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRevisionApplication {

	public static void main(String[] args) {
		System.out.println("start");
		SpringApplication.run(SpringBootRevisionApplication.class, args);
		System.out.println("End");
	}

}
