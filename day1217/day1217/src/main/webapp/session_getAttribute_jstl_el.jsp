<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 그냥 출력을 위한 것은 getAttribute 안하고 이렇게 하면 됨 -->
이름 : ${name }<br>
나이 : ${age }<br>
<c:forEach var="food" items="${list }">
	${food }
</c:forEach>
<hr>
<c:forEach var="g" items="${goods_list }">		<!-- var가 변수 items가 리스트 -->
	상품번호 : ${g.no }<br>			<!-- ->g.getNo랑 같은 것 -->
	상품명 : ${g.item }<br>
	상품수량 : ${g.qty }<br>
	상품가격 : ${g.price }<hr>
</c:forEach>
<br>
<br>
<%
	session.removeAttribute("name");
	session.removeAttribute("goods_list");
%>
<h4> --------- 세션을 삭제한 후 ------------</h4>
이름 : ${name }<br>
나이 : ${age }<br>
<c:forEach var="food" items="${list }">
	${food }
</c:forEach>
<hr>
<c:forEach var="g" items="${goods_list }">		
	상품번호 : ${g.no }<br>			
	상품명 : ${g.item }<br>
	상품수량 : ${g.qty }<br>
	상품가격 : ${g.price }<hr>
</c:forEach>
</body>
</html>