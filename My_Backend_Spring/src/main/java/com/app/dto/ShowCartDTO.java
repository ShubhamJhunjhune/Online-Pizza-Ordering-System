package com.app.dto;


public class ShowCartDTO {
	private int cartId;
	private int custId;
	private String subMenuName;
	private String subMenuDetails;
	private double subMenuBasePrice;
	private int sizeId;
	private int crustId;
	private int addrId;
	private int qty;
	private double total;

	public ShowCartDTO() {
		System.out.println("in cyor of " + getClass().getName());
	}

	
	public ShowCartDTO(int cartId, int custId, String subMenuName, String subMenuDetails, double subMenuBasePrice,
			int sizeId, int crustId, int addrId, int qty, double total) {
		this.cartId = cartId;
		this.custId = custId;
		this.subMenuName = subMenuName;
		this.subMenuDetails = subMenuDetails;
		this.subMenuBasePrice = subMenuBasePrice;
		this.sizeId = sizeId;
		this.crustId = crustId;
		this.addrId = addrId;
		this.qty = qty;
		this.total = total;
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

	public String getSubMenuName() {
		return subMenuName;
	}

	public void setSubMenuName(String subMenuName) {
		this.subMenuName = subMenuName;
	}
	
	

	public String getSubMenuDetails() {
		return subMenuDetails;
	}


	public void setSubMenuDetails(String subMenuDetails) {
		this.subMenuDetails = subMenuDetails;
	}


	public double getSubMenuBasePrice() {
		return subMenuBasePrice;
	}


	public void setSubMenuBasePrice(double subMenuBasePrice) {
		this.subMenuBasePrice = subMenuBasePrice;
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

	@Override
	public String toString() {
		return "CartDTO [cartId=" + cartId + ", custId=" + custId + ", subMenuName=" + subMenuName + ", sizeId=" + sizeId
				+ ", crustId=" + crustId + ", addrId=" + addrId + ", qty=" + qty + ", total=" + total + "]";
	}

}
