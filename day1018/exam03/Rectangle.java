package com.sist.exam03;

public class Rectangle extends TwoDimShape {  
		//만들자마자 오류표시 나는 건->부모클래스에 기본생성자 안 만들어서
	private double width;
	private double height;
	
	public Rectangle(int x, int y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", area=" + area + ", x=" + x + ", y=" + y + "]";
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		area = width*height;
		return area;
	}

}
