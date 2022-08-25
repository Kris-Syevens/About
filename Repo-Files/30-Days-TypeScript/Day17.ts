// Day 17 of 30 Day Challenge

// DESCRIPTION:
// You will be given a list of strings. You must sort it alphabetically (case-sensitive, and based on the ASCII values of the chars) and then return the first value.

// The returned value must be a string, and have "***" between each of its letters.

// You should not remove or add elements from/to the array.

function sortAndStar(stringArr: string[]): string {
  return stringArr.sort()[0].split("").join("***");
}

console.log(
  sortAndStar([
    "bitcoin",
    "take",
    "over",
    "the",
    "world",
    "maybe",
    "who",
    "knows",
    "perhaps",
  ])
); // 'b***i***t***c***o***i***n'
