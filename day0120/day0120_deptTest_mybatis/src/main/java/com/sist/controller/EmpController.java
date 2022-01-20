package com.sist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sist.dao.EmpDAO;

@Controller
public class EmpController {
	
	@Autowired
	private EmpDAO dao;
	public void setDao(EmpDAO dao) {
		this.dao = dao;
	}


	@RequestMapping("/listEmp.do")
	public ModelAndView listEmp() {		//실제로 사용자 요청에 의해서 동작하는 메소드
		ModelAndView mav = new ModelAndView();
		mav.addObject("list", dao.listEmp());		//list로 상태유지
		return mav;
	}
}
