const num = document.getElementById("ip1").value;
const text = document.getElementById("ip2");
function myPrint() {
  const out = document.getElementById("out");

  for (let index = 1; index <= num; index++) {
    out.innerHTML += `${text.value}<br>`;
  }
}
text.addEventListener("keypress",(keys)=>{
    if (keys.key === 'Enter') {
        myPrint();
        console.log(keys);
    }
})