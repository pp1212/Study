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
	<form action="searchName.jsp" method="post">
		이름을 입력하세요 ==> <input type="text" name="name">
		근무위치를 입력하세요 ==> <input type="text" name="dloc">
		<input type="submit" value="검색">
	</form>
	<%
		request.setCharacterEncoding("euc-kr");
		if(request.getParameter("name") != null){
			String name = request.getParameter("name");
			String dloc = request.getParameter("dloc");
			CustomerDAO dao = new CustomerDAO();
			ArrayList<String> list = dao.getName(name, dloc);
			%>
				<table border="1">
					<tr>
						<td>이름</td>					
					</tr>
					<%
						for(String ename : list){
							%>
								<tr>
									<td><%= ename %></td>					
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