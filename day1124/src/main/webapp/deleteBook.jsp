<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Statement"%>
<%@page import="com.sist.db.ConnectionProvider"%>
<%@page import="java.sql.Connection"%>
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
		int bookid = Integer.parseInt(request.getParameter("bookid"));
		String sql = "delete book where bookid=?";
		try{
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bookid);
			int re = pstmt.executeUpdate();
			if(re == 1){
				response.sendRedirect("listBookTest.jsp");
			}else{
				%>
				���������� �����Ͽ����ϴ�.<br>
				<a href="listBookTest.jsp">�������</a>
				<%
			}
		}catch(Exception e){
			System.out.println("���ܹ߻�:"+e.getMessage());
		}
	
	%>
</body>
</html>