const out = document.getElementById("out");

function maxi(){
    const num1 = document.getElementById("ip1").value;
    const num2 =document.getElementById("ip2").value;
    const m = Math.max(num1, num2)
    out.innerHTML = `Maximum of ${num1} and ${num2} is : ${m}`
}