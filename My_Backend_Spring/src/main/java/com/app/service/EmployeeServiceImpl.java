
package com.app.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_excs.CustomerHandlingException;
import com.app.dao.CustomerOrderDetailsRepository;
import com.app.dao.EmployeeRepository;
import com.app.dao.UserRepository;
import com.app.dto.EmployeeDTO;
import com.app.pojos.CustomerOrderDetails;
import com.app.pojos.EmployeeAddress;
import com.app.pojos.Employees;
import com.app.pojos.User;
import com.app.pojos.UserRole;

@Service
@Transactional
public class EmployeeServiceImpl implements IEmployeeService {
	@Autowired
	private EmployeeRepository employeeRepo;

	@Autowired
	private CustomerOrderDetailsRepository customerOrderDetailsRepo;
	@Autowired
	private UserRepository userRepo;

	@Override
	public List<Employees> getAllEmployees() {
		return employeeRepo.findAll();

	}

	@Override
	public Employees addEmployeeDetails(int mngrid, String role, EmployeeDTO employeeDTO) {
		Employees employees = new Employees();
		employeeDTO.setRole(role);
		employeeDTO.setManagerId(mngrid);
		BeanUtils.copyProperties(employeeDTO, employees);
		System.out.println("add user src : " + employeeDTO);
		System.out.println(employees);
		System.out.println("Role is : " + employees.getRole());
		User user = new User();
		user.setUserEmail(employeeDTO.getEmpEmail());
		user.setPassword(employeeDTO.getEmpPass());
		if(role.equals("MANAGER"))
			user.setRole(UserRole.MANAGER);
		else 
			user.setRole(UserRole.DELIVERYBOY);
		userRepo.save(user);
		return employeeRepo.save(employees);
		// return null;
	}

	@Override
	public Employees authenticateEmployee(String empEmail, String pwd) {
		System.out.println(empEmail + "  pwd " + pwd);

		return employeeRepo.validateEmployee(empEmail, pwd)
				.orElseThrow(() -> new CustomerHandlingException("Invalid Credentials!!!!"));
		// if(emp.getEmpRole().equals())
	}

	@Override
	public List<CustomerOrderDetails> getAllOrders(int role) {
		return customerOrderDetailsRepo.findAll();
	}

}