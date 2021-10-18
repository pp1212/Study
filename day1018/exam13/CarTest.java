package com.sist.exam13;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//6.
		Car car = new Car();
		car.speedUp(5);
		car.speedDown(6);
		
		//7.
		//Movable m = new Car();
		//m.speedUp(4);		호출 가능
		//m.TurnLeft();		호출 불가 -> 형변환 해야 함
		//m.TurnRight();
		
		
		//8.
		//Car c = m;		불가능
		//Car c = (Car)m;		가능
		//Car c = new Car();		가능
		//Movable m = c;			불가능	
		//Movable m = (Movable)c;		불가능
	}

}
//부모클래스의 참조변수를 만들어서 자식클래스 객체 생성 할 수 있지만 
//자식클래스에서 추가된 메소드는 부모클래스로 못 받음 -> 형변환 해야 함