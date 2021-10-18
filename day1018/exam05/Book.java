package com.sist.exam05;

import java.util.Objects;

public abstract class Book {
	protected String number;
	protected String title;
	protected String author;
	
	public abstract int getLateFees(int days);

	public boolean equals(Object obj) {	//비교할 책을 매개변수로 전달받아라
		if(number.equals(   ((Book)obj).number)){
			return true;
		}else {
			return false;
		}
	}

	public Book(String number, String title, String author) {
		super();
		this.number = number;
		this.title = title;
		this.author = author;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [number=" + number + ", title=" + title + ", author=" + author + "]";
	}
	
}
