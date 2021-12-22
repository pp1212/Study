package com.sist.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sist.dao.BoardDAO;
import com.sist.vo.BoardVO;

public class UpdateBoardAction implements SistAction {
	public BoardDAO dao;
	public UpdateBoardAction() {
		dao = new BoardDAO();
	}
	
	@Override
	public String proRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int no = Integer.parseInt(request.getParameter("no"));
		BoardVO b = dao.getBoard(no);	//no에 해당하는 vo를 받아옴
		request.setAttribute("b", b);	//상태유지
		return "updateBoard.jsp";
	}

}
