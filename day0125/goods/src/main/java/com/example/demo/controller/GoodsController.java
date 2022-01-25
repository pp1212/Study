package com.example.demo.controller;


import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.GoodsDAO;
import com.example.demo.vo.GoodsVO;

@Controller
public class GoodsController {
	
	@Autowired
	private GoodsDAO dao;
	public void setDao(GoodsDAO dao) {
		this.dao = dao;
	}
	
	@RequestMapping("/listGoods")
	public void list(Model model){
		model.addAttribute("list", dao.findAll());
	}
	
	@RequestMapping(value = "/insertGoods",method = RequestMethod.GET)
	public void insertForm() {
		
	}
	@RequestMapping(value = "/insertGoods",method = RequestMethod.POST)
	public ModelAndView insertSubmit(HttpServletRequest request ,GoodsVO g) {
		String path = request.getRealPath("images");
		System.out.println("path:"+path);
		MultipartFile uploadFile = g.getUploadFile();
		String fname = uploadFile.getOriginalFilename();	//이름
		g.setFname(fname);	//db에 파일이름 넣기
		try {
			byte[] data = uploadFile.getBytes();	//내용
			FileOutputStream fos = new FileOutputStream(path + "/" + fname);
			fos.write(data);
			fos.close();
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		int re = dao.insert(g);
		ModelAndView mav = new ModelAndView("redirect:/listGoods");
		if(re != 1) {
			mav.setViewName("error");
			mav.addObject("msg", "상품 등록에 실패하였습니다.");
		}
		return mav;
	}
	
	@RequestMapping("/detailGoods")
	public void detail(int no, Model model) {
		model.addAttribute("g", dao.findByNo(no));
	}
	
	
	//detailGoods에서 no를 갖고 옴, 수정할 상품을 상태유지해서 updateGoods.jsp로 감
	@RequestMapping(value = "/updateGoods",method = RequestMethod.GET)
	public void updateForm(int no,Model model) {
		model.addAttribute("g", dao.findByNo(no));	//수정 할 상품 상태유지
	}
	//updateGoods.jsp에서 submit누르면 GoodsVO를 갖고 옴
	@RequestMapping(value = "/updateGoods",method = RequestMethod.POST)
	public ModelAndView updateSubmit(HttpServletRequest request ,GoodsVO g) {
		ModelAndView mav = new ModelAndView("redirect:/listGoods");
		String path = request.getRealPath("images");
		
		String oldFname = g.getFname();					//원래 사진 이름
		MultipartFile uploadFile = g.getUploadFile();	//업로드 한 사진 정보
		String fname = uploadFile.getOriginalFilename();//업로드 한 사진 이름
		byte[] data;									//업로드 한 사진 내용
		try {
			data = uploadFile.getBytes();
			
			//파일이름이 null이 아니어야 하고 ""도 아니어야 함, 반드시 이 순서로 물어봐야 함
			if(fname != null && !fname.equals("")) {
				//출력하는 것, 업로드 한 파일 경로 가져와서 fos 객체에 넣어서 만들고 write() 써서 출력
				FileOutputStream fos = new FileOutputStream(path + "/" +fname);
				fos.write(data);
				fos.close();
				g.setFname(fname);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		int re = dao.update(g);
		if(re != 1) {
			//업데이트 실패
			mav.setViewName("error");
			mav.addObject("msg", "상품 수정에 실패하였습니다.");
		}else {
			//업데이트를 성공했고 파일도 수정(업로드 한 파일이름이 존재하면)했다면 원래 사진을 삭제함
			if(fname != null && !fname.equals("")) {
				//원래 있던 파일 경로 가져와서 file 객체에 넣어서 만들고 delete() 써서 삭제
				File file = new File(path + "/" +oldFname);
				file.delete();
			}
		}
		return mav;
	}
	
	@RequestMapping("/deleteGoods")
	public ModelAndView delete(HttpServletRequest request,int no) {
		ModelAndView mav = new ModelAndView("redirect:/listGoods");
		String oldFname = dao.findByNo(no).getFname();		//원래 사진 이름 받아 놓기
		
		int re = dao.delete(no);					//내용 지우고
		if(re != 1) {
			mav.setViewName("error");
			mav.addObject("msg", "상품 삭제에 실패하였습니다.");
		}else {
			String path = request.getRealPath("images");
			File file = new File(path + "/" + oldFname);
			file.delete();							//사진 파일 지우기
		}
		
		return mav;
	}
}





