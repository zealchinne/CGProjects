package com.jojuskills;

import java.util.List;
import java.util.Optional;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class TreeSetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(65);
		ts.add(35);
		ts.add(20);
		ts.add(15);
		ts.add(8);
	//	ts.forEach(System.out::println);
		System.out.println(ts);
		List<Integer> DesortedList=ts.stream().sorted((s1,s2)->-s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println(DesortedList);
		//System.out.println("Lowest Value: "+ts.pollFirst());    
     //   System.out.println("Highest Value: "+ts.pollLast()); 
		
		long Number=ts.stream().count();
		System.out.println("Number of elements in Tree set: "+Number);
        
        int maxValue=ts.stream().max((s1,s2)->s1.compareTo(s2)).get();
        System.out.println("Maximum value: "+maxValue);
        
        int minValue=ts.stream().min((s1,s2)->s1.compareTo(s2)).get();
        System.out.println("Minimum value: "+minValue);
        	}

}
