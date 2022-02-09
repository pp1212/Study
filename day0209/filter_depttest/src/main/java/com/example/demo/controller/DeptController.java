package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.DeptDao;
import com.example.demo.vo.DeptVO;

@Controller
public class DeptController {
	@Autowired
	private DeptDao dao;
	public void setDao(DeptDao dao) {
		this.dao = dao;
	}


	@RequestMapping("/listDept.do")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("list", dao.findAll());
		return mav;
	}
	
	@RequestMapping(value = "/insertDept.do",method = RequestMethod.GET)
	public ModelAndView insertForm(HttpSession session) {
		int re = -1; //로그인을 시도하지 않아서 re에 값이 없을 수도 있으니까 초기화
		if(session.getAttribute("re") != null) {
			re = (Integer)session.getAttribute("re");	//세션은 object로 주니까 형변환해야함
		}
		
		ModelAndView mav = new ModelAndView();
		if(re != 1) {
			mav.setViewName("redirect:/login");
		}
		return mav;
	}
	@RequestMapping(value = "/insertDept.do",method = RequestMethod.POST)
	public ModelAndView insertSubmit(DeptVO d) {
		ModelAndView mav = new ModelAndView("redirect:/listDept.do");
		int re = dao.insert(d);
		if(re != 1) {
			mav.setViewName("error");
			mav.addObject("msg", "부서등록에 실패하였습니다.");
		}
		return mav;
	}
}
