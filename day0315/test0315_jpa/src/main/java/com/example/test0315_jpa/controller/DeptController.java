package com.example.test0315_jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.test0315_jpa.service.DeptService;
import com.example.test0315_jpa.vo.DeptVO;

import lombok.Setter;

@Controller
@Setter
public class DeptController {
	
	@Autowired
	private DeptService ds;
	
	@GetMapping("/list")
	public void list(Model model) {
		model.addAttribute("list", ds.findAll());
	}
	
	//등록할 때, 수정할 때 사용 됨
	@PostMapping("/save")
	public String save(DeptVO d) {
		ds.save(d);		//만약에 부서번호가 테이블에 이미 존재한다면 수정을 하고 없으면 등록
		return "redirect:/list";
	}
	
	@GetMapping("/update")
	public void update(int dno, Model model) {
		model.addAttribute("d", ds.getDept(dno));
	}
	
	@GetMapping("/delete")
	public String delete(int dno) {
		ds.delete(dno);
		return "redirect:/list";
	}
}
