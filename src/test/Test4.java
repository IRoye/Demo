package test;

import java.util.ArrayList;
import java.util.List;

public class Test4 {
	
	public static void charge(int n){
		if(n <= 0){
			System.out.println("输入错误");
		}
		int i = 1;
		while(i <= n){
		   if(i == n){
			   System.out.println("是");
		   }
		   i <<= 1;
		}
	}
	
	public static void main(String[] args) {
//		charge(4);
		
		List list = new ArrayList();
		list.add(null);
		list.add(null);
		
	}

}
