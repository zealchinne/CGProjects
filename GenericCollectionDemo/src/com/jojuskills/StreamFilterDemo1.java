package com.jojuskills;
import java.util.*;
import java.util.stream.Collectors;
public class StreamFilterDemo1 {
public static void main(String args[]){
	ArrayList<Integer> marks=new ArrayList<Integer>();
	marks.add(70);
	marks.add(55);
	marks.add(25);
	System.out.println(marks);
	//filter the pass marks
List<Integer> passmark=marks.stream().filter(m->m>=35).collect(Collectors.toList());
	System.out.println(passmark);
}}