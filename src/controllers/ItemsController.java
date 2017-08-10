package controllers;

import model.Items;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import bean.Item;
import service.ItemService;

@Controller
public class ItemsController {

	 @Autowired
	 private ItemService itemService;
	/**
	 * 查询
	 * 
	 * @param req
	 * @param res
	 * @return
	 */
	@RequestMapping("/queryItems")
	public ModelAndView queryItem() {
       
		ModelAndView mav = new ModelAndView();
		
		
		List <Items> itemList = itemService.findItemList("2");
		
		System.out.println(itemList);
		
		mav.setViewName("items");
		mav.addObject("message", "Hello World!");
		return mav;

	}

}
