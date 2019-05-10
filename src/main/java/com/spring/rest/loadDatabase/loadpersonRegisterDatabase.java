package com.spring.rest;

import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@Slf4j
class loadpersonRegisterDatabase {
	
	@Bean
	CommandLineRunner initDatabase(personRegisterRepository repository) {
		return args ->{
			log.info("Loading"+repository.save(new personRegister("Daniel","Bandeira")));
			log.info("Loading"+repository.save(new personRegister("Rebeca","Bandeira")));
		};
	}
	
}
