package com.example.demo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data	//기본 생성자만 제공
@AllArgsConstructor		//모든 매개변수 갖는 생성자-> 기본생성자가 안 생김
@NoArgsConstructor		//그래서 기본 생성자 만들어줘야 함
public class MemberVO {
	private int no;
	private String name;
	private int age;
	private String addr;
}
