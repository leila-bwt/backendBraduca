package com.registro.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.registro.model"})
public class ApiBraducaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiBraducaApplication.class, args);
	}

}
