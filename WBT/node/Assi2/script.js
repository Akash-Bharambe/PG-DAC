import funs from "./module";

document.getElementById("number").addEventListener("input", () => {
  const num = Number(document.getElementById("number").value);

  if (num <= 5) console.log(funs.factorial(num));
  else if (num > 5 && num < 10) console.log(funs.printTable(num));
  else console.log(funs.isPrime(num));
});
