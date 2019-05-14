package com.spring.rest.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.models.skin;
import com.spring.rest.repository.skinRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/skin")
class skinController {
	
	private final skinRepository repository;
	
	skinController(skinRepository repository){
		this.repository = repository;
	}
	
	@GetMapping()
	List<skin> all(){
		return repository.findAll();
	}
	

}

