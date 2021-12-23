package com.sist.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sist.dao.BoardDAO;
import com.sist.vo.BoardVO;

public class ListBoardAction implements SistAction {
	public BoardDAO dao;
	
	public ListBoardAction() {
		dao = new BoardDAO();
	}
	
	@Override
	public String proRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//페이지 번호가 안 올수도 있기 때문에 if문
		int pageNUM = 1;
		if(request.getParameter("pageNUM") != null) {
			//listBoard.jsp에서 보내준 pageNUM 받음
			pageNUM = Integer.parseInt(request.getParameter("pageNUM"));
		}
		System.out.println("pageNUM:"+pageNUM);
		
		
		ArrayList<BoardVO> list = dao.listBoard(pageNUM);
		
		//계산되어 있는 전체 페이지 수 -> 상태유지
		request.setAttribute("totalPage", BoardDAO.totalPage);
		
		request.setAttribute("list", list);		//위에서 뽑아온 list를 "list"로 이름 붙이고 상태유지
		return "listBoard.jsp";		//list 가지고 viewPage="listBoard.jsp"로 가라
	}

}
