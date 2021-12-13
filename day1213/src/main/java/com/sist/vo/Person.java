package com.sist.vo;

public class Person {
	private int id = 20210001;
	private String name = "홍길동";
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("기본생성자 동작함!");
	}
	//-> 기본 생성자 안 만들면 객체 생성 X (<jsp:useBean id="" class="" /> - 객체 생성)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
