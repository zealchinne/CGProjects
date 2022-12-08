package com.jojuskills;

import java.util.HashSet;

public class BookHashSet {
	public static void main(String arg[]){
		 
		HashSet<BookExample> hs=new HashSet<BookExample>();
		BookExample b1=new BookExample(11,"Java","Joju",600);
		BookExample b2=new BookExample(22,"Python","Raju",400);
		BookExample b3=new BookExample(33,"DevOps","Anita",270);
		hs.add(b1);
		hs.add(b2);
		hs.add(b3);
		hs.forEach(System.out::println); }}


