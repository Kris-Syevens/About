// Day 22 of 30 Day Challenge

// DESCRIPTION:
// I'm new to coding and now I want to get the sum of two arrays... Actually the sum of all their elements. I'll appreciate for your help.

// P.S. Each array includes only integer numbers. Output is a number too.

function sumTwoArrays(arrOne: number[], arrTwo: number[]): number {
  return arrOne.reduce((a, b) => a + b) + arrTwo.reduce((a, b) => a + b);
}

console.log(sumTwoArrays([7, 7, 7], [7, 7, 7])); // 42
