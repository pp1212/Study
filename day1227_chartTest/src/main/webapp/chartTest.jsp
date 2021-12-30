<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript" src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script type="text/javascript">
     
     var arr = [['name','qty']];
     
   //jquery 사용하는 방법
     $(function(){
    	 $.ajax({url:"listGoods.jsp",success:function(data){
    		$.each(data,function(index,item){		//데이터만큼 루프 돌아야 되어서 $.each
   				row = [];	//빈 배열
   				row.push(item['name']);
   				row.push(item['qty']);
   				arr.push(row);
    		});
    		  google.charts.load('current', {'packages':['bar']});
    	      google.charts.setOnLoadCallback(drawChart);
    	 }});
     })
    
    //자바스크립트에서 서버를 요구하는 게 ajax
    //ajax를 용이하게 하는 게 jquery
      

      function drawChart() {							 
        var data = google.visualization.arrayToDataTable(arr);

        var options = {
          chart: {
            title: '상품별 재고수량'
          }
        };

        var chart = new google.charts.Bar(document.getElementById('columnchart_material'));

        chart.draw(data, google.charts.Bar.convertOptions(options));
      }
    </script>
  </head>
  <body>
    <div id="columnchart_material" style="width: 800px; height: 500px;"></div>
  </body>
</html>