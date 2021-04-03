package com.app.pojos;

import javax.persistence.*;

@Entity
@Table(name = "delivery_boy_orders")
public class DeliveryBoyOrders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int deliveryBoyOrdersId;
	@Column(name = "order_id")
	private int orderId;
	@Column(name = "emp_id")
	private int empId;
	@Column(name = "cust_id")
	private int custId;
	@Column(name = "addr_id")
	private int addrId;
	@Column(name = "delivery_status")
	private String deliveryStatus;

	public DeliveryBoyOrders() {
		System.out.println("in ctor of " + getClass().getName());
	}

	public DeliveryBoyOrders(int orderId, int empId, int custId, int addrId, String deliveryStatus) {
		super();

		this.orderId = orderId;
		this.empId = empId;
		this.custId = custId;
		this.addrId = addrId;
		this.deliveryStatus = deliveryStatus;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public int getAddrId() {
		return addrId;
	}

	public void setAddrId(int addrId) {
		this.addrId = addrId;
	}

	public String getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public int getDeliveryBoyOrdersId() {
		return deliveryBoyOrdersId;
	}

	public void setDeliveryBoyOrdersId(int deliveryBoyOrdersId) {
		this.deliveryBoyOrdersId = deliveryBoyOrdersId;
	}

	@Override
	public String toString() {
		return "DeliveryBoyOrders [orderId=" + orderId + ", empId=" + empId + ", custId=" + custId + ", addrId="
				+ addrId + ", deliveryStatus=" + deliveryStatus + "]";
	}

}
