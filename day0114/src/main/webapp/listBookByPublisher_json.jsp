<%@page import="java.util.ArrayList"%>
<%@page import="com.sist.vo.BookVO"%>
<%@page import="com.sist.dao.BookDAO"%>
<%@ page language="java" contentType="application/json; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String publisher = request.getParameter("publisher");
	//String publisher = "굿스포츠";
	BookDAO dao = new BookDAO();
	ArrayList<BookVO> list = dao.listBookByPublisher(publisher);
	
	
	/* String result = "<list>";		//book이 여러개여서 바깥에 제일 큰 <list></list>로 감싸기 -> <list></list> 둘 다 루프 밖에 쓰기
	for(BookVO b:list){
		result += "<book>";
		result += "<bookid>"+b.getBookid()+"</bookid>";
		result += "<bookname>"+b.getBookname()+"</bookname>";
		result += "<publisher>"+b.getPublisher()+"</publisher>";
		result += "<price>"+b.getPrice()+"</price>";
		result += "</book>";
	}
	result += "</list>"; */
	
	String result = "[";			//배열이어서 []로 담기
	for(int i=0;i<list.size();i++){
		BookVO b = list.get(i);
		
		//문자열 데이터와 key에 "" 붙여야 함, 근데 밖에 묶고 있는 ""로 인식하니까 \"로 해야 함
		result += "{\"bookid\":"+b.getBookid()+",\"bookname\":\""+b.getBookname()+"\",\"publisher\":\""+b.getPublisher()+"\",\"price\":"+b.getPrice()+"}";
		if(i != list.size()-1){		//맨 끝이 아니라면
			result += ",";
		}
	}
	result += "]";
	
%>
<%=result %>