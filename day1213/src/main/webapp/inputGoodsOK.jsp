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
	<jsp:useBean id="dao" class="com.sist.dao.GoodsDAO"/>		<!-- dao ��ü ���� -->
	<jsp:setProperty property="*" name="goods"/>
	�Է��� ��ǰ�� ������ ������ �����ϴ�.<hr>
	<%= goods %>
	<%
		int re = dao.insert(goods);
		if(re == 1){
			out.print("��ǰ�� ����Ͽ����ϴ�.");
		}else{
			out.print("��ǰ��Ͽ� �����Ͽ����ϴ�.");
		}
	%>
</body>
</html>