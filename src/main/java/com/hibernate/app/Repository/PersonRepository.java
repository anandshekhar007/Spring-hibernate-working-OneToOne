package com.hibernate.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hibernate.app.Entity.Person;

public interface PersonRepository  extends JpaRepository<Person, Integer>{
	
	/*
	 * @Query("select p from Person p where p.address.city=? 1") public Person
	 * getByCity(String city);
	 */

}
