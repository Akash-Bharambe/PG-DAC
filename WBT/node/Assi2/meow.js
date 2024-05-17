const http = require("http");
const fs = require("fs");
const funs = require("./module");
const url = require("url");

http
  .createServer(async function (req, res) {
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
        rs.on("", function () {
          if (q.query.number <= 5)
            res.write("Factorial: " + funs.factorial(q.query.number));
          else if (q.query.number > 5 && q.query.number < 10)
            res.write(funs.printTable(q.query.number));
          else res.write(funs.isPrime(q.query.number));
        });
        break;

      default:
        rs.pipe(res);
        break;
    }
  })
  .listen(8080, function () {
    console.log(`Server is on @: http://localhost:8080/home`);
  });
