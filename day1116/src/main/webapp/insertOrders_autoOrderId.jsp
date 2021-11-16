<%@page import="com.sist.vo.CustomerVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.sist.dao.CustomerDAO"%>
<%@page import="com.sist.dao.BookDAO"%>
<%@page import="com.sist.vo.BookVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	BookDAO bookDao = new BookDAO();
	CustomerDAO customerDAO = new CustomerDAO();
	ArrayList<BookVO> bookList = bookDao.listBook();
	ArrayList<CustomerVO> customerList = customerDAO.listCustomer();
%>


	<h2>주문등록</h2>
	<form action="insertOrdersOK_autoOrderId.jsp" method="post">
		고객번호:<select name="custid">
					<%
					 for(CustomerVO c : customerList){
					  %>
					  <option value="<%=c.getCustid()%>"><%= c.getName() %></option>
					  <%
					 }
					%>
				</select>
		
		<br>
		도서번호:<select name="bookid">
					<%
					 for(BookVO b : bookList){
						%>
						 <option value="<%=b.getBookid()%>"><%=b.getBookname() %>(<%=b.getPrice()%>)  </option>
						<%
					 }					
					%>				
				</select>
						
		<br>
		구매금액:<input type="text" name="saleprice"><br>
		<input type="submit" value="등록">
		<input type="reset" value="취소">
	</form>
</body>
</html>