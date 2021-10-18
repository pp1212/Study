package com.sist.exam03;

public abstract class ThreeDimShape extends Shape {
	protected double volume;
	public ThreeDimShape(int x, int y) {	//volume은 계산하는 필드라서 포함X 
		super(x, y);
	}
	
	public ThreeDimShape() {
		super();
		// TODO Auto-generated constructor stub
	}

	public abstract double getVolume();	//추상메소드-메소드선언부만 만듬
}
