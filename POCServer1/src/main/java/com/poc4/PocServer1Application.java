package com.poc4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class PocServer1Application {

	public static void main(String[] args) {
		SpringApplication.run(PocServer1Application.class, args);
	}

}
