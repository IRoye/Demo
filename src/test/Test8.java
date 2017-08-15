package test;

public class Test8 {
  public static void main(String[] args) {
	
	  int [] a = {1,-2,4,8,-4,7,-1,-5};
	  
	  int curSum = 0;
	  int totalSum = 0;
      // 每一个元素当起始元素	  
	  for(int i = 0;i< a.length;i++){
		  
		  // 内部的遍历
		  for(int j = i;j<a.length;j++){
			 
			  curSum = 0;
			  for(int k = i; k< j;k++){
				  curSum += a[k];
			  }
			  
			  if(curSum > totalSum){
				  totalSum = curSum;
			  }
			  
		  }
		  
	  }
	  System.out.println(totalSum);
	  
}
}
