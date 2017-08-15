package test;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Test19 {
   public static void main(String[] args) {
//	String str = " hello world ";
//	
//	str = str.trim();
//	int word = 0;
//	int count = 0;
//	
//	for(int i = 0;i< str.length();i++){
//		if(str.charAt(i) == ' '){
//			
//			word = 0;
//		}
//		
//		// 有了空格， 然后再不为0
//		else if(word == 0){
//			word = 1;
//			count ++;
//		}
//	}
//	
//	System.out.println(count);
//}
	   
// 
//	   int a = 16;
//	   int b = 12;
//	   
//	   while(a % b != 0){
//		   int temp = a % b;
//		   a = b;
//		   b = temp;
//		   
//	   }
//	   
//	   System.out.println(b);
	   
	   List<String > staff = new LinkedList<>();
	   
	   staff.add("tom");
	   
	   staff.add("marry");
	   
	   ListIterator <String> it = staff.listIterator();
	   
	   it.next();
	   
	   it.add("123");
	   
}
}
