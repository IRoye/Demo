package service;

import java.util.List;

import model.Items;

public interface ItemService {
      
	public List <Items> findItemList(String itemId);
}
