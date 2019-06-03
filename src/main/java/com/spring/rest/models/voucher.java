package com.spring.rest.models;


import lombok.Data;

import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.lang.String;

import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;

@Data
@Entity
public class voucher {
	@Id @GeneratedValue
	private long id;
	private String voucherId;
	private String offerId;
	private String format;
	private String created;
	private String partner;
	private String partnerId;
	private String clientSeq;
	private String title;
	private String descr;
	private String useOnly;
	private String instructions;
	@Embedded
	private Client client;
	@Embedded
	private Offer offer;
	@Embedded
	private Validity validity;
	private String area;
	
	voucher(){}
	
	voucher(String voucherId, 
			String offerId, 
			String format, 
			String created, 
			String partner, 
			String partnerId, 
			String clientSeq, 
			String title, 
			String descr, 
			String useOnly,
			String instructions,
			Client client,
			Offer offer,
			Validity validity,
			String area){
		this.voucherId = voucherId;
		this.offerId = offerId;
		this.format = format;
		this.created = created;
		this.partner = partner;
		this.partnerId = partnerId;
		this.clientSeq = clientSeq;
		this.title = title;
		this.descr = descr;
		this.useOnly = useOnly;
		this.instructions = instructions;
		this.client = client;
		this.offer = offer;
		this.validity = validity;
		this.area = area;
	}
}

@Data
class Client{
	@JsonProperty("id")
	private String clientId;
	@Embedded
	private Position position;
	
	Client(){}
	
	Client(String clientId, Position position){
		this.clientId = clientId;
		this.position = position;
	}
}

@Data
class Position{
	private String lat;
	@JsonProperty("long")
	private String longLat;
}

@Data
class Offer{
	private String type;
	private String value;
	private String minBuy;
	private String maxBuy;
	private String installments;
	private String minSpend;
	private String currency;
	
	Offer(){}
	
	Offer(String type, String value, String minBuy, String maxBuy, String installments, String minSpend, String currency){
		this.type = type;
		this.value = value;
		this.minBuy = minBuy;
		this.maxBuy = maxBuy;
		this.installments = installments;
		this.minSpend = minSpend;
		this.currency = currency;
	}
}

@Data
class Validity{
	private String begin;
	private String end;
	private String useBefore;
}
