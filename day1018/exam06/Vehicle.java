package com.sist.exam06;

public abstract class Vehicle {
	
	protected int speed;
	//�߻�Ŭ������ �Ӽ��� �߰��� �� ���� 
	//= �߻�Ŭ������ �߻�޼ҵ�ܿ� �ϹݼӼ��� ���� �� �� ����
	
	
	public abstract double getKilosPerLiter();
	
	public void printSpeed() {
		System.out.println("����ӵ�:"+speed);
	}
	//�߻�Ŭ������ �߻�޼ҵ� ���� body�� ��üȭ �� �Ϲݸ޼ҵ� ���� ����
}
