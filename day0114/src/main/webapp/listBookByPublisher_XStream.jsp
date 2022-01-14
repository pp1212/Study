<%@page import="com.thoughtworks.xstream.XStream"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.sist.vo.BookVO"%>
<%@page import="com.sist.dao.BookDAO"%>
<%@ page language="java" contentType="application/xml; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String publisher = request.getParameter("publisher");
	//String publisher = "굿스포츠";
	BookDAO dao = new BookDAO();
	ArrayList<BookVO> list = dao.listBookByPublisher(publisher);
	//내가 xml 노드 안 만들어줘도 됨 ->  XStream 객체 만들고 toXML 메서드 호출하면 자동으로 만들어 줌
	XStream stream = new XStream();
	stream.alias("book", BookVO.class);		//노드가 <book></book>으로 나오도록 애칭을 정해주기
	String result = stream.toXML(list);
%>
<%=result %>