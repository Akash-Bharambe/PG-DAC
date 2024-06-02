function multiply(...arr) {
  let prod = 1;
  for (let a of arr) {
    prod *= a;
  }
  return prod;
}

function divide(a, b) {
  return a / b || 0;
}

const num1 = document.getElementById("num1");
const num2 = document.getElementById("num2");
const multiply1 = document.getElementById("Multiply");
const divide1 = document.getElementById("Divide");

function validateNumbers(num1, num2) {
    console.log(num1+" "+num2);
  if (!(num1 || num2)) {
    alert("Please enter both Numbers");
    return false;
  }
  return true;
}

multiply1.addEventListener("click", () => {
  let number1 = Number(num1.value);
  let number2 = Number(num2.value);
  if (validateNumbers(number1, number2)) {
    const result = multiply(number1, number2);
    document.getElementById("out").innerHTML = `The result is: ${result}`;
  }
});
divide1.addEventListener("click", () => {
    let number1 = Number(num1.value);
    let number2 = Number(num2.value);
    if (validateNumbers(number1, number2)) {
    const result = divide(number1, number2);
    document.getElementById("out").innerHTML = `The result is: ${result}`;
  }
});
