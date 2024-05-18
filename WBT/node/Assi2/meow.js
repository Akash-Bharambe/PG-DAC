const http = require("http");
const fs = require("fs");
const funs = require("./module");
const url = require("url");

http
  .createServer( function (req, res) {
    console.log(req.url + "-->" + req.method);
    let q = url.parse(req.url, true);
    console.log("q --> ");
    console.log(q);

    res.writeHead(200, { "content-Type": "text/html" });

    let rs = fs.createReadStream("./home.html");
    switch (q.pathname) {
      case "/home":
        console.log("homepage");
        console.log(rs);
        rs.pipe(res);
        break;
      case "/output":
        console.log("outputpage");
        rs.pipe(res);
        rs.on("data", function () {
          let num = parseInt(q.query.number)
          if (q.query.number <= 5)
            res.write("Factorial: " + funs.factorial(num));
          else if (num > 5 && num < 10)
            res.write(funs.printTable(num));
          else res.write(funs.isPrime(num));
        });
        break;

      default:
        rs.pipe(res);
        break;
    }
  })
  .listen(8080,'192.168.40.24', function () {
    console.log(`Server is on @: http://192.168.40.24:8080/home`);
  });
