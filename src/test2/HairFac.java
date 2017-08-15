package test2;

import java.util.Map;

/**
 * 发型工厂
 * @author royeyu
 *
 */
public class HairFac {
	
	 public HairInterface getHairByClass(String className){
		 try {
			 
			Map<String, String> map = new PropertiesReader().getProperties();
			HairInterface hair = (HairInterface)Class.forName(map.get(className)).newInstance();
			return hair;
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 return null;
	 }
	
     public HairInterface getHair(String key){
    	 // 这样的话， 只能if  else 来进行；
    	if("left".equals(key)){
    		return new LeftHair();
    	}else if("right".equals(key)){
    		return new RightHair();
    	}
		return null;   	 
     }
}
