<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Enumeration en = session.getAttributeNames();	//session에 설정된 모든 이름 가지고 옴
		while(en.hasMoreElements()){
			String name = (String)en.nextElement();
			Object value = session.getAttribute(name);
			out.println(name);
			out.println(value);
			out.println("<hr>");
		}
	%>
</body>
</html>