package com.app.service;

import java.util.List;

import com.app.dto.CartDTO;
import com.app.dto.CustomerDTO;
import com.app.dto.ShowPendingOrderDTO;
import com.app.pojos.CustomerCart;
import com.app.pojos.CustomerOrder;
import com.app.pojos.CustomerOrderDetails;
import com.app.pojos.Customers;
import com.app.pojos.Employees;


public interface IManagerService {
	//List<CustomerOrder> getAllOrders();
	List<ShowPendingOrderDTO> getAllOrders();
	List<CustomerOrderDetails> getAllOrderDetails(int orderId);
	List<Employees> getAllDeliveryBoys();
	String changeStatusToDelivering (int deliveryBoyId, int orderId);
}