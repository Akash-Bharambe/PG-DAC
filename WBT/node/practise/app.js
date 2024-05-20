const express = require("express");
const morgan = require("morgan");
const path = require("path")
const routes=require("./routes/router")

const PORT = 8080
const IP = '192.168.40.24'

const app = express();

app.use(morgan("common"));

app.set("views",path.join(__dirname,"views"))
app.set('view engine', 'ejs');

app.use(express.urlencoded({ extended: false }));

app.use("/",routes)

app.listen(PORT,IP, () => {
  console.log(`Server Started @ http://${IP}:${PORT}/`);
});
