// Day 28 of 30 Day Challenge

// DESCRIPTION:
// Compare two strings by comparing the sum of their values (ASCII character code).

// For comparing treat all letters as UpperCase
// null/NULL/Nil/None should be treated as empty strings
// If the string contains other characters than letters, treat the whole string as it would be empty
// Your method should return true, if the strings are equal and false if they are not equal.

// Examples:
// "AD", "BC"  -> equal
// "AD", "DD"  -> not equal
// "gf", "FG"  -> equal
// "zz1", ""   -> equal (both are considered empty)
// "ZzZz", "ffPFF" -> equal
// "kl", "lz"  -> not equal
// null, ""    -> equal

function compChars(str1: string | null, str2: string | null): string {
  //
  let valStr1: number = 0;
  let valStr2: number = 0;

  if (typeof str1 === "string") {
    if (str1.length > 0) {
      if (str1.toUpperCase().search(/[^A-Z]/) === -1) {
        str1
          .toUpperCase()
          .split("")
          .forEach((el) => {
            valStr1 += el.charCodeAt(0);
          });
      } else valStr1 = 0;
    } else valStr1 = 0;
  } else if (typeof str1 === null) {
    valStr1 = 0;
  }

  if (typeof str2 === "string") {
    if (str2.length > 0) {
      if (str2.toUpperCase().search(/[^A-Z]/) === -1) {
        str2
          .toUpperCase()
          .split("")
          .forEach((el) => {
            valStr2 += el.charCodeAt(0);
          });
      } else valStr2 - 0;
    } else valStr2 = 0;
  } else if (typeof str2 === null) {
    valStr2 = 0;
  }

  console.log(valStr1, valStr2);
  return valStr1 === valStr2 ? "equal" : "not equal";
}

console.log(compChars("AD", "BC")); // equal
console.log(compChars("AD", "DD")); // not equal
console.log(compChars("gf", "FG")); // equal
console.log(compChars("zz1", "")); //  equal
console.log(compChars("ZzZz", "ffPFF")); // equal
console.log(compChars("kl", "lz")); // not equal
console.log(compChars(null, "")); // equal
