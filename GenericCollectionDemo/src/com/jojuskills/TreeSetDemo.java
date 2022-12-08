package com.jojuskills;

import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
public class TreeSetDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("Hi");
		ts.add("Hello");
		ts.add("Welcome");
		ts.add("Anu");
	//	ts.forEach(System.out::println);
		System.out.println(ts);
		List<String> DesortedList=ts.stream().sorted((s1,s2)->-s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println(DesortedList);
		System.out.println(" the sort string according to length of the string");
			List<String> lengthString=ts.stream().sorted( (s1,s2) -> { 
													int i1=s1.length();
													int i2=s2.length();
														if(i1<i2) return -1;
														else if(i1>i2) return +1;
														else return s1.compareTo(s2); }	).collect(Collectors.toList());
			System.out.println(lengthString);
	}

}
