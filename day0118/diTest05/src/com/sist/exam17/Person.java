package com.sist.exam17;

public class Person {
	private String name;
	private int age;
	
	 public Person(String name,int age) {
	  this.name = name;
	  this.age = age;
	  System.out.println("������ ������");
	 }
	
	public void sayHello() {
		System.out.println("hello,"+name);
		System.out.println("����:"+age);
	}
}
