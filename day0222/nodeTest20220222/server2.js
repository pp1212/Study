var http = require("http");
var express = require("express");
var app = express();

app.use(express.static("public"));
app.use(express.bodyParser());
app.use(app.router);

var items = [
	{name:"우유",price:2000},
	{name:"홍차",price:5000},
	{name:"커피",price:5000}
];

app.post("/products",function(req,res){
	try{
		var name = req.param("name");
		var price = req.param("price");
		var item = {name:name,price:price};
		items.push(item);
		res.send({message:"데이터를 추가하였습니다.",data:items});
	}catch(e){
		console.log(e);
	}
});

app.get("/products/:id",function(req,res){
	var id = Number(req.param("id"));
	if(isNaN(id)){
		res.send({error:"숫자를 입력하세요!"});
	}else if(items[id]){
		res.send(items[id]);
	}else{
		res.send({error:"존재하지 않는 데이터입니다."});
	}
});

app.get("/products",function(req,res){
	res.send(items);
});


//http://127.0.0.1:52273/wiki?id=Ajax
app.all("/wiki/:r",function(req,res){
	var id = req.param("r");
	console.log("id:"+id);
	res.send("<h1>"+id+"</h1>");
});


app.all("/detail",function(req,res){
	var no = req.param("no");
	var id = req.param("id");
	console.log("no:"+no);
	console.log("id:"+id);
	res.send("<h1>"+no+":"+id+"</h1>");
});

app.all("/data1",function(req,res){
	var output = "";
	output += "<html>";
	output += "<body>";
	items.forEach(function(item){
		output += "<div>";
		output += "<h1>"+item.name+"</h1>";
		output += "<h2>"+item.price+"</h2>";
		output += "</div>";
	});
	output += "</body>";
	output += "</html>";
	res.send(output);
});

app.all("/data2",function(req,res){
	res.send(items);
});

app.all("/data3",function(req,res){
	res.type("text/xml");
	var output = "";
	output += "<?xml version='1.0' encoding='UTF-8'?>";
	output += "<products>";
	items.forEach(function(item){
		output += "<product>";
		output += "<name>"+item.name+"</name>";
		output += "<price>"+item.price+"</price>";
		output += "</product>";
	});
	output += "</products>";
	res.send(output);
});

http.createServer(app).listen(52273,function(){
	console.log("Server Running at http://127.0.0.1:52273");
});