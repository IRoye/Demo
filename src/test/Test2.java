package test;

import java.util.Arrays;

public class Test2
{
	private String name;
	public Test2(String name){
//		this.name = name;
	}
	
    public static  void add(Byte b)
    {
//    	如何解释这里；
    	// 传递的确实是地址， 但是用基本类型进行赋值的时候， 
    	// 会自动创建新的实例所以，指向的还是其他的地方， 废了；
        byte temp = 1;
        b = (byte) (b + temp);
    }
    
    public static void change(Test2 test){
//    	  这里传递的是地址
    	test.name  = "456";
    }
    
    public static void main(String[] args) {
     
    	// 选择排序
    	
    	int [] a = {38, 65, 97, 76, 13, 27, 49};
    	int length = a.length;
//        for(int i = 0;i< length; i++){
//        	// 拿出第一个数, 假设就是最小的
//        	int temp = a[i];
//        	// 最小的下标
//        	int flag = i;
//        	for(int j=i+1; j < length ;j++){
//        		if(temp > a[j]){
//        			temp = a[j];
//        			// 记录新的最小的下标
//        			flag = j;
//        		}
//        	}
//        	// 每一轮统计完成之后，然后进行交换
//            // 将第i个位置的值和flag的值进行交换
//            if(flag != i){
//            	a[flag] = a[i];
//            	a[i] = temp;           	
//            }
//            
//        }
//        
//        for(int item : a){
//        	System.out.println(item);
//        }
//    	
    	
    	// 插入排序， 如何插入排序
    	// 先把第一个元素当做  有序数组， 然后从后面的依次添加
//    	int j = 0;
//        for(int i = 1; i< length;i++){
//        	
////        	找出要插入的元素，第 1 个 元素就是第一个需要插入的
//        	int temp = a[i];
//        	
//        	//找到插入的位置,从前一个元素开始找, 如果插入的元素小于最右边的元素
//        	// 那么就一直向左边开始查找
//        	for(j = i - 1; j >= 0 && temp < a[j]; j--){
//        		// 记录找到的位置
//        		// 这个循环也就是一直将元素向右边移动；把比temp 大的元素都向右移动一位
//        		a[j + 1] = a[j];
//        	}
//        	//循环完成之后将temp 放下；为很么是j + 1 因为
//        	a[j + 1] = temp;       	
//        }
//        for(int item : a){
//        	System.out.println(item);
//        }
    	
    	// 冒泡排序
    	//int length = a.length;
    	// 只需要遍历n - 1 轮就可以了
//    	for(int i = 0; i< length - 1; i++){
//    		
//    		for(int j = 0; j < length -1 - i ;j++){
//    			
//    			if(a[j + 1] < a[j]){
//    				
//    				int temp = a[j];
//    				a[j] = a[j + 1];
//    				a[j + 1] = temp;
//    				
//    			}
//    			
//    		}
//    		
//    	}
//    	
//    	 for(int item : a){
//         	System.out.println(item);
//        }
    	
    	// 快速排序
    	// 
    	
    	
    	
//    	 切分
    	
//    	Test2.sort(a, 0, 6);
//    	
//   	 for(int item : a){
//     	System.out.println(item);
    	
    	
    	//初始化为0；
    	int [] aa = new int[10];
    	
    	System.out.println(aa);
    	
    	System.out.println(aa[8]);
    	
    	
    	String s;
    	
    	String str1="hello";
    	String str2="he"+ new String("llo");
    	
    	System.out.println(str1 == str2);
    	
    	
    	
	}
    
    private static int partition(int a[], int lo, int hi){
    	int i = lo;
        int j = hi + 1;
        //切分的元素
        int v = a[lo];
        while(true){
        	while(a[++i] < v) {
        		System.out.println(i);
        		System.out.println("hi:" + hi);
        		if(i== hi) break;
        		}
        	while(a[--j] > v) {if(j == lo) break;}
        	
        	if(i >= j) break;
        	
        	//交换
        	int temp = a[i];
        	a[i] = a[j];
        	a[j] = temp;
        }
        // 最后的指针相遇的时候， 要把最开始的 lo 值放在中间了
        int temp2 = a[lo];
        a[lo] = a[j];
        a[j] = temp2;
        
        // 接下来就是开始  a[lo..j - 1] 和 a[j + 1...hi]部分的排序了
        return j;
    }
    
    private static void sort(int []a, int lo, int hi){
    	if(hi <= lo)
    		return;
    	int j = partition(a, lo, hi);
    	sort(a, lo, j - 1);
    	sort(a, j+ 1, hi);
    }
}
