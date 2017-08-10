package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test5{
	public static void main(String[] args) {
		int[] A =  {1,2,2,1,5,4,3};
		for(Object i:singleNumber(A)){
			System.out.println(i);
		}
	}
	public static Object[] singleNumber(int[] A) {
		if (A.length == 0) {
			return new Object[A.length];
		}
		HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
		//No.1
		//开始写代码，请在这里实现左侧需求中的问题
		for( int i = 0;i< A.length ; i++)
      {
         if(!hashMap.containsKey(A[i])){
        	 
             hashMap.put(A[i], 1);
         }else{
        	 System.out.println("进来了吗");
        	 int value = hashMap.get(A[i]);
             hashMap.put(A[i],  ++value);
         }
      }
 
//		  如何遍历map
		
		Iterator<Map.Entry<Integer, Integer>> it = hashMap.entrySet().iterator();
		while(it.hasNext()){
		  Map.Entry<Integer, Integer> entry = it.next();
		  int value = entry.getValue();
		  if(value > 1){
			  it.remove();
		  }
		}
		//end_code
		Object[] array = hashMap.keySet().toArray() ;
		return array;
	}
}