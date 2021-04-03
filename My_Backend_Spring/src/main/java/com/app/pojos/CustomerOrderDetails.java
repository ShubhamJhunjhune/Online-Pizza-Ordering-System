package com.app.pojos;

import java.util.Date;

import javax.persistence.*;

//Order_det_ID	O_ID	C_ID	S_ID	size_id	crust_id		O_DATE_AND_TIME	O_QTY	total(base+size+crust)	
@Entity
@Table(name = "order_details")
public class CustomerOrderDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orderDetailsId;

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
	/*
	 * @ManyToOne(optional = false)
	 * 
	 * @JoinColumn(name = "orderId", nullable = false) private CustomerOrder
	 * custOrder;
	 */

	private double total;
	@Column(name="o_status")
	private String OrderStatus;
	


	@Temporal(TemporalType.DATE)
	private Date orderDate;
	private int orderId;
	
	
	public CustomerOrderDetails(Integer orderDetailsId, int custId, int subMenuId, int sizeId, int crustId, int qty,
			double total, String orderStatus, Date orderDate, int orderId) {
		this.orderDetailsId = orderDetailsId;
		this.custId = custId;
		this.subMenuId = subMenuId;
		this.sizeId = sizeId;
		this.crustId = crustId;
		this.qty = qty;
		this.total = total;
		OrderStatus = orderStatus;
		this.orderDate = orderDate;
		this.orderId = orderId;
	}

	public String getOrderStatus() {
		return OrderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		OrderStatus = orderStatus;
	}

	public CustomerOrderDetails() {
		System.out.println("in ctor of :" + getClass().getName());
	}

	
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public void setOrderDetailsId(Integer orderDetailsId) {
		this.orderDetailsId = orderDetailsId;
	}

	public int getOrderDetailsId() {
		return orderDetailsId;
	}

	public void setOrderDetailsId(int orderDetailsId) {
		this.orderDetailsId = orderDetailsId;
	}

	/*
	 * public CustomerOrder getCustOrder() { return custOrder; }
	 * 
	 * public void setCustOrder(CustomerOrder custOrder) { this.custOrder =
	 * custOrder; }
	 */

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

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "CustomerOrderDetails [orderDetailsId=" + orderDetailsId + ", custId=" + custId + ", subMenuId="
				+ subMenuId + ", sizeId=" + sizeId + ", crustId=" + crustId + ", qty=" + qty + ", orderDate="
				+ orderDate + ", total=" + total + "]";
	}

}
