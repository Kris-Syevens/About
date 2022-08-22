// Day 14 of 30 Day Challenge

// DESCRIPTION:
// Build a function that returns an array of integers from n to 1 where n>0.

// Example : n=5 --> [5,4,3,2,1]

function reverseRangeArr(num: number): number[] {
  return num > 0
    ? new Array(num).fill(0).map((el, i) => {
        return num - i;
      })
    : [0];
}

console.log(reverseRangeArr(5)); // [5,4,3,2,1]
console.log(reverseRangeArr(7)); // [7,6,5,4,3,2,1]
console.log(reverseRangeArr(10)); // [10,9,8,7,6,5,4,3,2,1]
