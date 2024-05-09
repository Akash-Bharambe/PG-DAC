function printEven() {
  const num = document.getElementById("even").value;
  const out = document.getElementById("out");
  let str = "";
  for (let i = 2; i <= num; i += 2) {
    str += `${i}, `;
  }
  out.innerHTML = str.slice(0, str.length - 2);
}
