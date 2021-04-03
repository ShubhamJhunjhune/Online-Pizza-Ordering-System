package com.app.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.CustomerAddressRepository;
import com.app.dao.CustomerRepository;
import com.app.dto.CustomerAddressDTO;
import com.app.pojos.CustomerAddress;
import com.app.pojos.Customers;

@Service
@Transactional
public class CustomerAddressServiceImpl implements ICustomerAddressService {
	@Autowired
	private CustomerAddressRepository customerAddrRepo;
	@Autowired
	private CustomerRepository custRepo;
	
	@Override
	public List<CustomerAddress> getAllCustomerAddress() {
		return customerAddrRepo.findAll();
	}

	@Override
	public CustomerAddress addCustomerAddress(CustomerAddressDTO custAddr,int id) {
		CustomerAddress customerAddress = new CustomerAddress();
		customerAddress.setCustomer(custRepo.findById(id).get());
		BeanUtils.copyProperties(custAddr, customerAddress,"customer");
		System.out.println("add user src : " + custAddr);
		System.out.println(customerAddress);
		System.out.println(customerAddress.getCustomer());
		System.out.println(custAddr.getCustomer());
		return customerAddrRepo.save(customerAddress);
	}

}
