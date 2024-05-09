function printTable() {
  const num = Number(document.getElementById("ip1").value);
  const out = document.getElementById("out");

  for (let i = 1; i <= 10; i++) out.innerHTML += `${num} x ${i} = ${num * i}<br>`;
}
