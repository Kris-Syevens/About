// Day 13 of 30 Day Challenge

// DESCRIPTION:
// Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.

// Return your answer as a number.

function sumMixedArr(numArr: (string | number)[]): number {
  return numArr
    .map((el) => {
      if (typeof el === "string") {
        return parseInt(el);
      } else return el;
    })
    .reduce((a, b) => a + b);
}

console.log(sumMixedArr([10, "10", 10])); // 30
