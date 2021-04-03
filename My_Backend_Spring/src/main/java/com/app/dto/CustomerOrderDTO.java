package com.app.dto;

public class CustomerOrderDTO {
	private int orderId;
	private int custId;
	private int addrId;
	private double total;
	public CustomerOrderDTO() {

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
		return "CustomerOrderDTO [orderId=" + orderId + ", custId=" + custId + ", addrId=" + addrId + ", total=" + total
				+ "]";
	}

}
