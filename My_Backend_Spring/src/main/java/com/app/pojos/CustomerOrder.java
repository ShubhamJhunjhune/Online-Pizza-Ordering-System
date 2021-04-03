package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

//O_ID	C_ID	Total	Payment_status	Addr_ID
@Entity
@Table(name = "cust_order")
public class CustomerOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;
	@Column(name = "cust_id")
	private int custId;
	@Column(name = "addr_id")
	private int addrId;
	private double total;
	@Column(name="o_status")
	private String OrderStatus;

	/*
	 * @JsonIgnore
	 * 
	 * @OneToMany(mappedBy = "custOrder", fetch = FetchType.LAZY, cascade
	 * =CascadeType.ALL) private List<CustomerOrderDetails> custOrderDetails = new
	 * ArrayList<>();
	 */
	public CustomerOrder() {
		System.out.println("in ctor of :" + getClass().getName());
	}

	

	public String getOrderStatus() {
		return OrderStatus;
	}



	public void setOrderStatus(String orderStatus) {
		OrderStatus = orderStatus;
	}



	public CustomerOrder(int custId, int addrId, double total, String orderStatus) {
		this.custId = custId;
		this.addrId = addrId;
		this.total = total;
		OrderStatus = orderStatus;
	}



	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
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

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "CustomerOrder [orderId=" + orderId + ", custId=" + custId + ", addrId=" + addrId + ", total=" + total
				+ ", OrderStatus=" + OrderStatus + "]";
	}
	

	

	/*
	 * public List<CustomerOrderDetails> getCustOrderDetails() { return
	 * custOrderDetails; }
	 * 
	 * public void setCustOrderDetails(List<CustomerOrderDetails> custOrderDetails)
	 * { this.custOrderDetails = custOrderDetails; }
	 */

}
