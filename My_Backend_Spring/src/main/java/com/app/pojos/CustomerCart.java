package com.app.pojos;

import javax.persistence.*;

//Cart	Cart_ID	C_ID	S_ID	size_id	crust_id	Addr_ID	O_QTY	total(base+size+crust)	Cart_status
@Entity
@Table(name = "cust_cart")
public class CustomerCart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cartId;
	@Column(name = "cust_id")
	private int custId;
	@Column(name = "sub_menu_id")
	private int subMenuId;
	@Column(name = "size_id")
	private int sizeId;
	@Column(name = "crust_id")
	private int crustId;
	@Column(name = "qty")
	private int qty;
	private double total;
	@Column(name = "addr_id")
	private int addrId;
//	@Enumerated(EnumType.STRING)
//	private CartStatus cartStatus;

	public CustomerCart() {
		System.out.println("inside ctor of" + getClass().getName());
	}

	public CustomerCart(int custId, int subMenuId, int sizeId, int crustId, int addrId, int qty, double total) {
		super();
		this.custId = custId;
		this.subMenuId = subMenuId;
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

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}


	@Override
	public String toString() {
		return "CustomerCart [cartId=" + cartId + ", custId=" + custId + ", subMenuId=" + subMenuId + ", sizeId="
				+ sizeId + ", crustId=" + crustId + ", addrId=" + addrId + ", qty=" + qty + ", total=" + total
				+ "]";
	}

}
