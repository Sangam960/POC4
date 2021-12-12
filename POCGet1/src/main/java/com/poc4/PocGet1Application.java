package com.poc4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class PocGet1Application {

	public static void main(String[] args) {
		SpringApplication.run(PocGet1Application.class, args);
	}

}
