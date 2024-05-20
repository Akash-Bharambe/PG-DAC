const express = require("express");
const morgan = require("morgan");
const createtable = require("./public/table")
const myConnection = require("./db/dbconnection");

const PORT = 8080
const IP = '192.168.230.170'

const app = express();

app.use(morgan("common"));
app.use(express.urlencoded({ extended: false }));


app.get("/students", (req, res) => {
  myConnection.query("select * from student", (err, data, fields) => {
    if (err) res.status(404).send("No data Found");
    else res.status(202).send(createtable(data));
  });
});

app.listen(PORT,IP, () => {
  console.log(`Server Started @ http://${IP}:${PORT}/students`);
});
