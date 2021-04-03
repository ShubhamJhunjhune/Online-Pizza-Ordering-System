package com.app.dto;

public class ChangeStatusToDeliveringDTO {

	private int orderId;
	private int deliveryBoyId;
	
	public ChangeStatusToDeliveringDTO() {
		System.out.println("in ctopr of"+ getClass().getName());
	}

	public ChangeStatusToDeliveringDTO(int orderId, int deliveryBoyId) {
		super();
		this.orderId = orderId;
		this.deliveryBoyId = deliveryBoyId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getDeliveryBoyId() {
		return deliveryBoyId;
	}

	public void setDeliveryBoyId(int deliveryBoyId) {
		this.deliveryBoyId = deliveryBoyId;
	}
	

}
