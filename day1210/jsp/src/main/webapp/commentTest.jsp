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
	String name = "홍길동";
	int year = 2021;
	//out.println(name);
	out.println(year+"<br>");
%>
	<h2>Hello</h2>
	<!--  <h2>대한민국</h2>	->html 주석(노출됨) -->	
	<%--  <h2>JSP</h2>  	->jsp주석(노출되지 않음->코드가 노출되지 않으려면 jsp주석으로 막기)--%>		
</body>
</html>