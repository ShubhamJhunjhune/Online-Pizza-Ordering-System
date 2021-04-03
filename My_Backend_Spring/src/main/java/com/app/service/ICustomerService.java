package com.app.service;

import java.util.List;

import com.app.dto.CartDTO;
import com.app.dto.CustomerDTO;
import com.app.dto.ShowCartDTO;
import com.app.pojos.CustomerCart;
import com.app.pojos.CustomerOrder;
import com.app.pojos.CustomerOrderDetails;
import com.app.pojos.Customers;
import com.app.pojos.SubMenu;


public interface ICustomerService {
	List<Customers> getAllCustomers();
	Customers addCustomerDetails(CustomerDTO user);
	Customers authenticateCustomer(String customerId, String pwd);
	Customers editCustomerDetails(int custId,CustomerDTO customerDTO);
	
	CustomerCart addToCart (int custId, CartDTO cartDTO);
	List<CustomerCart> getAllCart(int custId);
	List<ShowCartDTO> getAllCartDetails(int custId);
	CustomerOrder addToCustomerOrder (int custId);
	List<SubMenu> getCustomerOrderHistory (int custId);
	String deleteCart(int cartId);
}