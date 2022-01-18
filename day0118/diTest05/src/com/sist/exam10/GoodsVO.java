package com.sist.exam10;

public class GoodsVO {
	private int no;
	private String name;
	private int price;
	private int qty;
	private String fname;
	public GoodsVO(int no, String name, int price, int qty, String fname) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
		this.qty = qty;
		this.fname = fname;
	}
	public void info() {
		System.out.println("상품번호 : "+no);
		System.out.println("상품이름 : "+name);
		System.out.println("상품가격 : "+price);
		System.out.println("상품수량 : "+qty);
		System.out.println("상품사진 : "+fname);
	}
}
