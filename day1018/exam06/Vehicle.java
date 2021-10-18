package com.sist.exam06;

public abstract class Vehicle {
	
	protected int speed;
	//추상클래스에 속성을 추가할 수 있음 
	//= 추상클래스는 추상메소드외에 일반속성을 포함 할 수 있음
	
	
	public abstract double getKilosPerLiter();
	
	public void printSpeed() {
		System.out.println("현재속도:"+speed);
	}
	//추상클래스는 추상메소드 말고도 body가 구체화 된 일반메소드 포함 가능
}
