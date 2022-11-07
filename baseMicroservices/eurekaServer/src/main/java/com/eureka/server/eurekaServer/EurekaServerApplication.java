package com.eureka.server.eurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {
	// EurekaServer: http://localhost:8761/
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}

}
