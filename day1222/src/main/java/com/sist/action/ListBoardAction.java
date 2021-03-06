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
		ArrayList<BoardVO> list = dao.listBoard();
		request.setAttribute("list", list);		//위에서 뽑아온 list를 "list"로 이름 붙이고 상태유지
		
		return "listBoard.jsp";		//list 가지고 viewPage="listBoard.jsp"로 가라
	}

}
