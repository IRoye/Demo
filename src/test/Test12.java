package test;

public class Test12 {
   public static void main(String[] args) {
	
	   
//	   int a[] = {1,2,1,3,4};
//	   
//	   	int temp1 = 0;
//	   	int temp2 = 0;
//
//	   	//求1~N-1的和
//	   	for(int i = 1;i <=a.length - 1;i++){
//	   		temp1 += i;	   	
//	   }
//	   	//求数组的和
//	   	for(int i = 0; i< a.length;i++){
//	   		temp2 +=a[i];
//	   	}
//	   	System.out.println(temp2 - temp1);
	   
	   //求数组之差的最大值
	   int a[] = {1,4,17,3,2,9};
	   int max = 0;
	   for(int i = 0;i< a.length;i++){
		   
		   for(int j = i + 1;j < a.length;j++){
			   
			   if(a[i] - a[j] > max){
				   max = a[i] - a[j];
			   }
			   
		   }
	   }
	   
	   System.out.println(max);
	   
	   
}
}
