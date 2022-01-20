package com.sist.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sist.dao.DeptDAO;
import com.sist.vo.DeptVO;

@Controller
public class ListDeptController {
	
	@Autowired
	private DeptDAO dao;
	public void setDao(DeptDAO dao) {
		this.dao = dao;
	}
	
	@RequestMapping("/listDept.do")	
	public ModelAndView listDept() {	//ModelAndView -> ctrl + space -> servlet ����
		ModelAndView mav = new ModelAndView();
		mav.addObject("list", dao.listAll());
		mav.setViewName("listDept");
		return mav;
	}
}
