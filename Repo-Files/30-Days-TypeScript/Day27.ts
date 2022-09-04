// Day 27 of 30 Day Challenge

// DESCRIPTION:
// Simple, remove the spaces from the string, then return the resultant string.

function removeSpaces(string: string): string {
  return string
    .split("")
    .filter((el) => el !== " ")
    .join("");
}

console.log(removeSpaces(" Kris tofer  ")); // "Kristofer"
