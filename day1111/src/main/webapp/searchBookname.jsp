<%@page import="com.sist.vo.CustomerVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.sist.dao.CustomerDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="searchBookname.jsp" method="post">
	이름을 입력하세요 ==> <input type="text" name="name">
	<input type="submit" value="검색">
	</form>
	<%
		request.setCharacterEncoding("euc-kr");
		if(request.getParameter("name") != null){
			String name = request.getParameter("name");
			CustomerDAO dao = new CustomerDAO();
			ArrayList<CustomerVO> list = dao.listBookname(name);
			%>
			<table border="1" width="80%">
				<tr>
					<td>도서이름</td>
				</tr>
				<%
					for(CustomerVO c : list){
					%>
						<tr>
							<td><%= c.getBookname() %></td>
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