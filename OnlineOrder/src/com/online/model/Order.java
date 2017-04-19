package com.online.model;

import java.util.List;

public class Order {

	int orderId;
	int userId;
	String address;
	String modeOfPayment;
	List<Item> itemDetails;
	double totalCost;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getModeOfPayment() {
		return modeOfPayment;
	}

	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}

	public List<Item> getItemDetails() {
		return itemDetails;
	}

	public void setItemDetails(List<Item> itemDetails) {
		this.itemDetails = itemDetails;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	@Override
	public String toString() {
		return String.format("OrderId=%s\n userId=%s\n address=%s\n modeOfPayment=%s\n totalCost=%s", orderId, userId,
				address, modeOfPayment, totalCost);
	}

}
