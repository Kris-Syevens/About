// Day 15 of 30 Day Challenge

// DESCRIPTION:
// Given a string, you have to return a string in which each character (case-sensitive) is repeated once.

// Examples (Input -> Output):
// * "String"      -> "SSttrriinngg"
// * "Hello World" -> "HHeelllloo  WWoorrlldd"
// * "1234!_ "     -> "11223344!!__  "
// Good Luck!

function doubleChar(string: string): string {
  return string
    .split("")
    .map((el) => el + el)
    .join("");
}

console.log(doubleChar("String"));
console.log(doubleChar("Hello World"));
