package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test16 {
  public static void main(String[] args) {
	
      String str = "how are you";
      
      String [] temp = str.split(" ");
      
      
      
//	  List list = Arrays.asList(temp);
//	  Collections.reverse(list);
//	  
//	  StringBuilder sb = new StringBuilder();
//	  for(int i = 0;i<list.size();i++){
//		  sb.append((String)list.get(i) + " ");	  
//	  }
//	  
//	  System.out.println(sb.toString());
      
//      System.out.println("----------------------------------");
//      
//      
//      String a = "aaaabbc";
//      
//      String b = "abcbaaa";
//      
//      String []temp1 = a.split("");
//      String []temp2 = b.split("");
//      
//      Arrays.sort(temp1);
//      Arrays.sort(temp2);
//      
//      
//      boolean flag = true;
//      for(int i = 0;i < temp1.length;i++ ){
//    	  System.out.println(temp1.equals(temp2) );
//    	  System.out.println("temp1[i]:" + temp1[i] + ": temp2[i]:" + temp2[i]);
//    	  if(! temp1[i].equals(temp2[i]) ){
//    		  
//    		  flag = false;
//    	  }    	  
//      }
//      System.out.println(flag);
      
      
      // 删除字符重复字符
      
      String str1 = "good";
      
      
      Set set = new HashSet();
      
      Collections.addAll(set, str1.split(""));
      
      Iterator it = set.iterator();
      
      while(it.hasNext()){
    	  System.out.println(it.next());
      }
      
      
      
      
}
}
