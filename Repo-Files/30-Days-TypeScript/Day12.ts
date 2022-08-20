// Day 12 of 30 Day Challenge

// DESCRIPTION:
// We need a function that can transform a number (integer) into a string.

// What ways of achieving this do you know?

// Examples (input --> output):
// 123  --> "123"
// 999  --> "999"
// -100 --> "-100"

function parseString(num: number): string {
  return String(num);
}

console.log(123);
console.log(parseString(123));
console.log(777);
console.log(parseString(777));
console.log(-100);
console.log(parseString(-100));
