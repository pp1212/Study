package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.CustomerDAO;
import com.example.demo.vo.CustomerVO;

import lombok.Setter;

@RestController	//뷰로 이동하는게 아니라 데이터를 전달하는 컨트롤러
@Setter
public class CustomerController {
	
	@Autowired
	private CustomerDAO dao;
	
	@RequestMapping("/findByBookID")
	public List<CustomerVO> findByBookID(int bookid){
		return dao.findByBookID(bookid);
	}
}
