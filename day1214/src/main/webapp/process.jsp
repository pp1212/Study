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
	request.setCharacterEncoding("utf-8");
	String name = request.getParameter("name");
	
	String method = request.getMethod();
	int contentLength = request.getContentLength();
	String uri = request.getRequestURI();
	StringBuffer url = request.getRequestURL();
	String serverName = request.getServerName();
	int port = request.getServerPort();
	String ip = request.getRemoteAddr();
%>
이름 : <%= name %><br>
요청방식 : <%= method %><br>
요청 정보 길이 : <%= contentLength %><br>
요청 URI : <%= uri %><br>
요청 URL : <%= url %><br>
서버 이름 : <%= serverName %><br>
포트 번호 : <%= port %><br>
ip주소 : <%= ip %>
</body>
</html>