var http = require('http');

http.createServer(function(req ,res){
	res.writeHead(200,{'Content-Type':'text/html'});
	res.write('Hello World');
	res.write('<br>');
	res.write('url Link:' + req.url);
	res.end();
}).listen(8080);
console.log('Server running on port 8080');