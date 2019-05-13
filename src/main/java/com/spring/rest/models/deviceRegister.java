package com.spring.rest.models;

import lombok.Data;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Data
@Entity
public class deviceRegister{
	
	@Id @GeneratedValue
	private Long id;
	private String clientversion;
	private String timeStamp;
	@Embedded
	private Device device;
	
	deviceRegister(){}
	
	deviceRegister(String clientVersion, String timeStamp, Device device){
		this.clientversion = clientVersion;
		this.timeStamp = timeStamp;
		this.device = device;
	}
}



@Data
class Device{
	private String devicebrand;
	private String devicemodel;
	private String systype;
	private String sysversion;
	
	Device (){}
	
	Device(String deviceBrand, String deviceModel, String systype, String sysversion){
		this.devicebrand = deviceBrand;
		this.devicemodel = deviceModel;
		this.systype = systype;
		this.sysversion = sysversion;
	}
}