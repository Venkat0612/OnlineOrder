package com.online.daoimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.online.MainClass;
import com.online.dao.ItemDAO;
import com.online.dao.OrderDAo;
import com.online.model.Item;
import com.online.model.Order;

public class OrderDAOImpl implements OrderDAo {

	private List<Order> orderData = new ArrayList<>();

	private ItemDAO itemDao = new ItemDAOImpl();

	@Override
	public void add(Order order) {

		orderData.add(order);
	}

	@Override
	public void update(int orderId) {
		Iterator<Item> itemData = itemDao.getItems().iterator();

		System.out.println("Please the Item Id from the below ");

		while (itemData.hasNext()) {

			Item item = itemData.next();

			System.out.println("Item Id: " + item.getItemId());

			System.out.println("Item Quantity: " + item.getItemQuantity());
		}

		System.out.println("Enter the item id: ");
		int id = MainClass.SCANNER.nextInt();

		System.out.println("Enter the quantity");
		int quantity = MainClass.SCANNER.nextInt();

		itemDao.update(id, quantity);

	}

	@Override
	public void delete(int orderId) {
		for (int i = 0; i < orderData.size(); i++) {
			if (orderData.get(i).getOrderId() == orderId) {
				List<Item> itemData = orderData.get(i).getItemDetails();
				itemData.remove(orderData.get(i).getItemDetails());
				orderData.remove(i);

			}
		}

	}

	@Override
	public List<Order> getOrders() {
		// TODO Auto-generated method stub
		return orderData;
	}

}
