package com.spring.rest.controllers;

import java.util.List;
import com.spring.rest.models.getMySkin;
import com.spring.rest.repository.getMySkinRepository;
import com.spring.rest.models.skin;
import com.spring.rest.repository.skinRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/getMySkin")
public class getMySkinController {
	private final getMySkinRepository repository;
	
	getMySkinController(getMySkinRepository repository){
		this.repository = repository;
	}
	
	@GetMapping
	List<getMySkin> all(){
		return repository.findAll();
	}
	
	@PostMapping
	String newSkin(@RequestBody getMySkin newSkin) {
		repository.save(newSkin);
		return "Ok, registrado";
	}
}
