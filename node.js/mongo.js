var MongoClient = require('mongodb').MongoClient;
var url = 'mongodb://localhost:27017/';
MongoClient.connect(url,function(err,db){
	if(err) throw err;
	var dbo = db.db('mydb');
	var myobj = [
				{name :"company inc", address:"HighWay 37"},
				{name:"Apple Inc",address:"Cupertino"},
				{name:"Microsoft Corporation ",address:"Redmond"},
				{name:"Amazon Systems",address:"California"},
				{name:"Facebook inc",address:"Silicon valley"},
				{name:"Pixar Animations",address:"Cupertino"},
				{name:"Walt Disney Productions",address:"Disneyland"},
				{name:"twitter Inc",address:"Silicon valley"},
				{name:"Uber",address:"California"},
				{name:"Windows Corporation",address:"Redmond"},
				{name:"IBM Computers",address:"Silicon valley"},
				{name:"Dell Computers",address:"Deloitte"}
				];
	dbo.collection("customers").insertMany(myobj,function(err,res){
		if(err) throw err;
		console.log(res.insertedCount+ 'Document Inserted');
	});
	db.close();
});