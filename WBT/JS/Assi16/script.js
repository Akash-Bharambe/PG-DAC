let sites = [
  "www.google.com",
  "www.msn.com",
  "www.amazon.co.in",
  "in.answers.yahoo.com",
  "en.m.wikipedia.com",
  "codehs.gitbooks.io",
  "www.coderanch.com",
];

let sitesWWW = sites.filter(a=>{
    return a.startsWith('www')
})

let str = `<ul>`
sitesWWW.forEach(s=>{
    str+= `<li><a href = "${s}">${s}</a></li>`
})
str+= `</ul>`
document.getElementById('out').innerHTML = str+`<br> Total: ${sitesWWW.length}`