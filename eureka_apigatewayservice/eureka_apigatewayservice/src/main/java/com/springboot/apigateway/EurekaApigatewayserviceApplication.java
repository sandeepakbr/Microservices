package com.springboot.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaApigatewayserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaApigatewayserviceApplication.class, args);
	}
}
