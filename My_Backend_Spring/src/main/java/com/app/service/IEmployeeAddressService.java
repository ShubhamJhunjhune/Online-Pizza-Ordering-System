package com.app.service;

import java.util.List;

import com.app.dto.EmployeeAddressDTO;
import com.app.pojos.EmployeeAddress;

public interface IEmployeeAddressService {
	List<EmployeeAddress> getAllEmployeeAddress();
	EmployeeAddress addEmployeeAddress(EmployeeAddressDTO empAddr, int id);
}
