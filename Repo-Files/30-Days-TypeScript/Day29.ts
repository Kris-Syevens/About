// Day 29 of 30 Day Challenge

// DESCRIPTION:
// In this Kata, you will be given a string that may have mixed uppercase and lowercase letters and your task is to convert that string to either lowercase only or uppercase only based on:

// make as few changes as possible.
// if the string contains equal number of uppercase and lowercase letters, convert the string to lowercase.
// For example:

// solve("coDe") = "code". Lowercase characters > uppercase. Change only the "D" to lowercase.
// solve("CODe") = "CODE". Uppercase characters > lowecase. Change only the "e" to uppercase.
// solve("coDE") = "code". Upper == lowercase. Change all to lowercase.
// More examples in test cases. Good luck!

function convertStr(string: string): string {
  //
  let lowerCount: number = 0;
  let upperCount: number = 0;

  string.split("").forEach((el, i, oA) => {
    if (el === el.toUpperCase()) {
      upperCount++;
    } else {
      lowerCount++;
    }
  });

  if (lowerCount > upperCount) {
    return string.toLowerCase();
  } else if (upperCount > lowerCount) {
    return string.toUpperCase();
  } else return string.toLowerCase();
}

console.log(convertStr("KRIStofer")); // "kristofer"
console.log(convertStr("KRISTofer")); // "KRISTOFER"
console.log(convertStr("BOBBYbobby")); // "bobbybobby"
