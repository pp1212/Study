package com.sist.vo;

import java.util.Date;

public class OrdersVO {
	private int orderid;
	private int custid;
	private int bookid;
	private int saleprice;
	private Date orderdate;		//util�� �ִ� Date ����
	
	//�Ű������� ��� ���� ������
	public OrdersVO(int orderid, int custid, int bookid, int saleprice, Date orderdate) {
		super();
		this.orderid = orderid;
		this.custid = custid;
		this.bookid = bookid;
		this.saleprice = saleprice;
		this.orderdate = orderdate;
	}
	//OrdersVO o = new OrdersVO(orderid, custid, bookid, saleprice, orderdate);
	//�⺻������ ������ ������ �ؿ�ó�� ��ü ���� �Ұ�
	//OrdersVO a = new OrdersVO();
	
	//�⺻������(�Ű������� �ϳ��� ���� �ʴ� ������)
	//����ڰ� �����ڸ� �ϳ��� ����� �����ϸ� �ڹٴ� ���̻� �⺻�����ڸ� �������� �ʱ� ������
	//�ʿ��ϴٸ� ����ڰ� �⺻�����ڸ� ������ ��
	public OrdersVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//�ܺο��� Ŭ������ �ɹ��� �����Ͽ� ���� �����ϴ� setter��
	//�����ؼ� ���� �о���� getter�� ����
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
