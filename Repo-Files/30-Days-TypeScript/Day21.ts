// Day 21 of 30 Day Challenge

// Description:
// Remove an exclamation mark from the end of a string. For a beginner kata, you can assume that the input data is always a string, no need to verify it.

// Examples
// remove("Hi!") == "Hi"
// remove("Hi!!!") == "Hi!!"
// remove("!Hi") == "!Hi"
// remove("!Hi!") == "!Hi"
// remove("Hi! Hi!") == "Hi! Hi"
// remove("Hi") == "Hi"

function removeExclamations(string: string): string {
  return string[string.length - 1] === "!"
    ? string.substring(0, string.length - 1)
    : string;
}

console.log(removeExclamations("Hi!"));
console.log(removeExclamations("Hi!!!"));
console.log(removeExclamations("!Hi"));
console.log(removeExclamations("!Hi!"));
console.log(removeExclamations("Hi! Hi!"));
console.log(removeExclamations("Hi"));
