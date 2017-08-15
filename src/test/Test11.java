package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test11 {
    public static void main(String[] args) {
		//数组中第K个最小的数
//    	Integer a[] = {1,5,2,6,8,0,6};
//    	
//    	List <Integer>list = Arrays.asList(a);
//    	
//    	Collections.sort(list);
//    	
//    	
//    	int value = (Integer)list.get(2);
//    	
//    	System.out.println(value);
    	
    	
    	// 数组中只出现一次的数字
    	
    	
       int a[] = {2,3,2,4,3,5,4,1};
       
       Arrays.sort(a);
       
       for(int i = 0;i< a.length;i++){
    	   System.out.println(a[i]);
       }
       
       for(int i = 0;i< a.length;i++){
    	   
          if(i == 0){
        	  if(a[i] != a[i+1]){
        		  System.out.println("value:" + a[i]);
        	  }
          }
          else if(i== a.length - 1){
        	  if(a[i] != a[i-1]){
        		  System.out.println("value:" + a[i]);
        	  }
          }else{
        	  if(a[i] != a[i - 1] && a[i] !=a[i+1]){
        		  System.out.println(a[i]);
        	  }
          }
    	   
       }
    	
    	
    	
	}
}
