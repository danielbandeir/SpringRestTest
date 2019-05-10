package com.spring.rest.repository;
import com.spring.rest.models.personRegister;

import org.springframework.data.jpa.repository.JpaRepository;

public interface personRegisterRepository extends JpaRepository<personRegister, Long>{

}
