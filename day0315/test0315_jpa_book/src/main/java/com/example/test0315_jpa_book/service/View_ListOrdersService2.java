package com.example.test0315_jpa_book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test0315_jpa_book.dao.View_ListOrdersDAO;
import com.example.test0315_jpa_book.dao.View_ListOrdersDAO2;
import com.example.test0315_jpa_book.vo.View_ListOrders;
import com.example.test0315_jpa_book.vo.View_ListOrders2;

import lombok.Setter;

@Service
@Setter
public class View_ListOrdersService2 {
	@Autowired
	private View_ListOrdersDAO2 dao;
	
	public List<View_ListOrders2> findAll(){
		return dao.findAll();
	}
}
