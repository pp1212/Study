<%@page import="kr.co.youiwe.webservice.BitSms"%>
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
	String to = request.getParameter("to");
	String msg = request.getParameter("msg");
	String from = "01025598279";
	BitSms sms = new BitSms();
	sms.sendMsg(from,to,msg);
%>
<%="메세지를 전송하였습니다." %>
</body>
</html>