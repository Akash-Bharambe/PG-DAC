function addition(a, b) {
  return a + b;
}
function subtract(a, b) {
  return a - b;
}

function multiply(...a) {
  let prod = 1;
  for (let i of a) {
    prod *= i;
  }
  return prod;
}

function divide(a, b) {
  return a / b;
}

function square(a) {
  return a * a;
}

function sum(...a) {
  let sum = 0;
  for (let i of a) {
    sum += i;
  }
  return sum;
}

module.exports = {
  addition,
  subtract,
  multiply,
  divide,
  square,
  sum,
};
