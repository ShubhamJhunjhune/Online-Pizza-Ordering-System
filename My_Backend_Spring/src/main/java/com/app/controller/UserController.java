package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.custom_excs.CustomerHandlingException;
import com.app.dao.CustomerRepository;
import com.app.dao.EmployeeRepository;
import com.app.dao.UserRepository;
import com.app.dto.ResponseDTO;
import com.app.dto.UserDTO;
import com.app.pojos.User;
import com.app.pojos.UserRole;
import com.app.service.IUserService;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
	@Autowired
	private IUserService userServ;
	@Autowired
	private CustomerRepository customerRepo;
	@Autowired
	private EmployeeRepository empRepo;

	@PostMapping
	public ResponseDTO<?> authenticateUser(@RequestBody UserDTO userDTO) {
		System.out.println(userDTO);
		User user = new User();
		user = userServ.authenticateUser(userDTO.getUserEmail(), userDTO.getPassword());

		if (user.getRole() == UserRole.CUSTOMER)
			return new ResponseDTO<>(HttpStatus.OK, "Updated user details",
					customerRepo.validateCustomer(userDTO.getUserEmail(), userDTO.getPassword()));
		else if (user.getRole() == UserRole.DELIVERYBOY)
			return new ResponseDTO<>(HttpStatus.OK, "Updated user details",
					empRepo.validateEmployee(userDTO.getUserEmail(), userDTO.getPassword()));

		return new ResponseDTO<>(HttpStatus.OK, "Updated user details",
				empRepo.validateEmployee(userDTO.getUserEmail(), userDTO.getPassword()));
	}
}
