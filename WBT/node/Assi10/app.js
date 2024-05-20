const express = require("express");
const app = express();
const morgan = require("morgan");

app.use(morgan("common"));

app.use(express.urlencoded({ extended: false }));

app.get("/", (req, res) => {
  res.sendFile(__dirname + "/index.html");
});

app.post("/submit", (req, res) => {
  const num = Number(req.body.num);
  let isPrime = true;

  if (num === 1) {
    isPrime = false;
  } else if (num > 1) {
    for (let i = 2; i < num; i++) {
      if (num % i === 0) {
        isPrime = false;
        break;
      }
    }
  }

  if (isPrime) res.send("Number is a Prime Number");
  else res.send("Number is not Prime");
});

app.listen(8080, () => {
  console.log("http://localhost:8080");
});
