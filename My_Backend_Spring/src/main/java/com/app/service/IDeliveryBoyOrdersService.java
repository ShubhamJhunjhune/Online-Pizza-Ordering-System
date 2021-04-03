package com.app.service;

import java.util.List;

import com.app.pojos.CustomerOrder;

public interface IDeliveryBoyOrdersService {

	List<String> showDeliveryBoyOrders(int empId);
	String changeStatusToDelivered(int empId, int orderId);
}
