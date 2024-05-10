function calcCI() {
  const principle = document.getElementById("p").value;
  const rate = document.getElementById("r").value;
  const years = document.getElementById("years").value;
  const out = document.getElementById("out");

  let res = principle * Math.pow(1 + rate / 100, years) - principle;

  out.innerHTML = `Compound Interest = ${res}  <br>  Principle = ${principle}`;
}

document.getElementById("p").addEventListener("input", (e) => {
  document.getElementById("p2").textContent = e.target.value;
});

document.addEventListener("keydown", (k) => {
  if (k.key === "Enter") calcCI();
});
