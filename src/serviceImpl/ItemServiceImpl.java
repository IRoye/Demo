package serviceImpl;

import java.util.List;

import mapper.ItemMapper;
import model.Items;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import service.ItemService;

@Service("itemService")
public class ItemServiceImpl implements ItemService{

	@Autowired
    private ItemMapper itemMapper;
	
	@Override
	public List<Items> findItemList(String itemId) {
		// TODO Auto-generated method stub
		return itemMapper.findItemList("123");
	}

	@Override
	public Items getItemsById(String itemId) {
		// TODO Auto-generated method stub
		return itemMapper.findItemById(itemId);
	}

	@Override
	public int updateItem(Items item) {
		// TODO Auto-generated method stub
		return itemMapper.updateItemById(item);
	}

}
