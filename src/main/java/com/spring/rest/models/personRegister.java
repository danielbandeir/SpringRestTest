package com.spring.rest.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Data
@Entity
public class personRegister{
	
	@Id @GeneratedValue 
	private Long id;
	private String name;
	private String lastName;
	
	public personRegister(){}
	
	public personRegister(String name, String lastName){
		this.name = name;
		this.lastName = lastName;
	}
}
