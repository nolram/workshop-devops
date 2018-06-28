process.on('SIGINT', function() {
    console.log('SIGINT');
    process.exit();
});
process.on('SIGTERM', function() {
    console.log('SIGTERM');
    process.exit();
});
console.log('PID: ', process.pid);


var http = require('http');
http.createServer(function (req, res) {
  res.writeHead(200, {'Content-Type': 'text/plain'});
  res.end('Bem vindo ao workshop de DevOps!');
}).listen(8080);
console.log('Server running at http://localhost:8080/');
