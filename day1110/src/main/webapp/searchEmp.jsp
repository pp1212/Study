<%@page import="com.sist.vo.EmpVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.sist.dao.EmpDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="searchEmp.jsp" method="post"> 
		지역명을 입력하세요 ==> <input type="text" name="dloc">
		<input type="submit" value="검색">	
	</form>
	<%
		request.setCharacterEncoding("euc-kr");
		if(request.getParameter("dloc") != null){
			String dloc = request.getParameter("dloc");
			EmpDAO dao = new EmpDAO();
			ArrayList<EmpVO> list = dao.listEmp(dloc);
			%>
				<table border="1">
					<tr>
						<td>사원번호</td>
						<td>이름</td>
						<td>급여</td>
						<td>수당</td>
						<td>실수령액</td>
						<td>부서번호</td>
						<td>부서명</td>
					</tr>
					<%
						for(EmpVO e : list){
							%>
								<tr>
									<td><%= e.getEno() %></td>
									<td><%= e.getEname() %></td>
									<td><%= e.getSalary() %></td>
									<td><%= e.getComm() %></td>
									<td><%= e.getTotal() %></td>
									<td><%= e.getDno() %></td>
									<td><%= e.getDname() %></td>
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