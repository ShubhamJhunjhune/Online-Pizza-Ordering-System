package com.app.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.EmployeeAddressRepository;
import com.app.dao.EmployeeRepository;
import com.app.dto.EmployeeAddressDTO;

import com.app.pojos.EmployeeAddress;

@Service
@Transactional
public class EmployeeAddressServiceImpl implements IEmployeeAddressService {
	@Autowired
	private EmployeeAddressRepository employeeAddrRepo;
	@Autowired
	private EmployeeRepository empRepo;
	
	@Override
	public List<EmployeeAddress> getAllEmployeeAddress() {
		return employeeAddrRepo.findAll();
	}


	@Override
	public EmployeeAddress addEmployeeAddress(EmployeeAddressDTO empAddr, int id) {
		EmployeeAddress employeeAddress = new EmployeeAddress();
		employeeAddress.setEmployee(empRepo.findById(id).get());
		BeanUtils.copyProperties(empAddr, employeeAddress,"employee");
		System.out.println("add user src : " + empAddr);
		System.out.println(employeeAddress);
		System.out.println(employeeAddress.getEmployee());
		System.out.println(empAddr.getEmployee());
		return employeeAddrRepo.save(employeeAddress);
	}

	

}
