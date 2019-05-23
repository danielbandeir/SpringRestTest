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
	@Embedded
	private Location location;
	
	deviceRegister(){}
	
	deviceRegister(String clientVersion, String timeStamp, Device device, Location local){
		this.clientversion = clientVersion;
		this.timeStamp = timeStamp;
		this.device = device;
		this.location = local;
	}
}



@Data
class Device{
	private String deviceid;
	
	private String devicebrand;
	private String devicemodel;
	private String systype;
	private String sysversion;
	
	Device (){}
	
	Device(String id, String deviceBrand, String deviceModel, String systype, String sysversion){
		this.deviceid = id;
		this.devicebrand = deviceBrand;
		this.devicemodel = deviceModel;
		this.systype = systype;
		this.sysversion = sysversion;
	}
}


@Data
class Location{
	private String lat;
	private String longi;
	
	Location(){}
	
	Location(String lat, String longi){
		this.lat = lat;
		this.longi = longi;
	}
}