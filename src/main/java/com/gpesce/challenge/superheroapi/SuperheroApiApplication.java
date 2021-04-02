package com.gpesce.challenge.superheroapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SuperheroApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuperheroApiApplication.class, args);
	}

}
