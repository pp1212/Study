package com.sist.exam01;

public class Person {
	private String name;
	private int age;
	
	 public Person(String name,int age) {
	  this.name = name;
	  this.age = age;
	  System.out.println("매개변수를 갖는 생성자 동작함");
	 }
	
	public void sayHello() {
		System.out.println("hello,"+name);
		System.out.println("나이:"+age);
	}
}
