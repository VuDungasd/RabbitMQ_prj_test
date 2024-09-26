package com.example.springbootRabbitMQ;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EntityScan("com.example.springbootRabbitMQ.usermanagement")
public class SpringbootRabbitMqApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRabbitMqApplication.class, args);
	}
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
