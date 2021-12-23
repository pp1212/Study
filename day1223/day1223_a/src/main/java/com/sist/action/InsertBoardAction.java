package com.sist.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InsertBoardAction implements SistAction {

	@Override
	public String proRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		int no = 0;
		String title = "새글작성";
		if(request.getParameter("no") != null) {
			no = Integer.parseInt(request.getParameter("no"));
			title = "답글작성";
		}
		request.setAttribute("no", no);			//상태유지해서 보냄
		request.setAttribute("title", title);			//상태유지해서 보냄
		return "insertBoard.jsp";	//여기로 가라
	}

}
