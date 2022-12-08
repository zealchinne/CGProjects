package com.jojuskills;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
public class BookRecordHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<BookRecord> hs=new HashSet<BookRecord>();
		BookRecord brecord1=new BookRecord(11,"Java","Jousha",600);
		BookRecord brecord2=new BookRecord(22,"Python","John",400);
		BookRecord brecord3=new BookRecord(33,"DevOps","Merry",270);
		hs.add(brecord1);
		hs.add(brecord2);
		hs.add(brecord3);
		hs.forEach(System.out::println);
		//System.out.println("count the NO of Records");
		//long NoBR=hs.stream().count();
		//System.out.println(NoBR);
		}}
