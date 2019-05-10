package com.spring.rest.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Data
@Entity
public class personRegister{
	private @Id @GeneratedValue Long id;
	private String name;
	private String lastName;
	
	personRegister(){}
	
	public personRegister(String name, String lastName){
		this.name = name;
		this.lastName = lastName;
	}
}
