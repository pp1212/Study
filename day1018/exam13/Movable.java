package com.sist.exam13;

public interface Movable {
	public abstract void speedUp(int amount);		//1.��������
	public abstract void speedDown(int amount);
	
	final int speed = 100;	
	//2. The blank final field speed may not have been initialized ���� �Է��ؾ� �Ѵ� 
	//3.���� �����, final �ٿ��� �� �ٿ��� �Ȱ���(�������̽��� �ڵ�final)

	public void printSpeed(int speed); 
		//4. System.out.println(speed);  //�޼ҵ�� �߻�޼ҵ常 �� �� ����
	

}
