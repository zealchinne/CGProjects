package com.jojuskills;
import java.util.*;
import java.util.stream.Collectors;

class StreamFilterDemo {
public static void main(String args[]){
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(10);
	al.add(15);
	al.add(25);
	al.add(40);
	System.out.println(al);
	//filter the even numbers
List<Integer> l=al.stream().filter(n->n%2==0).collect(Collectors.toList());
	System.out.println(l);
}}