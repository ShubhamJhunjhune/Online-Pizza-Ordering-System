package com.app.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.CustomerAddressDTO;
import com.app.dto.EmployeeAddressDTO;
import com.app.dto.ResponseDTO;
import com.app.service.ICustomerAddressService;
import com.app.service.IEmployeeAddressService;

@RestController
@RequestMapping("/emp/address")
@CrossOrigin
public class EmployeeAddressController {
	@Autowired
	private IEmployeeAddressService employeeAddressService;

	@GetMapping
	public ResponseDTO<?> getAllEmployeeAddress() {
		System.out.println("in get all customers");
		return new ResponseDTO<>(HttpStatus.OK, "Fetching user list successfully", employeeAddressService.getAllEmployeeAddress());
	}
	
	@PostMapping("/{userId}")
	public ResponseDTO<?> addEmployeeAddress(@RequestBody EmployeeAddressDTO employeeAddrDTO,@PathVariable int userId
) {
		System.out.println("in add user details " + employeeAddrDTO);
		System.out.println("customerId = "+userId);
		return new ResponseDTO<>(HttpStatus.OK, "User details added", employeeAddressService.addEmployeeAddress(employeeAddrDTO,userId));
	}
}
