package com.app.dao;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.pojos.Customers;
import com.app.pojos.CustomerCart;

public interface CustomerRepository extends JpaRepository<Customers,Integer>{

	@Query("select c from Customers c where c.custEmail=:id and c.custPass=:pass")
	Optional<Customers> validateCustomer(@Param("id")String id,@Param("pass") String pwd);
	
	@Query("select c from CustomerCart c where c.custId =:id")
	List<CustomerCart> findAllById(@Param("id") int id);
	
	@Query("select c from Customers c where c.custId =:id")
	Customers findAllCust(@Param("id") int id);
}
