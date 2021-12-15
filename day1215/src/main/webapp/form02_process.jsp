<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
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
	request.setCharacterEncoding("utf-8");

/*
	MultipartRequest multi = new MultipartRequest(request, "c:/upload", 1024*1024*5, "utf-8", new DefaultFileRenamePolicy());
	//생성하는 순간 파일 저장 됨
*/

	//upload의 실제 경로 알려줌
	String path = request.getRealPath("upload");
	System.out.println(path);
	MultipartRequest multi = new MultipartRequest(request, path, 1024*1024*5, "utf-8", new DefaultFileRenamePolicy());
	

	//multi를 통해서 받아옴
	String title = multi.getParameter("title");				//input type="text"여서 getParameter()로 받을 수 있음
	String fname = multi.getFilesystemName("fileName");		//input type="file"여서 getFilesystemName()로 받을 수 있음
	out.println("title:"+title);
	out.println("fname:"+fname);
	
	
%>
</body>
</html>