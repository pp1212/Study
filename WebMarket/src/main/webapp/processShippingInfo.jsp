<%@page import="java.net.URLEncoder"%>
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
	Cookie cartId = new Cookie("Shipping_cartId", URLEncoder.encode(request.getParameter("cartId"),"utf-8"));	//URLEncoder.encode로 감싸면 한국어,일본어 등 쓸 수 있음
	Cookie name = new Cookie("Shipping_name", URLEncoder.encode(request.getParameter("name"),"utf-8"));
	Cookie shippingDate = new Cookie("Shipping_shippingDate", URLEncoder.encode(request.getParameter("shippingDate"),"utf-8"));
	Cookie country = new Cookie("Shipping_country", URLEncoder.encode(request.getParameter("country"),"utf-8"));
	Cookie zipCode = new Cookie("Shipping_zipCode", URLEncoder.encode(request.getParameter("zipCode"),"utf-8"));
	Cookie addressName = new Cookie("Shipping_addressName", URLEncoder.encode(request.getParameter("addressName"),"utf-8"));
	
	//쿠키 유효시간 24시간
	cartId.setMaxAge(60*60*24);
	name.setMaxAge(60*60*24);
	shippingDate.setMaxAge(60*60*24);
	country.setMaxAge(60*60*24);
	zipCode.setMaxAge(60*60*24);
	addressName.setMaxAge(60*60*24);
	
	//생성된 쿠키를 클라이언트에 기록하는 메소드
	response.addCookie(cartId);
	response.addCookie(name);
	response.addCookie(shippingDate);
	response.addCookie(country);
	response.addCookie(zipCode);
	response.addCookie(addressName);
	
	//주문정보 확인하는 jsp
	response.sendRedirect("orderConfirmation.jsp");
%>
</body>
</html>