// Day 30 of 30 Day Challenge

// DESCRIPTION:
// Your non-profit company has assigned you the task of calculating some simple statistics on donations. You have an array of integers, representing various amounts of donations your company has been given. In particular, you're interested in the median value for donations.

// The median is the middle number of a sorted list of numbers. If the list is of even length, the 2 middle values are averaged.

// Write a function that takes an array of integers as an argument and returns the median of those integers.

// Notes:

// The sorting step is vital.
// Input arrays are non-empty.
// Examples
// Median of [33,99,100,30,29,50] is 41.5.
// Median of [3,2,1] is 2.

function median(numArr: number[]): number {
  if (numArr.length === 1) {
    return numArr[0];
  } else if (numArr.length === 2) {
    return numArr.reduce((a, b) => a + b) / numArr.length;
  } else {
    if (numArr.length % 2 === 0) {
      let leftMedian: number = numArr.length / 2 - 1;
      let rightMedian: number = numArr.length / 2;
      return (
        (numArr.sort((a, b) => a - b)[leftMedian] +
          numArr.sort((a, b) => a - b)[rightMedian]) /
        2
      );
    } else {
      let medianIndex: number = numArr.length / 2 - 0.5;
      return numArr.sort((a, b) => a - b)[medianIndex];
    }
  }
}

console.log(median([1])); // 1
console.log(median([1, 2])); // 1.5
console.log(median([1, 1])); // 1
console.log(median([33, 99, 100, 30, 29, 50])); // 41.5
console.log(median([3, 2, 1])); // 2
