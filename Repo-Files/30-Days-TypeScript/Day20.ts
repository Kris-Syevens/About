// Day 20 of 30 Day Challenge

// DESCRIPTION:
// Very simple, given an integer or a floating-point number, find its opposite.

// Examples:

// 1: -1
// 14: -14
// -34: 34

function printOpposite(num: number): number {
  return num - num * 2;
}

console.log(printOpposite(1));
console.log(printOpposite(14));
console.log(printOpposite(-34));
