package com.app.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerOrderDetailsDTO {
	private int orderDetailsId;
	private int cartId;
	private int custId;
	private int subMenuId;
	private int sizeId;
	private int crustId;
	private int addrId;
	private int qty;
	private double total;
	//private String Ostatus;
	private int OrderId;
	public CustomerOrderDetailsDTO() {
		System.out.println("in cyor of " + getClass().getName());
	}

	public CustomerOrderDetailsDTO(int cartId, int custId, int subMenuId, int sizeId, int crustId, int addrId, int qty, double total){ //, String Ostatus) {
		super();
		this.cartId = cartId;
		this.custId = custId;
		this.subMenuId = subMenuId;
		this.sizeId = sizeId;
		this.crustId = crustId;
		this.addrId = addrId;
		this.qty = qty;
		this.total = total;
		//this.Ostatus = Ostatus;
	}
	
	
//	public String getOstatus() {
//		return Ostatus;
//	}
//
//	public void setOstatus(String ostatus) {
//		Ostatus = ostatus;
//	}

	public int getOrderDetailsId() {
		return orderDetailsId;
	}

	public void setOrderDetailsId(int orderDetailsId) {
		this.orderDetailsId = orderDetailsId;
	}


	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public int getSubMenuId() {
		return subMenuId;
	}

	public void setSubMenuId(int subMenuId) {
		this.subMenuId = subMenuId;
	}

	public int getSizeId() {
		return sizeId;
	}

	public void setSizeId(int sizeId) {
		this.sizeId = sizeId;
	}

	public int getCrustId() {
		return crustId;
	}

	public void setCrustId(int crustId) {
		this.crustId = crustId;
	}

	public int getAddrId() {
		return addrId;
	}

	public void setAddrId(int addrId) {
		this.addrId = addrId;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getOrderId() {
		return OrderId;
	}

	public void setOrderId(int orderId) {
		OrderId = orderId;
	}

	@Override
	public String toString() {
		return "CustomerOrderDetailsDTO [orderDetailsId=" + orderDetailsId + ", cartId=" + cartId + ", custId=" + custId
				+ ", subMenuId=" + subMenuId + ", sizeId=" + sizeId + ", crustId=" + crustId + ", addrId=" + addrId
				+ ", qty=" + qty + ", total=" + total + ", OrderId=" + OrderId + "]";
	}

}
