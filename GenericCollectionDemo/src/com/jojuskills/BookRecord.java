package com.jojuskills;
public record BookRecord(int bookid,String bookname,String author,long price) {
	BookRecord() {
		this(1,"x","y",5);
	}
}