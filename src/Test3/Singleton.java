package Test3;
/**
 * 
 * 保证整个应用程序中某个实例只有一个
 * 
 * @author royeyu
 *
 */
public class Singleton {
//	1. 构造方法石私有化， 允许外部直接创建对象；
   private Singleton(){
	   
   }
   
   Singleton(String key){
	   
   }
   
   // 2.创建类的唯一实例
   
    private static Singleton instance = new Singleton();
    
    
    public static Singleton getInstance(){
    	return instance;
    }
   
}
