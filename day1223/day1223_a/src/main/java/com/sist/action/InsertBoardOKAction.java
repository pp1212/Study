package com.sist.action;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.sist.dao.BoardDAO;
import com.sist.vo.BoardVO;

public class InsertBoardOKAction implements SistAction {
	
	public BoardDAO dao;
	public InsertBoardOKAction() {
		dao = new BoardDAO();
	}
	
	@Override
	public String proRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String path = request.getRealPath("upload");
		System.out.println("path:"+path);
		
		//사진 말고 다른 정보들 multi에 담김
		MultipartRequest multi = new MultipartRequest(request, path, 1024*1024*5, "utf-8", new DefaultFileRenamePolicy());
		
		BoardVO b = new BoardVO();
		int no = dao.getNextNo();
		int b_ref = no;
		int b_level = 0;
		int b_step = 0;
		
		int pno = Integer.parseInt(multi.getParameter("no"));
		if(pno != 0) {
			BoardVO p = dao.getBoard(pno);
			b_ref = p.getB_ref();
			b_level = p.getB_level();
			b_step = p.getB_step();
			dao.updateStep(b_ref,b_step);			//이미 있는 답글에 숫자 증가
			b_level++;
			b_step++;
		}
		
		
		b.setTitle(multi.getParameter("title"));
		b.setWriter(multi.getParameter("writer"));
		b.setPwd(multi.getParameter("pwd"));
		b.setContent(multi.getParameter("content"));
		b.setFname("");	//첨부파일이 없는 게시물도 있을 수 있음
		b.setFsize(0);	//첨부파일이 없는 게시물도 있을 수 있음
		
		b.setNo(no);
		b.setB_ref(b_ref);
		b.setB_level(b_level);
		b.setB_step(b_step);
		
		//사이즈 알아내야 함
		String fname = multi.getFilesystemName("uploadFile");
		//파일업로드 하였다면
		if(fname != null && !fname.equals("")){
			b.setFname(fname);
			File file = multi.getFile("uploadFile");	//업로드 한 파일 얻어올 수 있음
			b.setFsize(file.length());
		}
		int re = dao.insertBoard(b);
		String viewPage = "";
		if(re == 1) {
			viewPage = "insertBoardOK.jsp";
		}else {
			viewPage = "error.jsp";
			request.setAttribute("msg", "게시물 등록에 실패하였습니다.");
		}
		
		return viewPage;
	}

}
