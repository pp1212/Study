<%@page import="com.sist.DAO.BookDAO"%>
<%@ page language="java" contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//축구의 이해		대한미디어
	/* String bookname = "축구의 이해";
	String publisher = "대한미디어";
	
	BookDAO dao = new BookDAO();
	int price = dao.getPrice(bookname, publisher); */
	
	String bookname = request.getParameter("bookname");
	String publisher = request.getParameter("publisher");
	
	BookDAO dao = new BookDAO();
	int price = dao.getPrice(bookname, publisher); 
%>
<%=price%>원