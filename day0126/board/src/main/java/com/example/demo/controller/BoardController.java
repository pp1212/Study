package com.example.demo.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.BoardDAO;
import com.example.demo.vo.BoardVO;

import lombok.Setter;

@Controller
@Setter
public class BoardController {
	
	@Autowired
	private BoardDAO dao;
	
	@RequestMapping("/listBoard")
	public void list(
			HttpSession session ,	//정렬 컬럼, 검색 컬럼, 검색어를 상태유지하기 위하여 session변수를 매개변수로 정의
			Model model,	        //View페이지에서 필요한 데이터를 유지하기 위하여 Model을 선언
			String searchColumn,    //검색 컬럼을 받아오기 위한 변수
			String keyword , 	    //검색어를 받아오기 위한 변수
			String orderColumn,	    //정렬 컬럼을 받아 오기 위한 변수
			@RequestParam(value = "pageNUM",defaultValue = "1") int pageNUM) { //페이지 번호를 받아오기 위한 변수
		
		//새로 정렬을 안 하고 세션에 이미 정렬한 값이 있으면 세션에 있는 orderColumn을 가져옴
		//만약에 새로운 정렬이 없고 세션에 정렬컬럼명이 저장되어 있다면
		//세션에 저장된 정렬컬럼명을 읽어옴
		if(orderColumn == null && session.getAttribute("orderColumn") != null) {
			orderColumn = (String)session.getAttribute("orderColumn");
		}
		
		//키워드가 null이거나 키워드가 오지 않는다면
		//만약 새로운 검색어가 없고
		//세션에 검색어가 저장되어 있다면 
		//세션에 저장된 검색컬럼명과 검색어를 읽어옴
		if(keyword == null) {
			if(session.getAttribute("keyword") != null) {
				searchColumn = (String)session.getAttribute("searchColumn");
				keyword = (String)session.getAttribute("keyword");
			}
		}
		
		
		//pageNUM은 int로 하면 페이지 수를 안누르면 null이 오기 때문에 오류가 남
		//1)String으로 받아오는 방법
		//2)int로 받아와서 위에처럼 하는 방법
		System.out.println("정렬컬럼:"+orderColumn);
		System.out.println("pageNUM:"+pageNUM);
		System.out.println("검색컬럼:"+searchColumn);
		System.out.println("검색어:|"+keyword+"|");
//		if(orderColumn == null) {
//			orderColumn = "no";	//정렬 기준이 될 컬럼이 선택되지 않을 경우 기본으로 no를 기준으로 정렬
//		}
		
		//현재 페이지에 보여줄 시작레코드와 마지막레코드의 위치를 계산
		int start = (pageNUM-1)*dao.pageSIZE + 1;	//현재 페이지에 보여줘야 할 페이지
		int end = start + dao.pageSIZE - 1;
		
		//Dao가 게시물 목록을 검색할 때 필요한
		//정보(정렬컬럼명, 검색컬럼명,검색어,현재페이지에 보여줄 시작 레코드,마지막 레코드)
		//들을 map에 저장
		HashMap map = new HashMap();
		map.put("orderColumn", orderColumn);
		map.put("searchColumn", searchColumn);
		map.put("keyword", keyword);
		map.put("start", start);
		map.put("end", end);					//map에 상태유지
		
		//dao를 통해  검색한 결과를 model에 저장
		//이 때 findAll메소드에서 전체레코드 수 구하고
		//그 값을 갖고 전체페이지수도 계산
		model.addAttribute("list", dao.findAll(map));	//dao가 그걸 받아서 DBManager한테 줌
		
		//dao는 계산된 전체페이지수를 model에 상태유지 함
		model.addAttribute("totalPage", dao.totalPage);
		
		//만약에 정렬하였다면 정렬 컬럼이름을 세션에 저장하여 상태유지 함
		if(orderColumn != null) {
			session.setAttribute("orderColumn", orderColumn);	
		}
		
		//만약에 검색하였다면
		//검색한 컬럼이름과 검색어를 세션에 저장하여 상태유지 함
		if(keyword != null) {
			session.setAttribute("searchColumn", searchColumn);
			session.setAttribute("keyword", keyword);
		}
	}
	
