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
import com.app.dto.ResponseDTO;
import com.app.service.ICustomerAddressService;

@RestController
@RequestMapping("/address")
@CrossOrigin
public class CustomerAddressController {
	@Autowired
	private ICustomerAddressService customerAddressService;

	@GetMapping
	public ResponseDTO<?> getAllCustomerAddress() {
		System.out.println("in get all customers");
		return new ResponseDTO<>(HttpStatus.OK, "Fetching user list successfully", customerAddressService.getAllCustomerAddress());
	}
	
	@PostMapping("/{userId}")
	public ResponseDTO<?> addCustomerAddress(@RequestBody CustomerAddressDTO customerAddrDTO,@PathVariable int userId
) {
		System.out.println("in add user details " + customerAddrDTO);
		System.out.println("customerId = "+userId);
		return new ResponseDTO<>(HttpStatus.OK, "User details added", customerAddressService.addCustomerAddress(customerAddrDTO,userId));
	}
}
