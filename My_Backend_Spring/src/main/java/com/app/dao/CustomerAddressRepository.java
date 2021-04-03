package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.CustomerAddress;

public interface CustomerAddressRepository  extends JpaRepository<CustomerAddress,Integer> {
	
}
