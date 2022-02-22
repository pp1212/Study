var http = require("http");
var express = require("express");
var app = express();

app.use(express.static("public"));

app.use(app.router);
app.all("/list.do",function(req,res){
	res.send("<h1>글 목록보기</h1>");
});

app.all("/write.do",function(req,res){
	res.send("<h1>글 작성하기</h1>");
});

app.all("/update.do",function(req,res){
	res.send("<h1>글 수정하기</h1>");
});

app.use(function(req,res){
	res.send("<h1>안녕하세요!</h1>");
});

http.createServer(app).listen(52273,function(){
	console.log("Server Running at http://127.0.0.1:52273");
});