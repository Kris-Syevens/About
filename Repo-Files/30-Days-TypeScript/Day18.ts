// Day 18 of 30 Day Challenge

// DESCRIPTION:
// Complete the function that takes two integers (a, b, where a < b) and return an array of all integers between the input parameters, including them.

// For example:

// a = 1
// b = 4
// --> [1, 2, 3, 4]

function spreadInBetween(a: number, b: number): number[] {
  let numArr: number[] = [];
  for (let i = a; i <= b; i++) {
    numArr.push(i);
  }
  return numArr;
}

console.log(spreadInBetween(1, 4)); // [1,2,3,4]
console.log(spreadInBetween(7, 11)); // [7,8,9,10,11]
