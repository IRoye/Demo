package service;

import java.util.List;

import model.Items;

public interface ItemService {
    
	/**
	 * 
	 * @param itemId
	 * @return
	 */
	public List <Items> findItemList(String itemId);
	
	/**
	 * 
	 * @param itemId
	 * @return
	 */
	Items getItemsById(String itemId);
	
	/**
	 * 
	 * @param item
	 * @return
	 */
	int updateItem(Items item);
}
