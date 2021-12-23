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
		
		//������ ��ȣ�� �� �ü��� �ֱ� ������ if��
		int pageNUM = 1;
		if(request.getParameter("pageNUM") != null) {
			//listBoard.jsp���� ������ pageNUM ����
			pageNUM = Integer.parseInt(request.getParameter("pageNUM"));
		}
		System.out.println("pageNUM:"+pageNUM);
		
		
		ArrayList<BoardVO> list = dao.listBoard(pageNUM);
		
		//���Ǿ� �ִ� ��ü ������ �� -> ��������
		request.setAttribute("totalPage", BoardDAO.totalPage);
		
		request.setAttribute("list", list);		//������ �̾ƿ� list�� "list"�� �̸� ���̰� ��������
		return "listBoard.jsp";		//list ������ viewPage="listBoard.jsp"�� ����
	}

}
