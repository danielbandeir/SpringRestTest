package com.spring.rest.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.models.personRegister;
import com.spring.rest.repository.personRegisterRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/person")
class personRegisterController {
	
	private final personRegisterRepository repository;
	
	personRegisterController(personRegisterRepository repository){
		this.repository = repository;
	}
	
	@GetMapping()
	List<personRegister> all(){
		return repository.findAll();
	}
	
	@PostMapping()
	personRegister newPerson(@RequestBody personRegister newPerson) {
		return repository.save(newPerson);
	}

}
