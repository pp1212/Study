package com.sist.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		
		//상태유지,받아오기 모두 session 필요
		HttpSession session = request.getSession();
		
		
		request.setCharacterEncoding("utf-8");
		String orderColum = request.getParameter("orderColum");
		System.out.println("정렬컬럼 : " + orderColum);
		
		String searchColum = request.getParameter("searchColum");
		System.out.println("검색컬럼 : "+searchColum);
		
		String keyword = request.getParameter("keyword");
		System.out.println("검색어 : "+keyword);
		
		//새로운 검색어가 없고 상태유지 된 검색어(전에 검색한 검색어)가 있냐
		if(keyword == null && session.getAttribute("keyword") != null) {
			searchColum = (String)session.getAttribute("searchColum");
			keyword = (String)session.getAttribute("keyword");
		}
		
		//새로운 정렬 컬럼이 없고 상태유지 된 정렬(전에 한 정렬)이 있다면
		if(orderColum == null && session.getAttribute("orderColum") != null) {
			orderColum = (String)session.getAttribute("orderColum");
		}
		
		
		//페이지 번호가 안 올수도 있기 때문에 if문
		int pageNUM = 1;
		if(request.getParameter("pageNUM") != null) {
			//listBoard.jsp에서 보내준 pageNUM 받음
			pageNUM = Integer.parseInt(request.getParameter("pageNUM"));
		}
		System.out.println("pageNUM:"+pageNUM);
		
		
		ArrayList<BoardVO> list = dao.listBoard(pageNUM,orderColum,searchColum,keyword);
		
		//계산되어 있는 전체 페이지 수 -> 상태유지
		request.setAttribute("totalPage", BoardDAO.totalPage);
		
		request.setAttribute("list", list);		//위에서 뽑아온 list를 "list"로 이름 붙이고 상태유지
		
		//검색어를 안 상태로 페이징 해야 함
		if(keyword != null) {
			session.setAttribute("keyword", keyword);
			session.setAttribute("searchColum", searchColum);
		}
		
		//
		if(orderColum != null) {
			session.setAttribute("orderColum", orderColum);
		}
		
		return "listBoard.jsp";		//list 가지고 viewPage="listBoard.jsp"로 가라
	}

}
