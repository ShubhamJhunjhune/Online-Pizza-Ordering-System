package com.app.dao;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.pojos.CustomerOrder;
import com.app.pojos.CustomerOrderDetails;

public interface CustomerOrderDetailsRepository extends JpaRepository<CustomerOrderDetails, Integer> {
	@Query ("select co from CustomerOrderDetails co where co.orderId=:oid")
	List<CustomerOrderDetails> findOrdersById (@Param("oid")int orderId);

	@Query("select cd from CustomerOrderDetails cd where cd.orderId=:id ")
	  List<CustomerOrderDetails> findOrderDet(@Param("id")int id);

	@Query("select cd from CustomerOrderDetails cd where cd.custId=:id and OrderStatus= 'DELIVERED'")
	List<CustomerOrderDetails> findAllOrderHistory(@Param("id")int custId);
}
