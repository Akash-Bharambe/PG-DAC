const radius = document.getElementById("radius");
const out = document.getElementById("out");
document.getElementById("btn").addEventListener("click", calculate);
radius.addEventListener("keydown", (k) => {
  if (k.key === "Enter") calculate();
});
function calculate() {
  out.innerHTML = `Area: ${Math.pow(radius.value, 2) * Math.PI}<br>
  Circumference: ${2 * Math.PI * radius.value}`;
}
document.querySelector('form').addEventListener("submit", (e)=>{e.preventDefault()})