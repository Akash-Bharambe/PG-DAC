const fs = require("fs");
const readline = require("readline");
const http = require("http");

http.createServer((req, res) => {
    res.writeHead(200, { "content-type": "text/html" });
    let count = 1;
  readline
    .createInterface({
      input: fs.createReadStream("./file.txt"),
    })
    .on("line", (line) => {
        res.write(count + " " + line +'<br>');
        console.log(count++ + " " + line);
    })
    .on("close", () => {
      console.log("file read complete");
    });
}).listen(8080,'192.168.230.170',()=>{
    console.log("Server started @ http://192.168.230.170:8080");
})
