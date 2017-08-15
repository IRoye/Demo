package test;

public class Test15 {
   public static void main(String[] args) {
	
	   int a[] = {1,5,6,7,9,2,4,8,10,13,14};
	   
	   // 冒泡排序
	   
	   for(int i = 0;i<a.length - 1;i++){
		   
		   for(int j = 0;j < a.length - i - 1;j++){
			   
			   if(a[j] > a[j + 1]){
				   int temp = a[j];
				   a[j] = a[j+1];
				   a[j+1] = temp;
			   }
			   
		   }
		   
	   }
	   System.out.println("--------------------------");
	   for(int item: a){
		  System.out.println(item);
	   }
	   
}
}
