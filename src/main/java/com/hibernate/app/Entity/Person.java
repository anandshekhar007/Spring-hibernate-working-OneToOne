package com.hibernate.app.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Person {

	@Id
	int id;
	
	String name;
	
	/*
	 * @OneToOne Address address;
	 */
	
	/*
	 * 
	 * public int getId() { return id; } public void setId(int id) { this.id = id; }
	 * public String getName() { return name; } public void setName(String name) {
	 * this.name = name; } public Address getAddress() { return address; } public
	 * void setAddress(Address address) { this.address = address; }
	 * 
	 * public Person(int id, String name, Address address) { super(); this.id = id;
	 * this.name = name; this.address = address; }
	 * 
	 * public Person() { super(); // TODO Auto-generated constructor stub }
	 */
	
	@OneToMany
	public List<Address> address ;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public Person(int id, String name, List<Address> address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
