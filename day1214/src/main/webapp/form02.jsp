<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>회원 가입</h3>
	<form action="form02_process.jsp" method="post">
		<p>아이디 : <input type="text" name="id"> 
					<input type="button" value="아이디 중복 검사"></p>
		<p>비밀번호 : <input type="password" name="passwd"> </p>
		<p>이름 : <input type="text" name="name"> </p>
		<p>연락처 :
			<input type="text" name="phone1" maxlength="4" size="4">		<!-- size:보여지는 길이 -->
			-
			<input type="text" name="phone2" maxlength="4" size="4">		
			-
			<input type="text" name="phone3" maxlength="4" size="4">		
		</p>	
		<p>성별 : 
			<input type="radio" name="sex" value="남성" checked="checked">남성		<!-- checked="checked"기본으로 선택,radio는 둘 중 하나 선택 -->
			<input type="radio" name="sex" value="여성">여성
		</p>
		
		<p>취미 :
			독서<input type="checkbox" name="hobby" value="독서">				<!-- checkbox: 여러개 선택 가능 -->
			운동<input type="checkbox" name="hobby" value="운동">
			영화<input type="checkbox" name="hobby" value="영화">
		</p>
		
		<p>
			지역 :
			<select name="city">
				<option value="서울특별시">서울특별시</option>
				<option value="경기도">경기도</option>
				<option value="인천광역시">인천광역시</option>
				<option value="충청도">충청도</option>
				<option value="전라도">전라도</option>
				<option value="경상도">경상도</option>
				<option value="제주도">제주도</option>
			</select>
		</p>
		
		<p>
			<textarea name="comment" rows="3" cols="30" placeholder="가입 인사를 입력해 주세요"></textarea>	<!-- textarea는 사이에 띄우면 안됨 -->
		</p>
		
		<p>
			<input type="submit" value="가입하기">
			<input type="reset" value="다시 쓰기">		<!-- value:나타날 글자 -->
		</p>
	</form>
</body>
</html>