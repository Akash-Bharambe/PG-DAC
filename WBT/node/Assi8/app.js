const http = require("http");
const fs = require("fs");
const url = require("url");
const circle = require('./circle')

http.createServer((req, res) => {
    const rs = fs.createReadStream('./index.html')
    const q = url.parse(req.url,true)
    res.writeHead(200, {'Content-Type': 'text/html'});
    rs.pipe(res)
    rs.on("data",()=>{
        switch (q.pathname) {
        case "/submit":
            let radius = Number(q.query.radius)
            let area = circle.calcArea(radius);
            let circum = circle.calcCircumference(radius);
            res.write("Area of Cirle: "+area+`<br>`)
            res.write("Circumference of Cirle: "+circum)
            break;
        default:
            break;
    }
    })
    
}).listen(8080)
