function factorial(num) {
  let fact = 1;
  for (let i = 1; i <= num; i++) {
    fact *= i;
  }
  return fact;
}

function isPrime(num) {
  if (num === 2) return `${num} is a prime number`;

  for (let i = 2; i <= num / 2; i = i + 2) {
    if (num % i === 0) {
      return `${num} is not a prime number`;
    }
  }
  return `${num} is a prime number`;
}

function printTable(num) {
    let str = ""
    for(let i = 1; i<= 10; i++){
        str+= `${num} * ${i} = ${num*i}\n`
    }
    return str
}

module.exports = {
  factorial, isPrime,printTable
};
