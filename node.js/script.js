var http = require('http'); 
console.log("Welcome to the Node.js First Program");
var server = http.createServer(function(req,res) {
		res.writeHead(200,{"content-Type":"text/plain"});
		res.end("welcome to My First Local Host Server  ");
});
server.listen(1234,function() {
	console.log("Server Started");
});