const express = require("express");
const morgan = require("morgan");
const cors = require("cors");
const app = express();

const arr = [
  {
    id: 1,
    name: "Harry Potter",
    author: "J.K.Rowling",
    price: 2500,
  },
  {
    id: 2,
    name: "Gulliver's Travel",
    author: "asdasd",
    price: 453,
  },
  {
    id: 3,
    name: "asd",
    author: "aerewqr",
    price: 2500,
  },
];

app.use(morgan("common"));
app.use(
  cors({
    origin: "http://localhost:5173",
  })
);

app.use(express.urlencoded({ extended: false }));

app.get("/", (req, res) => {
  res.status(200).json(arr);
});

app.listen("8080", () => {
  console.log("Server Started @ http://localhost:8080");
});
