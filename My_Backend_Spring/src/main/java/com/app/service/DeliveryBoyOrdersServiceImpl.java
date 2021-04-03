package com.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_excs.CustomerHandlingException;
import com.app.dao.CustomerAddressRepository;
import com.app.dao.CustomerOrderDetailsRepository;
import com.app.dao.CustomerOrderRepository;
import com.app.dao.CustomerRepository;
import com.app.dao.DeliveryBoyOrdersRepo;
import com.app.dao.EmployeeRepository;
import com.app.pojos.CustomerAddress;
import com.app.pojos.CustomerOrder;
import com.app.pojos.CustomerOrderDetails;
import com.app.pojos.Customers;
import com.app.pojos.DeliveryBoyOrders;
import com.app.pojos.EmployeeStatus;
import com.app.pojos.Employees;

@Service
@Transactional
public class DeliveryBoyOrdersServiceImpl implements IDeliveryBoyOrdersService {

	@Autowired
	private DeliveryBoyOrdersRepo deliveryBoyRepo;
	@Autowired
	private CustomerAddressRepository custAddrRepo;
	@Autowired
	private CustomerRepository custRepo;
	@Autowired
	private EmployeeRepository employeeRepo;

	@Autowired
	private CustomerOrderDetailsRepository customerOrderDetailsRepo;

	@Autowired
	private CustomerOrderRepository customerOrderRepo;

	@Override
	public List<String> showDeliveryBoyOrders(int empId) {
		DeliveryBoyOrders deliveryBoyOrders = new DeliveryBoyOrders();
		deliveryBoyOrders = deliveryBoyRepo.findByEmpId(empId)
				.orElseThrow(() -> new CustomerHandlingException("Error in showDeliveryBoyOrders"));
		System.out.println("deliveryBoyOrders" + deliveryBoyOrders);
		CustomerAddress custAddr = new CustomerAddress();
		custAddr = custAddrRepo.findById(deliveryBoyOrders.getAddrId())
				.orElseThrow(() -> new CustomerHandlingException("Error in showDeliveryBoyOrders"));
		System.out.println("custAddr" + custAddr);
		Customers cust = new Customers();
		cust = custRepo.findById(deliveryBoyOrders.getCustId())
				.orElseThrow(() -> new CustomerHandlingException("Error in showDeliveryBoyOrders"));
		System.out.println("cust" + cust);

		List<String> list = new ArrayList<>();
		list.add(cust.getCustName());
		list.add(cust.getCustMobile());
		list.add(custAddr.toString());
		System.out.println("list" + list);
		return list;
	}

	@Override
	public String changeStatusToDelivered(int empId, int orderId) {
		System.out.println(empId + "       " + orderId);
		Employees emp = new Employees();
		emp = employeeRepo.findEmployee(empId)
				.orElseThrow(() -> new CustomerHandlingException("Error in changeStatusToDelivered"));
		emp.setEmpStatus(EmployeeStatus.NOT_WORKING);

		CustomerOrder order = new CustomerOrder();
		order = customerOrderRepo.findOrder(orderId)
				.orElseThrow(() -> new CustomerHandlingException("Error in changeStatusToDelivered"));
		order.setOrderStatus("DELIVERED");

		List<CustomerOrderDetails> custOrderDet = new ArrayList<>();
		custOrderDet = customerOrderDetailsRepo.findOrdersById(orderId);
		for (CustomerOrderDetails cod : custOrderDet) {
			cod.setOrderStatus("DELIVERED");
		}

		// int orderId, int empId, int custId, int addrId, String deliveryStatus
		DeliveryBoyOrders deliveryBoyOrders = new DeliveryBoyOrders();
		// deliveryBoyRepo.save(deliveryBoyOrders);
		deliveryBoyOrders = deliveryBoyRepo.findByEmpId(empId)
				.orElseThrow(() -> new CustomerHandlingException("Error in changeStatusToDelivered"));
		deliveryBoyOrders.setDeliveryStatus("DELIVERED");
		System.out.println(deliveryBoyOrders);
		return "status changed";

	}

}
