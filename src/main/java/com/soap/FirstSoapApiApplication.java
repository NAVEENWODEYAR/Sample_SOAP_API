package com.soap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSoapApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSoapApiApplication.class, args);
		System.out.println(Thread.getDefaultUncaughtExceptionHandler().toString());
	}
}
