package redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisTest {
  public static void main(String[] args) {
	
//	  Jedis jedis = new Jedis("localhost", 6379);
//	  jedis.set("name", "yanting");
//	  
//	  
//	  System.out.println(jedis.get("name"));
	 
//	  
	  
	  demo2();
}
  
  /**
   * 连接池
   */
  public static void demo2(){
	 // 获取连接池的配置对象
	  JedisPoolConfig config = new JedisPoolConfig();
	  
     //设置最大的连接数
	  config.setMaxActive(30);
	  
      //设置最大的空闲连接数
	  config.setMaxIdle(30);
	  
	  // 获取连接池
	  JedisPool jedisPool = new JedisPool(config, "localhost", 6379);
	  
	  //获取核心对象
	  Jedis jedis = null;
	  try{
		  jedis = jedisPool.getResource();
		  jedis.set("name", "yanting");
		  
		  //获取数据
		  System.out.println(jedis.get("name"));
		  
	  }catch(Exception e){
		  e.printStackTrace();
	  }finally{
		   if(jedis != null){
			   jedis = null;
		   }
		   if(jedisPool != null){
			   jedisPool.destroy();
		   }
		   
	  }
	  
  }
  
  
}
