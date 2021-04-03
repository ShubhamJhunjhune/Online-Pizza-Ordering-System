package com.app.dao;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.pojos.Employees;

public interface EmployeeRepository extends JpaRepository<Employees,Integer>{

	@Query("select e from Employees e where e.empEmail=:id and e.empPass=:pass")
	Optional<Employees> validateEmployee(@Param("id")String id,@Param("pass") String pwd);
	
	@Query("select e from Employees e where e.role='DELIVERYBOY' and e.empStatus='NOT_WORKING'")
	List<Employees> findAllDeliveryBoys();
	
	@Query("select e from Employees e where e.empId=:id ")
	Optional<Employees> findEmployee(@Param("id")int  id);
}
