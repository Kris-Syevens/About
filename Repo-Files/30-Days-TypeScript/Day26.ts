// Day 26 of 30 Day Challenge

// DESCRIPTION:
// Your task is to find the first element of an array that is not consecutive.

// By not consecutive we mean not exactly 1 larger than the previous element of the array.

// E.g. If we have an array [1,2,3,4,6,7,8] then 1 then 2 then 3 then 4 are all consecutive but 6 is not, so that's the first non-consecutive number.

// If the whole array is consecutive then return null2.

// The array will always have at least 2 elements1 and all elements will be numbers. The numbers will also all be unique and in ascending order. The numbers could be positive or negative and the first non-consecutive could be either too!

// If you like this Kata, maybe try this one next: https://www.codewars.com/kata/represent-array-of-numbers-as-ranges

// 1 Can you write a solution that will return null2 for both [] and [ x ] though? (This is an empty array and one with a single number and is not tested for, but you can write your own example test. )

function firstNonConsecutiveNum(numArr: number[]): number | null {
  let nonConsecutiveNum: any = undefined;

  numArr.forEach((el: number, i: number, oA: number[]): void => {
    if (nonConsecutiveNum === undefined) {
      if (el + 1 !== oA[i + 1]) {
        nonConsecutiveNum = el + 1;
      }
    }
  });

  return nonConsecutiveNum === undefined
    ? null
    : numArr.length <= 1
    ? null
    : nonConsecutiveNum;
}

console.log(firstNonConsecutiveNum([1, 2, 3, 4, 6, 7, 8])); // 5
console.log(firstNonConsecutiveNum([1, 2, 3, 4, 6, 7, 8, 10])); // 5
