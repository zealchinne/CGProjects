package com.jojuskills.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Book")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="bookid")
	private int bookid;
	@Column(name="bookname")
	private String bookname;
	@Column(name="author")
	private String author;
	@Column(name="price")
	private long price;
	
	public Book() {
		super();
	}

	public Book(int bookid, String bookname, String author, long price) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.author = author;
		this.price = price;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

}
