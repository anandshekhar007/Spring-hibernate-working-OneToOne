package com.hibernate.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hibernate.app.Entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

	
}
