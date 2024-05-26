const fs = require("fs")

fs.readFile("./numbers.txt","utf-8",(err,data)=>{
    if (err) {
        console.log("error");
    } else {
        let numbers = data.split(/\s+/)
        let squared = [];
        numbers.forEach(num=>squared.push(num*num))
        console.log(squared);
        let str = ""
        squared.forEach((s)=>str+=(s+"\n"))
        fs.writeFile("./squared.txt", str, (err) => {
            if (err) {
                console.log("Error writing to file:", err);
            } else {
                console.log("Squared numbers written to squared.txt");
            }
        });
    }
})
