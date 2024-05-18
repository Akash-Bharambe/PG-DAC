function myprint(i) {
  if (i % 3 === 0) {
    if (i % 5 === 0) {
      return "fizbuzz";
    }
    return "fizz";
  }
  if (i % 5 === 0) return "buzz";

  return i;
}
for (let i = 0; i <= 100; i++) console.log(myprint(i));
