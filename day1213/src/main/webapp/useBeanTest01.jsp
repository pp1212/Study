<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="date" class="java.util.Date"/>	<!-- 객체를 생성  -->
	<p>
		오늘의 날짜 및 시각
		<%= date %>
	</p>
</body>
</html>