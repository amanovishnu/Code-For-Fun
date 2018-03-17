var  MongoClient = require('mongodb').MongoClient;
var url ='mongodb://localhost:27017/mydb2';
MongoClient.connect(url,function(err,res){
	if(err) throw err;
	console.log('Connected to Mongodb');
	var dbo = db.db('mydb2');
	dbo.createCollection('Students',function(err,result){
		if(err) throw err;
		console.log('Created Collection Students');
	});
	db.close();
});