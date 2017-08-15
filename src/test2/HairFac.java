package test2;
/**
 * 发型工厂
 * @author royeyu
 *
 */
public class HairFac {
     public HairInterface getHair(String key){
    	if("left".equals(key)){
    		return new LeftHair();
    	}else if("right".equals(key)){
    		return new RightHair();
    	}
		return null;   	 
     }
}
