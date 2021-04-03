package com.app.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.pojos.Customers;
import com.app.pojos.DeliveryBoyOrders;

public interface DeliveryBoyOrdersRepo extends JpaRepository<DeliveryBoyOrders, Integer> {

	@Query("select d from DeliveryBoyOrders d where d.empId=:id and d.deliveryStatus='OUT_FOR_DELIVERY'")
	Optional<DeliveryBoyOrders> findByEmpId(@Param("id")int id);
	
}
