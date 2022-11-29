package com.jojuskills;
import java.io.Serializable;
public class Employee implements Serializable {
	int empid;
	String empname;
	static String company="Anudip NGO";// It won't be serialized 
	public Employee(int empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
	}
}
