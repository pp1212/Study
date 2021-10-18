package com.sist.exam03;

public class Shpere extends ThreeDimShape {
	private double radius;
	
	public Shpere(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
	}
	public Shpere() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "Shpere [radius=" + radius + ", volume=" + volume + ", x=" + x + ", y=" + y + "]";
	}
	
	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		//volume=4/3*Math.PI*radius*radius*radius;
		volume = 4.0/3*Math.PI*Math.pow(radius, 3); //4나3 둘중에 하나를 실수로
		return volume;
	}

}
