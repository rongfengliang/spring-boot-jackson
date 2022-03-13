package com.dalong.jacksonapp;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JacksonappApplication {

	public static ApplicationContext applicationContext;
	@Bean
	public CommandLineRunner commandLineRunner(ObjectMapper objectMapper){
		return args -> {
			objectMapper.registerSubtypes(new NamedType(FirstUser.class, "first"));
			objectMapper.registerSubtypes(new NamedType(SecondUser.class, "second"));
		};
	}
	public static void main(String[] args) {
		applicationContext= SpringApplication.run(JacksonappApplication.class, args);
	}

}
