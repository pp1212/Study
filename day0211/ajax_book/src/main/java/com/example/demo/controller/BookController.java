package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.BookDAO;
import com.example.demo.vo.BookVO;

import lombok.Setter;

@RestController		//데이터를 응답하는 controller라면 @ResponseBody를 쓰지 않고 이렇게 하면 사용 가능 (@Controller + @ResponseBody)
@Setter
public class BookController {
	
	@Autowired
	private BookDAO dao;
	
	@RequestMapping("/listBook")
	public List<BookVO> list() {
		return dao.findAll();
	}
	
	@RequestMapping("/listPublisher")
	public List<String> listPublisher() {
		return dao.listPublisher();
	}
	
	@RequestMapping("/findByPublisher")
	public List<BookVO> findByPublisher(String publisher){
		return dao.findByPublisher(publisher);
	}
}
