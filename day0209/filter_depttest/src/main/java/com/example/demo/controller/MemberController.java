package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.MemberDAO;
import com.example.demo.vo.MemberVO;

import lombok.Setter;

@Controller
@Setter
public class MemberController {
	
	@Autowired
	private MemberDAO dao;
	
	
	@RequestMapping(value = "/login",method = RequestMethod.GET)
	public void login_form() {
		
	}
	
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	public ModelAndView login_submit(HttpSession session,String id,String pwd) {
		ModelAndView mav = new ModelAndView("loginOK");
		
		int re = dao.isMember(id, pwd);
		session.setAttribute("re", re);	
		//re의 값이 1이면 로그인 상태
		
		if(re != 1) {
			//아이디가 존재하기 않습니다.
			//암호가 올바르지 않습니다.
			//re를 상태유지해서 view에서 re에 따라 다른 메세지 나오도록 설정 -> redirect 하면 상태유지가 없어짐 -> 그래서 세션에 넣어야함
			mav.setViewName("redirect:/login");
		}
		
		return mav;
	}
}
