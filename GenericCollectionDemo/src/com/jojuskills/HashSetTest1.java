package com.jojuskills;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
public class HashSetTest1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> ht=new HashSet<String>();
		ht.add("Marri");
		ht.add("Srilekha");
		ht.add("Anu");
		ht.add("Asha");
		ht.add("Anusri");
		ht.add("Sruthi");
		System.out.println(ht);// un-order
		System.out.println("After sorting");
		List<String> sortedList=ht.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		List<String> DesortedList=ht.stream().sorted((s1,s2)->-s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println(DesortedList);
		System.out.println(" the sort string according to length of the string");
			List<String> lengthString=ht.stream().sorted( (s1,s2) -> { 
													int i1=s1.length();
													int i2=s2.length();
														if(i1<i2) return -1;
														else if(i1>i2) return +1;
														else return s1.compareTo(s2); }	).collect(Collectors.toList());
			System.out.println(lengthString);
				}}
