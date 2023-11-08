package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Address {

	// Fields
	@Id
	@GeneratedValue
	private int addrId;
	
	
	private String city;
	private String state;
	
	// Constructors , Getters/Setters, toString
	public Address() {}

	public Address( String city, String state) {
		super();
		
		this.city = city;
		this.state = state;
	}

	// Getters & Setters
	public int getAddrId() {
		return addrId;
	}

	public void setAddrId(int addrId) {
		this.addrId = addrId;
	}


	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [addrId=" + addrId + ", city=" + city + ", state=" + state + "]";
	}

	
}
