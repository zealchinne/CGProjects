package com.jojuskills;
import java.util.Map;
import java.util.HashMap;
public class MapDemo {
public static void main(String args[]) {
	  Map<Integer,String> map=new HashMap<Integer,String>();  
  map.put(100,"Anita");  
  map.put(101,"John");  
  map.put(102,"Raz");  
  //Elements can traverse in any order  
 for(@SuppressWarnings("rawtypes") Map.Entry m:map.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  }
   }}