	@RequestMapping(value = "/insertBoard",method = RequestMethod.GET)
	public void insertForm(Model model) {
		model.addAttribute("no", dao.getNextNO());
	}
	//listBoard로 보내주기 위해서 ModelAndView 필요
	@RequestMapping(value = "/insertBoard",method = RequestMethod.POST)
	public ModelAndView insertSubmit(HttpServletRequest request,BoardVO b) {
		String ip = request.getRemoteAddr();
		System.out.println(ip);
		b.setIp(ip);
		
		ModelAndView mav = new ModelAndView("redirect:/listBoard");
		String path = request.getRealPath("upload");
		System.out.println("path:"+path);
		b.setFname("");	//일단은 vo에 파일이름이 없다고 ""로 실행함
		
		MultipartFile uploadFile = b.getUploadFile();
		String fname = uploadFile.getOriginalFilename();
		if(fname != null && !fname.equals("")) {		//업로드 한 파일이 있으면 fname에 넣고
			b.setFname(fname);
		}
		
		int re = dao.insert(b);
		if(re != 1) {
			mav.setViewName("error");
			mav.addObject("msg", "게시물 등록에 실패하였습니다.");
		}else {
			//업로드에 성공하면 사진도 업로드
			try {
				byte[] data = uploadFile.getBytes();
				if(fname != null && !fname.equals("")) {
					FileOutputStream fos = new FileOutputStream(path + "/" + fname);
					fos.write(data);
					fos.close();
				}
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		return mav;
	}
	
	@RequestMapping("/detailBoard")
	public void detail(Model model,int no) {
		dao.updateHit(no);
		model.addAttribute("b", dao.findByNo(no));
	}
	
	@RequestMapping(value = "/updateBoard",method = RequestMethod.GET)
	public void updateForm(int no,Model model) {
		model.addAttribute("b", dao.findByNo(no));
	}
	@RequestMapping(value = "/updateBoard",method = RequestMethod.POST)
	public ModelAndView updateSubmit(HttpServletRequest request,BoardVO b) {
		ModelAndView mav = new ModelAndView("redirect:/listBoard");
		String path = request.getRealPath("upload");
		
		String oldFname = b.getFname();
		MultipartFile uploadFile = b.getUploadFile();
		String fname = uploadFile.getOriginalFilename();
		
		//업로드 한 파일이 있다면
		if(fname != null && !fname.equals("")) {
			b.setFname(fname);
			
		}
		
		int re = dao.update(b);
		if(re == 1) {
			//게시물 수정에 성공했고, 또 첨부파일도 수정했다면
			//파일 복사
			if(fname != null && !fname.equals("")) {
				try {
					byte[] data = uploadFile.getBytes();
					//복사
					FileOutputStream fos = new FileOutputStream(path + "/" + fname);
					fos.write(data);
					fos.close();
					
					//원래 게시물이 첨부파일이 있었다면 원래 파일을 삭제
					if(oldFname != null && !oldFname.equals("")) {
						File file = new File(path + "/" + oldFname);
						file.delete();
					}
				}catch (Exception e) {
					// TODO: handle exception
				}
			}
		}else {
			mav.setViewName("error");
			mav.addObject("msg", "게시물 수정에 실패하였습니다.");
		}	
		return mav;
	}
	
	@RequestMapping(value = "/deleteBoard",method = RequestMethod.GET)
	public void deleteForm(int no,Model model) {
		model.addAttribute("no", no);	//삭제할 번호를 상태유지하고 암호를 입력받아야 함
	}
	@RequestMapping(value = "/deleteBoard",method = RequestMethod.POST)
	public ModelAndView deleteSubmit(int no,String pwd,HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("redirect:/listBoard");
		String oldFname = dao.findByNo(no).getFname();
		
		HashMap map = new HashMap();
		map.put("no", no);
		map.put("pwd", pwd);
		int re = dao.delete(map);
		
		if(re == 1) {
			if(oldFname != null && !oldFname.equals("")) {
				String path = request.getRealPath("upload");
				File file = new File(path + "/" + oldFname);
				file.delete();
			}
		}else {
			mav.setViewName("error");
			mav.addObject("msg", "게시물 삭제에 실패하였습니다.");
		}
		return mav;
	}
}




