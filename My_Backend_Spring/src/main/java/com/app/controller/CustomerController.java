package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.CartDTO;
import com.app.dto.CustomerDTO;
import com.app.dto.LoginRequest;
import com.app.dto.ResponseDTO;
import com.app.service.ICustomerService;

@RestController
@RequestMapping("/customer")
@CrossOrigin
public class CustomerController {
	@Autowired
	private ICustomerService customerService;

	@GetMapping
	public ResponseDTO<?> getAllCustomers() {
		System.out.println("in get all customers");
		return new ResponseDTO<>(HttpStatus.OK, "Fetching user list successfully", customerService.getAllCustomers());
	}

	@PostMapping
	public ResponseDTO<?> addCustomerDetails(@RequestBody CustomerDTO customerDTO) {
		System.out.println("in add user details " + customerDTO);
		return new ResponseDTO<>(HttpStatus.OK, "User details added", customerService.addCustomerDetails(customerDTO));
	}

	@PostMapping("/signin")
	public ResponseEntity<?> authenticateCustomer(@RequestBody LoginRequest request) {
		System.out.println("in auth " + request);
		// API : o.s.http.ResponseEntity<T> (T body,HttpStatus stsCode)
		return new ResponseEntity<>(
				customerService.authenticateCustomer(request.getCustomerId(), request.getPassword()), HttpStatus.OK);

	}

	@PutMapping("/{custId}")
	public ResponseDTO<?> updateCustomerDetails(@PathVariable int custId, @RequestBody CustomerDTO customerDTO) {
		System.out.println("in rest : update details " + custId + " " + customerDTO);
		return new ResponseDTO<>(HttpStatus.OK, "Updated user details",
				customerService.editCustomerDetails(custId, customerDTO));
	}

	@PostMapping("/cart/{custId}")
	public ResponseDTO<?> addToCart(@PathVariable int custId, @RequestBody CartDTO cartDTO) {
		System.out.println("in add user details " + cartDTO + "    " + custId);
		return new ResponseDTO<>(HttpStatus.OK, "User details added", customerService.addToCart(custId, cartDTO));
	}
	
	@GetMapping("/cart/{custId}")
	public ResponseDTO<?> getAllCart(@PathVariable int custId) {
		System.out.println("in get all carts");
		return new ResponseDTO<>(HttpStatus.OK, "Fetching cart list successfully", customerService.getAllCart(custId));
	}

	@PostMapping("/order/{custId}")
	public ResponseDTO<?> addToCustomerOrder(@PathVariable int custId) {
		System.out.println("in add user details " + custId);
		return new ResponseDTO<>(HttpStatus.OK, "User details added", customerService.addToCustomerOrder(custId));
	}
	
	@GetMapping("/history/{custId}")
	public ResponseDTO<?> getCustomerOrderHistory(@PathVariable int custId) {
		System.out.println("in get order history");
		return new ResponseDTO<>(HttpStatus.OK, "Fetching history list successfully", customerService.getCustomerOrderHistory(custId));
	}
	
	@PostMapping("/cart/delete/{cartId}")
	public ResponseDTO<?> deleteCart(@PathVariable int cartId) {
		System.out.println("in delete cart " + cartId);
		return new ResponseDTO<>(HttpStatus.OK, "User details added", customerService.deleteCart(cartId));
	}
	
	@GetMapping("/cartdetails/{custId}")
	public ResponseDTO<?> getAllCartDetails(@PathVariable int custId) {
		System.out.println("in get all carts");
		return new ResponseDTO<>(HttpStatus.OK, "Fetching cart list successfully", customerService.getAllCartDetails(custId));
	}
}
