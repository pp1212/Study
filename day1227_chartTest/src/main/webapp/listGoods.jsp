<%@page import="com.google.gson.Gson"%>
<%@page import="com.sist.vo.GoodsVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="application/json; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//상품목록을 자바스크립트 객체(JSON)으로 응답하는 jsp를 작성
	//gson은 자바객체를 자바스크립트로 바꿔줌
	ArrayList<GoodsVO> list = new ArrayList<GoodsVO>();
	list.add(new GoodsVO(1,"사과",10,1000));
	list.add(new GoodsVO(2,"포도",11,1000));
	list.add(new GoodsVO(3,"수박",12,1000));
	list.add(new GoodsVO(4,"딸기",13,1000));
	list.add(new GoodsVO(5,"토마토",10,1000));
	//여기까지에 dao를 통해서 메소드 요청하는 부분
	
	Gson gson = new Gson();
	String str = gson.toJson(list);
%>
<%=str%>