package com.app.dao;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.app.pojos.Menu;

public interface MenuRepository extends JpaRepository<Menu,Integer>{

//	@Query("select c from Customers c where c.custId=:id and c.custPass=:pass")
//	Optional<Customers> validateCustomer(@Param("id")int id,@Param("pass") String pwd);
//	
}
