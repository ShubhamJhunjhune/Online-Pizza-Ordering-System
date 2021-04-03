package com.app.dao;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.pojos.CustomerOrder;

public interface CustomerOrderRepository extends JpaRepository<CustomerOrder, Integer> {

	@Query("select max(co.orderId) from CustomerOrder co where co.custId=:id")
	int findOrderById(@Param("id")int custId);
	
//	@Query("select max(cod.orderDetailsId) from CustomerOrderDetails cod")
//	int findOrderDById();
	
	@Query("select c from CustomerOrder c where c.orderId=:id ")
	Optional<CustomerOrder> findOrder(@Param("id") int id);
	
	@Query("select c from CustomerOrder c where c.OrderStatus='PENDING' ")
	List<CustomerOrder> findAllPending();
	
}
