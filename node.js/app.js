var http = require('http');
http.createServer(function(req , res){
    res.writeHead(200,{'Content-Type':'text/plain','Content-Length':'body_length'});
    var body = 'My Name is Khan and I am not a Terrorist (Reference to MyName is Khan)';
    var body_length = body.length;
    res.write('Hello World');
    res.end();
}).listen(3000);
console.log('Server is Running on Port 3000');