package com.example.demo.vo;

import javax.annotation.sql.DataSourceDefinition;

import lombok.Data;

@Data
public class BookVO {
	private int bookid;
	private String bookname;
	private String publisher;
	private int price;
}
