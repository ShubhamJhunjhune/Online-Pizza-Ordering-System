package com.app.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.pojos.Customers;
import com.app.pojos.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	@Query("select u from User u where u.userEmail=:id and u.password=:pass")
	Optional<User> authenticateUser(@Param("id")String id,@Param("pass") String pwd);
}
