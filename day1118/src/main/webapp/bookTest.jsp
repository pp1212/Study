<%@page import="com.sist.vo.BookVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.sist.dao.BookDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="bookTest.jsp" method="post">
		�̸��� �Է��ϼ���==> <input type="text" name="name"><br>
		<input type="submit" value="��õ">
	</form>
	<%
		request.setCharacterEncoding("euc-kr");
		if(request.getParameter("name") != null){
			String name = request.getParameter("name");
			
			BookDAO dao = new BookDAO();
			ArrayList<BookVO> list = dao.listBook(name);
			%>
			 <table border="1">
			 	<tr>
			 		<td>������ȣ</td>
			 		<td>�����̸�</td>
			 		<td>���ǻ��</td>
			 		<td>����</td>
			 	</tr>
			 	<%
			 		for(BookVO b : list){
			 			%>
			 				<tr>
						 		<td><%=b.getBookid() %></td>
						 		<td><%=b.getBookname() %></td>
						 		<td><%=b.getPublisher() %></td>
						 		<td><%=b.getPrice() %></td>
						 	</tr>
			 			<%
			 		}
			 	%>
			 	
			 </table>
			<%
		}
	%>
</body>
</html>