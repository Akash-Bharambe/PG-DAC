function calcCI() {
  const principleOBJ = document.getElementById("p");
  const principle = document.getElementById("p").value;
  const rate = document.getElementById("r").value;
  const years = document.getElementById("years").value;
  const p2 = document.getElementById()
  const out = document.getElementById("out");

    principleOBJ.addEventListener(()=>{
        p2.innerHTML = principle
    })

  let res = principle * Math.pow(1 + rate / 100, years) - principle;

  out.innerHTML = `Compound Interest = ${res}  <br>  Principle = ${principle}`;
}

principle