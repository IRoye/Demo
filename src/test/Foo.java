package test;

public class Foo {
//	final修饰的变量， 那必须是要初始化的
	   final int i = 0;
	    int j;
	    public void doSomething() {
	        System.out.println(++j + i);
	    }
	    public static void main(String[] args) {
//	    	Java 不像是  js 那么灵活
			//Integer.parseInt("123a");
			int a[] = null;
			a[0] = 1;
		}
}
