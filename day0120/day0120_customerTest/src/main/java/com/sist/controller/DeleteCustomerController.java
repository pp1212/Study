package com.sist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sist.dao.CustomerDAO;

@Controller
public class DeleteCustomerController {
	
	@Autowired
	private CustomerDAO dao;
	public void setDao(CustomerDAO dao) {		//dao�� ���� �ʱ�ȭ�� setter��
		this.dao = dao;
	}


	@RequestMapping("/deleteCustomer.do")
	public ModelAndView delete(int custid) {
		ModelAndView mav = new ModelAndView();
		int re = dao.deleteCustomer(custid);
		if(re == 1) {
			mav.setViewName("deleteCustomerOK");
		}else {
			mav.addObject("msg", "�� ������ �����Ͽ����ϴ�.");
			mav.setViewName("error");
		}
		return mav;
	}
}

