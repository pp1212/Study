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


	<h2>�ֹ����</h2>
	<form action="insertOrdersOK.jsp" method="post">
		�ֹ���ȣ:<input type="text" name="orderid"><br>
		����ȣ:<select name="custid">
					<%
					 for(CustomerVO c : customerList){
					  %>
					  <option value="<%=c.getCustid()%>"><%= c.getCustid() %></option>
					  <%
					 }
					%>
				</select>
		
		<br>
		������ȣ:<select name="bookid">
					<%
					 for(BookVO b : bookList){
						%>
						 <option value="<%=b.getBookid()%>"><%=b.getBookid() %></option>
						<%
					 }					
					%>				
				</select>
						
		<br>
		���űݾ�:<input type="text" name="saleprice"><br>
		<input type="submit" value="���">
		<input type="reset" value="���">
	</form>
</body>
</html>