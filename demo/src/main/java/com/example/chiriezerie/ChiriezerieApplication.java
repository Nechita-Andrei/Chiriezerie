package com.example.chiriezerie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChiriezerieApplication {

	public static void main(String[] args) {
		System.out.println("[Initializing SpringApp]");
		SpringApplication.run(ChiriezerieApplication.class, args);
		System.out.println("[SpringApp Initialized]");
	}

}
