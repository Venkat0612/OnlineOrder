package com.online;

import java.util.Iterator;
import java.util.Scanner;

import com.online.dao.ItemDAO;
import com.online.dao.OrderDAo;
import com.online.daoimpl.ItemDAOImpl;
import com.online.daoimpl.OrderDAOImpl;
import com.online.model.Item;
import com.online.model.Order;

public class MainClass {

	public final static Scanner SCANNER = new Scanner(System.in);
	static OrderDAo ao = new OrderDAOImpl();

	public static void main(String[] args) {

		System.out.println("How many Order u want to make");

		int orderLen = SCANNER.nextInt();

		for (int i = 0; i < orderLen; i++) {

			System.out.println("Enter the no of items u want purchase");

			int itemLen = SCANNER.nextInt();
			ItemDAO itemDAO = new ItemDAOImpl();
			for (int j = 0; j < itemLen; j++) {

				Item item = new Item();

				System.out.println("Enter the Item ID");

				item.setItemId(SCANNER.nextInt());

				System.out.println("Enter the Item Name");

				item.setItemName(SCANNER.next());

				System.out.println("Enter the Item price ");

				item.setItemPrice(SCANNER.nextDouble());

				System.out.println("Enter the Item quantity");

				item.setItemQuantity(SCANNER.nextInt());

				System.out.println("Enter the discount ");

				item.setItemDiscount(SCANNER.nextDouble());
				itemDAO.add(item);

			}

			System.out.println("Enter the order ID");

			Order order = new Order();

			order.setOrderId(SCANNER.nextInt());
			System.out.println("Enter the User ID");

			order.setUserId(SCANNER.nextInt());

			System.out.println("Enter the Address");
			order.setAddress(SCANNER.next());

			order.setItemDetails(itemDAO.getItems());

			System.out.println("Enter the Mode of Payment");
			order.setModeOfPayment(SCANNER.next());

			

			ao.add(order);
		}

		display();

	}

	private static void display() {

		Iterator orderDetails =ao.getOrders().iterator();

		while (orderDetails.hasNext()) {
			System.out.println(orderDetails.next());
		}

		System.out.println("Enter the Order ID to display the item details");

		int id = SCANNER.nextInt();

		orderDetails = ao.getOrders().iterator();

		while (orderDetails.hasNext()) {
			Order order = (Order) orderDetails.next();
			if (order.getOrderId() == id) {
				Iterator it = order.getItemDetails().iterator();

				while (it.hasNext()) {
					System.out.println(it.next());
				}
			}

		}

	}

}
