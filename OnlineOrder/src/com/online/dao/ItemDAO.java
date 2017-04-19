package com.online.dao;

import java.util.List;

import com.online.model.Item;

public interface ItemDAO {

	public void add(Item item);

	public void update(int itemId, int quantity);

	public void delete(int itemId);
	
	public List<Item> getItems();
	
	

}
