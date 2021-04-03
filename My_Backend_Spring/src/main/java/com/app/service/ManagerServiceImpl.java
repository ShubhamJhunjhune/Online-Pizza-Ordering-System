
package com.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_excs.CustomerHandlingException;
import com.app.dao.CustomerOrderDetailsRepository;
import com.app.dao.CustomerOrderRepository;
import com.app.dao.CustomerRepository;
import com.app.dao.DeliveryBoyOrdersRepo;
import com.app.dao.EmployeeRepository;
import com.app.dto.ShowPendingOrderDTO;
import com.app.pojos.CustomerOrder;
import com.app.pojos.CustomerOrderDetails;
import com.app.pojos.Customers;
import com.app.pojos.DeliveryBoyOrders;
import com.app.pojos.EmployeeStatus;
import com.app.pojos.Employees;

@Service
@Transactional
public class ManagerServiceImpl implements IManagerService {
	@Autowired
	private EmployeeRepository employeeRepo;
	
	@Autowired
	private CustomerOrderDetailsRepository customerOrderDetailsRepo;
	
	@Autowired
	private CustomerOrderRepository customerOrderRepo;
	
	@Autowired
	private DeliveryBoyOrdersRepo deliveryBoyRepo;
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public List<Employees> getAllDeliveryBoys() {
		return employeeRepo.findAllDeliveryBoys();
	}
	
	@Override
	public List<ShowPendingOrderDTO> getAllOrders() {
		List<CustomerOrder> customerOrder = new ArrayList<>();
		customerOrder = customerOrderRepo.findAllPending();
		List<ShowPendingOrderDTO> showPendingOrderDTO = new ArrayList<ShowPendingOrderDTO>();
		for (CustomerOrder co : customerOrder) {
			int custId = co.getCustId();
			Customers customers = new Customers();
			customers = customerRepository.findAllCust(custId);
			ShowPendingOrderDTO showPendingOrderDTO1 = new ShowPendingOrderDTO(co.getOrderId(),co.getCustId(),co.getAddrId(),co.getTotal(),co.getOrderStatus(),customers.getCustName(),customers.getCustMobile());
			showPendingOrderDTO.add(showPendingOrderDTO1);
		}
		return showPendingOrderDTO;
	}

	@Override
	public List<CustomerOrderDetails> getAllOrderDetails(int orderId) {
		
		return customerOrderDetailsRepo.findOrdersById(orderId);
	}

	@Override
	public String changeStatusToDelivering(int deliveryBoyId, int orderId) {
		System.out.println("db id :" + deliveryBoyId + "o id " + orderId);
		Employees emp = new Employees();
		emp = employeeRepo.findEmployee(deliveryBoyId)
				.orElseThrow(() -> new CustomerHandlingException("Error in changeStatusToDelivering"));
		emp.setEmpStatus(EmployeeStatus.WORKING);

		CustomerOrder order = new CustomerOrder();
		order = customerOrderRepo.findOrder(orderId)
				.orElseThrow(() -> new CustomerHandlingException("Error in changeStatusToDelivering"));
		order.setOrderStatus("OUT_FOR_DELIVERY");

		List<CustomerOrderDetails> custOrderDet = new ArrayList<>();
		custOrderDet = customerOrderDetailsRepo.findOrdersById(orderId);
		for (CustomerOrderDetails cod : custOrderDet) {
			cod.setOrderStatus("OUT_FOR_DELIVERY");
		}

		// int orderId, int empId, int custId, int addrId, String deliveryStatus
		DeliveryBoyOrders deliveryBoyOrders = new DeliveryBoyOrders(orderId, deliveryBoyId, order.getCustId(),
				order.getAddrId(), "OUT_FOR_DELIVERY");
		deliveryBoyRepo.save(deliveryBoyOrders);
		System.out.println(deliveryBoyOrders);
		return "status changed";
	}
}
