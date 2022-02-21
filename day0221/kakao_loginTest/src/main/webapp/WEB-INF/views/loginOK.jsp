<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="http://developers.kakao.com/sdk/js/kakao.js"></script>
<script type="text/javascript">
	Kakao.init("cb867968b137f5ce568960c2a63abd83");	//카카오 서비스를 이용할 수 있는 권한이 있는 사람이다 인증
	function kakaoLogout(){
		//카카오가 제공하는 연결을 끊는 동작
		Kakao.API.request({
			url:"/v1/user/unlink",
			success:function(){
				alert("카카오 로그아웃되었습니다.");
				location.href = "/login.html";
			}
		});
	}
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${not empty member }">
		${member }님 로그인 하였습니다.
		<a href="javascript:kakaoLogout()">카카오 로그아웃</a>
	</c:if>
	<hr>
	
	
	
</body>
</html>