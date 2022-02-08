<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>로그인</h2>
	<form action="login" method="post">
		<input type="hidden" name="${_csrf.parameterName }" value="${_csrf.token }">
		아이디 : <input type="text" name="username"><br>
		암호 : <input type="password" name="password"><br>
		<input type="submit" value="로그인">
	</form>
	
	<!-- 스프링 시큐리티에서는
			로그인의 post방식에 대한 처리는 우리가 따로 하지 않음
			
			내부적으로 UserDetailService의
				loadUserByUsername 메소드가 자동으로 동작함
				
				우리는 이 메소드를 오버라이딩해서 로그인한 회원의 정보를 
				User객체로 생성하여 반환하도록 만들어주어야 함
				
				이렇게만 해주면 아이디와 암호가 일치하는지 "인증"에 대한 처리와
									권한이 있는지 "인가"에 대한 처리는
									 스프링 시큐리티가 처리함-->
</body>
</html>