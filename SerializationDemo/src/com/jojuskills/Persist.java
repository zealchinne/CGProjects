package com.jojuskills;
import java.io.*;
public class Persist {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
		Student s=new Student(121,"Joshua");//object creation
	FileOutputStream fout=new FileOutputStream("D:/JavaProgram/Test.txt");
	ObjectOutputStream out=new ObjectOutputStream(fout);
	out.writeObject(s);
	out.flush();
	out.close();
	System.out.println("Success");
	}catch(Exception e) {
		System.out.println(e);}
	}
}
