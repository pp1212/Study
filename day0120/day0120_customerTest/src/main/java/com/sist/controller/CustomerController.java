package com.sist.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sist.dao.CustomerDAO;
import com.sist.vo.CustomerVO;

@Controller
public class CustomerController {
	
	//데이터베이스 연결해서 모든 고객목록을 읽어오기 위해 멤버로 갖도록 함
	@Autowired
	private CustomerDAO dao;
	//초기화 위해 setter
	public void setDao(CustomerDAO dao) {
		this.dao = dao;
	}

	
	
	@RequestMapping("/listCustomer.do")
	public ModelAndView list() {		//실제로 동작하는 메소드
		ModelAndView mav = new ModelAndView();
		
		ArrayList<CustomerVO> list = dao.listAll();
		mav.addObject("list",list);
		mav.setViewName("listCustomer");	//view의 위치와 확장자가 항상 같아서 생략
		return mav;
	}
	
	
	
	@RequestMapping("/detailCustomer.do")
	public ModelAndView detail(int custid) {	//dao가 동작하려면 필요한 매개변수
		ModelAndView mav = new ModelAndView();
		//CustomerVO c = dao.getCustomer(custid);
		//mav.addObject("c", c);
		mav.addObject("c", dao.getCustomer(custid));
		//요청한 서비스이름과 같은 view로 설정할 때에는
		//setView(  mav.setViewName("detailCustomer");  )를 생략할 수 있음
		return mav;
	}
	
}

