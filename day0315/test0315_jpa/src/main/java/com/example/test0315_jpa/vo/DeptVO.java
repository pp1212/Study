package com.example.test0315_jpa.vo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity			//이걸하면 이 이름의 테이블을 만들어줌
@Data
@Table(name = "dept")
public class DeptVO {
	
	@Id
	private int dno;
	private String dname;
	private String dloc;
}
