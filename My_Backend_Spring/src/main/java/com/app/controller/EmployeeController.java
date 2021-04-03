package com.app.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.CustomerDTO;
import com.app.dto.EmployeeDTO;
import com.app.dto.LoginRequest;
import com.app.dto.LoginRequest_emp;
import com.app.dto.ResponseDTO;
import com.app.service.ICustomerService;
import com.app.service.IEmployeeAddressService;
import com.app.service.IEmployeeService;

@RestController
@RequestMapping("/employee")
@CrossOrigin
public class EmployeeController {
	@Autowired
	private IEmployeeService employeeService;
	@Autowired
	private IEmployeeAddressService employeeAddressService;

	@GetMapping
	public ResponseDTO<?> getAllEmployees() {
		System.out.println("in get all employees");
		return new ResponseDTO<>(HttpStatus.OK, "Fetching user list successfully", employeeService.getAllEmployees());
	}
	
	@PostMapping("/{uid}/{role}")
	public ResponseDTO<?> addDetails(@PathVariable int uid,@PathVariable String role,@RequestBody EmployeeDTO employeeDTO) {
		System.out.println("in add user details " + employeeDTO);
		return new ResponseDTO<>(HttpStatus.OK, "User details added", employeeService.addEmployeeDetails(uid,role,employeeDTO));
	}
	
	@PostMapping("/signin")
	public ResponseEntity<?> authenticateEmployee(@RequestBody LoginRequest_emp request) {
		System.out.println("in auth " + request);
		// API : o.s.http.ResponseEntity<T> (T body,HttpStatus stsCode)
		return new ResponseEntity<>(employeeService.authenticateEmployee(request.getEmployeeEmail(), request.getPassword()),HttpStatus.OK);

	}
	
	
	
	@GetMapping("/orders/{role}")
	public ResponseDTO<?> getAllOrders(@PathVariable int role) {
		System.out.println("in get all orders");
		return new ResponseDTO<>(HttpStatus.OK, "Fetching Order List successfully", employeeService.getAllOrders(role));
	}
	
}
