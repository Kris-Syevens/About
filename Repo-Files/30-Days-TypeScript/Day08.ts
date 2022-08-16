// Day 8 of 30 Day Challenge

// DESCRIPTION:
// When provided with a letter, return its position in the alphabet.

// Input :: "a"

// Ouput :: "Position of alphabet: 1"

function findIndexOfAlpha(char: string): string {
  const alphabet: string = "abcdefghijklmnopqrstuvwxyz";

  return `Position of alphabet: ${alphabet.indexOf(char.toLowerCase()) + 1}`;
}

console.log(findIndexOfAlpha("A")); // 1
console.log(findIndexOfAlpha("a")); // 1
console.log(findIndexOfAlpha("b")); // 2
console.log(findIndexOfAlpha("y")); // 25
console.log(findIndexOfAlpha("Y")); // 25
console.log(findIndexOfAlpha("z")); // 26
