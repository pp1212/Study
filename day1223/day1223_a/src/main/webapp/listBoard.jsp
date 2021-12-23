<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="insertBoard.do">글등록</a>
	<hr>
	
	<form action="listBoard.do" method="post">
		<select name="searchColum">
			<option value="writer">작성자</option>
			<option value="title">제목</option>
			<option value="content">내용</option>
		</select>
		<input type="search" name="keyword">
		<input type="submit" value="검색">
	</form>
	<table border="1" width="80%">
		<tr>
			<th><a href="listBoard.do?orderColum=no">글번호</a></th>
			<th><a href="listBoard.do?orderColum=title">글제목</a></th>
			<th><a href="listBoard.do?orderColum=writer">작성자</a></th>
			<th><a href="listBoard.do?orderColum=regdate">등록일</a></th>
		</tr>
		<!-- 배열에 있는 거 하나씩 꺼내와서 반복 -->
		<c:forEach var="b" items="${list }">		<!-- var:변수이름 ,items:가져온 list -->
			<tr>
				<td>${b.no }</td>
				<td>
					<!-- 답글이면 그림 출력 -->
					<c:if test="${b.b_level > 0 }">
						<c:forEach var="i" begin="1" end="${b.b_level }">
							&nbsp;&nbsp;
						</c:forEach>
						<img src="re.png">
					</c:if>
					<a href="detailBoard.do?no=${b.no }">${b.title }</a>
				</td>
				<td>${b.writer }</td>
				<td>${b.regdate }</td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<br>
	<!-- 시작값부터 반복 -->
	<c:forEach var="i" begin="1" end="${totalPage }">
		<a href="listBoard.do?pageNUM=${i }">${i }</a>&nbsp;&nbsp;
	</c:forEach>
</body>
</html>