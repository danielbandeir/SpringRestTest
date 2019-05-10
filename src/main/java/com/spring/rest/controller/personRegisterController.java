package com.spring.rest.controller;

import java.util.List;

import com.spring.rest.repository.personRegisterRepository;
import com.spring.rest.models.personRegister;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
class personRegisterController {
	
	private final personRegisterRepository repository;
	
	personRegisterController(personRegisterRepository repository){
		this.repository = repository;
	}
	
	@GetMapping("/person")
	List<personRegister> all(){
		return repository.findAll();
	}
	
	@PostMapping("/person")
	personRegister newPerson(@RequestBody personRegister newPerson) {
		return repository.save(newPerson);
	}

}
