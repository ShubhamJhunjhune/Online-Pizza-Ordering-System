package com.app.dto;


public class ShowPendingOrderDTO {

	private int orderId;
	private int custId;
	private int addrId;
	private double total;
	private String OrderStatus;
	private String custName;
	private String custMobile;
	
	
	public ShowPendingOrderDTO(int orderId, int custId, int addrId, double total, String orderStatus, String custName,
			String custMobile) {
		this.orderId = orderId;
		this.custId = custId;
		this.addrId = addrId;
		this.total = total;
		OrderStatus = orderStatus;
		this.custName = custName;
		this.custMobile = custMobile;
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
	public String getOrderStatus() {
		return OrderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		OrderStatus = orderStatus;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustMobile() {
		return custMobile;
	}
	public void setCustMobile(String custMobile) {
		this.custMobile = custMobile;
	}
	@Override
	public String toString() {
		return "ShowPendingOrderDTO [orderId=" + orderId + ", custId=" + custId + ", addrId=" + addrId + ", total="
				+ total + ", OrderStatus=" + OrderStatus + ", custName=" + custName + ", custMobile=" + custMobile
				+ "]";
	}
	
	
	

}
