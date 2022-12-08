package com.jojuskills;
import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list=new LinkedList<String>();//another class 
		list.add("pravallika");
		list.add("Niharika");
		list.add("Sathish");
		/*Iterator itr=list.iterator(); //Traversing list through Iterator  
		while(itr.hasNext()){  
		System.out.println(itr.next());} */
		//list.forEach(names->System.out.println(names));//using Lambda forEach method 
		//list.forEach(System.out::println);// Iterating by passing method reference  
		list.stream().forEach(names -> System.out.println(names));
		//System.out.println(list);
	}
}
