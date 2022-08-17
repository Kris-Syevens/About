// Day 9 of 30 Day Challenge

// DESCRIPTION:
// Given an array of integers your solution should find the smallest integer.

// For example:

// Given [34, 15, 88, 2] your solution will return 2
// Given [34, -345, -1, 100] your solution will return -345
// You can assume, for the purpose of this kata, that the supplied array will not be empty.

function smallestInt(arr: number[]): number {
  return arr.sort((a, b) => a - b)[0];
}

console.log(smallestInt([34, 15, 88, 2])); // 2
console.log(smallestInt([34, -345, -1, 100])); // -345
