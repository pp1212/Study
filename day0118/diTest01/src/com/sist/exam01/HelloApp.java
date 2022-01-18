package com.sist.exam01;

public class HelloApp {

	public static void main(String[] args) {
		//사용해야 하니까 객체 생성해야 함
		// -> 원래 쓰이던 곳을 일일이 찾아서 바꿔줘야 함
		//MessageBean mb = new MessageBean();	강한의존관계
		MessageBeanJP mb = new MessageBeanJP();
		mb.sayHello("tiger");

	}

}
