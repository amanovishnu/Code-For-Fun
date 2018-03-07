var express = require('express');
var path = require('path');
var app = express();

// Define the port to run on
var port = process.env.PORT || 8080;

app.use(express.static(path.join(__dirname, 'public')));

// Listen for requests
var server = app.listen(port, function() {
  var port = server.address().port;
  console.log('Magic happens on port ' + port);
});