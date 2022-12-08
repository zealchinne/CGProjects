package com.jojuskills;
import java.util.*;  
public class GenericsTest{  
public static void main(String args[]){  

ArrayList<String> list=new ArrayList<String>();  
list.add("raju"); //0 
list.add("joju"); //1
list.add("Anu"); //2
//list.add(2);//compile time error  
String s=list.get(1);//type casting is not required  
System.out.println("element is: "+s);  
 
Iterator<String> itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());}}}  

