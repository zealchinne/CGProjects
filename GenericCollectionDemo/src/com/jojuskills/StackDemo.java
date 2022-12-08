package com.jojuskills;
import java.util.Stack;
public class StackDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st=new Stack<Integer>();
		System.out.println(st.isEmpty());//true
		st.push(10);
		st.push(30);
		st.push(50);
		st.push(70);
		System.out.println(st);
		System.out.println(st.isEmpty());//false
		System.out.println(st.get(2));
		st.forEach(System.out::println);
	}

}
