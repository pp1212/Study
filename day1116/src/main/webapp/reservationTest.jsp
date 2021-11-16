<%@page import="com.sist.vo.TheaterVO"%>
<%@page import="com.sist.dao.ReservationDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.sist.vo.ReservationVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>고객 검색</h2>
	<form action="reservationTest.jsp" method="post">
		이름을 입력하세요==> <input type="text" name="name">
		<input type="submit" value="검색">
	</form>
	
	<%
		request.setCharacterEncoding("euc-kr");
		if(request.getParameter("name") != null){
			String name = request.getParameter("name");
			ReservationDAO dao = new ReservationDAO();
			ArrayList<ReservationVO> list = dao.listReservation(name);
			%>
			<table border="1">
 			<tr>
 				<td>극장이름</td>
 				<td>상영관번호</td>
 				<td>영화제목</td>
 				<td>날짜</td>
 				<td>좌석번호</td>
 				<td>가격</td>
 			</tr>
				<%
				for(ReservationVO r : list){
				%>
					<tr>
		 				<td><%=r.getCinemaName() %></td>
		 				<td><%=r.getTheater_number() %></td>
		 				<td><%=r.getTitle() %></td>
		 				<td><%=r.getDay() %></td>
		 				<td><%=r.getSeats_number() %></td>
		 				<td><%=r.getPrice() %></td>
		 			</tr>
				<%	
				}
				%>
			</table>	
			<%
		}
	%>
</body>
</html>