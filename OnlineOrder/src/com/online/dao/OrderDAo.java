package com.online.dao;

import java.util.List;

import com.online.model.Order;

public interface OrderDAo {

	public void add(Order order);

	public void update(int orderId);

	public void delete(int orderId);
	
	public List<Order> getOrders();

}
