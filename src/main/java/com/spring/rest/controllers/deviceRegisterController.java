package com.spring.rest.controllers;

import java.util.List;

import com.spring.rest.models.deviceRegister;
import com.spring.rest.repository.deviceRegisterRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/devices")
class deviceRegisterController{
	private final deviceRegisterRepository repository;
	
	deviceRegisterController(deviceRegisterRepository repository){
		this.repository = repository;
	}
	
	@GetMapping
	List<deviceRegister> all(){
		return repository.findAll();
	}
	
	@PostMapping
	deviceRegister newDevice(@RequestBody deviceRegister newDevice) {
		return repository.save(newDevice);
	}
}