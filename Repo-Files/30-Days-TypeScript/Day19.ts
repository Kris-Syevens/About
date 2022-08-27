// Day 19 of 30 Day Challenge

// DESCRIPTION:
// Write a function to split a string and convert it into an array of words.

// Examples (Input ==> Output):
// "Robin Singh" ==> ["Robin", "Singh"]

// "I love arrays they are my favorite" ==> ["I", "love", "arrays", "they", "are", "my", "favorite"]

function splitString(string: string): string[] {
  return string.split(" ");
}

console.log(splitString("Robin Singh"));
console.log(splitString("I love arrays they are my favorite"));
