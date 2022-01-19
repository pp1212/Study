package com.sist.controller;

import javax.management.MXBean;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sist.dao.CustomerDAO;
import com.sist.vo.CustomerVO;

@Controller
@RequestMapping("/updateCustomer.do")
public class UpdateCustomerController {
	
	private CustomerDAO dao;
	public void setDao(CustomerDAO dao) {
		this.dao = dao;
	}

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView form(int custid) {	//수정할 고객정보 상태유지 해야 함
		ModelAndView mav = new ModelAndView();
		mav.addObject("c", dao.getCustomer(custid));	//수정할 고객정보 상태유지
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView submit(CustomerVO c) {
		ModelAndView mav = new ModelAndView();
		int re = dao.updateCustomer(c);
		if(re == 1) {
			mav.setViewName("updateCustomerOK");
		}else {
			mav.addObject("msg", "고객 수정에 실패하였습니다.");
			mav.setViewName("error");
		}
		return mav;
	}
}
