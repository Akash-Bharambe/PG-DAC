const http = require("http");

http
  .createServer((req, res) => {
    res.writeHead(200, { "Content-Type": "text/html" });
    res.end("Hello World!");
  })
  .listen(8080, "192.168.230.170", (a) => {
    console.log("Server started @ http://192.168.230.170:8080");
  });
