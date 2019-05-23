package com.spring.rest.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

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

	@PostMapping()
	skin newSkin(@RequestBody skin newSkin) {
		return repository.save(newSkin);
	}
	
	@PutMapping("/skin/{id}")
	Optional<skin> replaceSkin(@RequestBody skin newSkin, @PathVariable Long id){
		return repository.findById(id);
	}
}

