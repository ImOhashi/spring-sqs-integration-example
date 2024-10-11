package com.ohashi.spring_sqs_integration_example;

import com.ohashi.spring_sqs_integration_example.application.config.EventQueuesProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(EventQueuesProperties.class)
public class SpringSqsIntegrationExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSqsIntegrationExampleApplication.class, args);
	}

}
