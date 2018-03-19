var http = require('http');
http.createServer(function(req,res){
	res.writeHead(210,{'Content-Type':'text/plain'});
	res.write('Node.js is a runtime Environment built on Google Chrome JavaScript v8 Engine.');
	res.end();
}).listen(8080);