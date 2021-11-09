package com.sist.vo;

import java.util.Date;

public class OrdersVO {
	private int orderid;
	private int custid;
	private int bookid;
	private int saleprice;
	private Date orderdate;		//util에 있는 Date 쓰기
	
	//매개변수를 모두 갖는 생성자
	public OrdersVO(int orderid, int custid, int bookid, int saleprice, Date orderdate) {
		super();
		this.orderid = orderid;
		this.custid = custid;
		this.bookid = bookid;
		this.saleprice = saleprice;
		this.orderdate = orderdate;
	}
	//OrdersVO o = new OrdersVO(orderid, custid, bookid, saleprice, orderdate);
	//기본생성자 만들지 않으면 밑에처럼 객체 생성 불가
	//OrdersVO a = new OrdersVO();
	
	//기본생성자(매개변수를 하나도 갖지 않는 생성자)
	//사용자가 생성자를 하나라도 만들기 시작하면 자바는 더이상 기본생성자를 제공하지 않기 때문에
	//필요하다면 사용자가 기본생성자를 만들어야 함
	public OrdersVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//외부에서 클래스의 맴버에 접근하여 값을 변경하는 setter와
	//접근해서 값을 읽어오는 getter를 만듬
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public int getSaleprice() {
		return saleprice;
	}
	public void setSaleprice(int saleprice) {
		this.saleprice = saleprice;
	}
	public Date getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}

	@Override
	public String toString() {
		return "OrdersVO [orderid=" + orderid + ", custid=" + custid + ", bookid=" + bookid + ", saleprice=" + saleprice
				+ ", orderdate=" + orderdate + "]";
	}
	
}
