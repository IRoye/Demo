package mapper;

import java.util.List;

import model.Items;

public interface ItemMapper {

    /**
     * 
     * @param itemId
     * @return
     */
	List<Items> findItemList(String itemId);
	
    /**
     * 
     * @param itemId
     * @return
     */
    Items findItemById(String itemId);
    
    /**
     * 
     * @param item
     */
    int updateItemById(Items item);
    
    
}
