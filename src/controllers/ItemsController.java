package controllers;

import model.Items;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import service.ItemService;

/**
 *  请求重定向，商品修改提交后， 重定向到商品下旬列表
 *  return "redirect:queryItems.action";
 * 
 * 
 * 
 * 
 * @author royeyu
 *
 */

@Controller
public class ItemsController {

	 @Autowired
	 private ItemService itemService;
	/**
	 * 查询
	 * @RequestParam(value="id", required=true) Integer itemId,
	 * 
	 * 
	 * 
	 * @RequestBody 接受JSON 数据
	 * @param req
	 * @param res
	 * @return
	 */
	@RequestMapping(value= "/queryItems" ,method={RequestMethod.GET})
	public ModelAndView queryItem(HttpServletRequest req, HttpServletResponse res, HttpSession session, Items items) {
       
		System.out.println();
		
		System.out.println("对象ID" + items.getId());
		ModelAndView mav = new ModelAndView();
		
		
		List <Items> itemList = itemService.findItemList("2");
		
		Iterator<Items> it = itemList.iterator();
		
		while(it.hasNext()){
			Items item = it.next();
		    System.out.println("名字：" + item.getName());
		}
		
		//修改
		Items item2 = new Items();
		item2.setId("1");
		item2.setName("我不是筆記本了123！！！");
		
		itemService.updateItem(item2);
		
		
		// 查詢單個
		Items item = itemService.getItemsById("1");
		
		System.out.println("名字:" +  item.getName());
		
		mav.setViewName("items");
		mav.addObject("message", "Hello World!");
		return mav;

	}

}
