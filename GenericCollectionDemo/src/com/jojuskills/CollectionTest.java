package com.jojuskills;

import java.util.ArrayList;
import java.util.Iterator;
public class CollectionTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> l=new ArrayList<String>();
		l.add("Ravi");
		l.add("Raju");
		l.add("Ramu");
		l.add("Raju");//duplicate element
		System.out.println(l);
		System.out.println(l.get(2).toUpperCase()); //Ramu
	
		/*Iterator itr=l.iterator(); //Traversing list through Iterator  
		while(itr.hasNext()){  
		System.out.println(itr.next());} */

//l.forEach(names->System.out.println(names));//using Lambda forEach method 
		
//l.forEach(System.out::println);// Iterating by passing method reference  

//l.stream().forEachOrdered(names -> System.out.println(names));  
		
	}
}
