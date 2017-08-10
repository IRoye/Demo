package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * 实现comparable 接口
 * 
 * 
 * @author royeyu
 *
 */
public class Person  implements Comparable<Person>{

	private String name;
	
	private double score; 
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return Double.compare(score, o.score);
	}
	
	public Person(String name, double score){
		this.name = name;
		this.score = score;
	}
	
	
	public static void main(String[] args) {
		
//		Person p1 = new Person("jhon", 90.00);
//	    Person p2 = new Person("tom", 100.00);
//	    Person p3 = new Person("peter", 200.00);
//	    
//        List<Person> list = new ArrayList<Person>();
//        list.add(p1);
//        list.add(p2);
//        list.add(p3);
//        
//        Collections.sort(list);
//        
//        Iterator<Person> i = list.iterator();
//        
//        while(i.hasNext()){
//        	Person p = i.next();
//        	System.out.println(p.getName() + " : " + p.getScore());
//        }
		  
		int a = 10;
		a = a++;
		System.out.println(a);
        
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

}
