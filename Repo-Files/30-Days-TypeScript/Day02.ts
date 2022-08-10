// Day 2 of 30 Day Challenge

// DESCRIPTION:
// Input: Array of elements

// ["h","o","l","a"]

// Output: String with comma delimited elements of the array in th same order.

// "h,o,l,a"

// Note: if this seems too simple for you try the next level

function commaDelimiters(stringArr: string[]): string {
  return stringArr.join(",");
}

console.log(commaDelimiters(["h", "o", "l", "a"])); // "h,o,l,a"
