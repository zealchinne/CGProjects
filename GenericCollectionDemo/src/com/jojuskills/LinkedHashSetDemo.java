package com.jojuskills;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;
public class LinkedHashSetDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("Suresh");
		lhs.add("Maha");
		lhs.add("Raju");
		lhs.add("Rajesh");
		System.out.println(lhs);
		//lhs.forEach(System.out::println);
		System.out.println("after sorting using stream");
		List<String> lhslist=lhs.stream().sorted().collect(Collectors.toList());
		System.out.println(lhslist);
		List<String> dsclist=lhs.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
		System.out.println(dsclist);
		System.out.println("Sorted the string based on length");
		List<String> lenlist=lhs.stream().sorted( (s1,s2) -> { 
			int i1=s1.length();
			int i2=s2.length();
				if(i1<i2) return -1;
				else if(i1>i2) return +1;
				else return s1.compareTo(s2); }	).collect(Collectors.toList());
		System.out.println(lenlist);
	}
}
