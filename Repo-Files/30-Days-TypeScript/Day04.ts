// Day 4 of 30 Day Challenge

// DESCRIPTION:
// Define a method hello that returns "Hello, Name!" to a given name, or says Hello, World! if name is not given (or passed as an empty String).

// Assuming that name is a String and it checks for user typos to return a name with a first capital letter (Xxxx).

// Examples:

// * With `name` = "john"  => return "Hello, John!"
// * With `name` = "aliCE" => return "Hello, Alice!"
// * With `name` not given
//   or `name` = ""        => return "Hello, World!"

function helloWho(name: string): string {
  return name.length > 0 ? `Hello, ${name}!` : "Hello, World!";
}

console.log(helloWho("Kris")); // "Hello, Kris!"
console.log(helloWho("")); // "Hello, World!"
