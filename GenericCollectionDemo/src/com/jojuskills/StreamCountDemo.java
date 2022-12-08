package com.jojuskills;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class StreamCountDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names=new ArrayList<String>();
		names.add("Rajesh");
		names.add("Suresh");
		names.add("Mahesh");
		names.add("Rajesh");
		//l.forEach(System.out::println);
		long noOfnames=names.stream().count();
		System.out.println(noOfnames);}}
