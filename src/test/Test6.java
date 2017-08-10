package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Test6 {

	public static void main(String[] args) {
		String str = "hello xiao mi";
		
		// 将字符串分割成
		
		String [] str2 = str.split(" ");
	    List<String> list = new ArrayList<String>();
	    
	    for(int i = 0;i< str2.length;i++){
	    	list.add(str2[i]);
	    }
	    
	    Collections.reverse(list);
	    StringBuilder sb = new StringBuilder();
	    Iterator <String> it = list.iterator();
	    while(it.hasNext()){
	        sb.append(it.next() + " "); 
	    }
	    
	    System.out.println(sb.toString().trim());
	    
	}
	
}
