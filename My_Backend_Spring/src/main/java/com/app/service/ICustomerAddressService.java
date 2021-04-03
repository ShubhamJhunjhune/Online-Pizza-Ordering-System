package com.app.service;

import java.util.List;

import com.app.dto.CustomerAddressDTO;
import com.app.pojos.CustomerAddress;

public interface ICustomerAddressService {
	List<CustomerAddress> getAllCustomerAddress();
	CustomerAddress addCustomerAddress(CustomerAddressDTO custAddr, int id);
}
