package com.sist.exam13;

public interface Movable {
	public abstract void speedUp(int amount);		//1.생략가능
	public abstract void speedDown(int amount);
	
	final int speed = 100;	
	//2. The blank final field speed may not have been initialized 값을 입력해야 한다 
	//3.오류 사라짐, final 붙여도 안 붙여도 똑같음(인터페이스는 자동final)

	public void printSpeed(int speed); 
		//4. System.out.println(speed);  //메소드는 추상메소드만 올 수 있음
	

}
