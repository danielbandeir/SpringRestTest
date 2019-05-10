package com.spring.rest.loadDatabase;

import com.spring.rest.repository.personRegisterRepository;
import com.spring.rest.models.personRegister;

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
			System.out.println("Loading"+repository.save(new personRegister("Daniel","Bandeira")));
			System.out.println("Loading"+repository.save(new personRegister("Rebeca","Bandeira")));
		};
	}
	
}
