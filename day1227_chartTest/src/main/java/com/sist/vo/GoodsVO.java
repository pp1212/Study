package com.sist.vo;

public class GoodsVO {
	private int no;
	private String name;
	private int qty;
	private int price;
	public GoodsVO(int no, String name, int qty, int price) {
		super();
		this.no = no;
		this.name = name;
		this.qty = qty;
		this.price = price;
	}
	public GoodsVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
