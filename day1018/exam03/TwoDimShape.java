package com.sist.exam03;

public abstract class TwoDimShape extends Shape {
	protected double area;
	public TwoDimShape(int x, int y) {	//area�� ����ϴ� �ʵ�� ����X 
		super(x, y);
	}
	
	public TwoDimShape() { 
		super();
		// TODO Auto-generated constructor stub
	}
	//�̰� �� ����� �ڽ�Ŭ���� ���� ������ ���� ǥ��


	public abstract double getArea();
}
