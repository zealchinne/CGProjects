package com.jojuskills;
import java.io.Serializable;
public class Person implements Serializable {
	int id;
	String name;
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}
