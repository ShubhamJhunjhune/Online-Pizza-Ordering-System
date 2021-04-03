package com.app.service;

import java.util.List;

import com.app.dto.EmployeeDTO;
import com.app.pojos.CustomerAddress;
import com.app.pojos.CustomerOrderDetails;
import com.app.pojos.Customers;
import com.app.pojos.EmployeeAddress;
import com.app.pojos.Employees;

public interface IEmployeeService {
	List<Employees> getAllEmployees();
	Employees addEmployeeDetails(int uid, String role, EmployeeDTO employeeDTO);
	Employees authenticateEmployee(String empEmail,String pwd);
	
	List<CustomerOrderDetails> getAllOrders(int role);
	
}
