// Day 24 of 30 Day Challenge

// DESCRIPTION:
// This kata is from check py.checkio.org

// You are given an array with positive numbers and a non-negative number N. You should find the N-th power of the element in the array with the index N. If N is outside of the array, then return -1. Don't forget that the first element has the index 0.

// Let's look at a few examples:

// array = [1, 2, 3, 4] and N = 2, then the result is 3^2 == 9;
// array = [1, 2, 3] and N = 3, but N is outside of the array, so the result is -1.

function nthPwr(numArr: number[], n: number): number {
  return n + 1 > numArr.length ? -1 : numArr[n] ** n;
}

console.log(nthPwr([1, 2, 3, 4], 2)); // 9
console.log(nthPwr([1, 2, 3], 3)); // -1
