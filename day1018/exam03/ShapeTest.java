package com.sist.exam03;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape []arr = new Shape[3];	//아직 객체 생성 전
		
		arr[0] = new Ellipse(10, 10, 20, 50);
		arr[1] = new Cube(10, 100, 100, 100, 100);
		arr[2] = new Cylinder(10, 300, 50, 100);
		/*
		System.out.println(arr[0]);	//객체만 생성된 후라 area,volume 계산 전
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		//((Ellipse)arr[0]).getArea();	밑이랑 같음
		((TwoDimShape)arr[0]).getArea();
		((ThreeDimShape)arr[1]).getVolume();
		((ThreeDimShape)arr[2]).getVolume();
		
		System.out.println("=============================");
		System.out.println(arr[0]);	
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		*/
		
		
		//배열 일괄처리
		for(Shape s: arr) {
			if(s instanceof TwoDimShape) {
				((TwoDimShape)s).getArea();
			}else if(s instanceof ThreeDimShape){
				((ThreeDimShape)s).getVolume();
			}
			System.out.println(s);
		}
		
	}

}
