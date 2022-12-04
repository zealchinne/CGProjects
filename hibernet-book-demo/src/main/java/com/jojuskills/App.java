package com.jojuskills;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.jojuskills.config.HibernateUtil;
import com.jojuskills.entity.Book;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.makeSession();
		System.out.println("got a session " + session);
		Book b1=new Book();
		b1.setBookid(28);
		b1.setBookname("Java");
		b1.setAuthor("Chinnam Raju");
		b1.setPrice(750);
		Transaction tr = session.beginTransaction();
		session.save(b1);
		tr.commit();
		session.close();
		System.out.println("---object saved using hibernate---");
		System.out.println("Praise the lord");

	}

}
