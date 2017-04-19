package com.online.daoimpl;

import java.awt.ItemSelectable;
import java.util.ArrayList;
import java.util.List;

import com.online.dao.ItemDAO;
import com.online.model.Item;

public class ItemDAOImpl implements ItemDAO {

	private List<Item> itemData = new ArrayList<>();

	@Override
	public void add(Item item) {
		itemData.add(item);

	}

	@Override
	public void update(int itemId, int quantity) {

		for (int i = 0; i < itemData.size(); i++) {
			if (itemData.get(i).getItemId() == itemId) {
				itemData.get(i).setItemQuantity(quantity);
				itemData.get(i).getTotalPrice();
			}
		}

	}

	@Override
	public void delete(int itemId) {
		for (int i = 0; i < itemData.size(); i++) {
			if (itemData.get(i).getItemId() == itemId) {
				itemData.remove(i);
			}
		}

	}

	@Override
	public List<Item> getItems() {

		return itemData;
	}

}
