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
		//m.speedUp(4);		ȣ�� ����
		//m.TurnLeft();		ȣ�� �Ұ� -> ����ȯ �ؾ� ��
		//m.TurnRight();
		
		
		//8.
		//Car c = m;		�Ұ���
		//Car c = (Car)m;		����
		//Car c = new Car();		����
		//Movable m = c;			�Ұ���	
		//Movable m = (Movable)c;		�Ұ���
	}

}
//�θ�Ŭ������ ���������� ���� �ڽ�Ŭ���� ��ü ���� �� �� ������ 
//�ڽ�Ŭ�������� �߰��� �޼ҵ�� �θ�Ŭ������ �� ���� -> ����ȯ �ؾ� ��