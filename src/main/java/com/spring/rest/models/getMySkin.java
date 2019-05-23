package com.spring.rest.models;

import lombok.Data;

import javax.persistence.Embedded;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
@Data
public class getMySkin {
	@Id @GeneratedValue
	private long id;
	private String clientVersion;
	private String userId;
	private String deviceId;
	private String currentSkin;
	private String lastUpdated;
	@Embedded
	private Location2 location;
	
	getMySkin(){}
	
	getMySkin(String clientversion, String userId, String deviceId, String currentSkin, String lastUpdated, Location2 location){
		this.clientVersion = clientversion;
		this.userId = userId;
		this.deviceId = deviceId;
		this.currentSkin = currentSkin;
		this.lastUpdated = lastUpdated;
		this.location = location;
	}
}

@Data
class Location2{
	private String lat;
	private String longe;
	
	Location2(){}
	
	Location2(String lat, String longe){
		this.lat = lat;
		this.longe = longe;
	}
}

