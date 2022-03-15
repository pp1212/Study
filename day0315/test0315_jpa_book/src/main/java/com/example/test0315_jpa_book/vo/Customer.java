package com.example.test0315_jpa_book.vo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Customer {
	@Id
	private int custid;
	private String name;
	private String address;
	private String phone;
	
	@OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)	//fetch : 언제 읽어올 것인지 -> FetchType.EAGER : 즉시
	private List<Orders> orders;
}
