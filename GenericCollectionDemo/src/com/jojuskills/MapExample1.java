package com.jojuskills;

import java.util.Map;
import java.util.HashMap;  
class MapExample1{  
 public static void main(String args[]){  
Map<Integer,String> map=new HashMap<Integer,String>();          
      map.put(10,"Anu");    
      map.put(9,"Vijay");    
      map.put(12,"Raju");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue())
		.forEach(System.out::println);
		map.entrySet().stream().sorted(Map.Entry.comparingByKey())
		.forEach(System.out::println);}}
		
	/*	
     //Returns a Set view of the mappings contained in this map        
      map.entrySet()//Returns a sequential Stream with this collection as its source  
      .stream()        //Sorted according to the provided Comparator  
      .sorted(Map.Entry.comparingByKey())  
           .forEach(System.out::println);}} //Performs an action for each element of this stream  
		*/