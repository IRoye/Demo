package mapper;

import java.util.List;


import model.Items;

public interface ItemMapper {

	List<Items> findItemList(String itemId);
}
