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
		request.setCharacterEncoding("euc-kr");
		String subject = request.getParameter("subject");
		String job = request.getParameter("job");
	%>
		입력한 내용은 다음과 같습니다.<br>
		좋아하는 과목 : <%=subject %><br>
		직업 : <%=job %>
</body>
</html>