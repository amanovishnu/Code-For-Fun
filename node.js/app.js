var http = require('http');

http.createServer(function(req,res){
    res.writeHead(200,{'Content-Type':'text/plain'});
    res.write('Hello World');
    res.write('<br>');
    res.write(req.url);
    res.end();
}).listen(8080);
console.log('Server Running on Port 8080');
console.log('Server was created by Mano');