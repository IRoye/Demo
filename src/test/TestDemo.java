package test;

public class TestDemo{
    private int count;
    public static void main(String[] args) {
    	int a[] = {1,2,3,4,5};
    	int []b = new int[20];
        TestDemo test=new TestDemo(88);
        System.out.println(test.count);
    }
     TestDemo(int a) {
//    	 这个地方没有this 也是可以访问额？？？
         count=a;
    }
}
