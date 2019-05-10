package com.spring.rest.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Data
@Entity
public class deviceRegister{
	
	private String clientVersion;
	private String timeStamp;
	private Device device;
	private Location location;
	
	deviceRegister(){}
	
	deviceRegister(String clientVersion, String timeStamp, Device device, Location location){
		this.clientVersion = clientVersion;
		this.timeStamp = timeStamp;
		this.device = device;
		this.location = location;
	}
}



class Device{
	private String deviceBrand;
	private String devicemodel;
	private String systype;
	private String sysversion;
	
	Device (){}
	
	Device(String deviceBrand, String deviceModel, String systype, String sysversion){
		this.deviceBrand = deviceBrand;
		this.devicemodel = deviceModel;
		this.systype = systype;
		this.sysversion = sysversion;
	}
}



class Location{
	private String longi;
	private String lat;
	
	Location(){}
	
	Location(String longi, String lat){
		this.lat = lat;
		this.longi = longi;
	}
}