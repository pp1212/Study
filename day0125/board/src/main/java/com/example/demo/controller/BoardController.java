package com.example.demo.controller;

import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	public void list(Model model) {
		model.addAttribute("list", dao.findAll());
	}
	
	@RequestMapping(value = "/insertBoard",method = RequestMethod.GET)
	public void insertForm() {
		
	}
	//listBoard로 보내주기 위해서 ModelAndView 필요
	@RequestMapping(value = "/insertBoard",method = RequestMethod.POST)
	public ModelAndView insertSubmit(HttpServletRequest request,BoardVO b) {
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
}




