package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Base{
	public void f(){
		System.out.println("Base");
	}
}

public class TestDemo{
    private int count;
    public static void main(String[] args) {
    int i;
    i = 10 - 1;
    	
//    	List
    	
//    	 基本类型可以排好序
//    	Integer ob[]={11,22,33};  C
////    	注意这里死Integer
//    	List<Integer> objList=Arrays.asList(ob);  //数组里的每一个元素都是作为list中的一个元素  
//    	for(int a:objList){  
//    	    System.out.println(a);  
//    	}
//    	
//    	System.out.println(Collections.max(objList) + ":" + Collections.min(objList));
//    	
//    	Collections.sort(objList);
//    	
//    	for(int a:objList){  
//    	    System.out.println(a);  
//    	}
    	
    	
		try {
           //反射的时候需要指定具体的包名；
			Class c = Class.forName("test.Base");
			Base b = (Base)c.newInstance();
			
			b.f();			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(F(6));

        
        
        
    	
    }
    
   public static int  F(int n){

	   if(n == 1 || n == 2){
		  return 1;
	   }
	   
	   int result = F(n-1) + F(n - 2);
	   
	   return result;
	   
   }
    
}
