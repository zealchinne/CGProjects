package com.jojuskills;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class StreamMapDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> m=new ArrayList<Integer>();
		m.add(75);
		m.add(62);
		m.add(45);
		m.add(35);
		m.forEach(System.out::println);
		System.out.println("after updated marks");
		//we want add grace marks
		List<Integer> updatemarks=m.stream().map(i->i+5).collect(Collectors.toList());
		updatemarks.forEach(System.out::println);
	}
}
