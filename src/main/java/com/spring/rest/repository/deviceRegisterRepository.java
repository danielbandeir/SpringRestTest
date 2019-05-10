package com.spring.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.rest.models.deviceRegister;

public interface deviceRegisterRepository extends JpaRepository<deviceRegister, Long>{
	
}
