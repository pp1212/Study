package com.sist.exam03;

public abstract class TwoDimShape extends Shape {
	protected double area;
	public TwoDimShape(int x, int y) {	//area는 계산하는 필드라서 포함X 
		super(x, y);
	}
	
	public TwoDimShape() { 
		super();
		// TODO Auto-generated constructor stub
	}
	//이거 안 만들면 자식클래스 만들 때마다 오류 표시


	public abstract double getArea();
}
