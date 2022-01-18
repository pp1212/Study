package com.sist.exam14;

public class OrderGoods {
	private String customer;
	private GoodsVO goodsVO;
	//초기화를 setter로
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public void setGoodsVO(GoodsVO goodsVO) {
		this.goodsVO = goodsVO;
	}
	public void order() {
		System.out.println(customer+"고객이 주문한 상품은 다음과 같습니다.");
		goodsVO.info();
	}
}
