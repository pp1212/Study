<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function calcAdd() {
		a = document.getElementById("num1").value;	//let 안 써도 됨
		b = document.getElementById("num2").value;
		result = Number(a) + Number(b);	//100200 -> 문자열이어서
		document.getElementById("add").innerHTML = result;
	}
	function calcSub() {
		a = document.getElementById("num1").value;
		b = document.getElementById("num2").value;
		result = Number(a) - Number(b);
		document.getElementById("sub").innerHTML = result;
	}
	function calcMulti() {
		a = document.getElementById("num1").value;
		b = document.getElementById("num2").value;
		result = Number(a) * Number(b);
		document.getElementById("multi").innerHTML = result;
	}
	function calcDiv() {
		a = document.getElementById("num1").value;
		b = document.getElementById("num2").value;
		result = Number(a) / Number(b);
		document.getElementById("div").innerHTML = result;
	}
</script>
</head>
<body>
	
	수1: <input type="text" id="num1"><br>
	수2: <input type="text" id="num2"><br>
	<button onclick="calcAdd()">더하기</button><span id="add"></span> <!-- span 값을 입력하고 버튼을 누르면 값이 나옴,value 없음 -->
	<button onclick="calcSub()">빼기</button><span id="sub"></span> 
	<button onclick="calcMulti()">곱하기</button><span id="multi"></span> 
	<button onclick="calcDiv()">나누기</button><span id="div"></span> 
</body>
</html>