package com.sist.exam10;

public class OrderGoods {
	private String customer;	//�⺻�ڷ���
	private GoodsVO goodsVO;	//�����ڷ��� -> ��������
	public OrderGoods(String customer, GoodsVO goodsVO) {
		super();
		this.customer = customer;
		this.goodsVO = goodsVO;
	}
	public void order() {
		System.out.println(customer + "���� ������ ��ǰ�� ������ ������ �����ϴ�.");
		goodsVO.info();
	}
}
