package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.BookDAO;
import com.example.demo.vo.BookVO;

import lombok.Setter;

@Controller
@Setter
public class BookController {
	
	@Autowired
	private BookDAO dao;
	
	@RequestMapping("/listBook")
	public void list(Model model){	//void말고 modelandview해도 상관 없음
		model.addAttribute("list", dao.listBook());
	}
	
	@RequestMapping("/detailBook/{bookid}")
	public ModelAndView detail(@PathVariable int bookid) {
		ModelAndView mav = new ModelAndView();
		BookVO b = dao.findByBookid(bookid);
		mav.setViewName("detailBook.html");
		mav.addObject("b", b);	//상태유지한것을 detailBook으로 
		return mav;
	}
	
	@GetMapping("/updateBook/{bookid}")
	public ModelAndView updateForm(@PathVariable int bookid, Model model) {
		ModelAndView mav = new ModelAndView();
		BookVO b = dao.findByBookid(bookid);	
		model.addAttribute("b", b);
		mav.setViewName("updateBook.html");
		return mav;
		
	}
	
	@PostMapping("/updateBook")
	//@ResponseBody
	public ModelAndView update(BookVO b) {	
		ModelAndView mav = new ModelAndView("redirect:/listBook");
		dao.updateBook(b);
		return mav;
	}
	
	@RequestMapping("/deleteBook/{bookid}")
	public ModelAndView delete(@PathVariable int bookid, Model model) {
		ModelAndView mav = new ModelAndView("redirect:/listBook");
		dao.deleteBook(bookid);
		return mav;
		
	}
}
