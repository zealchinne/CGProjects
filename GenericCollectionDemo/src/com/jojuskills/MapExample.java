package com.jojuskills;

import java.util.HashMap;
import java.util.Map;
  
class MapExample{  
 public static void main(String args[]){  
 
  Map<Integer,String> map=new HashMap<Integer,String>();  
  map.put(100,"Anu");  
  map.put(101,"Ravi");  
  map.put(102,"Rahul");  
  
  //Elements can traverse in any order  
    for(@SuppressWarnings("rawtypes") Map.Entry m:map.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  }}}

