package test2;
/**
 * 测试代码
 * @author royeyu
 *
 */
public class SunnyTest {
  public static void main(String[] args) {
	
//	  HairInterface left = new LeftHair();
//	  left.draw();
//	  HairInterface right = new RightHair();
//	  right.draw();
	  
	 HairFac factory = new HairFac();
	 HairInterface left = factory.getHairByClass("left");
	 left.draw();
	 
	 
	 
	 
	 
}
}
