package com.sist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sist.dao.DeptDAO;
import com.sist.vo.DeptVO;

@Controller
@RequestMapping("/insertDept.do")
public class InsertDeptController {
	
	private DeptDAO dao;
	public void setDao(DeptDAO dao) {
		this.dao = dao;
	}

	//@RequestMapping(value = "/insertDept.do", method = RequestMethod.GET)
	@RequestMapping(method = RequestMethod.GET)	//��Ʈ�ѷ� �ؿ� ���ٸ� �̷��� ��
	public void form() {
		/*
		 * ModelAndView mav = new ModelAndView(); mav.setViewName("insertDept");
		 * //view�̸� ���� return mav;
		 */
		
		//=> view�� �Ƚᵵ ��û�� �̸��� view�� �ڵ����� ���� ��
	}
	
							//���û����� �޶� �����̸� ���Ƶ� ��
	//@RequestMapping(value = "/insertDept.do", method = RequestMethod.POST)
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView submit(DeptVO d) {		//DeptVO -> Command Object��� �θ�
		ModelAndView mav = new ModelAndView();
		int re = dao.insert(d);
		
		//�������ο� ���� view �ٸ��� ��
		if(re == 1) {
			mav.setViewName("insertDeptOK");
		}else {
			mav.addObject("msg", "�μ� ��Ͽ� �����Ͽ����ϴ�.");
			mav.setViewName("error");
		}
		
		return mav;
	}
}
