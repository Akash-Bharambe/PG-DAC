const mysql = require("mysql2")

 const myConnection = mysql.createConnection({
    host : 'localhost',
    user: "root",
    password: "root",
    database: 'employees',
    port: 3306
})

myConnection.connect((err)=>{
    if (err) {
        console.log("Cannot Connect to Database "+JSON.stringify(err));
    }else{
        console.log("Database Connection Successfull...");
    }
})
module.exports = myConnection