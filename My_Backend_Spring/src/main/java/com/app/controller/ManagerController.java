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
import com.app.dto.ChangeStatusToDeliveringDTO;
import com.app.dto.CustomerDTO;
import com.app.dto.LoginRequest;
import com.app.dto.ResponseDTO;
import com.app.service.ICustomerService;
import com.app.service.IManagerService;

@RestController
@RequestMapping("/manager")
@CrossOrigin
public class ManagerController {
	@Autowired
	private IManagerService managerService;

	@GetMapping("/deliveryboy")
	public ResponseDTO<?> getAllDeliveryBoys() {
		System.out.println("in get all deliveryboy");
		return new ResponseDTO<>(HttpStatus.OK, "Fetching delivery boys list successfully", managerService.getAllDeliveryBoys());
	}
	
	@GetMapping
	public ResponseDTO<?> getAllOrders() {
		System.out.println("in get all orders");
		return new ResponseDTO<>(HttpStatus.OK, "Fetching orders list successfully", managerService.getAllOrders());
	}

	@GetMapping("/{orderId}")
	public ResponseDTO<?> getAllOrderDetails(@PathVariable int orderId) {
		System.out.println("in get all orders");
		return new ResponseDTO<>(HttpStatus.OK, "Fetching orders list successfully",
				managerService.getAllOrderDetails(orderId));
	}
	
	
	@PostMapping
	public ResponseDTO<?> changeStatusToDelivering(
			@RequestBody ChangeStatusToDeliveringDTO changeStatusToDeliveringDTO) {
		System.out.println("in get all changeStatusToDelivering");
		return new ResponseDTO<>(HttpStatus.OK, "Fetching delivery boys list successfully",
				managerService.changeStatusToDelivering(changeStatusToDeliveringDTO.getDeliveryBoyId(),
						changeStatusToDeliveringDTO.getOrderId()));
	
	}
	

}
