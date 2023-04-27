package com.hibernate.app.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernate.app.Entity.Address;
import com.hibernate.app.Entity.Person;
import com.hibernate.app.Repository.AddressRepository;
import com.hibernate.app.Repository.PersonRepository;

@Service
public class MyServiceImpl implements MyService {
	
	@Autowired
	PersonRepository personRepository;
	
	@Autowired
	AddressRepository addressRepository;

	@Override
	public List<Person> getPerson() {

     return  personRepository.findAll();
		
		
	}

	@Override
	public Person getPersonById(int id) {

         
		 Person p=personRepository.findById(id).get();
		// addressRepository.findById(p.getAddress().getAid());
		 
		 return p;
	}

	/*
	 * @Override public Person createPerson(Person person) { // TODO Auto-generated
	 * method stub addressRepository.save(person.getAddress()); person=
	 * personRepository.save(person); return person;
	 * 
	 * }
	 */
	
	@Override
	public Person createPerson(Person person) {
		// TODO Auto-generated method stub
		addressRepository.saveAll(person.getAddress());
	    person= personRepository.save(person);
	    return person;
		
	}

	@Override
	public  void deletePersonById(int id) {
		 personRepository.deleteById(id);
		
	}

	@Override
	public Person updatePersonById(Person person) {
		
		System.out.println(addressRepository.saveAll(person.getAddress()));
	
	return personRepository.save(person);
		
	}
	
	
	
	
	
	/*
	 * public Person getByCity(String city) { return
	 * personRepository.getByCity(city);
	 * 
	 * }
	 */

	
}
