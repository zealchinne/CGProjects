package com.jojuskills;
import java.io.Serializable;
public class Student3 implements Serializable{
	int rollno;
	String name;
	Address address;//Has-A
public Student3(int rollno, String name) {
	this.rollno=rollno;
	this.name=name;
	}
}
