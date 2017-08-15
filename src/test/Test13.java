package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortByNumber implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2 - o1;
	}
	
}

public class Test13 {
   public static void main(String[] args) {
	   
	   int [] temp = {1,2,3};
	   
	   Integer a[] = {-10, -5, -2, 7, 15, 50};
	   
	   for(int i = 0;i< a.length;i++){
		   a[i] = Math.abs(a[i]);
	   }
	   
	   SortByNumber sb = new SortByNumber();
//	   使用比较器的时候一定要是Integetr的数组
	   Arrays.sort(a, sb);
	   
	   System.out.println(a);
	   
	  System.out.println("______________________");
	  Integer b[] = {3,4,5,6,5,6,7,8,9,8};
	  
	  List <Integer>list = Arrays.asList(b);
	  
      System.out.println(list.indexOf(9));
	  
	  
}
}
