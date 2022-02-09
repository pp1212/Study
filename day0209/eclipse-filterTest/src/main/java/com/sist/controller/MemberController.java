package com.sist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MemberController {
	
	@RequestMapping("/member/menu1")
	@ResponseBody
	public String menu1() {
		return "ȸ���޴�1�Դϴ�.";
	}
	
	@RequestMapping("/member/menu2")
	@ResponseBody
	public String menu2() {
		return "ȸ���޴�2�Դϴ�.";
	}
}
