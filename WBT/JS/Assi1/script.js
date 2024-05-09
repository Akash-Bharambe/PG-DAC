
function maxi(){
    const num1 = document.getElementById("ip1").value;
    const num2 =document.getElementById("ip2").value;
    const num3 =document.getElementById("ip3").value;
    const out = document.getElementById("out");
    
    const m = Math.max(num1, num2, num3)
    out.innerHTML = `Maximum of ${num1} and ${num2} is : ${m}`
}