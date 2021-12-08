<%@page import="com.sist.vo.GoodsVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.sist.dao.GoodsDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <style type="text/css">
  	/*모바일에도 적용되야 하니까 밖에서 설정*/
  	.container{
  		width: 100%;
  	}
  	
  	#cardList{
  		width: 100%;
  	}
  	
  	.card{
  		position: relative;
  		margin-bottom: 15px;
  		width: 100%;
  	}
  
  /*태블릿에서는 한 줄에 두개의 카드 출력
	pc에서는 한 줄에 세개의 카드 출력
	
	부트스트랩을 가져오는 경우는 내가 만든게 부트스트랩 밑에 오도록 하기!!!*/
  
  	@media all and (min-width:768px) and (max-width:991px){
  		#cardList{
  			display: flex;
  			flex-wrap: wrap;
  			justify-content: space-between;
  		}
  		
  		.card{
  			width: 49%;
  		}
  	}
  	
  	@media all and (min-width:992px){
  		#cardList{
  			display: flex;
  			flex-wrap: wrap;
  			justify-content: space-between;
  		}
  		
  		.card{
  			width: 33%;
  		}
  	}
  </style>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h2>상품 목록</h2>
			<div id="cardList">
				<%
					GoodsDAO dao = new GoodsDAO();
					ArrayList<GoodsVO> list = dao.listGoods();
					
					for(GoodsVO g:list){
						%>
							<div class="card">
								<img class="card-img-top" src="goods/<%=g.getFname() %>" style="width: 100%">
								<div class="card-body">
									<h4 class="card-title"><%=g.getName() %></h4>
									<p class="card-text">상품번호 : <%=g.getNo() %><br>
										가격 : <%=g.getPrice() %>원<br>
										수량 : <%=g.getQty() %></p>
									<a href="#" class="btn btn-primary stretched-link">상품 구매</a>
								</div>
							</div>
						<%
					}
				%>
			</div>
	</div>
</body>
</html>