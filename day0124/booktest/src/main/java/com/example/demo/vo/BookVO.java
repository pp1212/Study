package com.example.demo.vo;


import lombok.Data;


@Data		//매개변수 모두 갖는 생성자 빼고 다 만들어줌
public class BookVO {
	private int bookid;
	private String bookname;
	private String publisher;
	private int price;
}
