package com.hibernate.app.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Address {
	
	@Id
	int aid;
	
	String city;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	

	public Address(int aid, String city) {
		super();
		this.aid = aid;
		this.city = city;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
