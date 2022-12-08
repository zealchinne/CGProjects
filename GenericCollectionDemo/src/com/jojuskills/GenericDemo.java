package com.jojuskills;
import java.util.*;
class SampleGeneric {
	void m(ArrayList<String> al) {
	Iterator<String> itr=al.iterator();
	while(itr.hasNext()) {
	Object obj=itr.next();
	String s=(String)obj;
	System.out.println(s.toUpperCase());}	}}

class GenericDemo {
public static void main(String arg[]){
ArrayList<String> al=new ArrayList<String>();
	al.add("anu");
	al.add("ngo");
	al.add("joju");
	SampleGeneric s1=new SampleGeneric();// 
	s1.m(al);
	}
}