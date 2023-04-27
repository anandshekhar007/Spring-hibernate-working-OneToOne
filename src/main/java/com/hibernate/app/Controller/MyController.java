package com.hibernate.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.app.Entity.Person;
import com.hibernate.app.Service.MyService;

@RestController
public class MyController {
	@Autowired
	MyService myService;
	
	@GetMapping("/")
	public List<Person> allpersons(){
		return myService.getPerson();
		
	}
	
	@GetMapping("/person/{id}")
	public Person getPersonById(@PathVariable int id )
	{
		return myService.getPersonById(id);
		
	}
	
	@PostMapping("/addperson")
	public Person createPerson(@RequestBody Person person ) {
		
		return myService.createPerson(person);
	}
	
	/*
	 * @GetMapping("/city/{city}") public Person getByCity(String city) { return
	 * myService.getByCity(city); }
	 */
	
	@DeleteMapping("/person/{id}")
	public void deletePerson(@PathVariable("Id") int id ) {

		myService.deletePersonById(id);

		
	}
	
	@PutMapping ("/person")
	public Person updatePerson(@RequestBody Person person) {
		
	return myService.updatePersonById(person);
		
		
	}
	
	}



