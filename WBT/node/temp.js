const readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
  });
  console.log(readline);
  readline.question('What is your name?', name => {
    console.log(`Hello, ${name}!`);
    readline.close();
  });