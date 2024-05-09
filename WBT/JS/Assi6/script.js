function sumOfDigits() {
  const num = Number(document.getElementById("ip1").value);
  const out = document.getElementById("out");
  let res = 0;
  let temp = num;
  while (temp!= 0) {
    res += temp % 10;
    temp = parseInt(temp/ 10);
  }
  out.innerHTML = `Result: ${res}`;
}
