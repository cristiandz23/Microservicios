package com.microservice.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class MicroserviceGatwayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceGatwayApplication.class, args);
	}

}
