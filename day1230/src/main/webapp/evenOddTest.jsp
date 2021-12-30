<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function pro() {
		let num = Number(document.getElementById("num").value);
		let result = "짝수";
		if(num % 2 == 1){
			result = "홀수";
		}
		document.getElementById("result").innerHTML = result;
	}
</script>
</head>
<body>
	<h2>짝수,홀수 판별하기</h2>
	<hr>
	수를 입력하세요 ==> <input type="text" id="num">
	<button onclick="pro()">확인</button><br>
	결과 : <span id="result"></span>
</body>
</html>