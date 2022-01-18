package com.sist.exam02;

public class HelloApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//아직 new를 사용함
		//↓인터페이스(참조변수)		
		//여전히 뒷부분 바꿔줘야 함
		//MessageBean mb = new MessageBeanEN();
		MessageBean mb = new MessageBeanKR();
		mb.sayHello("tiger");
	}

}
