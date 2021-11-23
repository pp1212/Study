<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%
	Class.forName("oracle.jdbc.driver.OracleDriver");
	String url = "jdbc:oracle:thin:@localhost:1521:XE";
	Connection conn = DriverManager.getConnection(url,"c##madang" , "madang");
	Statement stmt = conn.createStatement();
	ResultSet rs = stmt.executeQuery("select bookid,bookname from book");
%>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr>
		<td>도서번호</td>
		<td>도서명</td>
	</tr>
	
	<%
		while(rs.next()){
			int b_bookid = rs.getInt(1);
			String b_bookname = rs.getString(2);
			%>
			<tr>
			<td><%= b_bookid%></td>
				<td><a href="bookdetail.jsp?bookid=<%=b_bookid%>"><%=b_bookname %></a></td>
			</tr>
			<% 
		}
	%>
	
</table>


</body>
</html>