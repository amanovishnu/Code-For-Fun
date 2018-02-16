var http = require("http");
const hostname = '127.0.0.1';
const port = 3010;
const server = http.createServer((req,res) => {
	res.statuscode = 200;
	res.setHeader('content-Type','text/plain');
	res.end('<!doctype html><h1>Hello welcome to Manyavar Collections</h1>');
});
server.listen(port,hostname,()=>{
	console.log(`Server Running at http://${hostname}:${port}/`);
});