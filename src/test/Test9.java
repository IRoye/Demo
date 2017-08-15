package test;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test9 {
  public static void main(String[] args) {
	//数组中重复元素最多的数；
	  int a[] = {1,1,2,2,4,4,4,4,5,5,6,6,6};
	  //根据Map来
	  Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	  
	  for(int i = 0;i < a.length;i++){
		  
		  if(!map.containsKey(a[i])){
			  map.put(a[i], 1);
		  }else{
			  int value = map.get(a[i]);
			  map.put(a[i], ++value);
		  }		  
	  }

	    Iterator it = map.entrySet().iterator();
	    
	    int MAX = 0;
	    int MAXKey = 0;
	    while(it.hasNext()){
	    	
	    	Map.Entry<Integer, Integer> entry = (Map.Entry<Integer, Integer>) it.next();
	    	int key = entry.getKey();
	    	int value = entry.getValue();
	    	
	        if(value > MAX){
	        	MAX = value;
	        	MAXKey = key;
	        }
	    	
	    }
	    System.out.println(MAXKey + ":" + MAX);
	  
}
}
