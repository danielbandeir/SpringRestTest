package com.spring.rest.controllers;

import java.util.List;
import java.util.Optional;

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
	private final skinRepository repositorySkin;
	
	getMySkinController(getMySkinRepository repository, skinRepository repositorySkin){
		this.repository = repository;
		this.repositorySkin = repositorySkin;
	}
	
	@GetMapping
	List<getMySkin> all(){
		return repository.findAll();
	}
	
	@PostMapping
	Optional<skin> newSkin(@RequestBody getMySkin newSkin) {
		repository.save(newSkin);
		return repositorySkin.findById((long) 1);
	}
}
