package com.app.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.pojos.CustomerCart;

public interface CartRepository extends JpaRepository<CustomerCart, Integer> {
	
	@Modifying
	@Query("delete from CustomerCart cc where cc.custId=:id")
	void deleteCart(@Param("id")int custId);
	
	@Query("select cc from CustomerCart cc where cc.custId=:cid")
	List<CustomerCart> findAllCart(@Param("cid")int custId);
	
}
