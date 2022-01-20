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
	
	//�����ͺ��̽� �����ؼ� ��� ������� �о���� ���� ����� ������ ��
	@Autowired
	private CustomerDAO dao;
	//�ʱ�ȭ ���� setter
	public void setDao(CustomerDAO dao) {
		this.dao = dao;
	}

	
	
	@RequestMapping("/listCustomer.do")
	public ModelAndView list() {		//������ �����ϴ� �޼ҵ�
		ModelAndView mav = new ModelAndView();
		
		ArrayList<CustomerVO> list = dao.listAll();
		mav.addObject("list",list);
		mav.setViewName("listCustomer");	//view�� ��ġ�� Ȯ���ڰ� �׻� ���Ƽ� ����
		return mav;
	}
	
	
	
	@RequestMapping("/detailCustomer.do")
	public ModelAndView detail(int custid) {	//dao�� �����Ϸ��� �ʿ��� �Ű�����
		ModelAndView mav = new ModelAndView();
		//CustomerVO c = dao.getCustomer(custid);
		//mav.addObject("c", c);
		mav.addObject("c", dao.getCustomer(custid));
		//��û�� �����̸��� ���� view�� ������ ������
		//setView(  mav.setViewName("detailCustomer");  )�� ������ �� ����
		return mav;
	}
	
}

