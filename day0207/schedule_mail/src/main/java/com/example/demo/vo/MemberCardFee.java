package com.example.demo.vo;

import java.util.Date;

import lombok.Data;

@Data
public class MemberCardFee {
	//검색한 결과를 포장하기 위한 속성으로 작성
	private String id;
	private String name;
	private String email;
	private int total;
}
