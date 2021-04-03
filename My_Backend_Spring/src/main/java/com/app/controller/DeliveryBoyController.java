package com.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.ResponseDTO;
import com.app.service.IDeliveryBoyOrdersService;

@RestController
@RequestMapping("/deliveryboy")
@CrossOrigin
public class DeliveryBoyController {

	@Autowired
	private IDeliveryBoyOrdersService deliveryBoysServ;

	@GetMapping("/{empId}")
	public ResponseDTO<?> showDeliveryBoyOrders(@PathVariable int empId) {
		System.out.println("inside showDeliveryBoyOrders:" + empId);
		List<String> list = new ArrayList<>();
		list = deliveryBoysServ.showDeliveryBoyOrders(empId);
		System.out.println(list);
		return new ResponseDTO<>(HttpStatus.OK, "Updated user details", list);
	}
	
	@PutMapping("/{empId}/{orderId}")
	public ResponseDTO<?> changeStatusToDelivered(@PathVariable int empId, @PathVariable int orderId){
		System.out.println("emp id "+empId+"         "+orderId);
		
		return new ResponseDTO<>(HttpStatus.OK, "Updated user details",
				deliveryBoysServ.changeStatusToDelivered(empId, orderId) );
	}
}
