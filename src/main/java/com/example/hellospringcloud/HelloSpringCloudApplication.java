package com.example.hellospringcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient // This annotation makes the application a Eureka client
public class HelloSpringCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringCloudApplication.class, args);
	}

}
