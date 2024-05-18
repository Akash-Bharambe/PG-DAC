const http = require("http");
const fs = require("fs");
const circle1 = require("./circle");
const rectangle1 = require("./rectangle");
const triangle1 = require("./triangle");
const url = require("url");
const PORT = 8080;
const IP = "192.168.40.24";
let prevURL = "";

http
  .createServer((request, response) => {
    console.log("request -->");
    console.log(request.url);
    let q = url.parse(request.url, true);

    response.writeHead(200, { "content-type": "text/html" });

    let index = fs.createReadStream("./index.html");
    let circle = fs.createReadStream("./circle.html");
    let rectangle = fs.createReadStream("./rectangle.html");
    let triangle = fs.createReadStream("./triangle.html");

    index.pipe(response);
    response.write(`<a href="/">Home</a><br>`);
    index.on("data", () => {
      console.log(q.pathname);
      switch (q.pathname) {
        case "/circle":
          circle.pipe(response);
          prevURL = "circle";
          break;

        case "/rectangle":
          rectangle.pipe(response);
          prevURL = "rectangle";
          break;

        case "/triangle":
          triangle.pipe(response);
          prevURL = "triangle";
          break;

        case "/output":
          let inp1 = Number(q.query.inp1);
          let inp2 = Number(q.query.inp2);
          let inp3 = Number(q.query.inp3);
          if (prevURL === "circle") {
            circle.pipe(response);
            response.write(
              "Area of Circle: " + circle1.calcArea(inp1) + "<br>"
            );
            response.write(
              "Circumference of Circle: " +
                circle1.calcCircumference(inp1) +
                "<br>"
            );
            response.write(
              "Diameter of Circle: " + circle1.calcDiameter(inp1) + "<br>"
            );
          } else if (prevURL === "rectangle") {
            rectangle.pipe(response);
            response.write(
              "Area of Rectangle: " + rectangle1.calcArea(inp1, inp2) + "<br>"
            );
            response.write(
              "Perimeter of Rectangle: " +
                rectangle1.calcPerimeter(inp1, inp2) +
                "<br>"
            );
          } else if (prevURL === "triangle") {
          triangle.pipe(response);
            response.write(
              triangle1.isEquilateral(inp1, inp2, inp3)
                ? "Triangle is Equilateral triangle<br>"
                : "Triangle is not Equilateral triangle<br>"
            );
            response.write(
              "Perimeter of Triangle: " +
                triangle1.calcPerimeter(inp1, inp2, inp3) +
                "<br>"
            );
          }

        default:
          break;
      }
    });
  })
  .listen(PORT, IP, function () {
    console.log("Server Started @ http://" + IP + ":" + PORT);
  });
