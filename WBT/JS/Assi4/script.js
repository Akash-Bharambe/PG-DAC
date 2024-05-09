function calc() {
  const num1 =Number(document.getElementById("ip1").value);
  const num2 =Number(document.getElementById("ip2").value);
  const operator = document.getElementById("operator").value;
  const out = document.getElementById("out");
  let result = 1;
  switch (operator) {
    case "+":
      result = num1 + num2;
      break;
    case "-":
      result = num1 - num2;
      break;
    case "*":
      result = num1 * num2;
      break;
    case "/":
      result = num1 / num2;
      break;
    case "%":
      result = num1 % num2;
      break;
    case "**":
      result = num1 ** num2;
      break;
    default:
      break;
  }
  out.innerHTML = `Result: ${result}`;
}

document.getElementById("operator").addEventListener("keypress", (k) => {
  if (k.key === "Enter") calc();
});
