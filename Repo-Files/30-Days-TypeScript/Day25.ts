// Day 25 of 30 Day Challenge

// DESCRIPTION:
// Define a function that removes duplicates from an array of numbers and returns it as a result.

// The order of the sequence has to stay the same.

function removeDups(numArr: number[]): number[] {
  return [...new Set(numArr)];
}

console.log(removeDups([1, 1, 2, 2, 3, 3, 4, 4, 4, 5])); // [1,2,3,4,5]
