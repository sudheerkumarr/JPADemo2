package com.example.entity;

public class Address {

	// Fields
	private int addrId;
	private String dNo;
	private String streetName;
	private String city;
	private String state;
	
	// Constructors , Getters/Setters, toString
	public Address() {}

	public Address(int addrId, String dNo, String streetName, String city, String state) {
		super();
		this.addrId = addrId;
		this.dNo = dNo;
		this.streetName = streetName;
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

	public String getdNo() {
		return dNo;
	}

	public void setdNo(String dNo) {
		this.dNo = dNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
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
		return "Address [addrId=" + addrId + ", dNo=" + dNo + ", streetName=" + streetName + ", city=" + city
				+ ", state=" + state + "]";
	}
	
	
	
}
