<%@page import="java.util.ArrayList"%>
<%@page import="com.sist.vo.BookVO"%>
<%@page import="com.sist.dao.BookDAO"%>
<%@ page language="java" contentType="application/xml; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String publisher = request.getParameter("publisher");
	//String publisher = "쌍용미디어";
	BookDAO dao = new BookDAO();
	ArrayList<BookVO> list = dao.listBookByPublisher(publisher);
	String result = "<list>";		//book이 여러개여서 바깥에 제일 큰 <list></list>로 감싸기 -> <list></list> 둘 다 루프 밖에 쓰기
	for(BookVO b:list){
		result += "<book>";
		result += "<bookid>"+b.getBookid()+"</bookid>";
		result += "<bookname>"+b.getBookname()+"</bookname>";
		result += "<publisher>"+b.getPublisher()+"</publisher>";
		result += "<price>"+b.getPrice()+"</price>";
		result += "</book>";
	}
	result += "</list>";
%>
<%=result %>