<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
	table, td{
		border: 1px solid black;
	}
	
	table{
		border-collapse: collapse;
		width: 60%;
	}
	
	.title{
		background-color: black;
		color: white;
	}
</style>
</head>
<body>
	<%
		int []lastDate = {31,28,31,30,31,30,31,31,30,31,30,31};
		String []days = {"일","월","화","수","목","금","토"};
		Date today = new Date();
		
		
		int year = today.getYear();			//year는 1900빼서 반환 -> +1900 해줘야 함
		int month = today.getMonth();		//month는 -1해서 반환 -> +1 해줘야 함
		
		//다음달을 눌러서 오냐? -> 다음달 누르고 오면 month가 전달되기 때문에 null이 아님
		if(request.getParameter("month") != null){
			year = Integer.parseInt(request.getParameter("year"));
			month = Integer.parseInt(request.getParameter("month"));
			
			//12월달에서 '다음달'버튼을 누르면 다음년도의 1월로 감
			if(month == 12){
				year++;
				month = 0;			//month는 0부터 시작
			}
			
			if(month == -1){		//1월->month:0인데 month-1을 한 상태여서 month;-1
				year--;
				month = 11;
			}
		}
		
		Date startDate = new Date(year,month,1);
		int startDay = startDate.getDay();
	%>
	<h2><%=year+1900 %>년 <%=month+1 %>월</h2>
	<table>
	<tr class="title">
		<%
			//days 배열의 요소만큼 td를 동적으로 만듬
			for(String day:days){
				%>
					<td><%=day %></td>
				<%
			}
		%>
	</tr>
	<tr>
		<%
			for(int i=1;i<=startDay;i++){
				%>
					<td>&nbsp;</td>		<!-- &nbsp; -> 빈칸 -->
				<%
			}
			for(int i=1;i<=lastDate[month];i++){
				
				%>
					<td><%=i %></td>
				<%
					if((i+startDay)%7 == 0){
					%>
						</tr><tr>
					<%
				}
			}
		%>
	</tr>
	</table>
	<hr>
	<a href="calendarTest.jsp?year=<%=year %>&month=<%=month-1%>">이전달</a>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="calendarTest.jsp?year=<%=year %>&month=<%=month+1%>">다음달</a>
</body>
</html>






