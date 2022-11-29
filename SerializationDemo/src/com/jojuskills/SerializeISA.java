package com.jojuskills;
import java.io.*;
public class SerializeISA {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {//creating stream to writing object
			Student1 s2=new Student1(121,"ravi",1500,"Java");
			FileOutputStream fout=new FileOutputStream("D:/JavaProgram/abc.txt");
			ObjectOutputStream out=new ObjectOutputStream(fout);
			out.writeObject(s2);
			out.flush();
			out.close();
			System.out.println("Success");
		}catch(Exception e) {
			System.out.println(e);}
		try {// creating stream to read object
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("D:/JavaProgram/abc.txt"));
		Student1 s3=(Student1)in.readObject();
		System.out.println(s3.id+" "+s3.name+" "+s3.course+" "+s3.fee);
		in.close();
		}catch(Exception e) {
			System.out.println(e)	;	}
	}
}
