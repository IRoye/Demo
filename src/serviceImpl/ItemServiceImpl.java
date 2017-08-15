package serviceImpl;

import java.util.List;

import mapper.ItemMapper;
import model.Items;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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
    // mysql 中默认的隔离级别： 
	@Override
	@Transactional(isolation=Isolation.DEFAULT, propagation=Propagation.REQUIRED ,readOnly=true, rollbackFor=Exception.class)
	public int updateItem(Items item) {
		// TODO Auto-generated method stub
		itemMapper.updateItemById(item);
		int a = 1/0;
		return 1;
	}

}
