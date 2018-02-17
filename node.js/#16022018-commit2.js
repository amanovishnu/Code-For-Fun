var http = require('http');
http.createServer(function(req,res) {
	var body ="This is Node.js Body Content";
	var content_length = body.lengthh;
	res.writeHead(200,{
		'content-Type':'text/plain',
		'content-Length':content_length
	}); 
	res.end(body);
}).listen(3000);
console.log('Server is Running on http://127.0.0.1:3000');
