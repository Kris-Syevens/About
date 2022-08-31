// Day 23 of 30 Day Challenge

// DESCRIPTION:
// If you can't sleep, just count sheep!!

// Task:
// Given a non-negative integer, 3 for example, return a string with a murmur: "1 sheep...2 sheep...3 sheep...". Input will always be valid, i.e. no negative integers.

function countSheep(num: number): string {
  return new Array(num)
    .fill(0)
    .map((el, i) => `${i + 1} sheep...`)
    .join("");
}

console.log(countSheep(3)); // 1 sheep...2 sheep...3 sheep...
console.log(countSheep(10)); // 1 sheep...2 sheep...3 sheep...4 sheep...5 sheep...6 sheep...7 sheep...8 sheep...9 sheep...10 sheep...
