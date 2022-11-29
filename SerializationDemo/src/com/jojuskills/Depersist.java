package com.jojuskills;
import java.io.*;
public class Depersist {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("D:/JavaProgram/Test.txt"));
		Student1 s=(Student1)in.readObject();
		System.out.println(s.id+" "+s.name);
		in.close();
	}catch(Exception e) {
		System.out.println(e);}
	}
}
