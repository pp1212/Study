package com.sist.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/hello.do")	//����ڰ� hello.do��� �Է��ϸ� �̰� ������
	public ModelAndView hello() {
		System.out.println("��Ʈ�ѷ� ������");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("hello");		//�̷��Ը� ���� �˾Ƽ� �յڷ� ���� ����
		mav.addObject("msg","hello spring!!");
		ArrayList<String> list = new ArrayList<String>();
		list.add("���");
		list.add("����");
		list.add("����");
		mav.addObject("list", list);
		return mav;
	}
}

