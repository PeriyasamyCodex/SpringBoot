package com.spboot.contactus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringBootContactUsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootContactUsServiceApplication.class, args);
	}
}
