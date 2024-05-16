var http = require('http');

http.createServer(function (req, res) {
  res.writeHead(200, {'Content-Type': 'text/html'});

  res.end(`<!DOCTYPE html>
  <html lang="en">
  <head>
      <meta charset="UTF-8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <title>Document</title>
  </head>
  <body>
      <form id="myForm"> 
          <input type="text" name="number" id="number">
      </form>
      <script type="module" src="module.js"></script>
      
      <script src="script.js"></script>
  </body>
  </html>`);

}).listen(8080);
console.log(`Server is on @: http://localhost:8080`)