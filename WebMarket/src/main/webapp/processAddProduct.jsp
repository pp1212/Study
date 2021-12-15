<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="com.sist.dao.ProductRepository"%>
<%@page import="com.sist.vo.Product"%>
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
	String path = request.getRealPath("images");
	MultipartRequest multi = new MultipartRequest(request, path, 1024*1024*5, "utf-8", new DefaultFileRenamePolicy());
	

	String productId = multi.getParameter("productId");
	String name = multi.getParameter("name");
	int unitPrice = Integer.parseInt(multi.getParameter("unitPrice"));
	String description = multi.getParameter("description");
	String manufacturer = multi.getParameter("manufacturer");
	String category = multi.getParameter("category");
	int unitInStock = Integer.parseInt(multi.getParameter("unitInStock"));
	String condition = multi.getParameter("condition");
	String fileName = multi.getFilesystemName("productImage");
	
	Product product = new Product();
	product.setProductId(productId);
	product.setPname(name);
	product.setUnitPrice(unitPrice);
	product.setDescription(description);
	product.setManufacturer(manufacturer);
	product.setCategory(category);
	product.setUnitInStock(unitInStock);
	product.setCondition(condition);
	product.setFilename(fileName);
	
	//ProductRepository dao = new ProductRepository();	new로 하면 products.jsp에서 만든 ProductRepository와 다르게 만들어짐,private으로 해서 못 만듬
	ProductRepository dao = ProductRepository.getInstance();
	dao.addProduct(product);
	response.sendRedirect("products.jsp");
	
%>
</body>
</html>