<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("euc-kr");
	%>
	<jsp:useBean id="goods" class="com.sist.vo.Goods" />
	<jsp:useBean id="dao" class="com.sist.dao.GoodsDAO"/>		<!-- dao 객체 생성 -->
	<jsp:setProperty property="*" name="goods"/>
	입력한 상품의 정보는 다음과 같습니다.<hr>
	<%= goods %>
	<%
		int re = dao.insert(goods);
		if(re == 1){
			out.print("상품을 등록하였습니다.");
		}else{
			out.print("상품등록에 실패하였습니다.");
		}
	%>
</body>
</html>