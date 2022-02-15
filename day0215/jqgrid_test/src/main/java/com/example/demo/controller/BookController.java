package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.BookDao;
import com.example.demo.vo.BookVO;

import lombok.Setter;

@Controller
@Setter
public class BookController {
	
	@Autowired
	private BookDao dao;
	
													//응답방식 설정
	@RequestMapping(value = "/listBook",produces = "application/xml")
	@ResponseBody
	public String listBook(int page,int rows,String sidx,String sord) {
		System.out.println("page:"+page);
		System.out.println("rows:"+rows);
		
		if(sidx == null) {
			System.out.println("null입니다.");
		}
		
		if(sidx.equals("")) {
			System.out.println("''입니다.");
		}
		System.out.println("sidx:"+sidx);
		System.out.println("sord:"+sord);
		
		
		int records = dao.getTotalCount();
		int total = (int)Math.ceil(records/(double)rows);
		System.out.println("전체레코드수:"+records);
		System.out.println("전체페이지수:"+total);
		
		String r = "";
		r += "<rows>";
		r += "<page>"+page+"</page>";			//매개변수로 전달 받은 페이지를 설정
		r += "<total>"+total+"</total>";		//전체 레코드 수에 따른 페이지 수를 설정
		r += "<records>"+records+"</records>";	//진짜로 db연동하여 전체 레코드 수를 설정
		
		//만약에 한 화면에 10개씩 보여주고 
		//현재 페이지가 1페이지라면 보여줘야 할 시작 레코드는 1,마지막 레코드는 10
		//현재 페이지가 2페이지라면 보여줘야 할 시작 레코드는 11,마지막 레코드는 20
		//				2-1*10    +1 =11
		int start = (page-1)*rows + 1;
		//			11 + 10	   -1 =20
		int end = start + rows -1;			
		
		HashMap map = new HashMap();
		map.put("start", start);
		map.put("end", end);
		map.put("sidx", sidx);
		map.put("sord", sord);
		
		//매개변수가 없는 findAll에서 map을 매개변수로 갖는 findAll로 바뀜
		List<BookVO> list = dao.findAll(map);
		//현재 페이지에 보여줄 레코드만 반환하도록 
		
		
		
		for(BookVO b:list) {
			r += "<row>";
			r += "<cell>"+b.getBookid()+"</cell>";
			r += "<cell>"+b.getBookname()+"</cell>";
			r += "<cell>"+b.getPublisher()+"</cell>";
			r += "<cell>"+b.getPrice()+"</cell>";
			r += "</row>";
		}
		
		r += "</rows>";
		return r;	//jqgrid가 원하는 xml형태를 만들어서 보냄
	}
	
	@RequestMapping("/editBook")
	@ResponseBody
	public String editBook(String oper,BookVO b) {
		System.out.println(oper);	//oper:add,edit,del
		
		if(oper.equals("add")) {
			dao.insert(b);
		}else if(oper.equals("edit")) {
			dao.update(b);
		}else {
			//삭제할 때 bookid를 전달해주는 다이얼로그 설정
			dao.delete(b.getBookid());
		}
		
		return "OK";
	}
}
