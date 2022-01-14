<%@page import="com.thoughtworks.xstream.XStream"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.sist.dao.BookDAO"%>
<%@page import="com.sist.vo.OrderBookInfo"%>
<%@ page language="java" contentType="application/xml; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//고객번호를 전달받아 해당 고객이 주문한 도서내역을 xml로 응답
	int custid = Integer.parseInt(request.getParameter("custid"));
	//int custid = 1;
	BookDAO dao = new BookDAO();
	ArrayList<OrderBookInfo> list = dao.listOrderBook(custid);
	XStream stream = new XStream();
	stream.alias("book", OrderBookInfo.class);
%>
<%=stream.toXML(list)%>