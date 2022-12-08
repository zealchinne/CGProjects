package com.jojuskills;
public class BookExample {
	private int bookid;
	private String bookname;
	private String author;
	private long price;
	
	public BookExample() {
		super();
	}

	public BookExample(int bookid, String bookname, String author, long price) {
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

	@Override
	public String toString() {
		return "BookExample [bookid=" + bookid + ", bookname=" + bookname + ", author=" + author + ", price=" + price
				+ "]";
	}
		
	}

