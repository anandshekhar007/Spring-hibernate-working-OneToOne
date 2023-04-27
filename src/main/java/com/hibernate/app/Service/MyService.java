package com.hibernate.app.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hibernate.app.Entity.Person;


public interface MyService {

	public List<Person> getPerson();
	public Person  getPersonById(int id);
	public Person createPerson(Person person);
	
	public void deletePersonById(int id);
	public Person updatePersonById(Person person );
	//public Person getByCity(String city);
	
	/*
	 * public int deletePersonById(); public int updatePersonById();
	 */
}
