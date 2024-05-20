const http = require("http");
const url = require("url");
const fs = require("fs");
const check = require("./module");

http
  .createServer((req, res) => {
    res.writeHead(200, { "content-type": "text/html" });
    let q = url.parse(req.url, true);

    let rs = fs.createReadStream("./index.html");
    rs.pipe(res);
    rs.on("data", () => {
      switch (q.pathname) {
        case "/submit":
          if (check.checkUname(q.query.uname) && check.checkPass(q.query.pass))
            res.write("ok");
          else res.write("Invalid Credentials");
          break;

        default:
          break;
      }
    });
  })
  .listen(8080);
