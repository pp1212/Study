<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>상품 등록</h2>
	<hr>
	<form action="inputGoodsOK.jsp" method="post">
		상품번호 : <input type="text" name="no"><br>
		상품이름 : <input type="text" name="item"><br>
		상품수량 : <input type="text" name="qty"><br>
		상품단가 : <input type="text" name="price"><br>
		<input type="submit" value="등록">
	</form>
</body>
</html>