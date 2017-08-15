package test;

public class Test10 {
  public static void main(String[] args) {
	//两两相加等于20
	  
	  int [] a = {1,7,17,2,6,3,14};
	  
	  for(int i = 0;i<a.length;i++){
		  for(int j = i;j<a.length;j++){
			  
				  if(a[i] + a[j] == 20)
				  {
					  System.out.println(a[i] + " + " + a[j] + " = 20");
				  }
	  }
}
	  
}
  
}
