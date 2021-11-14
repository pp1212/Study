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
		도서번호를 입력하세요==> <input type="text" name="bookid">
		도서명을 입력하세요==> <input type="text" name="bookname">
		출판사명을 입력하세요==> <input type="text" name="publisher">
		가격을 입력하세요==> <input type="text" name="price">
		<input type="submit" value="추가">
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
				System.out.println("도서정보 추가에 성공하였습니다.");
			}else{
				System.out.println("도서정보 추가에 실패하였습니다.");
			}
		}
	%>
</body>
</html>