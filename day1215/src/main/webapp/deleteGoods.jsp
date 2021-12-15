<%@page import="java.io.File"%>
<%@page import="com.sist.vo.GoodsVO"%>
<%@page import="com.sist.dao.GoodsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	int no = Integer.parseInt(request.getParameter("no"));
	GoodsDAO dao = GoodsDAO.getInstance();
	String oldFname = dao.getGoods(no).getFname();		//해당 상품의 파일이름을 미리 알아 놓기
	String path = request.getRealPath("goods");
	int re = dao.dalete(no);
	if(re == 1){
		File file = new File(path + "/" + oldFname);
		file.delete();
		response.sendRedirect("listGoods.jsp");
	}else{
		out.println("상품삭제에 실패하였습니다.");
	}
	
%>

</form>
</body>
</html>