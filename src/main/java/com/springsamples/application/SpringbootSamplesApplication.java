package com.springsamples.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.springsamples.repositry.springsamplerepo;

@SpringBootApplication
@ComponentScan("com.springsamples")
@EnableMongoRepositories(basePackageClasses = springsamplerepo.class)
public class SpringbootSamplesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSamplesApplication.class, args);
	}

}
