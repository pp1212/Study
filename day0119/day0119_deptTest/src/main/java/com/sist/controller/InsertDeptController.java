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
	@RequestMapping(method = RequestMethod.GET)	//컨트롤러 밑에 쓴다면 이렇게 씀
	public void form() {
		/*
		 * ModelAndView mav = new ModelAndView(); mav.setViewName("insertDept");
		 * //view이름 설정 return mav;
		 */
		
		//=> view를 안써도 요청한 이름의 view가 자동으로 설정 됨
	}
	
							//↓요청방식이 달라서 서비스이름 같아도 됨
	//@RequestMapping(value = "/insertDept.do", method = RequestMethod.POST)
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView submit(DeptVO d) {		//DeptVO -> Command Object라고 부름
		ModelAndView mav = new ModelAndView();
		int re = dao.insert(d);
		
		//성공여부에 따라 view 다르게 함
		if(re == 1) {
			mav.setViewName("insertDeptOK");
		}else {
			mav.addObject("msg", "부서 등록에 실패하였습니다.");
			mav.setViewName("error");
		}
		
		return mav;
	}
}
