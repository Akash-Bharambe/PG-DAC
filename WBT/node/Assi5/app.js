const fs = require('fs')

function calcWords(data) {
    return data.trim().split(/\s+/).length
}

fs.readFile('./file.txt','utf-8',(err,data)=>{
    if (err) {
        console.log(err);
    }else{
        console.log("Total words in file.txt: "+ calcWords(data));
    }
})

fs.readFile('./file.bin','utf8',(err,data)=>{
    if (err) {
        console.log(err);
    }else{
        console.log("Total words in file.bin: "+ calcWords(data));
    }
})