<%@page import="com.sist.homework.BookVO"%>
<%@page import="java.util.Vector"%>
<%@page import="com.sist.homework.BookDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="bookTest02.jsp" method="post">
		������ȣ�� �Է��ϼ���==> <input type="text" name="bookid">
		�������� �Է��ϼ���==> <input type="text" name="bookname">
		���ǻ���� �Է��ϼ���==> <input type="text" name="publisher">
		������ �Է��ϼ���==> <input type="text" name="price">
		<input type="submit" value="�߰�">
	</form>
	<%
		request.setCharacterEncoding("euc-kr");
		if(request.getParameter("bookid") != null){
			int bookid = Integer.parseInt(request.getParameter("bookid"));
			String bookname = request.getParameter("bookname");
			String publisher = request.getParameter("publisher");
			int price = Integer.parseInt(request.getParameter("price"));
			BookVO b = new BookVO(bookid,bookname,publisher,price);
			BookDAO dao = new BookDAO();
			int re = dao.insertBook(b);
			if(re == 1){
				System.out.println("�������� �߰��� �����Ͽ����ϴ�.");
			}else{
				System.out.println("�������� �߰��� �����Ͽ����ϴ�.");
			}
		}
	%>
</body>
</html>